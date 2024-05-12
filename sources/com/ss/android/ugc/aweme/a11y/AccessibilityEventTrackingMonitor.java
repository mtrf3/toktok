package com.ss.android.ugc.aweme.a11y;

import X.C12460eI;
import X.C16880lQ;
import X.C40206FqE;
import X.C55242LmA;
import X.C65352Pkq;
import X.C84355X8t;
import X.C84356X8u;
import X.C84357X8v;
import X.EF7;
import X.EnumC84359X8x;
import X.InterfaceC74236TBo;
import X.J1R;
import X.TBV;
import X.X1V;
import X.X1W;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import ujb.o;

/* loaded from: classes16.dex */
public final class AccessibilityEventTrackingMonitor {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public static final X1W Companion;
    public static volatile AccessibilityEventTrackingMonitor monitor;
    public boolean hasListen;
    public boolean isAppForeground;
    public C84355X8t observer;
    public final C55242LmA context$delegate = new C55242LmA(C84357X8v.LJLIL);
    public final Handler uiHandler = new Handler(C16880lQ.LLJJJJ());
    public final C84356X8u appBackGroundListener = new C84356X8u(this);

    static {
        TBV tbv = new TBV(AccessibilityEventTrackingMonitor.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbv};
        Companion = new X1W();
    }

    public final void addAppBackGroundListener() {
        ActivityStack.addAppBackGroundListener(this.appBackGroundListener);
    }

    public final Context getContext() {
        return (Context) this.context$delegate.LIZ($$delegatedProperties[0]);
    }

    public final void addNewLifeCycleCallbacks() {
        ((Application) EF7.LIZIZ()).registerActivityLifecycleCallbacks(new X1V(this));
    }

    public final void trackSettingEnd() {
        String LIZ = J1R.LIZ(btmMapping(C12460eI.LJFF()));
        for (EnumC84359X8x enumC84359X8x : EnumC84359X8x.values()) {
            C40206FqE.LIZIZ(enumC84359X8x, null, LIZ, "app_pause");
        }
    }

    private final void setContext(Context context) {
        this.context$delegate.LIZIZ($$delegatedProperties[0], context);
    }

    private final void trackSettingStart(Context context) {
        String LIZ = J1R.LIZ(btmMapping(C12460eI.LJFF()));
        for (EnumC84359X8x enumC84359X8x : EnumC84359X8x.values()) {
            C40206FqE.LIZJ(enumC84359X8x, context, LIZ, "app_start");
        }
    }

    public final String btmMapping(String str) {
        if (TextUtils.equals(J1R.LIZ(str), str)) {
            if (str != null) {
                return o.LJJJJZ(str, "cd", "", false);
            }
            return null;
        }
        return str;
    }

    public final void startAccessibilityEventTracking(Context context) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        trackSettingStart(context);
        startListen(context);
    }

    public final void startListen(Context context) {
        boolean z;
        setContext(context);
        if (!this.hasListen) {
            try {
                C84355X8t c84355X8t = new C84355X8t(this, this.uiHandler);
                this.observer = c84355X8t;
                ContentResolver contentResolver = C16880lQ.LLLLL(context).getContentResolver();
                Uri uri = Settings.Secure.CONTENT_URI;
                if (Build.VERSION.SDK_INT > 28) {
                    z = true;
                } else {
                    z = false;
                }
                contentResolver.registerContentObserver(uri, z, c84355X8t);
                this.hasListen = true;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (this.isAppForeground) {
            this.isAppForeground = false;
            trackSettingStart(context);
        }
    }

    public final void stopListen(Context context) {
        setContext(null);
        if (this.hasListen) {
            try {
                C84355X8t c84355X8t = this.observer;
                if (c84355X8t != null) {
                    context.getContentResolver().unregisterContentObserver(c84355X8t);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            this.observer = null;
            this.hasListen = false;
        }
    }
}
