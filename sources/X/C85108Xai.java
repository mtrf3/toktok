package X;

import Y.ARunnableS34S0200000_15;
import Y.IDLListenerS11S0300000_15;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.lang.ref.WeakReference;

/* renamed from: X.Xai, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85108Xai implements InterfaceC64217PIf {
    public String LJLILLLLZI;
    public IDLListenerS11S0300000_15 LJLJI;
    public ARunnableS34S0200000_15 LJLJJI;
    public long LJLJJLL;
    public boolean LJLJL;
    public long LJLIL = -1;
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());

    @Override // X.InterfaceC64217PIf
    public final void LIZJ(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LJFF(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LJI(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LJII(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void onActivityStarted(Activity activity) {
    }

    public final void LIZ(Activity activity) {
        this.LJLIL = System.currentTimeMillis();
        String LJLLILLLL = C16880lQ.LJLLILLLL(activity.getClass());
        this.LJLILLLLZI = LJLLILLLL;
        Integer LIZ = C2LC.LIZ(LJLLILLLL);
        if (LIZ == null) {
            return;
        }
        WeakReference weakReference = new WeakReference(activity.getWindow().getDecorView());
        this.LJLJI = new IDLListenerS11S0300000_15(this, weakReference, LIZ, 1);
        ((View) weakReference.get()).getViewTreeObserver().addOnGlobalLayoutListener(this.LJLJI);
        ARunnableS34S0200000_15 aRunnableS34S0200000_15 = new ARunnableS34S0200000_15(weakReference, this, 74);
        this.LJLJJI = aRunnableS34S0200000_15;
        this.LJLJJL.postDelayed(aRunnableS34S0200000_15, this.LJLJJLL);
    }

    @Override // X.InterfaceC64217PIf
    public final void LIZLLL(Activity activity) {
        this.LJLIL = 0L;
        try {
            if (this.LJLJI != null) {
                activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.LJLJI);
                this.LJLJI = null;
            }
            ARunnableS34S0200000_15 aRunnableS34S0200000_15 = this.LJLJJI;
            if (aRunnableS34S0200000_15 != null) {
                this.LJLJJL.removeCallbacks(aRunnableS34S0200000_15);
                this.LJLJJI = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC64217PIf
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(activity) || !this.LJLJL) {
            return;
        }
        try {
            LIZ(activity);
        } catch (Exception unused) {
        }
    }
}
