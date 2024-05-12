package X;

/* renamed from: X.Qo1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68097Qo1 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C68089Qnt LJLJI;

    public RunnableC68097Qo1(C68089Qnt c68089Qnt, String str, long j) {
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
        if (c68089Qnt.LIZJ.isEmpty()) {
            c68089Qnt.LIZLLL = j;
        }
        Integer num = (Integer) c68089Qnt.LIZJ.getOrDefault(str, null);
        if (num != null) {
            c68089Qnt.LIZJ.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        C1HQ c1hq = c68089Qnt.LIZJ;
        if (c1hq.LJLJI >= 100) {
            c68089Qnt.LIZ.LIZJ().LJIIIIZZ.LIZ("Too many ads visible");
        } else {
            c1hq.put(str, 1);
            c68089Qnt.LIZIZ.put(str, Long.valueOf(j));
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
