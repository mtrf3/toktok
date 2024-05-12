package X;

/* renamed from: X.Vh2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80404Vh2 implements InterfaceC80409Vh7 {
    public final /* synthetic */ C80401Vgz LIZ;

    public C80404Vh2(C80401Vgz c80401Vgz) {
        this.LIZ = c80401Vgz;
    }

    @Override // X.InterfaceC80409Vh7
    public final void LIZ(C80400Vgy c80400Vgy, boolean z) {
        int i;
        C80401Vgz c80401Vgz = this.LIZ;
        if (c80401Vgz.LJLJL) {
            return;
        }
        if (c80401Vgz.LJLJLJ) {
            if (z) {
                i = c80400Vgy.getId();
            } else {
                i = -1;
            }
            c80401Vgz.LJLL = i;
        }
        if (this.LIZ.LJI(c80400Vgy.getId(), z)) {
            this.LIZ.LIZJ(c80400Vgy.getId(), c80400Vgy.isChecked());
        }
        this.LIZ.invalidate();
    }
}
