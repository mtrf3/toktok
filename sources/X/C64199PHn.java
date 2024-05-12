package X;

/* renamed from: X.PHn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64199PHn {
    public boolean LIZ;
    public final PI0 LIZIZ = new PI0();
    public C64198PHm LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public boolean LJFF;

    public final synchronized boolean LIZ() {
        return this.LIZLLL;
    }

    public final synchronized void LIZIZ(C64198PHm c64198PHm) {
        if (c64198PHm == null) {
            return;
        }
        if (!PC5.LJJIIZ() && !c64198PHm.LJFF) {
            return;
        }
        this.LIZJ = c64198PHm;
        if (this.LJFF) {
            if (!this.LIZ) {
                this.LIZ = true;
                this.LIZLLL = true;
                this.LIZIZ.LJFF(c64198PHm);
            }
            return;
        }
        if (c64198PHm.LIZ) {
            this.LIZ = true;
            this.LIZLLL = true;
            this.LIZIZ.LJFF(c64198PHm);
        } else {
            this.LIZ = false;
            this.LIZIZ.LJI();
        }
    }
}
