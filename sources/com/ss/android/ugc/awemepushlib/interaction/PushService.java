package com.ss.android.ugc.awemepushlib.interaction;

import X.C00F;
import X.C022406y;
import X.C03660Ck;
import X.C09900aA;
import X.C10K;
import X.C16880lQ;
import X.C1791471i;
import X.C36296EMi;
import X.C36582EXi;
import X.C36913EeD;
import X.C36916EeG;
import X.C38354F3m;
import X.C38566FBq;
import X.C38776FJs;
import X.C46254IDi;
import X.C48247Iwd;
import X.C58096Mr6;
import X.C64131PEx;
import X.C67003QRj;
import X.C67011QRr;
import X.C67016QRw;
import X.C67228Qa0;
import X.C67229Qa1;
import X.C67230Qa2;
import X.C76917UGr;
import X.C77123UOp;
import X.C88117Yi9;
import X.CallableC48246Iwc;
import X.CallableC48663J7z;
import X.EE1;
import X.EF7;
import X.EYD;
import X.F9J;
import X.FCD;
import X.FCO;
import X.FM0;
import X.FMA;
import X.FMX;
import X.FZL;
import X.J2Z;
import X.M66;
import X.M6X;
import X.PFS;
import X.QRA;
import X.QRG;
import X.QSA;
import X.QSD;
import X.QSE;
import X.QSH;
import X.QSI;
import X.QSN;
import X.QSP;
import X.WX6;
import X.X1D;
import Y.ARunnableS12S0110000_6;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS17S0110000_11;
import Y.ARunnableS1S0010000_6;
import Y.ARunnableS47S0100000_11;
import Y.AfS36S0101000_5;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import com.ss.android.ugc.awemepushlib.os.receiver.NotificationBroadcastReceiver;
import com.ss.android.ugc.awemepushlib.task.CancelNotificationTask;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PushService implements IPushApi {
    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void deletePushExpiredCache() {
        try {
            C10K.LIZJ(CallableC48246Iwc.LJLIL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initMessageDepend() {
        C67016QRw.LIZ(new C77123UOp());
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isSswoAct(Activity activity) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void startPushProcess(Context context) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public EE1 getCancelNotiTask() {
        return new CancelNotificationTask();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initNotificationChannel() {
        Context LIZIZ = EF7.LIZIZ();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                NotificationManager notificationManager = (NotificationManager) C16880lQ.LLILL(LIZIZ, "notification");
                QSH.LIZ(LIZIZ, notificationManager, QSH.LIZ);
                if (notificationManager != null && notificationManager.getNotificationChannel("com.ss.android.ugc.aweme.server") != null) {
                    notificationManager.deleteNotificationChannel("com.ss.android.ugc.aweme.server");
                }
                if (notificationManager != null && notificationManager.getNotificationChannel("com.ss.android.ugc.aweme.server.important.low") != null) {
                    notificationManager.deleteNotificationChannel("com.ss.android.ugc.aweme.server.important.low");
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public List<String> getFromNotificationIds() {
        return MessageShowHandler.LJFF;
    }

    public static IPushApi createIPushApibyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IPushApi.class, z);
        if (LIZ != null) {
            return (IPushApi) LIZ;
        }
        return new PushService();
    }

    private synchronized boolean getConfirmPush(Context context) {
        return C67003QRj.LJFF().LIZIZ();
    }

    private boolean getNotifyEnabled(Context context) {
        C67003QRj LJFF = C67003QRj.LJFF();
        if (LJFF.LIZ(context)) {
            return LJFF.LJIILL;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void clearAll(Context context) {
        NotificationManager notificationManager = (NotificationManager) C16880lQ.LLILL(context, "notification");
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public Aweme getPushCacheAweme(String awemeId) {
        String str;
        Aweme aweme;
        String str2;
        String str3;
        o.LJIIIZ(awemeId, "awemeId");
        synchronized (C48247Iwd.LJ) {
            Aweme aweme2 = C48247Iwd.LIZLLL;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            if (o.LJ(awemeId, str)) {
                aweme = C48247Iwd.LIZLLL;
                if (C46254IDi.LIZ >= 0 && o.LJ(awemeId, C46254IDi.LJ)) {
                    C46254IDi.LJFF = 1;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("get cache succeed, awemeId: ");
                if (aweme == null) {
                    str2 = null;
                } else {
                    str2 = aweme.getAid();
                }
                LIZ.append(str2);
                LIZ.append(", desc: ");
                if (aweme == null) {
                    str3 = null;
                } else {
                    str3 = aweme.getDesc();
                }
                LIZ.append(str3);
                X1D.LIZIZ(LIZ);
            } else {
                aweme = null;
            }
        }
        C48247Iwd.LIZLLL = null;
        return aweme;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public String getRealChannelId(String str) {
        return QSH.LIZIZ(2, str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isNotificationIdContains(String str) {
        return ((ArrayList) M6X.LIZ).contains(str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isNotifyEnabled(Context context) {
        C67003QRj LJFF = C67003QRj.LJFF();
        if (LJFF.LIZ(context)) {
            return LJFF.LJIILL;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isPersonalizedVideoPush(String str) {
        return J2Z.LIZ.contains(str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isPushProcess(Context context) {
        String LIZ = FCD.LIZ(context);
        if (LIZ != null && (LIZ.endsWith(":push") || LIZ.endsWith(":pushservice"))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isSystemNotifyChannel(String str) {
        return QSH.LIZ.containsKey(str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isVideoPush(String str) {
        return C48247Iwd.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public Aweme loadPushCacheSync(String str) {
        if (str == null) {
            return null;
        }
        Aweme LIZJ = C48247Iwd.LIZJ(str);
        if (LIZJ == null || C46254IDi.LIZ < 0 || !o.LJ(str, C46254IDi.LJ)) {
            return LIZJ;
        }
        C46254IDi.LJFF = 1;
        return LIZJ;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void preloadPushCacheAsync(String str) {
        if (str == null || str.length() == 0 || C48247Iwd.LIZIZ) {
            return;
        }
        C48247Iwd.LIZIZ = true;
        C10K.LIZJ(new CallableC48663J7z(str));
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void removeRedBadge(Context context) {
        AwemeRedBadgerManager awemeRedBadgerManager = AwemeRedBadgerManager.LJLJI;
        awemeRedBadgerManager.getClass();
        if (C38566FBq.LIZ == 0 || C38566FBq.LIZ == 2) {
            awemeRedBadgerManager.LJLILLLLZI.LIZ(0, context);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void setAutoDisappear(int i) {
        C38566FBq.LIZ = i;
    }

    private String getParameterString(Uri uri, String str) {
        try {
            return UriProtector.getQueryParameter(uri, str);
        } catch (Exception unused) {
            return "";
        }
    }

    private synchronized void setConfirmPush(Context context, boolean z) {
        C67003QRj.LJFF().LJIIIZ(context, z);
    }

    private void setNotifyEnabled(Context context, boolean z) {
        C67003QRj LJFF = C67003QRj.LJFF();
        LJFF.LJIILL = z;
        SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, "push_setting").edit();
        edit.putBoolean("notify_enabled", LJFF.LJIILL);
        WX6.LIZ(edit);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean checkChannelStatus(Context context, String str) {
        String realChannelId = getRealChannelId(str);
        NotificationManager notificationManager = (NotificationManager) C16880lQ.LLILL(context, "notification");
        if (Build.VERSION.SDK_INT < 26 || notificationManager == null || notificationManager.getNotificationChannel(realChannelId).getImportance() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void handleLocalMessage(Context context, String str) {
        C67230Qa2 from = C67230Qa2.from(str);
        if (from == null) {
            return;
        }
        HashMap LIZJ = C03660Ck.LIZJ("receive_notification", String.valueOf(from.rid64));
        if (PFS.LIZ != null && C64131PEx.LIZ != null) {
            Npth.addTags(LIZJ);
        }
        if (AwemeRedBadgerManager.LJLJI.LIZJ(context, from)) {
            return;
        }
        QSN.LJFF(from, 10000);
        C67229Qa1 c67229Qa1 = from.extra;
        if (c67229Qa1 != null) {
            c67229Qa1.turn_screen_on = false;
        }
        MessageShowHandler.LJI(10000, context, from);
        C67003QRj LJFF = C67003QRj.LJFF();
        long currentTimeMillis = System.currentTimeMillis();
        if (LJFF.LIZLLL() == null) {
            return;
        }
        LJFF.LIZLLL().edit().putLong("last_notify_time", currentTimeMillis).apply();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void init(Context context, QSE qse) {
        pushInit(context, qse, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initImmediately(Context context, QSE qse) {
        pushInit(context, qse, Boolean.TRUE);
    }

    private void pushInit(Context context, QSE qse, Boolean bool) {
        Keva repo;
        boolean z;
        C67016QRw.LIZ(qse);
        boolean LJI = FCD.LJI(context);
        boolean booleanValue = bool.booleanValue();
        ((LinkedList) C36582EXi.LIZIZ).addFirst(new ARunnableS17S0110000_11(context, LJI, 10));
        if (((Boolean) C88117Yi9.LIZIZ.getValue()).booleanValue() || !LJI || (repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME)) == null || !repo.getBoolean("enable_push_initialize_optimize", false)) {
            z = false;
        } else {
            z = true;
        }
        boolean LIZ = e1.LIZ(31744, "red_badger_impl_opt_exp", true, false);
        StringBuilder LIZLLL = C00F.LIZLLL("PushInitializer, isMainProcess: ", LJI, ", enableAsync:", z, ", enableBadgerImplOpt: ");
        LIZLLL.append(LIZ);
        QSI.LIZ(X1D.LIZIZ(LIZLLL));
        FZL.LIZLLL = LIZ;
        if (LJI) {
            if (!((Boolean) C88117Yi9.LIZJ.getValue()).booleanValue()) {
                if (z) {
                    C36582EXi.LIZ.execute(new ARunnableS47S0100000_11(context, 169));
                } else {
                    QSD.LIZ().getClass();
                    QRG.LIZIZ().getClass();
                    QRG.LIZJ().LJFF(true);
                }
            }
            if (!((Boolean) C88117Yi9.LIZLLL.getValue()).booleanValue()) {
                Context LIZIZ = EF7.LIZIZ();
                if (QRA.LIZJ == null) {
                    QRA.LIZJ = new C36913EeD();
                }
                C36913EeD c36913EeD = QRA.LIZJ;
                synchronized (C36916EeG.class) {
                    C36916EeG.LJI = c36913EeD;
                    C36916EeG.LIZIZ(LIZIZ);
                }
                if (!FCO.LJFF && !z) {
                    C67003QRj.LJFF().LIZLLL = C38776FJs.LJIIL().LIZ(context, "is_allow_oppo_push", true);
                }
            }
            C36582EXi.LIZJ(new ARunnableS15S0101000_11(context, 1, 13));
            o.LJIIIZ(context, "context");
            C36296EMi.LJ(new C67011QRr(context));
            if (((Boolean) C88117Yi9.LJIIIIZZ.getValue()).booleanValue()) {
                QRA.LIZLLL.postAtFrontOfQueue(new ARunnableS12S0110000_6(context, z, 1));
            } else {
                C38566FBq.LIZ(context, z);
                FM0.LIZ.LJJIFFI(new FMA()).LJJJJZI(new AfS36S0101000_5(3, context, 39));
            }
        }
        if (!((Boolean) C88117Yi9.LJ.getValue()).booleanValue()) {
            if (((Boolean) C88117Yi9.LJIIIIZZ.getValue()).booleanValue()) {
                QRA.LIZLLL.postAtFrontOfQueue(new ARunnableS1S0010000_6(z, 3));
            } else {
                EYD.LIZ(z);
            }
        }
        Boolean valueOf = Boolean.valueOf(LJI);
        Boolean valueOf2 = Boolean.valueOf(booleanValue);
        if (valueOf.booleanValue()) {
            C36582EXi.LIZ.execute(new IDRunnableS6S0101000(7, valueOf2, 1));
        } else {
            C36582EXi.LIZ(4);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void clearNotificationId(String str, Context context, int i) {
        NotificationManager notificationManager = (NotificationManager) C16880lQ.LLILL(context, "notification");
        if (notificationManager != null) {
            notificationManager.cancel(str, i);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void sendPushShowInterceptEvent(String str, int i, String str2) {
        C67230Qa2 from = C67230Qa2.from(str);
        if (from == null) {
            return;
        }
        QSN.LJI(from, i, str2);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri) {
        String str;
        long longValue;
        if (!z) {
            QSN.LIZLLL(uri.toString(), false);
            return;
        }
        try {
            int LJJIFFI = C76917UGr.LJJIFFI(-1, "msg_from", intent);
            long LJJIIZI = C76917UGr.LJJIIZI(intent, "msg_id");
            String valueOf = String.valueOf(LJJIIZI);
            HashMap hashMap = new HashMap();
            hashMap.put("click_notification", valueOf);
            if (PFS.LIZ != null && C64131PEx.LIZ != null) {
                Npth.addTags(hashMap);
            }
            HashMap hashMap2 = (HashMap) intent.getSerializableExtra("log_data_extra_to_adsapp");
            if (hashMap2 == null) {
                hashMap2 = new HashMap(8);
                C67228Qa0.LIZJ(uri.toString(), hashMap2);
            }
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "post_back");
            String str2 = (String) hashMap2.get("rule_id");
            if (TextUtils.isEmpty(C16880lQ.LLJJIJIIJIL(intent, "rule_id"))) {
                intent.putExtra("rule_id", str2);
            }
            String parameterString = getParameterString(uri, "push_params");
            if (!TextUtils.isEmpty(parameterString)) {
                hashMap2.put("feed_batch_params", parameterString);
            }
            String parameterString2 = getParameterString(uri, "gids");
            if (!TextUtils.isEmpty(parameterString2) && TextUtils.equals("aweme", uri.getHost())) {
                if (parameterString2.contains(",")) {
                    parameterString2 = parameterString2.substring(0, parameterString2.indexOf(","));
                }
                hashMap2.put("group_id", parameterString2);
            }
            if (AccountService.LJIJ().LJFF().isLogin()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap2.put("is_login", str);
            int LJJIFFI2 = C76917UGr.LJJIFFI(-1, "message_from", intent);
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "message_extra");
            JSONObject jSONObject = new JSONObject(hashMap2);
            if (!TextUtils.isEmpty(str2)) {
                longValue = CastLongProtector.valueOf(str2).longValue();
            } else {
                longValue = LJJIIZI;
            }
            if (LJJIFFI != 1) {
                if (LJJIFFI != 2) {
                    return;
                }
                QSN.LIZIZ(context, "news_notify_view", LJJIIZI, -1L, new JSONObject[0]);
                trackClickPush(context, longValue, null, false, LLJJIJIIJIL, jSONObject, LLJJIJIIJIL2);
                return;
            }
            QSN.LIZIZ(context, "news_notify_view", LJJIIZI, -1L, new JSONObject[0]);
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "action_id");
            if (LJJIFFI2 == 10001) {
                hashMap2.put("real_timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                QSN.LIZJ(C76917UGr.LJJIIZI(intent, "push_rule_id"), LLJJIJIIJIL, hashMap2, LLJJIJIIJIL3);
            } else {
                trackClickPush(context, longValue, LLJJIJIIJIL3, true, LLJJIJIIJIL, jSONObject, LLJJIJIIJIL2);
            }
        } catch (Exception e) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", e.toString());
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            C09900aA.LJI("push_click_error_event", jSONObject2, null, null);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean setCancelIntent(Context context, Intent intent, C022406y c022406y, boolean z) {
        Intent intent2 = new Intent(context, (Class<?>) NotificationBroadcastReceiver.class);
        intent2.setAction("notification_cancelled");
        intent2.putExtra("contentIntentURI", intent);
        if (z) {
            intent2.putExtra("message_from", 10001);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            c022406y.LJJIIJ.deleteIntent = PendingIntent.getBroadcast(context, 0, intent2, 201326592);
        } else {
            c022406y.LJJIIJ.deleteIntent = PendingIntent.getBroadcast(context, 0, intent2, 134217728);
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i, String str, int i2, String str2) {
        Intent intent;
        try {
            jSONObject.optInt("preload_article", 0);
            String optString = jSONObject.optString("open_url");
            if (C38354F3m.LJ(optString)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("app_data");
                intent = null;
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt("t", 0);
                    int optInt2 = optJSONObject.optInt("p", 0);
                    long optLong = optJSONObject.optLong("uid", 0L);
                    if (optInt == 1) {
                        intent = new Intent();
                        if (optInt2 != 1) {
                            if (optInt2 != 3) {
                                if (optInt2 == 4 && optLong > 0) {
                                    M6X.LIZ(intent);
                                }
                            } else {
                                intent.addFlags(536870912);
                                M6X.LIZ(intent);
                            }
                        } else {
                            intent.addFlags(536870912);
                            M6X.LIZ(intent);
                        }
                        if (C38354F3m.LJ(intent.getDataString())) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("ssnotify://common/");
                            LIZ.append(optInt);
                            LIZ.append(optInt2);
                            LIZ.append(optLong);
                            intent.setData(UriProtector.parse(X1D.LIZIZ(LIZ)));
                        }
                    }
                }
            } else {
                Uri parse = UriProtector.parse(optString);
                String scheme = parse.getScheme();
                if ("sslocal".equals(scheme)) {
                    parse = UriProtector.parse(M66.LIZIZ.LJIILJJIL(optString));
                }
                intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                if (M66.LIZIZ.LIZJ(scheme)) {
                    intent.putExtra("is_from_self", true);
                }
                intent.setData(parse);
            }
            String packageName = activity.getPackageName();
            if (intent != null || (intent = FCD.LIZIZ(activity, packageName)) != null) {
                intent.addFlags(268435456);
                M6X.LIZ(intent);
                intent.putExtra("msg_from", 2);
                intent.putExtra("msg_id", i);
                intent.putExtra("message_from", str);
                if (!C38354F3m.LJ(str2)) {
                    intent.putExtra("message_extra", str2);
                }
                if (i2 == 0) {
                    try {
                        C16880lQ.LIZJ(activity, intent);
                        return;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                if (!activity.isFinishing()) {
                    C16880lQ.LIZIZ(activity, intent);
                }
            }
        } catch (Exception e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("can not get launch intent: ");
            LIZ2.append(e2);
            X1D.LIZIZ(LIZ2);
            synchronized (QSA.class) {
            }
        }
    }

    private void trackClickPush(Context context, long j, String str, boolean z, String str2, JSONObject jSONObject, String str3) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } else {
            jSONObject2 = jSONObject;
        }
        if (z) {
            jSONObject2.put("click_position", "notify");
            if (str == null) {
                jSONObject2.put("position", "push_body");
            } else {
                jSONObject2.put("position", str);
            }
        } else {
            jSONObject2.put("click_position", "alert");
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject2.put("post_back", str2);
        }
        jSONObject2.put("rule_id", String.valueOf(j));
        FMX.LJIILJJIL("push_click", jSONObject2);
        QSN.LIZ(str3, false);
        C1791471i.LIZ.registerActivityLifecycleCallbacks(new QSP(j, z, str, str2, jSONObject));
    }
}
