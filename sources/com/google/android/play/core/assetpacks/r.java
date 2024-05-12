package com.google.android.play.core.assetpacks;

/* loaded from: classes7.dex */
public final /* synthetic */ class r implements Runnable {
    public final t LJLIL;
    public final AssetPackState LJLILLLLZI;

    public r(t tVar, AssetPackState assetPackState) {
        this.LJLIL = tVar;
        this.LJLILLLLZI = assetPackState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LJFF(this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
