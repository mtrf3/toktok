package com.bytedance.apm.agent.logging;

/* loaded from: classes.dex */
public class AgentLogManager {
    public static DefaultAgentLog instance = new DefaultAgentLog();

    public static AgentLog getAgentLog() {
        return instance;
    }

    public static void setAgentLog(AgentLog agentLog) {
        instance.setImpl(agentLog);
    }
}
