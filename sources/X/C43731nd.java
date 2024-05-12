package X;

/* renamed from: X.1nd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43731nd<V> extends AbstractC35091Zh<V> {
    public final boolean LJIIIIZZ(V v) {
        if (v == null) {
            v = (V) AbstractC35091Zh.LJLJL;
        }
        if (AbstractC35091Zh.LJLJJLL.LIZIZ(this, null, v)) {
            AbstractC35091Zh.LIZIZ(this);
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ(Throwable th) {
        th.getClass();
        if (AbstractC35091Zh.LJLJJLL.LIZIZ(this, null, new C22580uc(th))) {
            AbstractC35091Zh.LIZIZ(this);
            return true;
        }
        return false;
    }

    public final boolean LJIIJ(C76L<? extends V> c76l) {
        C22580uc c22580uc;
        c76l.getClass();
        Object obj = this.LJLIL;
        if (obj == null) {
            if (c76l.isDone()) {
                if (!AbstractC35091Zh.LJLJJLL.LIZIZ(this, null, AbstractC35091Zh.LJ(c76l))) {
                    return false;
                }
                AbstractC35091Zh.LIZIZ(this);
            } else {
                RunnableC22600ue runnableC22600ue = new RunnableC22600ue(this, c76l);
                if (AbstractC35091Zh.LJLJJLL.LIZIZ(this, null, runnableC22600ue)) {
                    try {
                        c76l.LJFF(runnableC22600ue, EnumC22620ug.LJLIL);
                    } catch (Throwable th) {
                        try {
                            c22580uc = new C22580uc(th);
                        } catch (Throwable unused) {
                            c22580uc = C22580uc.LIZIZ;
                        }
                        AbstractC35091Zh.LJLJJLL.LIZIZ(this, runnableC22600ue, c22580uc);
                    }
                } else {
                    obj = this.LJLIL;
                }
            }
            return true;
        }
        if (!(obj instanceof C22560ua)) {
            return false;
        }
        c76l.cancel(((C22560ua) obj).LIZ);
        return false;
    }
}
