package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sx6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73756Sx6<T> extends AtomicReference<Thread> implements InterfaceC73812Sy0<T>, InterfaceC73651SvP, Runnable {
    public static final long serialVersionUID = 8094547886072529208L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public final AbstractC73945T0j LJLILLLLZI;
    public final AtomicReference<InterfaceC73651SvP> LJLJI = new AtomicReference<>();
    public final AtomicLong LJLJJI = new AtomicLong();
    public final boolean LJLJJL;
    public InterfaceC73650SvO<T> LJLJJLL;

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_operators_flowable_FlowableSubscribeOn$SubscribeOnSubscriber_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    @Override // X.InterfaceC73651SvP
    public void cancel() {
        EnumC73755Sx5.cancel(this.LJLJI);
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC73740Swq
    public void onComplete() {
        this.LJLIL.onComplete();
        this.LJLILLLLZI.dispose();
    }

    public void io_reactivex_internal_operators_flowable_FlowableSubscribeOn$SubscribeOnSubscriber__run$___twin___() {
        lazySet(C16880lQ.LLLLIIIILLL());
        InterfaceC73650SvO<T> interfaceC73650SvO = this.LJLJJLL;
        this.LJLJJLL = null;
        interfaceC73650SvO.subscribe(this);
    }

    public static void io_reactivex_internal_operators_flowable_FlowableSubscribeOn$SubscribeOnSubscriber_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC73756Sx6 runnableC73756Sx6) {
        boolean LIZ;
        try {
            runnableC73756Sx6.io_reactivex_internal_operators_flowable_FlowableSubscribeOn$SubscribeOnSubscriber__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC73740Swq
    public void onError(Throwable th) {
        this.LJLIL.onError(th);
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC73740Swq
    public void onNext(T t) {
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.setOnce(this.LJLJI, interfaceC73651SvP)) {
            long andSet = this.LJLJJI.getAndSet(0L);
            if (andSet != 0) {
                LIZIZ(andSet, interfaceC73651SvP);
            }
        }
    }

    @Override // X.InterfaceC73651SvP
    public void request(long j) {
        if (EnumC73755Sx5.validate(j)) {
            InterfaceC73651SvP interfaceC73651SvP = this.LJLJI.get();
            if (interfaceC73651SvP != null) {
                LIZIZ(j, interfaceC73651SvP);
                return;
            }
            V2B.LIZ(this.LJLJJI, j);
            InterfaceC73651SvP interfaceC73651SvP2 = this.LJLJI.get();
            if (interfaceC73651SvP2 == null) {
                return;
            }
            long andSet = this.LJLJJI.getAndSet(0L);
            if (andSet == 0) {
                return;
            }
            LIZIZ(andSet, interfaceC73651SvP2);
        }
    }

    public final void LIZIZ(long j, InterfaceC73651SvP interfaceC73651SvP) {
        if (this.LJLJJL || C16880lQ.LLLLIIIILLL() == get()) {
            interfaceC73651SvP.request(j);
        } else {
            this.LJLILLLLZI.LIZIZ(new RunnableC73765SxF(j, interfaceC73651SvP));
        }
    }

    public RunnableC73756Sx6(InterfaceC73740Swq interfaceC73740Swq, AbstractC73945T0j abstractC73945T0j, AbstractC73745Swv abstractC73745Swv, boolean z) {
        this.LJLIL = interfaceC73740Swq;
        this.LJLILLLLZI = abstractC73945T0j;
        this.LJLJJLL = abstractC73745Swv;
        this.LJLJJL = !z;
    }
}
