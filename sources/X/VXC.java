package X;

/* loaded from: classes15.dex */
public final class VXC implements InterfaceC78208Umi {
    public final /* synthetic */ VXD LIZ;

    @Override // X.InterfaceC78208Umi
    public final void LJIIIZ() {
        VXD vxd = this.LIZ;
        if (vxd != null) {
            vxd.LJIIIZ();
        }
    }

    @Override // X.InterfaceC78208Umi
    public final void onStart() {
        VXD vxd = this.LIZ;
        if (vxd != null) {
            vxd.onStart();
        }
    }

    @Override // X.InterfaceC78208Umi
    public final void onStop() {
        VXD vxd = this.LIZ;
        if (vxd != null) {
            vxd.onStop();
        }
    }

    public VXC(VXD vxd) {
        this.LIZ = vxd;
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZ(C78163Ulz c78163Ulz) {
        boolean z;
        int i;
        String str;
        VXD vxd = this.LIZ;
        if (vxd != null) {
            if (c78163Ulz != null) {
                z = true;
                i = c78163Ulz.LIZ;
                str = c78163Ulz.LIZIZ;
            } else {
                z = false;
                i = -1;
                str = null;
            }
            vxd.LIZIZ(i, str, z);
        }
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZIZ(C60382Yo c60382Yo) {
        VXD vxd = this.LIZ;
        if (vxd != null) {
            vxd.LIZ();
        }
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZJ(float f, float f2, float f3, float f4) {
        VXD vxd = this.LIZ;
        if (vxd != null) {
            vxd.LIZJ(f, f2, f3, f4);
        }
    }
}
