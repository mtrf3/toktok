package X;

import android.widget.Magnifier;

/* renamed from: X.1Lt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C31571Lt implements C0SQ {
    public final Magnifier LIZ;

    @Override // X.C0SQ
    public final long LIZ() {
        return C78996UzQ.LIZIZ(this.LIZ.getWidth(), this.LIZ.getHeight());
    }

    @Override // X.C0SQ
    public final void LIZJ() {
        this.LIZ.update();
    }

    @Override // X.C0SQ
    public final void dismiss() {
        this.LIZ.dismiss();
    }

    public C31571Lt(Magnifier magnifier) {
        this.LIZ = magnifier;
    }

    @Override // X.C0SQ
    public void LIZIZ(float f, long j, long j2) {
        this.LIZ.show(C10370av.LIZLLL(j), C10370av.LJ(j));
    }
}
