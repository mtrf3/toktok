package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class G48 implements InterfaceC86124Xr6, InterfaceC87439YTj {
    public C85973Xof LIZ;

    @Override // X.InterfaceC86124Xr6
    public Context attachPreBaseContext(Context context) {
        return context;
    }

    @Override // X.InterfaceC86124Xr6
    public void finish() {
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityReenter(int i, Intent intent) {
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC86124Xr6
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public final C85973Xof LJIILJJIL() {
        C85973Xof c85973Xof = this.LIZ;
        if (c85973Xof != null) {
            return c85973Xof;
        }
        o.LJIJI("configuration");
        throw null;
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityPaused(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostPaused(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityPostResumed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostStarted(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostStopped(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPreDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPrePaused(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityPreResumed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPreStarted(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPreStopped(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityResumed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityStarted(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityStopped(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public void onPreRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
    }

    @Override // X.InterfaceC86124Xr6
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
    }

    @Override // X.InterfaceC86124Xr6
    public void onSupportContentChanged(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC87439YTj
    public final void LIZ(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
    }

    @Override // X.InterfaceC87439YTj
    public final void LIZIZ(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
    }

    @Override // X.InterfaceC87439YTj
    public final void LIZJ(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
    }

    @Override // X.InterfaceC87439YTj
    public final void LIZLLL(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
    }

    @Override // X.InterfaceC87439YTj
    public final void LJII(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
    }

    @Override // X.InterfaceC87439YTj
    public void LJIIIIZZ(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
    }

    @Override // X.InterfaceC87439YTj
    public final void LJIIJ(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
    }

    @Override // X.InterfaceC87439YTj
    public final void LJIIJJI(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
    }

    @Override // X.InterfaceC87439YTj
    public void LJIIL(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
    }

    @Override // X.InterfaceC87439YTj
    public final void LJIILIIL(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
    }

    @Override // X.InterfaceC86124Xr6
    public void attachBaseContext(Context context, Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostSaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
        G12.LIZ(activityC86117Xqz, bundle);
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivityPreCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPreSaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
        G12.LIZIZ(activityC86117Xqz, bundle);
    }

    @Override // X.InterfaceC86124Xr6
    public void onActivitySaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
        G12.LIZJ(activityC86117Xqz, bundle);
    }

    @Override // X.InterfaceC86124Xr6
    public void onConfigurationChanged(ActivityC86117Xqz activityC86117Xqz, Configuration configuration) {
        G12.LIZLLL(activityC86117Xqz, configuration);
    }

    @Override // X.InterfaceC86124Xr6
    public void onWindowFocusChanged(ActivityC86117Xqz activity, boolean z) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void setContentView(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void setContentView(Activity activity, View view) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC87439YTj
    public final void LJ(FragmentManager fm, BaseFragment f, Context context) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC87439YTj
    public final void LJI(FragmentManager fm, BaseFragment f, Bundle outState) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(outState, "outState");
    }

    @Override // X.InterfaceC87439YTj
    public void LJIIIZ(FragmentManager fm, BaseFragment f, Context context) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC87439YTj
    public void LJFF(FragmentManager fm, BaseFragment f, View v, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(v, "v");
    }
}
