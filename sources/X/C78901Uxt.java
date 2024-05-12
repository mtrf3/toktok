package X;

/* renamed from: X.Uxt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78901Uxt implements UDJ {
    public final /* synthetic */ C78909Uy1 LIZ;
    public final /* synthetic */ FragmentC78903Uxv LIZIZ;

    @Override // X.UDJ
    public final void cancel() {
        this.LIZ.LIZ();
        C78909Uy1 c78909Uy1 = this.LIZ;
        c78909Uy1.LIZJ.LJ("DENY_FROM_RATIONAL", c78909Uy1.LIZ);
    }

    @Override // X.UDJ
    public final void execute() {
        FragmentC78903Uxv fragmentC78903Uxv = this.LIZIZ;
        C78909Uy1 c78909Uy1 = this.LIZ;
        fragmentC78903Uxv.getClass();
        int LJJIIJ = C78897Uxp.LJJIIJ(c78909Uy1.LIZ) & 65535;
        C012403c.LJ("doRequestPermissions: requestCode = ", LJJIIJ, "PermissionFragment");
        fragmentC78903Uxv.LJLIL.LJI(LJJIIJ, c78909Uy1);
        String[] strArr = c78909Uy1.LIZIZ;
        if (!new C03880Dg(2).LIZJ(102601, "com/bytedance/android/livesdk/permission/PermissionFragment", "requestPermissions", fragmentC78903Uxv, new Object[]{strArr, Integer.valueOf(LJJIIJ)}, "void", new C65300Pk0(false, "([Ljava/lang/String;I)V", "-4549891349641243252")).LIZ) {
            fragmentC78903Uxv.requestPermissions(strArr, LJJIIJ);
        }
        C78909Uy1 c78909Uy12 = this.LIZ;
        c78909Uy12.LIZJ.LIZJ(c78909Uy12.LIZ);
    }

    public C78901Uxt(FragmentC78903Uxv fragmentC78903Uxv, C78909Uy1 c78909Uy1) {
        this.LIZIZ = fragmentC78903Uxv;
        this.LIZ = c78909Uy1;
    }
}
