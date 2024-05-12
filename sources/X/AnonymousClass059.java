package X;

import X.C04A;
import X.C24770y9;
import X.C29U;
import X.C3C5;
import X.C529926d;
import X.C76800UCe;
import X.InterfaceC67352kd;
import X.XKX;
import X.XKY;
import Y.IDCListenerS113S0200000;
import Y.IDCListenerS241S0100000;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

/* renamed from: X.059, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass059 {
    public static final AtomicReference<AnonymousClass056> LIZ;

    static {
        AnonymousClass056.LIZ.getClass();
        LIZ = new AtomicReference<>(new AnonymousClass056() { // from class: X.1A2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v7, types: [T, X.1qF] */
            @Override // X.AnonymousClass056
            public final C36001bA LIZ(final View rootView) {
                MBA mba;
                MBA plus;
                Lifecycle lifecycle;
                o.LJIIIZ(rootView, "rootView");
                MBB coroutineContext = MBB.INSTANCE;
                o.LJIIIZ(coroutineContext, "coroutineContext");
                if (coroutineContext.get(C3CQ.LJJIJLIJ) == null || coroutineContext.get(InterfaceC44041o8.LJJLIL) == null) {
                    if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                        mba = (MBA) C29Y.LJLLI.getValue();
                    } else {
                        mba = C29Y.LJLLILLLL.get();
                        if (mba == null) {
                            "no AndroidUiDispatcher for this thread".toString();
                            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                        }
                    }
                    plus = mba.plus(coroutineContext);
                } else {
                    plus = coroutineContext;
                }
                InterfaceC44041o8 interfaceC44041o8 = (InterfaceC44041o8) plus.get(InterfaceC44041o8.LJJLIL);
                final C529926d c529926d = 0;
                if (interfaceC44041o8 != null) {
                    C529926d c529926d2 = new C529926d(interfaceC44041o8);
                    C24770y9 c24770y9 = c529926d2.LJLILLLLZI;
                    synchronized (c24770y9.LIZ) {
                        c24770y9.LIZLLL = false;
                        c529926d = c529926d2;
                    }
                }
                final C68322mC c68322mC = new C68322mC();
                MBD mbd = plus.get(InterfaceC41991kp.LJJJIL);
                MBD mbd2 = mbd;
                if (mbd == null) {
                    ?? c45351qF = new C45351qF();
                    c68322mC.element = c45351qF;
                    mbd2 = c45351qF;
                }
                if (c529926d != 0) {
                    coroutineContext = c529926d;
                }
                MBA plus2 = plus.plus(coroutineContext).plus(mbd2);
                final C36001bA c36001bA = new C36001bA(plus2);
                final C64962gm LIZ2 = C48841JEv.LIZ(plus2);
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(rootView);
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    rootView.addOnAttachStateChangeListener(new IDCListenerS113S0200000(rootView, c36001bA, 1));
                    lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                            o.LJIIIZ(lifecycleOwner2, "lifecycleOwner");
                            o.LJIIIZ(event, "event");
                            int i = C04A.LIZ[event.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 4) {
                                            return;
                                        }
                                        c36001bA.LJJI();
                                        return;
                                    } else {
                                        C529926d c529926d3 = c529926d;
                                        if (c529926d3 == null) {
                                            return;
                                        }
                                        c529926d3.LIZLLL();
                                        return;
                                    }
                                }
                                C529926d c529926d4 = c529926d;
                                if (c529926d4 == null) {
                                    return;
                                }
                                C24770y9 c24770y92 = c529926d4.LJLILLLLZI;
                                synchronized (c24770y92.LIZ) {
                                    if (c24770y92.LIZ()) {
                                        return;
                                    }
                                    List<InterfaceC67352kd<C76800UCe>> list = c24770y92.LIZIZ;
                                    c24770y92.LIZIZ = c24770y92.LIZJ;
                                    c24770y92.LIZJ = list;
                                    c24770y92.LIZLLL = true;
                                    int size = list.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        InterfaceC67352kd<C76800UCe> interfaceC67352kd = list.get(i2);
                                        C76800UCe c76800UCe = C76800UCe.LIZ;
                                        C3C5.m7constructorimpl(c76800UCe);
                                        interfaceC67352kd.resumeWith(c76800UCe);
                                    }
                                    list.clear();
                                    return;
                                }
                            }
                            XKX.LIZLLL(LIZ2, null, XKY.UNDISPATCHED, new C29U(c68322mC, c36001bA, lifecycleOwner2, this, rootView, null), 1);
                        }
                    });
                    return c36001bA;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ViewTreeLifecycleOwner not found from ");
                LIZ3.append(rootView);
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                LIZIZ2.toString();
                throw new IllegalStateException(LIZIZ2);
            }
        });
    }

    public static C36001bA LIZ(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        C36001bA LIZ2 = LIZ.get().LIZ(rootView);
        rootView.setTag(R.id.a4z, LIZ2);
        C780334l c780334l = C780334l.LJLIL;
        Handler handler = rootView.getHandler();
        o.LJIIIIZZ(handler, "rootView.handler");
        rootView.addOnAttachStateChangeListener(new IDCListenerS241S0100000(XKX.LIZLLL(c780334l, EXR.LIZIZ(handler, "windowRecomposer cleanup").LJLJJI, null, new C29Z(LIZ2, rootView, null), 2), 3));
        return LIZ2;
    }
}
