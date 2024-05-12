package X;

import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public final class VQ8 implements VQG {
    public final /* synthetic */ LynxBaseUI LIZ;

    public VQ8(LynxBaseUI lynxBaseUI) {
        this.LIZ = lynxBaseUI;
    }

    @Override // X.VQG
    public final void LIZ(int i) {
        VQG[] vqgArr;
        synchronized (this.LIZ) {
            vqgArr = (VQG[]) this.LIZ.mStateChangeListeners.toArray(new VQG[this.LIZ.mStateChangeListeners.size()]);
        }
        for (VQG vqg : vqgArr) {
            vqg.LIZ(i);
        }
    }
}
