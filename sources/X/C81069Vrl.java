package X;

import android.view.View;

/* renamed from: X.Vrl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81069Vrl implements C00O {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ View LIZIZ;

    public C81069Vrl(View view, boolean z) {
        this.LIZ = z;
        this.LIZIZ = view;
    }

    @Override // X.C00O
    public final void LIZ() {
        if (!this.LIZ) {
            this.LIZIZ.setVisibility(8);
        } else {
            this.LIZIZ.setClickable(true);
        }
    }
}
