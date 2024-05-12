package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Oxg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63600Oxg implements InterfaceC114864f4 {
    public final /* synthetic */ InterfaceC67352kd<C114844f2> LIZ;

    public C63600Oxg(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC114864f4
    public final void LIZ(C114844f2 response) {
        o.LJIIIZ(response, "response");
        InterfaceC67352kd<C114844f2> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(response);
        interfaceC67352kd.resumeWith(response);
    }

    @Override // X.InterfaceC114864f4
    public final void LIZIZ(Exception exc, String str, int i) {
        InterfaceC67352kd<C114844f2> interfaceC67352kd = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new C63608Oxo(str, i, exc));
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }
}
