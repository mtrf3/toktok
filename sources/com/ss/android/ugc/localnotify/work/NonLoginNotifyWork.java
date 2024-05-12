package com.ss.android.ugc.localnotify.work;

import X.AnonymousClass078;
import X.C022406y;
import X.C04270Et;
import X.C06540Nm;
import X.C0CS;
import X.C16880lQ;
import X.C1AX;
import X.C29241Cu;
import X.C29261Cw;
import X.C29822Bn8;
import X.C34518Dgg;
import X.C40322Fs6;
import X.C47629Imf;
import X.C52204KeG;
import X.C58195Msh;
import X.C61099NyR;
import X.C61100NyS;
import X.C67245QaH;
import X.C67249QaL;
import X.C67257QaT;
import X.C68467Qtz;
import X.C84763XOl;
import X.C86781Y4b;
import X.DJ9;
import X.DZL;
import X.EF7;
import X.FMX;
import X.HG3;
import X.IVZ;
import X.JBR;
import X.QRH;
import X.RBX;
import X.X1D;
import X.Y4Y;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import com.ss.android.ugc.tiktok.local_notify.R$drawable;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public final class NonLoginNotifyWork extends Worker {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIIZZ() {
        int i;
        NotificationManager notificationManager;
        NotificationManager notificationManager2;
        Object[] objArr;
        Bitmap bitmap;
        int i2 = 0;
        int i3 = DJ9.LIZ().getInt("executed_non_login_push_count", 0);
        String str = IVZ.LIZ()[i3];
        Integer num = IVZ.LIZ.get(str);
        if (num != null) {
            i = num.intValue();
        } else {
            i = R.string.pk5;
        }
        Resources resources = EF7.LIZIZ().getResources();
        long parseLong = CastLongProtector.parseLong(str);
        long parseLong2 = CastLongProtector.parseLong(str);
        String string = resources.getString(i);
        o.LJIIIIZZ(string, "res.getString(content)");
        String string2 = resources.getString(R.string.bri);
        o.LJIIIIZZ(string2, "res.getString(R.string.app_name)");
        StringBuilder LIZ = X1D.LIZ();
        C67245QaH c67245QaH = new C67245QaH(parseLong, parseLong2, string, string2, JBR.LJFF(LIZ, "musically", "://feed?tab=1&push_label=non_login_push", LIZ), i2, null, i3, 96, 0 == true ? 1 : 0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getNextNonLoginPush(");
        LIZ2.append(c67245QaH);
        LIZ2.append(')');
        C47629Imf.LIZ("NonLoginPushUtil", X1D.LIZIZ(LIZ2));
        QRH.LIZLLL(10001, c67245QaH.toPushBody(), true);
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "notification");
        if (LLILL instanceof NotificationManager) {
            notificationManager = (NotificationManager) LLILL;
        } else {
            notificationManager = null;
        }
        Context LIZIZ = EF7.LIZIZ();
        Object LLILL2 = C16880lQ.LLILL(LIZIZ, "notification");
        if (LLILL2 instanceof NotificationManager) {
            notificationManager2 = (NotificationManager) LLILL2;
        } else {
            notificationManager2 = null;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && notificationManager2 != null) {
            String LIZ3 = C29822Bn8.LIZ(LIZIZ, R.string.r14, "context.resources.getStr…push_notifications_other)");
            if (notificationManager2.getNotificationChannel("other_channel") == null) {
                notificationManager2.createNotificationChannel(new NotificationChannel("other_channel", LIZ3, 4));
            }
        }
        int id = (int) (c67245QaH.getId() % Integer.MAX_VALUE);
        if (notificationManager != null) {
            Context LIZIZ2 = EF7.LIZIZ();
            Drawable LIZIZ3 = C04270Et.LIZIZ(LIZIZ2, R$drawable.icon);
            if (LIZIZ3 instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) LIZIZ3).getBitmap();
            } else {
                bitmap = null;
            }
            RemoteViews remoteViews = new RemoteViews(LIZIZ2.getPackageName(), R.layout.bwt);
            remoteViews.setTextViewText(R.id.title, c67245QaH.getTitle());
            remoteViews.setTextViewText(R.id.bst, c67245QaH.getText());
            remoteViews.setImageViewBitmap(R.id.e_q, bitmap);
            C022406y c022406y = new C022406y(LIZIZ2, "other_channel");
            c022406y.LJJI = remoteViews;
            c022406y.LJIIJ(new C1AX());
            c022406y.LJII(16, true);
            Notification notification = c022406y.LJJIIJ;
            notification.icon = R.drawable.b9p;
            c022406y.LJIIJ = 2;
            notification.vibrate = new long[0];
            c022406y.LJFF(c67245QaH.getTitle());
            c022406y.LJ(c67245QaH.getText());
            c022406y.LJJIIJ.when = System.currentTimeMillis();
            c022406y.LJJ = 1;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("android.resource://");
            LIZ4.append(LIZIZ2.getPackageName());
            LIZ4.append('/');
            LIZ4.append(R.raw.tiktok_new_customezed_tone);
            Uri parse = UriProtector.parse(X1D.LIZIZ(LIZ4));
            if (parse != null) {
                c022406y.LJIIIZ(parse);
            } else {
                c022406y.LJI(1);
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setPackage(LIZIZ2.getPackageName());
            intent.setData(UriProtector.parse(c67245QaH.getOpenUrl()));
            intent.putExtra("from_notification", true);
            intent.putExtra("msg_from", 1);
            intent.putExtra("message_from", 10001);
            intent.putExtra("push_rule_id", c67245QaH.getRid64());
            intent.putExtra("non_login_push_show_rank", c67245QaH.getShowIndex());
            if (i4 >= 23) {
                c022406y.LJI = PendingIntent.getActivity(LIZIZ2, 0, intent, 201326592);
            } else {
                c022406y.LJI = PendingIntent.getActivity(LIZIZ2, 0, intent, 134217728);
            }
            PushService.createIPushApibyMonsterPlugin(false).setCancelIntent(LIZIZ2, intent, c022406y, true);
            Notification LIZIZ4 = c022406y.LIZIZ();
            o.LJIIIIZZ(LIZIZ4, "builder.build()");
            notificationManager.notify("non_login_notify", id, LIZIZ4);
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("rule_id", String.valueOf(c67245QaH.getId()));
            hashMap.put("rule_id64", String.valueOf(c67245QaH.getRid64()));
            hashMap.put("push_label", "non_login_push");
            hashMap.put("real_timestamp", String.valueOf(System.currentTimeMillis() / 1000));
            hashMap.put("show_rank", String.valueOf(c67245QaH.getShowIndex()));
            hashMap.put("push_channel", "CLIENT_NON_LOGIN");
            hashMap.put("click_position", "notify");
            hashMap.put("colorized", CardStruct.IStatusCode.DEFAULT);
            hashMap.put("has_image", CardStruct.IStatusCode.DEFAULT);
            hashMap.put("image_play_button", CardStruct.IStatusCode.DEFAULT);
            hashMap.put("image_size", "normal");
            hashMap.put("has_button", CardStruct.IStatusCode.DEFAULT);
            if (((RBX) HG3.LJIILL()).isLogin()) {
                objArr = "1";
            } else {
                objArr = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("user_is_login", objArr);
            if (!a.LJIJJ().LJ(null)) {
                str2 = "1";
            }
            hashMap.put("user_consent_status", str2);
        } catch (Exception unused) {
        }
        FMX.LJIILIIL("non_login_push_show", hashMap, true);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("Do notify() - ");
        LIZ5.append(c67245QaH);
        C47629Imf.LIZ("NonLoginNotifyWork", X1D.LIZIZ(LIZ5));
        DJ9.LIZ().storeInt("executed_non_login_push_count", DJ9.LIZ().getInt("executed_non_login_push_count", 0) + 1);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("increaseExecutedNonLoginPushCount(");
        LIZ6.append(DJ9.LIZ().getInt("executed_non_login_push_count", 0));
        LIZ6.append(')');
        C47629Imf.LIZ("NonLoginPushUtil", X1D.LIZIZ(LIZ6));
    }

    @Override // androidx.work.Worker
    public final C0CS LJII() {
        long currentTimeMillis = System.currentTimeMillis();
        long LIZIZ = this.LJLILLLLZI.LIZIZ.LIZIZ();
        long j = currentTimeMillis - LIZIZ;
        String LIZJ = this.LJLILLLLZI.LIZIZ.LIZJ("notification_id");
        String str = CardStruct.IStatusCode.DEFAULT;
        if (LIZJ == null) {
            LIZJ = CardStruct.IStatusCode.DEFAULT;
        }
        String LIZJ2 = this.LJLILLLLZI.LIZIZ.LIZJ("scheduled_time_string");
        if (LIZJ2 != null) {
            str = LIZJ2;
        }
        C68467Qtz.LIZ(3, currentTimeMillis, j, LIZJ, true);
        StringBuilder LIZLLL = C06540Nm.LIZLLL("NonLoginNotifyWork.doWork(", LIZJ, ": ", str, " - offset: ");
        LIZLLL.append(j);
        LIZLLL.append(") - START, ");
        LIZLLL.append(C16880lQ.LLLLIIIILLL());
        LIZLLL.append(" is main? ");
        LIZLLL.append(o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL()));
        C47629Imf.LIZIZ("NonLoginNotifyWork", X1D.LIZIZ(LIZLLL));
        if (!IVZ.LIZJ()) {
            C67249QaL.LIZ().LIZJ();
            return new C29261Cw();
        }
        if (C58195Msh.LIZIZ.LIZ() && !DZL.LIZ) {
            return new C29261Cw();
        }
        if (QRH.LIZJ() && !C52204KeG.LIZ) {
            return new C29261Cw();
        }
        if (!C84763XOl.LJIIJJI) {
            return new C29261Cw();
        }
        Integer[] numArr = C67257QaT.LIZIZ;
        long LIZ = C67257QaT.LIZ(numArr[0].intValue(), numArr[1].intValue());
        long LIZ2 = C67257QaT.LIZ(numArr[2].intValue(), numArr[3].intValue());
        if (LIZ > LIZ2) {
            LIZ2 += 86400000;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (LIZ <= currentTimeMillis2 && currentTimeMillis2 <= LIZ2 && !C34518Dgg.LIZ) {
            return new C29261Cw();
        }
        IPushApi createIPushApibyMonsterPlugin = PushService.createIPushApibyMonsterPlugin(false);
        Context applicationContext = this.LJLIL;
        o.LJIIIIZZ(applicationContext, "applicationContext");
        if (!createIPushApibyMonsterPlugin.isNotifyEnabled(applicationContext)) {
            return new C29261Cw();
        }
        if (IVZ.LIZIZ() <= 0) {
            return new C29261Cw();
        }
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && Build.VERSION.SDK_INT >= 33 && !new AnonymousClass078(EF7.LIZIZ()).LIZIZ()) {
            PushPermissionStatusEvent pushPermissionStatusEvent = new PushPermissionStatusEvent();
            long currentTimeMillis3 = System.currentTimeMillis();
            C61099NyR LIZIZ2 = C61099NyR.LIZIZ.LIZIZ(topActivity, TokenCert.Companion.with("bpea-push_permission_local_post_notifications"));
            C86781Y4b c86781Y4b = new C86781Y4b(pushPermissionStatusEvent, topActivity);
            C61100NyS c61100NyS = LIZIZ2.LIZ;
            c61100NyS.LIZ(c86781Y4b);
            c61100NyS.LIZIZ("android.permission.POST_NOTIFICATIONS");
            c61100NyS.LIZJ(new Y4Y(pushPermissionStatusEvent, this, LIZIZ, currentTimeMillis3, topActivity));
        } else if (C40322Fs6.LJFF(EF7.LIZIZ())) {
            LJIIIIZZ();
        }
        return new C29241Cu();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonLoginNotifyWork(Context context, WorkerParameters params) {
        super(context, params);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(params, "params");
    }
}
