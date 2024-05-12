package X;

/* renamed from: X.Umh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78207Umh implements InterfaceC78208Umi {
    public final /* synthetic */ InterfaceC78208Umi LIZ;
    public final /* synthetic */ C78203Umd LIZIZ;

    @Override // X.InterfaceC78208Umi
    public final void LJIIIZ() {
        InterfaceC78208Umi interfaceC78208Umi = this.LIZ;
        if (interfaceC78208Umi != null) {
            interfaceC78208Umi.LJIIIZ();
        }
    }

    @Override // X.InterfaceC78208Umi
    public final void onStart() {
        this.LIZIZ.LJIIIIZZ = false;
        InterfaceC78208Umi interfaceC78208Umi = this.LIZ;
        if (interfaceC78208Umi != null) {
            interfaceC78208Umi.onStart();
        }
    }

    @Override // X.InterfaceC78208Umi
    public final void onStop() {
        C78203Umd c78203Umd = this.LIZIZ;
        c78203Umd.LJIIIIZZ = true;
        c78203Umd.LIZIZ();
        InterfaceC78208Umi interfaceC78208Umi = this.LIZ;
        if (interfaceC78208Umi != null) {
            interfaceC78208Umi.onStop();
        }
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZ(C78163Ulz c78163Ulz) {
        C78203Umd c78203Umd = this.LIZIZ;
        c78203Umd.LJIIIIZZ = true;
        c78203Umd.LIZIZ();
        InterfaceC78208Umi interfaceC78208Umi = this.LIZ;
        if (interfaceC78208Umi != null) {
            interfaceC78208Umi.LIZ(c78163Ulz);
        }
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZIZ(C60382Yo c60382Yo) {
        C78203Umd c78203Umd = this.LIZIZ;
        c78203Umd.LJIIIIZZ = true;
        c78203Umd.LIZIZ();
        InterfaceC78208Umi interfaceC78208Umi = this.LIZ;
        if (interfaceC78208Umi != null) {
            interfaceC78208Umi.LIZIZ(c60382Yo);
        }
    }

    public C78207Umh(C78203Umd c78203Umd, C78201Umb c78201Umb) {
        this.LIZIZ = c78203Umd;
        this.LIZ = c78201Umb;
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZJ(float f, float f2, float f3, float f4) {
        InterfaceC78208Umi interfaceC78208Umi = this.LIZ;
        if (interfaceC78208Umi != null) {
            interfaceC78208Umi.LIZJ(f, f2, f3, f4);
        }
    }
}
