package X;

/* loaded from: classes10.dex */
public final class MFY {
    public static MFZ LIZ;

    public static void LIZIZ() {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        MFZ mfz = LIZ;
        int i = 0;
        if (mfz != null && mfz.LJ) {
            long j = mfz.LIZ;
            if (0 < j) {
                long j2 = mfz.LIZIZ;
                if (j < j2) {
                    long j3 = mfz.LIZJ;
                    if (j2 >= j3 || j3 >= mfz.LIZLLL) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C188727au c188727au = new C188727au();
        MFZ mfz2 = LIZ;
        if (mfz2 != null) {
            l = Long.valueOf(mfz2.LJI);
        } else {
            l = null;
        }
        c188727au.LJFF(l, "click_to_request_duration");
        MFZ mfz3 = LIZ;
        if (mfz3 != null) {
            l2 = Long.valueOf(mfz3.LJII);
        } else {
            l2 = null;
        }
        c188727au.LJFF(l2, "request_duration");
        MFZ mfz4 = LIZ;
        if (mfz4 != null) {
            l3 = Long.valueOf(mfz4.LJIIIIZZ);
        } else {
            l3 = null;
        }
        c188727au.LJFF(l3, "request_to_show_duration");
        MFZ mfz5 = LIZ;
        if (mfz5 != null && mfz5.LJ) {
            i = 1;
        }
        c188727au.LIZLLL(i, "is_success");
        MFZ mfz6 = LIZ;
        if (mfz6 != null && (l4 = mfz6.LJFF) != null) {
            c188727au.LJ(l4.longValue(), "list_count");
        }
        FMX.LJIIL("profile_liked_video_list_duration", c188727au.LIZ);
        LIZ = null;
    }

    public static void LIZ(Long l, boolean z) {
        MFZ mfz = LIZ;
        if (mfz != null) {
            LIZ = MFZ.LIZ(mfz, 0L, System.currentTimeMillis(), 0L, z, l, 11);
            if (!z) {
                LIZIZ();
            }
        }
    }
}
