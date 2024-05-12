package X;

import android.app.Activity;

/* renamed from: X.Byq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30548Byq implements InterfaceC77281UUr {
    public final /* synthetic */ XJL<Boolean> LIZ;

    public C30548Byq(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.InterfaceC77281UUr
    public final void LIZ(Activity activity, UDJ udj, String[] strArr) {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.K;
        Boolean bool = Boolean.FALSE;
        c48459J0d.LIZ(bool);
        if (this.LIZ.isActive()) {
            XJL<Boolean> xjl = this.LIZ;
            C3C5.m7constructorimpl(bool);
            xjl.resumeWith(bool);
        }
    }
}
