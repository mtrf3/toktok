package X;

/* renamed from: X.Qnx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68093Qnx implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C68089Qnt LJLJI;

    public RunnableC68093Qnx(C68089Qnt c68089Qnt, String str, long j) {
        this.LJLJI = c68089Qnt;
        this.LJLIL = str;
        this.LJLILLLLZI = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        C68089Qnt c68089Qnt = this.LJLJI;
        String str = this.LJLIL;
        long j = this.LJLILLLLZI;
        c68089Qnt.LJFF();
        QH7.LJI(str);
        Integer num = (Integer) c68089Qnt.LIZJ.getOrDefault(str, null);
        if (num != null) {
            C68132Qoa LJIIL = c68089Qnt.LIZ.LJIJI().LJIIL(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c68089Qnt.LIZJ.remove(str);
                Long l = (Long) c68089Qnt.LIZIZ.getOrDefault(str, null);
                if (l == null) {
                    c68089Qnt.LIZ.LIZJ().LJFF.LIZ("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    c68089Qnt.LIZIZ.remove(str);
                    c68089Qnt.LJIIJ(str, j - longValue, LJIIL);
                }
                if (c68089Qnt.LIZJ.isEmpty()) {
                    long j2 = c68089Qnt.LIZLLL;
                    if (j2 == 0) {
                        c68089Qnt.LIZ.LIZJ().LJFF.LIZ("First ad exposure time was never set");
                        return;
                    } else {
                        c68089Qnt.LJIIIZ(j - j2, LJIIL);
                        c68089Qnt.LIZLLL = 0L;
                        return;
                    }
                }
                return;
            }
            c68089Qnt.LIZJ.put(str, Integer.valueOf(intValue));
            return;
        }
        c68089Qnt.LIZ.LIZJ().LJFF.LIZIZ(str, "Call to endAdUnitExposure for unknown ad unit id");
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
