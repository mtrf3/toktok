package com.google.ar.core;

import X.V0N;

/* loaded from: classes34.dex */
public enum ModuleAvailability {
    SUPPORTED_INSTALLED(0),
    SUPPORTED_PENDING_IMMEDIATE_INSTALL(10),
    SUPPORTED_NOT_INSTALLED(11),
    SUPPORTED_PENDING_DEFERRED_INSTALL(20),
    UNKNOWN_ERROR(50);

    public final int nativeCode;

    public static ModuleAvailability forNumber(int i) {
        for (ModuleAvailability moduleAvailability : values()) {
            if (moduleAvailability.nativeCode == i) {
                return moduleAvailability;
            }
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Unexpected value for native ModuleAvailability, value=");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static ModuleAvailability valueOf(String str) {
        return (ModuleAvailability) V0N.LJJJ(ModuleAvailability.class, str);
    }

    ModuleAvailability(int i) {
        this.nativeCode = i;
    }
}
