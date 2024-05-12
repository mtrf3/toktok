package com.bytedance.crash;

import X.V0N;

/* loaded from: classes7.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    GAME("game"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL("all");

    public final String mName;

    @Override // java.lang.Enum
    public String toString() {
        return getName();
    }

    public String getName() {
        return this.mName;
    }

    public static CrashType valueOf(String str) {
        return (CrashType) V0N.LJJJ(CrashType.class, str);
    }

    CrashType(String str) {
        this.mName = str;
    }
}
