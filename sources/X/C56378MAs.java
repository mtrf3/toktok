package X;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.RemoteViews;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.model.AppWidgetStruct;
import com.ss.android.ugc.aweme.model.ChallengeStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS142S0200000_11;
import kotlin.jvm.internal.AqS14S0500000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MAs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56378MAs {
    public static final long LIZ = TimeUnit.HOURS.toMillis(3);
    public static final long LIZIZ = TimeUnit.DAYS.toMillis(2);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C56380MAu.LJLIL);

    public static int LIZIZ() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static PendingIntent LIZJ(Context context, String str, ChallengeStruct challengeStruct) {
        String str2;
        Intent LIZ2 = MAE.LIZ(context, str);
        LIZ2.putExtra("extra_jump_type", 1);
        Challenge challenge = challengeStruct.getChallenge();
        if (challenge == null || (str2 = challenge.getCid()) == null) {
            str2 = "";
        }
        LIZ2.putExtra("extra_challenge_id", str2);
        LIZ2.setFlags(268435456);
        LIZ2.addFlags(67108864);
        PendingIntent activity = PendingIntent.getActivity(context, 5, LIZ2, LIZIZ());
        o.LJIIIIZZ(activity, "getActivity(\n           …NG_INTENT_FLAGS\n        )");
        return activity;
    }

    public static void LIZ(Context context, int i, String str, int i2, int i3, int[] iArr, Float f, int[] iArr2, int[] iArr3, AppWidgetStruct appWidgetStruct) {
        long j;
        String str2;
        String str3;
        Aweme aweme;
        Aweme aweme2;
        Video video;
        UrlModel cover;
        List<String> urlList;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AppWidgetId: ");
        LIZ2.append(i2);
        LIZ2.append(", bindData");
        String msg = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(msg, "msg");
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i3);
        List<ChallengeStruct> challengeStructList = appWidgetStruct.getChallengeStructList();
        int i4 = 0;
        if (challengeStructList == null || challengeStructList.isEmpty()) {
            return;
        }
        List<ChallengeStruct> challengeStructList2 = appWidgetStruct.getChallengeStructList();
        o.LJI(challengeStructList2);
        ChallengeStruct challengeStruct = (ChallengeStruct) ListProtector.get(challengeStructList2, 0);
        List<String> coverUrlList = challengeStruct.getCoverUrlList();
        if (coverUrlList != null && !coverUrlList.isEmpty()) {
            C56374MAo.LIZJ(context, (String) ListProtector.get(coverUrlList, 0), new C56375MAp(remoteViews, iArr2, context, i2));
        }
        Challenge challenge = challengeStruct.getChallenge();
        if (challenge != null) {
            j = challenge.getDisplayCount();
        } else {
            j = 0;
        }
        String LJJIIJ = C77123UOp.LJJIIJ(j);
        C116724i4 c116724i4 = new C116724i4();
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        LJJIIJ.toString();
        c116724i4.LIZ(resources, R.string.ck_, LJJIIJ);
        C116714i3 c116714i3 = c116724i4.LIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append('#');
        Challenge challenge2 = challengeStruct.getChallenge();
        if (challenge2 != null) {
            str2 = challenge2.getChallengeName();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        LIZ3.append(str2);
        remoteViews.setTextViewText(R.id.mol, X1D.LIZIZ(LIZ3));
        String desc = challengeStruct.getDesc();
        if (desc == null) {
            desc = "";
        }
        remoteViews.setTextViewText(R.id.mpb, desc);
        remoteViews.setTextViewText(R.id.mqc, c116714i3);
        if (i != 1) {
            List<Aweme> awemeList = challengeStruct.getAwemeList();
            if (awemeList != null && !awemeList.isEmpty() && iArr != null) {
                int length = iArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = iArr[i6];
                    int i8 = i5 + 1;
                    if (i5 >= awemeList.size() || (aweme2 = (Aweme) ListProtector.get(awemeList, i5)) == null || (video = aweme2.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || urlList.isEmpty()) {
                        break;
                    }
                    if (iArr3 != null) {
                        Object obj = ListProtector.get(urlList, i4);
                        o.LJIIIIZZ(obj, "videoUrlList[0]");
                        C56374MAo.LIZJ(context, (String) obj, new C56376MAq(f, remoteViews, i7, iArr3, context, i2));
                    }
                    i6++;
                    i5 = i8;
                    i4 = 0;
                }
            }
            PendingIntent LIZJ2 = LIZJ(context, str, challengeStruct);
            remoteViews.setOnClickPendingIntent(R.id.fbw, LIZJ2);
            remoteViews.setOnClickPendingIntent(R.id.fbs, LIZJ2);
            remoteViews.setOnClickPendingIntent(R.id.mpb, LIZJ2);
            remoteViews.setOnClickPendingIntent(R.id.mol, LIZJ2);
            if (iArr != null) {
                int length2 = iArr.length;
                int i9 = 0;
                while (i4 < length2) {
                    int i10 = iArr[i4];
                    int i11 = i9 + 1;
                    Intent LIZ4 = MAE.LIZ(context, str);
                    LIZ4.putExtra("extra_jump_type", 2);
                    Challenge challenge3 = challengeStruct.getChallenge();
                    if (challenge3 == null || (str3 = challenge3.getCid()) == null) {
                        str3 = "";
                    }
                    LIZ4.putExtra("extra_challenge_id", str3);
                    List<Aweme> awemeList2 = challengeStruct.getAwemeList();
                    if (awemeList2 != null) {
                        aweme = (Aweme) ListProtector.get(awemeList2, i9);
                    } else {
                        aweme = null;
                    }
                    LIZ4.putExtra("extra_aweme", aweme);
                    PendingIntent activity = PendingIntent.getActivity(context, i10, LIZ4, LIZIZ());
                    o.LJIIIIZZ(activity, "getActivity(\n           …NG_INTENT_FLAGS\n        )");
                    remoteViews.setOnClickPendingIntent(i10, activity);
                    i4++;
                    i9 = i11;
                }
            }
            AppWidgetManager.getInstance(context).updateAppWidget(i2, remoteViews);
        }
        remoteViews.setOnClickPendingIntent(R.id.j71, LIZJ(context, str, challengeStruct));
        AppWidgetManager.getInstance(context).updateAppWidget(i2, remoteViews);
    }

    public static boolean LIZLLL(Context context, Integer num, Integer num2, int[] iArr, Float f, int[] iArr2, String str, int[] iArr3, int[] iArr4, AqS14S0500000_9 aqS14S0500000_9, AqS142S0200000_11 aqS142S0200000_11, int i) {
        AqS142S0200000_11 aqS142S0200000_112 = aqS142S0200000_11;
        AqS14S0500000_9 aqS14S0500000_92 = aqS14S0500000_9;
        if ((i & 512) != 0) {
            aqS14S0500000_92 = null;
        }
        if ((i & 1024) != 0) {
            aqS142S0200000_112 = null;
        }
        o.LJIIIZ(context, "context");
        if (num == null || num2 == null || iArr2 == null || iArr2.length == 0) {
            if (!((Boolean) C52859Kop.LIZ.getValue()).booleanValue() || aqS142S0200000_112 == null) {
                return false;
            }
            aqS142S0200000_112.invoke(Boolean.FALSE);
            return false;
        }
        C10K.LIZIZ(new CallableC56377MAr(context, f, num, num2, str, aqS142S0200000_112, aqS14S0500000_92, iArr, iArr2, iArr3, iArr4), C10K.LJI, null);
        return true;
    }
}
