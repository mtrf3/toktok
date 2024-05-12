package com.ss.ttlivestreamer.core.utils;

import X.V0N;

/* loaded from: classes6.dex */
public class QualcommGpuUtils {
    public static native int nativeSendCommand(int i);

    /* loaded from: classes6.dex */
    public enum CommandType {
        DISABLE(-1),
        DEFAULT(0),
        LOW(1),
        HIGH(2);

        public final int value;

        public static CommandType valueOf(String str) {
            return (CommandType) V0N.LJJJ(CommandType.class, str);
        }

        CommandType(int i) {
            this.value = i;
        }
    }

    public static void sendCommand(CommandType commandType) {
        nativeSendCommand(commandType.value);
    }
}
