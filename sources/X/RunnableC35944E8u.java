package X;

/* renamed from: X.E8u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC35944E8u implements Runnable {
    public static final RunnableC35944E8u LJLIL = new RunnableC35944E8u();

    public static void LIZ() {
        Long l;
        C35940E8q c35940E8q = C35945E8v.LIZJ;
        c35940E8q.LIZ();
        java.util.Map<Integer, Long> map = c35940E8q.LJFF.LJII;
        if (map != null && (l = map.get(Integer.valueOf(C35945E8v.LIZIZ))) != null) {
            long longValue = l.longValue();
            long j = c35940E8q.LJFF.LJFF;
            if (j > 0) {
                C35945E8v.LIZLLL = ((float) longValue) / ((float) j);
            }
        }
        if (C35945E8v.LJ.get()) {
            C37179EiV.LJFF.postDelayed(LJLIL, C35945E8v.LIZ);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
