package X;

/* loaded from: classes6.dex */
public final class BIJ implements InterfaceC30837C8j {
    public final /* synthetic */ InterfaceC67352kd<Boolean> LIZ;

    @Override // X.InterfaceC30837C8j
    public final void onSuccess() {
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LIZ;
        Boolean bool = Boolean.TRUE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }

    public BIJ(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }
}
