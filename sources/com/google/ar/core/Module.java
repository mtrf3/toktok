package com.google.ar.core;

import X.V0N;

/* loaded from: classes34.dex */
public enum Module {
    AUGMENTED_FACE_IMPROVED_LIP_EYE(0),
    NORMAL_NET(1),
    DEPTH_NET(2);

    public final int nativeCode;

    public static Module forNumber(int i) {
        for (Module module : values()) {
            if (module.nativeCode == i) {
                return module;
            }
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Unexpected value for native Module, value=");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Module valueOf(String str) {
        return (Module) V0N.LJJJ(Module.class, str);
    }

    Module(int i) {
        this.nativeCode = i;
    }
}
