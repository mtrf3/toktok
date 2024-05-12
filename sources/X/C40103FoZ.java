package X;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.FoZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40103FoZ extends G46 {
    public static int LJFF;
    public String LIZJ;
    public FK8 LIZLLL;
    public int LJ;

    @Override // X.G46, X.G48, X.InterfaceC86124Xr6
    public final void onActivityDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZIZ = null;
        FK8 fk8 = this.LIZLLL;
        if (fk8 != null) {
            C10760bY.LIZ(activity).LIZLLL(fk8);
        }
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityPaused(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        InterfaceC40105Fob LIZ = C39328Fc4.LIZ();
        if (LIZ != null) {
            LIZ.onActivityPaused(activity);
        }
        C84763XOl.LJIIJ(null);
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityPreResumed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        C84763XOl.LJIIJ(activity);
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityResumed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        InterfaceC40105Fob LIZ = C39328Fc4.LIZ();
        if (LIZ != null) {
            LIZ.onActivityResumed(activity);
        }
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityStarted(ActivityC86117Xqz activity) {
        InterfaceC39329Fc5 interfaceC39329Fc5;
        o.LJIIIZ(activity, "activity");
        if (this.LJ == 0 && (interfaceC39329Fc5 = C39328Fc4.LIZIZ) != null) {
            interfaceC39329Fc5.LIZ();
        }
        this.LJ++;
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityStopped(ActivityC86117Xqz activity) {
        InterfaceC39329Fc5 interfaceC39329Fc5;
        o.LJIIIZ(activity, "activity");
        int i = this.LJ - 1;
        this.LJ = i;
        if (i == 0 && (interfaceC39329Fc5 = C39328Fc4.LIZIZ) != null) {
            interfaceC39329Fc5.LIZ();
        }
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
        if (savedInstanceState.containsKey("abs_Activity_Key")) {
            this.LIZJ = savedInstanceState.getString("abs_Activity_Key");
        }
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onSupportContentChanged(ActivityC86117Xqz activity) {
        InterfaceC28616BKy interfaceC28616BKy;
        View findViewById;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        o.LJIIIZ(activity, "activity");
        Iterator<InterfaceC28616BKy> it = LJIILJJIL().LIZ().iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC28616BKy = it.next();
                if (interfaceC28616BKy instanceof C40104Foa) {
                    break;
                }
            } else {
                interfaceC28616BKy = null;
                break;
            }
        }
        if (!(interfaceC28616BKy instanceof C40104Foa)) {
            interfaceC28616BKy = null;
        }
        C40104Foa c40104Foa = (C40104Foa) interfaceC28616BKy;
        if ((c40104Foa != null && c40104Foa.LJLILLLLZI) || (findViewById = activity.findViewById(R.id.nq)) == null) {
            return;
        }
        ViewParent parent = findViewById.getParent();
        if ((parent instanceof FrameLayout) && (viewGroup = (ViewGroup) parent) != null) {
            View findViewById2 = activity.findViewById(android.R.id.content);
            if ((findViewById2 instanceof FrameLayout) && (viewGroup2 = (ViewGroup) findViewById2) != null && viewGroup2.getChildCount() == 1) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeAllViews();
                viewGroup.addView(childAt);
                findViewById2.setId(-1);
                viewGroup.setId(android.R.id.content);
            }
        }
    }

    @Override // X.G46, X.G48, X.InterfaceC86124Xr6
    public final void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
        String LIZIZ;
        InterfaceC28616BKy interfaceC28616BKy;
        o.LJIIIZ(activity, "activity");
        super.onActivityCreated(activity, bundle);
        this.LJ = 0;
        if (bundle != null && bundle.containsKey("abs_Activity_Key")) {
            LIZIZ = bundle.getString("abs_Activity_Key");
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LJLLILLLL(C40103FoZ.class));
            LIZ.append('@');
            int i = LJFF;
            LJFF = i + 1;
            LIZ.append(i);
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        this.LIZJ = LIZIZ;
        Iterator<InterfaceC28616BKy> it = LJIILJJIL().LIZ().iterator();
        do {
            interfaceC28616BKy = null;
            if (!it.hasNext()) {
                break;
            } else {
                interfaceC28616BKy = it.next();
            }
        } while (!(interfaceC28616BKy instanceof C40104Foa));
        boolean z = interfaceC28616BKy instanceof C40104Foa;
        FK8 fk8 = new FK8(activity, this);
        this.LIZLLL = fk8;
        C10760bY.LIZ(activity).LIZIZ(fk8, new IntentFilter("com.ss.android.common.app.action.exit_app"));
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivitySaveInstanceState(ActivityC86117Xqz activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
        G12.LIZJ(activity, outState);
        outState.putString("abs_Activity_Key", this.LIZJ);
        outState.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
    }
}
