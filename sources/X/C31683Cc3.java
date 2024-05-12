package X;

import com.bytedance.geckox.model.UpdatePackage;

/* renamed from: X.Cc3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31683Cc3 extends AbstractC61537ODd {
    public final /* synthetic */ InterfaceC67352kd<UpdatePackage> LIZ;

    public C31683Cc3(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        InterfaceC67352kd<UpdatePackage> interfaceC67352kd = this.LIZ;
        if (th == null) {
            th = new UnknownError();
        }
        OUR.LJ(th, interfaceC67352kd);
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        InterfaceC67352kd<UpdatePackage> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(updatePackage);
        interfaceC67352kd.resumeWith(updatePackage);
    }
}
