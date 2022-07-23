package io.nanovc.agentsim.simulations.memory;

import io.nanovc.agentsim.*;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class MemorySimulationHandlerTests_ReturningModelItems extends MemorySimulationHandlerTestsBase
{
    @Test
    public void AgentChangingModelItemName() throws Exception
    {
        // Define the input model using code:
        MemorySimulationHandlerTestsBase.ConsumerWithException<EnvironmentController> inputModelCreator = controller ->
        {
            //#region Input Model

            AgentModel dataModel = new AgentModel();
            dataModel.name = "question";
            dataModel.data = "Are robots the best?";
            controller.addModel(dataModel);

            AgentConfig agentConfig1 = new AgentConfig();
            agentConfig1.modelNameToManipulate = "question";
            agentConfig1.expectedValueBeforeManipulating = "Are robots the best?";
            agentConfig1.valueToSet = "yes";
            agentConfig1.newModelName = "answer";
            controller.addAgentConfig(agentConfig1);


            //#endregion
        };

        // Make sure that the output solutions are as expected:
        //#region Output Solution JSON
        //language=JSON
        String expectedOutputJSON =
            "[\n" +
            "  {\n" +
            "    \"solutionName\" : \"Solution 0\",\n" +
            "    \"environment\" : {\n" +
            "      \"models\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentModel\",\n" +
            "          \"name\" : \"answer\",\n" +
            "          \"data\" : \"yes\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"agentConfigs\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"question\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"yes\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  }\n" +
            "]";
        //#endregion

        assert_Simulation_OutputJSONSolutions(
            inputModelCreator,
            expectedOutputJSON
        );
    }

    @Test
    public void TwoAgentsChangingNameOfModelItem() throws Exception
    {
        // Define the input model using code:
        MemorySimulationHandlerTestsBase.ConsumerWithException<EnvironmentController> inputModelCreator = controller ->
        {
            //#region Input Model

            AgentModel dataModel = new AgentModel();
            dataModel.name = "question";
            dataModel.data = "Are robots the best?";
            controller.addModel(dataModel);

            AgentConfig agentConfig1 = new AgentConfig();
            agentConfig1.modelNameToManipulate = "question";
            agentConfig1.expectedValueBeforeManipulating = "Are robots the best?";
            agentConfig1.valueToSet = "yes";
            agentConfig1.newModelName = "answer";
            controller.addAgentConfig(agentConfig1);

            AgentConfig agentConfig2 = new AgentConfig();
            agentConfig2.modelNameToManipulate = "question";
            agentConfig2.expectedValueBeforeManipulating = "Are robots the best?";
            agentConfig2.valueToSet = "no";
            agentConfig2.newModelName = "answer";
            controller.addAgentConfig(agentConfig2);

            //#endregion
        };

        // Make sure that the output solutions are as expected:
        //#region Output Solution JSON
        //language=JSON
        String expectedOutputJSON =
            "[\n" +
            "  {\n" +
            "    \"solutionName\" : \"Solution 1\",\n" +
            "    \"environment\" : {\n" +
            "      \"models\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentModel\",\n" +
            "          \"name\" : \"answer\",\n" +
            "          \"data\" : \"no\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"agentConfigs\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"question\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"yes\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"question\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"no\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"solutionName\" : \"Solution 2\",\n" +
            "    \"environment\" : {\n" +
            "      \"models\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentModel\",\n" +
            "          \"name\" : \"answer\",\n" +
            "          \"data\" : \"yes\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"agentConfigs\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"question\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"yes\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"question\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"no\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  }\n" +
            "]";
        //#endregion

        assert_Simulation_OutputJSONSolutions(
            inputModelCreator,
            expectedOutputJSON
        );
    }

    @Test
    public void TwoAgentsChangingNameOfModelItemDifferentName() throws Exception
    {
        // Define the input model using code:
        MemorySimulationHandlerTestsBase.ConsumerWithException<EnvironmentController> inputModelCreator = controller ->
        {
            //#region Input Model

            AgentModel dataModel = new AgentModel();
            dataModel.name = "answer";
            dataModel.data = "Are robots the best?";
            controller.addModel(dataModel);

            AgentConfig agentConfig1 = new AgentConfig();
            agentConfig1.modelNameToManipulate = "answer";
            agentConfig1.expectedValueBeforeManipulating = "Are robots the best?";
            agentConfig1.valueToSet = "yes";
            agentConfig1.newModelName = "answer";
            controller.addAgentConfig(agentConfig1);

            AgentConfig agentConfig2 = new AgentConfig();
            agentConfig2.modelNameToManipulate = "answer";
            agentConfig2.expectedValueBeforeManipulating = "Are robots the best?";
            agentConfig2.valueToSet = "no";
            agentConfig2.newModelName = "answer";
            controller.addAgentConfig(agentConfig2);

            //#endregion
        };

        // Make sure that the output solutions are as expected:
        //#region Output Solution JSON
        //language=JSON
        String expectedOutputJSON =
            "[\n" +
            "  {\n" +
            "    \"solutionName\" : \"Solution 1\",\n" +
            "    \"environment\" : {\n" +
            "      \"models\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentModel\",\n" +
            "          \"name\" : \"answer\",\n" +
            "          \"data\" : \"no\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"agentConfigs\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"answer\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"yes\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"answer\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"no\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"solutionName\" : \"Solution 2\",\n" +
            "    \"environment\" : {\n" +
            "      \"models\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentModel\",\n" +
            "          \"name\" : \"answer\",\n" +
            "          \"data\" : \"yes\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"agentConfigs\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"answer\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"yes\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"answer\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"no\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  }\n" +
            "]";
        //#endregion

        assert_Simulation_OutputJSONSolutions(
            inputModelCreator,
            expectedOutputJSON
        );
    }

    @Test
    public void TwoSetsOfTwoAgents() throws Exception
    {
        // Define the input model using code:
        MemorySimulationHandlerTestsBase.ConsumerWithException<EnvironmentController> inputModelCreator = controller ->
        {
            //#region Input Model

            AgentModel dataModel = new AgentModel();
            dataModel.name = "question";
            dataModel.data = "Are robots the best?";
            controller.addModel(dataModel);

            AgentConfig agentConfig1 = new AgentConfig();
            agentConfig1.modelNameToManipulate = "question";
            agentConfig1.expectedValueBeforeManipulating = "Are robots the best?";
            agentConfig1.valueToSet = "yes";
            agentConfig1.newModelName = "answer";
            controller.addAgentConfig(agentConfig1);

            AgentConfig agentConfig2 = new AgentConfig();
            agentConfig2.modelNameToManipulate = "question";
            agentConfig2.expectedValueBeforeManipulating = "Are robots the best?";
            agentConfig2.valueToSet = "no";
            agentConfig2.newModelName = "answer";
            controller.addAgentConfig(agentConfig2);

            AgentConfig agentConfig3 = new AgentConfig();
            agentConfig3.modelNameToManipulate = "answer";
            agentConfig3.expectedValueBeforeManipulating = "yes";
            agentConfig3.valueToSet = "Left";
            agentConfig3.newModelName = "action";
            controller.addAgentConfig(agentConfig3);

            AgentConfig agentConfig4 = new AgentConfig();
            agentConfig4.modelNameToManipulate = "answer";
            agentConfig4.expectedValueBeforeManipulating = "no";
            agentConfig4.valueToSet = "Right";
            agentConfig4.newModelName = "action";
            controller.addAgentConfig(agentConfig4);

            //#endregion
        };

        // Make sure that the output solutions are as expected:
        //#region Output Solution JSON
        //language=JSON
        String expectedOutputJSON =
            "[\n" +
            "  {\n" +
            "    \"solutionName\" : \"Solution 1\",\n" +
            "    \"environment\" : {\n" +
            "      \"models\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentModel\",\n" +
            "          \"name\" : \"action\",\n" +
            "          \"data\" : \"Right\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"agentConfigs\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"question\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"yes\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"question\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"no\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"answer\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"yes\",\n" +
            "          \"valueToSet\" : \"Left\",\n" +
            "          \"newModelName\" : \"action\",\n" +
            "          \"enabled\" : true\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"answer\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"no\",\n" +
            "          \"valueToSet\" : \"Right\",\n" +
            "          \"newModelName\" : \"action\",\n" +
            "          \"enabled\" : true\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"solutionName\" : \"Solution 2\",\n" +
            "    \"environment\" : {\n" +
            "      \"models\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentModel\",\n" +
            "          \"name\" : \"action\",\n" +
            "          \"data\" : \"Left\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"agentConfigs\" : [\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"question\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"yes\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"question\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"Are robots the best?\",\n" +
            "          \"valueToSet\" : \"no\",\n" +
            "          \"newModelName\" : \"answer\",\n" +
            "          \"enabled\" : true\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"answer\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"yes\",\n" +
            "          \"valueToSet\" : \"Left\",\n" +
            "          \"newModelName\" : \"action\",\n" +
            "          \"enabled\" : true\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\" : \"io.nanovc.agentsim.simulations.memory.MemorySimulationHandlerTests_ReturningModelItems$AgentConfig\",\n" +
            "          \"modelNameToManipulate\" : \"answer\",\n" +
            "          \"expectedValueBeforeManipulating\" : \"no\",\n" +
            "          \"valueToSet\" : \"Right\",\n" +
            "          \"newModelName\" : \"action\",\n" +
            "          \"enabled\" : true\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  }\n" +
            "]";
        //#endregion

        assert_Simulation_OutputJSONSolutions(
            inputModelCreator,
            expectedOutputJSON
        );
    }


    public static class AgentModel extends ModelBase
    {
        public String data;
    }

    public static class AgentConfig extends AgentConfigBase
    {
        /**
         * The name of the model to manipulate.
         */
        public String modelNameToManipulate;

        /**
         * This is the value that the agent expects to see on the model before manipulating it.
         * If the value is not as expected then the agent does nothing.
         */
        public String expectedValueBeforeManipulating;

        /**
         * The value to set when the agent finds the named model and manipulates it.
         */
        public String valueToSet;

        /**
         * The value to change  the model to when the agent finds the named model and manipulates it.
         */
        public String newModelName;
    }

    public static class Agent extends AgentBase<AgentConfig>
    {

        /**
         * This allows the agent to modify the environment for an iteration.
         *
         * @param input      The input model to this iteration. This is provided for reference. It must not be modified.
         * @param output     The output model for this iteration. The agent is allowed to modify this output model for the next iteration.
         * @param iteration  The current simulation iteration that is running.
         * @param simulation The simulation that is running.
         * @param config     The agent configuration.
         */
        @Override public void modifyEnvironment(ReadOnlyEnvironmentController input, EnvironmentController output, SimulationIterationAPI iteration, SimulationController simulation, AgentConfig config) throws Exception
        {
            // Check whether we have the model that we are supposed to modify:
            AgentModel modelToManipulate = output.getModelByName(config.modelNameToManipulate);
            if (modelToManipulate != null)
            {
                // We found the model to manipulate.

                // Get the current value for the model:
                String currentValue = modelToManipulate.data;

                // Make sure that the current value is as expected before we manipulate it:
                if (Objects.equals(currentValue, config.expectedValueBeforeManipulating))
                {
                    // The current value is as expected for the model.

                    // Set the value for the model:
                    modelToManipulate.name = config.newModelName;
                    modelToManipulate.data = config.valueToSet;
                }
            }
        }
    }
}
