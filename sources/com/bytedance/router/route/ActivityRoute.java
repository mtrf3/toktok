package com.bytedance.router.route;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C78598Ut0;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.FakeFragment;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;

/* loaded from: classes11.dex */
public class ActivityRoute extends SysComponentRoute {
    @Override // com.bytedance.router.route.SysComponentRoute
    public void openComponent(Context context, Intent intent) {
        RouteIntent routeIntent = getRouteIntent();
        if (context instanceof Activity) {
            if (getRouteIntent().getAnimationBundle() == null) {
                normalStart(context, routeIntent, intent);
                return;
            } else {
                activityCompatStart(context, routeIntent, intent);
                return;
            }
        }
        applicationStart(context, routeIntent, intent);
    }

    private void activityCompatStart(Context context, RouteIntent routeIntent, Intent intent) {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        C16880lQ.LJ(context, intent, getRouteIntent().getAnimationBundle());
    }

    private void applicationStart(Context context, RouteIntent routeIntent, Intent intent) {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        intent.addFlags(268435456);
        C16880lQ.LIZJ(context, intent);
        if (routeIntent.hasRequestCode()) {
            Logger.e("SmartRoute.open(int requestCode):the context must be Activity !!!");
        }
        if (routeIntent.getEnterAnim() != -1 || routeIntent.getExitAnim() != -1) {
            Logger.e("SmartRoute.withAnimation(int enterAnim, int exitAnim):the context must be Activity !!!");
        }
    }

    private void normalStart(Context context, RouteIntent routeIntent, Intent intent) {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        if (routeIntent.hasRequestCode()) {
            Activity activity = (Activity) context;
            Fragment fragment = routeIntent.getFragment();
            if (fragment != null) {
                C16880lQ.LJII(fragment, intent, routeIntent.getRequestCode());
            } else if (routeIntent.getOnActivityResultCallback() != null && (activity instanceof ActivityC45651qj)) {
                FakeFragment fakeFragment = new FakeFragment();
                fakeFragment.setCallback(routeIntent.getOnActivityResultCallback());
                FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
                C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(System.currentTimeMillis());
                LIZ2.append("");
                LIZ.LJIIIIZZ(0, 1, fakeFragment, X1D.LIZIZ(LIZ2));
                LIZ.LJIILLIIL();
                int requestCode = routeIntent.getRequestCode();
                C78598Ut0.LJIJJ(intent, fakeFragment);
                fakeFragment.startActivityForResult(intent, requestCode);
            } else {
                C16880lQ.LJFF(activity, routeIntent.getRequestCode(), intent);
            }
        } else {
            C16880lQ.LIZJ(context, intent);
        }
        if (routeIntent.getEnterAnim() != -1 || routeIntent.getExitAnim() != -1) {
            ((Activity) context).overridePendingTransition(getRouteIntent().getEnterAnim(), getRouteIntent().getExitAnim());
        }
    }
}
