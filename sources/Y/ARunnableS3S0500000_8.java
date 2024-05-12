package Y;

import X.C141335gf;
import X.C3C5;
import X.C48966JJq;
import X.C50989Jzl;
import X.C68182ly;
import X.C76800UCe;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.LynxExposeHelper;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ARunnableS3S0500000_8 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Object LIZ;
        LynxExposeHelper.ExposeView exposeView = (LynxExposeHelper.ExposeView) this.l0;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS it = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) this.l1;
        o.LJIIIIZZ(it, "it");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.l2;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = (ViewTreeObserver.OnWindowFocusChangeListener) this.l3;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.l4;
        if (exposeView.LJLJJL) {
            LifecycleOwner LIZ2 = C48966JJq.LIZ(it);
            if (LIZ2 != null || (LIZ2 = C50989Jzl.LJ()) != null) {
                C68182ly.LIZLLL(LIZ2, exposeView);
            }
            ViewTreeObserver viewTreeObserver = exposeView.LJLJJLL;
            if (viewTreeObserver != null) {
                try {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
                    viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                if (m10exceptionOrNullimpl != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("viewTReeObserver error:");
                    LIZ3.append(m10exceptionOrNullimpl.getMessage());
                    X1D.LIZIZ(LIZ3);
                    exposeView.LIZJ();
                }
            }
            exposeView.LJLJJL = false;
        }
    }

    public static final void run$0(ARunnableS3S0500000_8 aRunnableS3S0500000_8) {
        boolean LIZ;
        try {
            LynxExposeHelper.ExposeView exposeView = (LynxExposeHelper.ExposeView) aRunnableS3S0500000_8.l0;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS it = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) aRunnableS3S0500000_8.l1;
            o.LJIIIIZZ(it, "it");
            exposeView.LIZ(it, (ViewTreeObserver.OnGlobalLayoutListener) aRunnableS3S0500000_8.l2, (ViewTreeObserver.OnWindowFocusChangeListener) aRunnableS3S0500000_8.l3, (ViewTreeObserver.OnScrollChangedListener) aRunnableS3S0500000_8.l4);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0500000_8 aRunnableS3S0500000_8) {
        boolean LIZ;
        try {
            aRunnableS3S0500000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S0500000_8(LynxExposeHelper.ExposeView exposeView, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, int i) {
        this.$t = i;
        this.l0 = exposeView;
        this.l1 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.l2 = onGlobalLayoutListener;
        this.l3 = onWindowFocusChangeListener;
        this.l4 = onScrollChangedListener;
    }
}
