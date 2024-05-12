package com.ss.android.ugc.aweme.promote;

import X.AnonymousClass114;
import X.C03880Dg;
import X.C16880lQ;
import X.C1FJ;
import X.C26045AKb;
import X.C38333F2r;
import X.C65300Pk0;
import X.C88546Yp4;
import X.EF7;
import X.F9J;
import X.HG3;
import X.M5H;
import X.M5I;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public class PromoteGdprManager implements WeakHandler.IHandler {
    public static SharedPreferences mSharedPreferences;
    public static PromoteGdprManager sPromoteGdprManager;
    public static M5I sPromoteNotificationDialog;
    public WeakReference<Activity> mActivityRef;
    public WeakHandler mHandler = new WeakHandler(this);
    public PopupSetting mPromoteGdprConfig;

    public static void com_ss_android_ugc_aweme_promote_PromoteGdprManager_com_ss_android_ugc_aweme_promote_PromoteNotificationDialog_show(M5I m5i) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/promote/PromoteNotificationDialog", "show", m5i, new Object[0], "void", new C65300Pk0(false, "()V", "6868498518825582820")).LIZ) {
            return;
        }
        m5i.show();
    }

    private SharedPreferences getSharePref() {
        if (mSharedPreferences == null) {
            mSharedPreferences = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme-gdpr-dialog");
        }
        return mSharedPreferences;
    }

    public static PromoteGdprManager inst() {
        if (sPromoteGdprManager == null) {
            synchronized (PromoteGdprManager.class) {
                if (sPromoteGdprManager == null) {
                    sPromoteGdprManager = new PromoteGdprManager();
                }
            }
        }
        return sPromoteGdprManager;
    }

    private boolean shouldPopup() {
        WeakReference<Activity> weakReference;
        if (this.mPromoteGdprConfig == null || (weakReference = this.mActivityRef) == null || weakReference.get() == null) {
            return false;
        }
        this.mPromoteGdprConfig = null;
        String curUserId = HG3.LJIILL().getCurUserId();
        SharedPreferences sharePref = getSharePref();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("last_pop_time_");
        LIZ.append(curUserId);
        if (DateUtils.isToday(sharePref.getLong(X1D.LIZIZ(LIZ), 0L))) {
            return false;
        }
        try {
            SharedPreferences.Editor edit = getSharePref().edit();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("last_pop_time_");
            LIZ2.append(curUserId);
            edit.putLong(X1D.LIZIZ(LIZ2), System.currentTimeMillis());
            edit.apply();
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return true;
        }
    }

    private void handlePopup() {
        if (shouldPopup()) {
            M5I m5i = new M5I(this.mActivityRef.get(), this.mPromoteGdprConfig);
            sPromoteNotificationDialog = m5i;
            m5i.setOnDismissListener(new M5H());
            com_ss_android_ugc_aweme_promote_PromoteGdprManager_com_ss_android_ugc_aweme_promote_PromoteNotificationDialog_show(sPromoteNotificationDialog);
        }
    }

    private void onJoin(boolean z) {
        String curUserId = HG3.LJIILL().getCurUserId();
        SharedPreferences.Editor edit = getSharePref().edit();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joined_");
        LIZ.append(curUserId);
        edit.putBoolean(X1D.LIZIZ(LIZ), z);
        edit.apply();
    }

    private void requestPopup(int i) {
        requestPopup(this.mHandler, i);
    }

    private void requestShowPromoteNotification(int i) {
        requestPopup(i);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) obj;
            Activity activity = this.mActivityRef.get();
            if (activity != null) {
                C1FJ.LJI(c38333F2r, new C26045AKb(activity));
                return;
            }
            return;
        }
        if (obj instanceof Exception) {
            Activity activity2 = this.mActivityRef.get();
            if (activity2 != null) {
                AnonymousClass114.LIZ(activity2, R.string.imh);
                return;
            }
            return;
        }
        if (obj instanceof PromoteGdprResponse) {
            boolean z = true;
            if (i == 1) {
                PromoteGdprResponse promoteGdprResponse = (PromoteGdprResponse) obj;
                if (promoteGdprResponse != null) {
                    Boolean bool = promoteGdprResponse.signed;
                    if (bool == null || !bool.booleanValue()) {
                        z = false;
                    }
                    onJoin(z);
                    handlePopup();
                    return;
                }
                return;
            }
        }
        if (i != 2) {
            return;
        }
        this.mPromoteGdprConfig = C88546Yp4.LIZIZ.LIZJ("gdpr_popup");
        handlePopup();
    }

    private void requestPopup(WeakHandler weakHandler, int i) {
        String curUserId = HG3.LJIILL().getCurUserId();
        SharedPreferences sharePref = getSharePref();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("last_pop_time_");
        LIZ.append(curUserId);
        if (DateUtils.isToday(sharePref.getLong(X1D.LIZIZ(LIZ), 0L))) {
            handlePopup();
        } else {
            C88546Yp4.LIZIZ.LJ(weakHandler, 2, i);
        }
    }

    public void tryToShowPromoteNotification(Activity activity, int i) {
        if (activity == null || activity.isFinishing() || !HG3.LJIILL().isLogin()) {
            return;
        }
        M5I m5i = sPromoteNotificationDialog;
        if (m5i != null) {
            m5i.dismiss();
            sPromoteNotificationDialog = null;
        }
        WeakReference<Activity> weakReference = this.mActivityRef;
        if (weakReference == null || activity != weakReference.get()) {
            this.mActivityRef = new WeakReference<>(activity);
        }
        requestPopup(i);
    }

    public static void jmpToWeb(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(str)) {
            str = "https://www.tiktok.com/aweme/inapp/v2/ad_agreement?hide_nav_bar=1";
        }
        intent.setData(UriProtector.parse(str));
        intent.putExtra("hide_nav_bar", true);
        if (TextUtils.isEmpty(str2)) {
            str2 = context.getResources().getString(R.string.phk);
        }
        intent.putExtra("title", str2);
        intent.putExtra("aweme_model", bundle);
        C16880lQ.LIZJ(context, intent);
    }
}
