package com.bytedance.apm.agent.logging;

import X.X1D;
import defpackage.b1;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class ConsoleAgentLog implements AgentLog {
    public int mLevel = 3;

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public int getLevel() {
        return this.mLevel;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void audit(String str) {
        if (this.mLevel == 6) {
            print("AUDIT", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void debug(String str) {
        if (this.mLevel >= 5) {
            print("DEBUG", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str) {
        if (this.mLevel >= 1) {
            print("ERROR", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void info(String str) {
        if (this.mLevel >= 3) {
            print("INFO", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void setLevel(int i) {
        this.mLevel = i;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void verbose(String str) {
        if (this.mLevel >= 4) {
            print("VERBOSE", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void warning(String str) {
        if (this.mLevel >= 2) {
            print("WARN", str);
        }
    }

    public static void print(String str, String str2) {
        PrintStream printStream = System.out;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        LIZ.append(str);
        LIZ.append("] ");
        LIZ.append(str2);
        printStream.println(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str, Throwable th) {
        if (this.mLevel >= 1) {
            StringBuilder LIZJ = b1.LIZJ(str, " ");
            LIZJ.append(th.getMessage());
            print("ERROR", X1D.LIZIZ(LIZJ));
        }
    }
}
