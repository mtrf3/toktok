package X;

/* renamed from: X.AeE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26722AeE implements C44 {
    public final /* synthetic */ InterfaceC67352kd<Boolean> LIZ;

    public C26722AeE(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.C44
    public final void onFailed(Throwable th) {
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LIZ;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }

    @Override // X.C44
    public final void LIZ(Boolean bool, C29180Bcm c29180Bcm, BUT but) {
        boolean z;
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LIZ;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        C3C5.m7constructorimpl(valueOf);
        interfaceC67352kd.resumeWith(valueOf);
    }
}
