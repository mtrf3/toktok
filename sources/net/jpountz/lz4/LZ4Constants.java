package net.jpountz.lz4;

import X.V0N;

/* loaded from: classes2.dex */
public enum LZ4Constants {
    ;

    public static final int SKIP_STRENGTH = Math.max(6, 2);

    public static LZ4Constants valueOf(String str) {
        return (LZ4Constants) V0N.LJJJ(LZ4Constants.class, str);
    }
}
