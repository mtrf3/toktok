package X;

import com.bytedance.ies.xelement.LynxNestedScrollView;

/* renamed from: X.VUb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79813VUb implements VUZ {
    public final /* synthetic */ LynxNestedScrollView LJLIL;

    @Override // X.VUZ
    public final void LIZIZ() {
    }

    @Override // X.VUZ
    public final void LIZJ() {
    }

    @Override // X.VUZ
    public final void LJ() {
    }

    @Override // X.VUZ
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    public C79813VUb(LynxNestedScrollView lynxNestedScrollView) {
        this.LJLIL = lynxNestedScrollView;
    }

    @Override // X.VUZ
    public final void LIZ(int i) {
        LynxNestedScrollView lynxNestedScrollView = this.LJLIL;
        if (!lynxNestedScrollView.LJLJJI) {
            if (i != 0) {
                lynxNestedScrollView.recognizeGesturere();
            }
        } else {
            if (i != 1) {
                return;
            }
            lynxNestedScrollView.recognizeGesturere();
        }
    }
}
