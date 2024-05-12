package com.byted.cast.usbsource.usbdisplaysource;

import X.C38891fp;
import X.C65803Ps7;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

/* loaded from: classes29.dex */
public class UsbSourceActivity extends Activity {
    public static UsbSourceServer mServer;

    public void com_byted_cast_usbsource_usbdisplaysource_UsbSourceActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        com_byted_cast_usbsource_usbdisplaysource_UsbSourceActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    public static void com_byted_cast_usbsource_usbdisplaysource_UsbSourceActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(UsbSourceActivity usbSourceActivity) {
        usbSourceActivity.com_byted_cast_usbsource_usbdisplaysource_UsbSourceActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                usbSourceActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_byted_cast_usbsource_usbdisplaysource_UsbSourceActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(UsbSourceActivity usbSourceActivity) {
        com_byted_cast_usbsource_usbdisplaysource_UsbSourceActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(usbSourceActivity);
        try {
            usbSourceActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    public static void setRootView(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                childAt.setFitsSystemWindows(true);
                ((ViewGroup) childAt).setClipToPadding(true);
            }
        }
    }

    public static void setTransparent(Activity activity) {
        transparentStatusBar(activity);
        setRootView(activity);
    }

    public static void transparentStatusBar(Activity activity) {
        activity.getWindow().addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().addFlags(134217728);
        activity.getWindow().setStatusBarColor(0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        setTransparent(this);
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        UsbSourceServer usbSourceServer = UsbSourceServer.getInstance(this, applicationContext);
        mServer = usbSourceServer;
        usbSourceServer.checkAccessory();
        finish();
    }
}
