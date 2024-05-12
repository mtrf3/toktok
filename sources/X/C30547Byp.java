package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Byp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30547Byp implements InterfaceC78910Uy2 {
    public final /* synthetic */ XJL<Boolean> LIZ;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    public C30547Byp(XKS xks) {
        this.LIZ = xks;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZLLL(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.K;
        Boolean bool = Boolean.FALSE;
        c48459J0d.LIZ(bool);
        if (this.LIZ.isActive()) {
            XJL<Boolean> xjl = this.LIZ;
            C3C5.m7constructorimpl(bool);
            xjl.resumeWith(bool);
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LJ(String str, String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        if (!o.LJ(str, "DENY_FROM_RATIONAL")) {
            InterfaceC30442Bx8.K.LIZ(Boolean.FALSE);
        }
        if (this.LIZ.isActive()) {
            XJL<Boolean> xjl = this.LIZ;
            Boolean bool = Boolean.FALSE;
            C3C5.m7constructorimpl(bool);
            xjl.resumeWith(bool);
        }
    }
}
