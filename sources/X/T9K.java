package X;

import android.app.Activity;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T9K {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final Activity LIZJ;
    public final C80896Voy LIZLLL;
    public final Handler LJ;
    public final String LJFF;
    public final int LJI;
    public C7XR LJII;
    public T9L LJIIIIZZ;
    public long LJIIIZ;

    public final void LIZIZ() {
        T9L t9l = this.LJIIIIZZ;
        if (t9l != null) {
            C2NU.LIZ.LIZLLL(t9l);
        }
        C7XR c7xr = this.LJII;
        if (c7xr != null) {
            this.LJ.removeCallbacks(c7xr);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7XR] */
    public final void LIZ(final Exception exc) {
        final T9L t9l = new T9L(this);
        this.LJIIIIZZ = t9l;
        final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
        final Activity activity = this.LIZJ;
        final C80896Voy c80896Voy = this.LIZLLL;
        final String str = this.LJFF;
        final int i = this.LJI;
        this.LJII = new Runnable(interfaceC65784Pro, activity, c80896Voy, t9l, str, i, exc) { // from class: X.7XR
            public final InterfaceC65784Pro<C76800UCe> LJLIL;
            public final Activity LJLILLLLZI;
            public final C80896Voy LJLJI;
            public final InterfaceC69602oG LJLJJI;
            public final String LJLJJL;
            public final int LJLJJLL;
            public final Exception LJLJL;

            public final void LIZ() {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2;
                Activity activity2 = this.LJLILLLLZI;
                if (activity2 != null) {
                    if (this.LJLJJLL == 0) {
                        C25678A5y.LIZ(activity2, this.LJLJJL, this.LJLJL, null);
                        C80896Voy c80896Voy2 = this.LJLJI;
                        if ((c80896Voy2 == null || c80896Voy2.getVisibility() != 0) && (interfaceC65784Pro2 = this.LJLIL) != null) {
                            interfaceC65784Pro2.invoke();
                        }
                        InterfaceC69602oG interfaceC69602oG = this.LJLJJI;
                        if (interfaceC69602oG != null) {
                            C2NU.LIZ.LIZLLL(interfaceC69602oG);
                        }
                        C80896Voy c80896Voy3 = this.LJLJI;
                        if (c80896Voy3 == null) {
                            return;
                        }
                        c80896Voy3.setRefreshing(false);
                        return;
                    }
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJLIL;
                    if (interfaceC65784Pro3 == null) {
                        return;
                    }
                    interfaceC65784Pro3.invoke();
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

            {
                o.LJIIIZ(str, "scene");
                this.LJLIL = interfaceC65784Pro;
                this.LJLILLLLZI = activity;
                this.LJLJI = c80896Voy;
                this.LJLJJI = t9l;
                this.LJLJJL = str;
                this.LJLJJLL = i;
                this.LJLJL = exc;
            }
        };
        long currentTimeMillis = System.currentTimeMillis() - this.LJIIIZ;
        this.LJIIIZ = currentTimeMillis;
        if (currentTimeMillis >= 2000) {
            C7XR c7xr = this.LJII;
            if (c7xr != null) {
                this.LJ.post(c7xr);
                return;
            }
            return;
        }
        C2NU.LIZ.LIZ(this.LJIIIIZZ);
        C7XR c7xr2 = this.LJII;
        if (c7xr2 == null) {
            return;
        }
        this.LJ.postDelayed(c7xr2, LiveNetAdaptiveHurryTimeSetting.DEFAULT - this.LJIIIZ);
    }

    public /* synthetic */ T9K(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, ActivityC45651qj activityC45651qj, C80896Voy c80896Voy, WeakHandler weakHandler, String str) {
        this(interfaceC65784Pro, interfaceC65784Pro2, activityC45651qj, c80896Voy, weakHandler, str, 0);
    }

    public T9K(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, Activity activity, C80896Voy c80896Voy, Handler handler, String str, int i) {
        o.LJIIIZ(handler, "handler");
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = interfaceC65784Pro2;
        this.LIZJ = activity;
        this.LIZLLL = c80896Voy;
        this.LJ = handler;
        this.LJFF = str;
        this.LJI = i;
    }
}
