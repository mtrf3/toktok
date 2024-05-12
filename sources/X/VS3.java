package X;

/* loaded from: classes15.dex */
public final class VS3 implements Runnable {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final /* synthetic */ VS2 LJLJI;

    public final void LIZ() {
        VS2 vs2 = this.LJLJI;
        if (!vs2.mIsInSelection) {
            vs2.mIsInSelection = true;
            vs2.mSelectStartPos.set(this.LJLIL, this.LJLILLLLZI);
            this.LJLJI.mSelectEndPos.set(this.LJLIL, this.LJLILLLLZI);
            this.LJLJI.updateSelectionRange();
            this.LJLJI.mCheckForLongPress = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public VS3(VS2 vs2, float f, float f2) {
        this.LJLJI = vs2;
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
    }
}
