package X;

/* loaded from: classes9.dex */
public final class JB2 {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public final String LIZ() {
        if (this.LIZ) {
            return "horizontal_mode";
        }
        if (this.LIZIZ) {
            return "comment_panel";
        }
        if (this.LIZJ) {
            return "long_press_panel";
        }
        if (this.LIZLLL) {
            return "share_panel";
        }
        if (this.LJ) {
            return "mini_window";
        }
        if (this.LJFF) {
            return "drag_status";
        }
        return null;
    }

    public final boolean LIZIZ() {
        if (this.LIZIZ || this.LIZJ || this.LIZLLL || this.LIZ || this.LJ || this.LJFF || this.LJI) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (this.LIZIZ || this.LIZJ || this.LIZLLL || this.LIZ || this.LJ || this.LJI) {
            return true;
        }
        return false;
    }
}
