package X;

/* renamed from: X.UmH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78181UmH {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public int LJI;

    public static long LIZ() {
        return C32257ClJ.LIZLLL().LIZ();
    }

    public final void LIZIZ() {
        int i;
        String str;
        long LIZ = LIZ();
        C32255ClH LIZ2 = C32256ClI.LIZ("gift_render_spark_prepare");
        if (this.LJI == 6) {
            i = 1;
        } else {
            i = 0;
        }
        LIZ2.LIZLLL(Integer.valueOf(i), "show_success");
        int i2 = this.LJI;
        if (i2 != 6) {
            switch (i2) {
                case 0:
                    str = "init";
                    break;
                case 1:
                    str = "spark_create";
                    break;
                case 2:
                    str = "resource_load";
                    break;
                case 3:
                    str = "bridge_register";
                    break;
                case 4:
                    str = "first_screen";
                    break;
                case 5:
                    str = "fe_ready";
                    break;
                case 6:
                    str = "shown";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            LIZ2.LIZLLL(str, "terminate_stage");
        }
        int i3 = this.LJI;
        if (i3 >= 2) {
            LIZ2.LIZJ(this.LIZIZ - this.LIZ, "spark_create_time");
        } else if (i3 == 0) {
            LIZ2.LIZJ(LIZ - this.LIZ, "spark_create_time");
        }
        int i4 = this.LJI;
        if (i4 >= 3) {
            LIZ2.LIZJ(this.LIZJ - this.LIZIZ, "resource_load_time");
        } else if (i4 == 2) {
            LIZ2.LIZJ(LIZ - this.LIZIZ, "resource_load_time");
        }
        int i5 = this.LJI;
        if (i5 >= 4) {
            LIZ2.LIZJ(this.LIZLLL - this.LIZJ, "bridge_register_time");
        } else if (i5 == 3) {
            LIZ2.LIZJ(LIZ - this.LIZJ, "bridge_register_time");
        }
        int i6 = this.LJI;
        if (i6 >= 5) {
            LIZ2.LIZJ(this.LJ - this.LIZLLL, "first_screen_time");
        } else if (i6 == 4) {
            LIZ2.LIZJ(LIZ - this.LIZLLL, "first_screen_time");
        }
        int i7 = this.LJI;
        if (i7 >= 6) {
            LIZ2.LIZJ(this.LJFF - this.LJ, "fe_ready_time");
        } else if (i7 == 5) {
            LIZ2.LIZJ(LIZ - this.LJ, "fe_ready_time");
        }
        LIZ2.LIZJ(LIZ - this.LIZ, "total_duration");
        LIZ2.LJI();
    }
}
