package X;

import Y.ACallableS26S1300000_9;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.touchpoint.core.appwidget.ReferralWidget;
import com.bytedance.touchpoint.core.model.ReferralWidgetResponse;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class MCA {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(MCD.LJLIL);

    public static void LIZIZ(Context context) {
        int[] iArr;
        Integer valueOf;
        o.LJIIIZ(context, "context");
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (appWidgetManager == null || (iArr = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) ReferralWidget.class))) == null) {
                iArr = new int[0];
            }
        } catch (Throwable unused) {
            iArr = new int[0];
        }
        if (iArr.length == 0 || (valueOf = Integer.valueOf(R.layout.ct1)) == null || iArr.length == 0) {
            return;
        }
        C10K.LIZIZ(new ACallableS26S1300000_9(context, valueOf, iArr, 1), C10K.LJI, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static void LIZ(Context context, int i, String str, int[] iArr, ReferralWidgetResponse referralWidgetResponse) {
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        List<ReferralWidgetResponse.TaskInfo> list;
        PendingIntent LIZJ;
        String str6;
        int LIZ2;
        int parseColor;
        int LIZ3;
        int parseColor2;
        int LIZ4;
        int parseColor3;
        String str7;
        String str8;
        String str9;
        int i2;
        int i3;
        PendingIntent LIZJ2;
        String str10;
        if (referralWidgetResponse == null || ((referralWidgetResponse.widgetSimple == null && referralWidgetResponse.widgetList == null) || ((!o.LJ(referralWidgetResponse.widgetViewType, "widget_simple")) && (!o.LJ(referralWidgetResponse.widgetViewType, "widget_list"))))) {
            C10K.LIZIZ(new MC8(context, i, str, iArr), C10K.LJIIIIZZ, null);
            return;
        }
        int length = iArr.length;
        ?? r2 = 0;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
            String str11 = referralWidgetResponse.widgetViewType;
            String str12 = "";
            if (o.LJ(str11, "widget_simple")) {
                remoteViews.setViewVisibility(R.id.k0j, r2);
                remoteViews.setViewVisibility(R.id.fu7, 8);
                remoteViews.setViewVisibility(R.id.c5k, 8);
                remoteViews.setViewVisibility(R.id.h3i, 8);
                ReferralWidgetResponse.WidgetSimple widgetSimple = referralWidgetResponse.widgetSimple;
                if (widgetSimple != null) {
                    str7 = widgetSimple.title;
                } else {
                    str7 = null;
                }
                remoteViews.setTextViewText(R.id.mo6, str7);
                ReferralWidgetResponse.WidgetSimple widgetSimple2 = referralWidgetResponse.widgetSimple;
                if (widgetSimple2 != null) {
                    str8 = widgetSimple2.displayReward;
                } else {
                    str8 = null;
                }
                remoteViews.setTextViewText(R.id.m5n, str8);
                ReferralWidgetResponse.WidgetSimple widgetSimple3 = referralWidgetResponse.widgetSimple;
                if (widgetSimple3 != null) {
                    str9 = widgetSimple3.progressDesc;
                } else {
                    str9 = null;
                }
                remoteViews.setTextViewText(R.id.mff, str9);
                ReferralWidgetResponse.WidgetSimple widgetSimple4 = referralWidgetResponse.widgetSimple;
                if (widgetSimple4 != null) {
                    i2 = widgetSimple4.pointsTotal;
                    i3 = widgetSimple4.pointsEarned;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                remoteViews.setProgressBar(R.id.iac, i2, i3, r2);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZIZ = C7MY.LIZIZ(22);
                c2068389v.LIZJ = C7MY.LIZIZ(22);
                c2068389v.LIZ = R.raw.icon_color_tiktok_logo_light;
                remoteViews.setImageViewBitmap(R.id.fbw, C1DH.LJJJ(c2068389v.LIZ(context), r2, r2, 7));
                ReferralWidgetResponse.WidgetSimple widgetSimple5 = referralWidgetResponse.widgetSimple;
                if (widgetSimple5 != null && (str10 = widgetSimple5.jumpLink) != null) {
                    str12 = str10;
                }
                MCC mcc = (MCC) C95J.LIZ(1000);
                if (mcc != null && (LIZJ2 = mcc.LIZJ(context, str, str12)) != null) {
                    remoteViews.setOnClickPendingIntent(R.id.k0j, LIZJ2);
                }
            } else if (o.LJ(str11, "widget_list")) {
                remoteViews.setViewVisibility(R.id.k0j, 8);
                remoteViews.setViewVisibility(R.id.c5k, 8);
                remoteViews.setViewVisibility(R.id.h3i, 8);
                remoteViews.setViewVisibility(R.id.fu7, r2);
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZIZ = C7MY.LIZIZ(22);
                c2068389v2.LIZJ = C7MY.LIZIZ(22);
                c2068389v2.LIZ = R.raw.icon_color_tiktok_logo_light;
                remoteViews.setImageViewBitmap(R.id.fbx, C1DH.LJJJ(c2068389v2.LIZ(context), r2, r2, 7));
                ReferralWidgetResponse.WidgetList widgetList = referralWidgetResponse.widgetList;
                if (widgetList != null) {
                    str2 = widgetList.title;
                } else {
                    str2 = null;
                }
                remoteViews.setTextViewText(R.id.cke, str2);
                StringBuilder LIZ5 = X1D.LIZ();
                ReferralWidgetResponse.WidgetList widgetList2 = referralWidgetResponse.widgetList;
                if (widgetList2 != null) {
                    str3 = widgetList2.pointsEarned;
                } else {
                    str3 = null;
                }
                LIZ5.append(str3);
                LIZ5.append("/");
                ReferralWidgetResponse.WidgetList widgetList3 = referralWidgetResponse.widgetList;
                if (widgetList3 != null) {
                    str4 = widgetList3.pointsTotal;
                } else {
                    str4 = null;
                }
                LIZ5.append(str4);
                String LIZIZ = X1D.LIZIZ(LIZ5);
                ReferralWidgetResponse.WidgetList widgetList4 = referralWidgetResponse.widgetList;
                if (widgetList4 != null) {
                    str5 = widgetList4.pointsEarned;
                } else {
                    str5 = null;
                }
                if (LIZIZ == null || LIZIZ.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && str5 != null && str5.length() != 0 && s.LJJJLZIJ(LIZIZ, str5, r2)) {
                    int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, str5, r2, r2, 6);
                    int length2 = str5.length() + LJJLIIIJL;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LIZIZ).setSpan(new ForegroundColorSpan(ColorProtector.parseColor("#FFBB35")), LJJLIIIJL, length2, 33);
                    LIZIZ = spannableStringBuilder;
                }
                remoteViews.setTextViewText(R.id.bgi, LIZIZ);
                ReferralWidgetResponse.WidgetList widgetList5 = referralWidgetResponse.widgetList;
                if (widgetList5 != null) {
                    list = widgetList5.taskList;
                } else {
                    list = null;
                }
                if (list != null && (!list.isEmpty())) {
                    remoteViews.setViewVisibility(R.id.l1b, 0);
                    remoteViews.setTextViewText(R.id.l1g, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 0)).taskName);
                    remoteViews.setTextViewText(R.id.bga, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 0)).points);
                    if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 0)).taskStatus == 0) {
                        LIZ2 = C247489nU.LIZ(R.attr.cp, context);
                    } else {
                        LIZ2 = C247489nU.LIZ(R.attr.dm, context);
                    }
                    remoteViews.setInt(R.id.l1g, "setTextColor", LIZ2);
                    if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 0)).taskStatus == 0) {
                        parseColor = ColorProtector.parseColor("#FFBB35");
                    } else {
                        parseColor = ColorProtector.parseColor("#80FFBB35");
                    }
                    remoteViews.setInt(R.id.bga, "setTextColor", parseColor);
                    if (list.size() >= 2) {
                        remoteViews.setViewVisibility(R.id.l1c, 0);
                        remoteViews.setTextViewText(R.id.l1h, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 1)).taskName);
                        remoteViews.setTextViewText(R.id.bgb, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 1)).points);
                        if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 1)).taskStatus == 0) {
                            LIZ4 = C247489nU.LIZ(R.attr.cp, context);
                        } else {
                            LIZ4 = C247489nU.LIZ(R.attr.dm, context);
                        }
                        remoteViews.setInt(R.id.l1h, "setTextColor", LIZ4);
                        if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 1)).taskStatus == 0) {
                            parseColor3 = ColorProtector.parseColor("#FFBB35");
                        } else {
                            parseColor3 = ColorProtector.parseColor("#80FFBB35");
                        }
                        remoteViews.setInt(R.id.bgb, "setTextColor", parseColor3);
                    } else {
                        remoteViews.setViewVisibility(R.id.l1c, 4);
                    }
                    if (list.size() >= 3) {
                        remoteViews.setViewVisibility(R.id.l1d, 0);
                        remoteViews.setTextViewText(R.id.l1i, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 2)).taskName);
                        remoteViews.setTextViewText(R.id.bgc, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 2)).points);
                        if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 2)).taskStatus == 0) {
                            LIZ3 = C247489nU.LIZ(R.attr.cp, context);
                        } else {
                            LIZ3 = C247489nU.LIZ(R.attr.dm, context);
                        }
                        remoteViews.setInt(R.id.l1i, "setTextColor", LIZ3);
                        if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 2)).taskStatus == 0) {
                            parseColor2 = ColorProtector.parseColor("#FFBB35");
                        } else {
                            parseColor2 = ColorProtector.parseColor("#80FFBB35");
                        }
                        remoteViews.setInt(R.id.bgc, "setTextColor", parseColor2);
                        remoteViews.setImageViewResource(R.id.eit, R.drawable.c9h);
                    } else {
                        remoteViews.setViewVisibility(R.id.l1d, 4);
                    }
                } else {
                    remoteViews.setViewVisibility(R.id.l1b, 4);
                    remoteViews.setViewVisibility(R.id.l1c, 4);
                    remoteViews.setViewVisibility(R.id.l1d, 4);
                }
                ReferralWidgetResponse.WidgetList widgetList6 = referralWidgetResponse.widgetList;
                if (widgetList6 != null && (str6 = widgetList6.jumpLink) != null) {
                    str12 = str6;
                }
                MCC mcc2 = (MCC) C95J.LIZ(1000);
                if (mcc2 != null && (LIZJ = mcc2.LIZJ(context, str, str12)) != null) {
                    remoteViews.setOnClickPendingIntent(R.id.fu7, LIZJ);
                }
            }
            AppWidgetManager.getInstance(context).updateAppWidget(i5, remoteViews);
            i4++;
            r2 = 0;
        }
    }
}
