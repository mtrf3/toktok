package X;

import android.view.View;

/* renamed from: X.TLc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74484TLc extends TMN {
    public final /* synthetic */ C74485TLd LIZ;

    @Override // X.TMN
    public final void LIZ(View view) {
    }

    public C74484TLc(C74485TLd c74485TLd) {
        this.LIZ = c74485TLd;
    }

    @Override // X.TMN
    public final void LIZIZ(int i, View view) {
        if (i == 4) {
            this.LIZ.LIZIZ.onNext(TLY.CLOSE);
        } else {
            if (i != 1) {
                return;
            }
            this.LIZ.LIZIZ.onNext(TLY.DRAGGING);
        }
    }
}
