package com.ss.android.ugc.awemepushapi;

import X.C022406y;
import X.C39047FUd;
import X.QSE;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface IPushApi {
    public static final C39047FUd Companion = C39047FUd.LIZ;

    boolean checkChannelStatus(Context context, String str);

    void clearAll(Context context);

    void clearNotificationId(String str, Context context, int i);

    void deletePushExpiredCache();

    Object getCancelNotiTask();

    List<String> getFromNotificationIds();

    Aweme getPushCacheAweme(String str);

    String getRealChannelId(String str);

    void handleLocalMessage(Context context, String str);

    void init(Context context, QSE qse);

    void initImmediately(Context context, QSE qse);

    void initMessageDepend();

    void initNotificationChannel();

    boolean isNotificationIdContains(String str);

    boolean isNotifyEnabled(Context context);

    boolean isPersonalizedVideoPush(String str);

    boolean isPushProcess(Context context);

    boolean isSswoAct(Activity activity);

    boolean isSystemNotifyChannel(String str);

    boolean isVideoPush(String str);

    Aweme loadPushCacheSync(String str);

    void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri);

    void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i, String str, int i2, String str2);

    void preloadPushCacheAsync(String str);

    void removeRedBadge(Context context);

    void sendPushShowInterceptEvent(String str, int i, String str2);

    void setAutoDisappear(int i);

    boolean setCancelIntent(Context context, Intent intent, C022406y c022406y, boolean z);

    void startPushProcess(Context context);
}
