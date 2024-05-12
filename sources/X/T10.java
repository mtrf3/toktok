package X;

/* loaded from: classes13.dex */
public final class T10 extends AbstractC73961T0z implements Runnable {
    public static final long serialVersionUID = 1811839108042568751L;

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_schedulers_ScheduledDirectPeriodicTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    @Override // X.AbstractC73961T0z
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public void io_reactivex_internal_schedulers_ScheduledDirectPeriodicTask__run$___twin___() {
        this.LJLILLLLZI = C16880lQ.LLLLIIIILLL();
        try {
            this.LJLIL.run();
            this.LJLILLLLZI = null;
        } catch (Throwable th) {
            this.LJLILLLLZI = null;
            lazySet(AbstractC73961T0z.LJLJI);
            C73548Stk.LIZIZ(th);
        }
    }

    public T10(Runnable runnable) {
        super(runnable);
    }

    public static void io_reactivex_internal_schedulers_ScheduledDirectPeriodicTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(T10 t10) {
        boolean LIZ;
        try {
            t10.io_reactivex_internal_schedulers_ScheduledDirectPeriodicTask__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }
}
