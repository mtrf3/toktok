package com.google.android.play.core.assetpacks;

/* loaded from: classes7.dex */
public final class m0 extends RuntimeException {
    public final int LJLIL;

    public m0(int i, String str, Exception exc) {
        super(str, exc);
        this.LJLIL = i;
    }

    public m0(String str) {
        super(str);
        this.LJLIL = -1;
    }

    public m0(String str, int i) {
        super(str);
        this.LJLIL = i;
    }

    public m0(String str, Exception exc) {
        super(str, exc);
        this.LJLIL = -1;
    }
}
