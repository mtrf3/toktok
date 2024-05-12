package Y;

import X.ActivityC45651qj;
import X.C0NB;
import X.C113554cx;
import X.C15490jB;
import X.C16880lQ;
import X.C1DH;
import X.C2068389v;
import X.C23220ve;
import X.C32151Nz;
import X.C35585Dxt;
import X.C36922EeM;
import X.C38306F1q;
import X.C38333F2r;
import X.C54024LIe;
import X.C55001LiH;
import X.C55002LiI;
import X.C55693LtR;
import X.C55902Lwo;
import X.C55906Lws;
import X.C56662Kg;
import X.C59895Nf1;
import X.C64799Pbv;
import X.C64920Pds;
import X.C65352Pkq;
import X.C6D8;
import X.C76800UCe;
import X.C78983UzD;
import X.C79004UzY;
import X.C79045V0n;
import X.C7MY;
import X.C81154Vt8;
import X.C86V;
import X.CFX;
import X.EF7;
import X.EnumC55042Liw;
import X.IDP;
import X.LHM;
import X.LII;
import X.LWX;
import X.LX1;
import X.MAW;
import X.O6R;
import X.OSZ;
import X.SFS;
import X.WM7;
import X.X1D;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.widget.RemoteViews;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.follow.widget.FollowBigWidgetProvider;
import com.ss.android.ugc.aweme.followingtab.assem.FollowingBottomTabProtocolAssem;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedPreload;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.assem.FriendsTabProtocolAssem;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACallableS86S0200000_9 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v39 */
    public static final Object call$0(ACallableS86S0200000_9 aCallableS86S0200000_9) {
        boolean z;
        RemoteViews remoteViews;
        Bitmap bitmap;
        Context context = (Context) aCallableS86S0200000_9.l0;
        if (context != null) {
            FollowBigWidgetProvider followBigWidgetProvider = (FollowBigWidgetProvider) aCallableS86S0200000_9.l1;
            int[] LJI = C55902Lwo.LJI(context, true);
            if (LJI.length != 0) {
                int length = LJI.length;
                ?? r6 = 0;
                int i = 0;
                while (i < length) {
                    int i2 = LJI[i];
                    followBigWidgetProvider.getClass();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.bp9);
                    if (C55902Lwo.LIZIZ <= 0 || !BaseUserService.createIUserServicebyMonsterPlugin(r6).isLogin()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C55902Lwo.LJ().storeInt("follow_anchor_live_num", r6);
                        Drawable LIZ = C15490jB.LIZ(CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_outside_demand_1"), "live_big_widget_default_bg.png");
                        if (LIZ != null) {
                            bitmap = C1DH.LJJJ(LIZ, r6, r6, 7);
                        } else {
                            bitmap = null;
                        }
                        remoteViews2.setViewVisibility(R.id.dju, r6);
                        remoteViews2.setViewVisibility(R.id.dk1, 8);
                        if (bitmap != null) {
                            remoteViews2.setImageViewBitmap(R.id.egt, bitmap);
                        }
                        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
                        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZIZ = LJJIIZ;
                        c2068389v.LIZJ = LJJIIZ2;
                        c2068389v.LIZ = R.raw.icon_color_tiktok_logo_dark;
                        remoteViews2.setImageViewBitmap(R.id.egu, SFS.LJIIIZ(c2068389v.LIZ(context)));
                        if (!BaseUserService.createIUserServicebyMonsterPlugin(r6).isLogin()) {
                            remoteViews2.setTextViewText(R.id.m0o, C86V.LJFF(R.string.m02));
                            remoteViews2.setTextViewText(R.id.m0p, C86V.LJFF(R.string.m01));
                        } else {
                            remoteViews2.setTextViewText(R.id.m0o, C86V.LJFF(R.string.lzx));
                            remoteViews2.setTextViewText(R.id.m0p, C86V.LJFF(R.string.lzy));
                        }
                        remoteViews2.setOnClickPendingIntent(R.id.dju, C55902Lwo.LIZJ(context, r6, true));
                        remoteViews = remoteViews2;
                    } else {
                        remoteViews2.setViewVisibility(R.id.dju, 8);
                        remoteViews2.setViewVisibility(R.id.dk1, r6);
                        remoteViews2.setTextViewText(R.id.m0q, C86V.LJFF(R.string.m00));
                        int LJJIIZ3 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
                        int LJJIIZ4 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
                        C2068389v c2068389v2 = new C2068389v();
                        c2068389v2.LIZIZ = LJJIIZ3;
                        c2068389v2.LIZJ = LJJIIZ4;
                        c2068389v2.LIZ = R.raw.icon_color_tiktok_logo_dark;
                        remoteViews2.setImageViewBitmap(R.id.egv, SFS.LJIIIZ(c2068389v2.LIZ(context)));
                        int i3 = C55902Lwo.LIZIZ;
                        if (i3 == 1) {
                            remoteViews2.setViewVisibility(R.id.dk0, r6);
                            remoteViews2.setViewVisibility(R.id.djv, 8);
                            C55902Lwo.LJII(context, O6R.LJJIIZ(C32151Nz.LJIIZILJ(64)), C7MY.LIZIZ(64), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, r6)).LIZJ, R.id.egw, i2, C7MY.LIZIZ(34), remoteViews2);
                            remoteViews2.setOnClickPendingIntent(R.id.dag, C55902Lwo.LIZJ(context, r6, true));
                            remoteViews2.setTextViewText(R.id.m6u, C86V.LJFF(R.string.som));
                            remoteViews2.setTextViewText(R.id.m70, ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, r6)).LIZLLL);
                            remoteViews2.setTextViewText(R.id.m6z, ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, r6)).LJ);
                            remoteViews2.setOnClickPendingIntent(R.id.m70, C55902Lwo.LIZJ(context, r6, true));
                            remoteViews2.setOnClickPendingIntent(R.id.m6z, C55902Lwo.LIZJ(context, r6, true));
                            remoteViews = remoteViews2;
                        } else {
                            remoteViews2.setViewVisibility(R.id.dk0, 8);
                            remoteViews2.setViewVisibility(R.id.djv, r6);
                            RemoteViews remoteViews3 = remoteViews2;
                            C55902Lwo.LJII(context, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)), C7MY.LIZIZ(56), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, r6)).LIZJ, R.id.eib, i2, C7MY.LIZIZ(28), remoteViews3);
                            C55902Lwo.LJII(context, C7MY.LIZIZ(56), C7MY.LIZIZ(56), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 1)).LIZJ, R.id.eic, i2, C7MY.LIZIZ(28), remoteViews3);
                            remoteViews3.setTextViewText(R.id.eie, ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, r6)).LIZLLL);
                            remoteViews3.setTextViewText(R.id.eig, ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 1)).LIZLLL);
                            remoteViews3.setOnClickPendingIntent(R.id.djx, C55902Lwo.LIZJ(context, r6, true));
                            remoteViews3.setOnClickPendingIntent(R.id.djz, C55902Lwo.LIZJ(context, 1, true));
                            remoteViews3.setOnClickPendingIntent(R.id.djy, C55902Lwo.LIZJ(context, 2, true));
                            remoteViews3.setOnClickPendingIntent(R.id.djw, C55902Lwo.LIZJ(context, 3, true));
                            remoteViews3.setTextViewText(R.id.m0s, C86V.LJFF(R.string.som));
                            remoteViews3.setTextViewText(R.id.m0u, C86V.LJFF(R.string.som));
                            remoteViews3.setTextViewText(R.id.m0t, C86V.LJFF(R.string.som));
                            remoteViews3.setTextViewText(R.id.m0r, C86V.LJFF(R.string.som));
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    remoteViews3.setViewVisibility(R.id.djy, r6);
                                    remoteViews3.setViewVisibility(R.id.djw, r6);
                                    C55902Lwo.LJII(context, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)), C7MY.LIZIZ(56), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 2)).LIZJ, R.id.eia, i2, C7MY.LIZIZ(28), remoteViews3);
                                    remoteViews3.setTextViewText(R.id.eif, ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 2)).LIZLLL);
                                    C55902Lwo.LJII(context, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)), C7MY.LIZIZ(56), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 3)).LIZJ, R.id.ei_, i2, C7MY.LIZIZ(28), remoteViews3);
                                    remoteViews3.setTextViewText(R.id.eid, ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 3)).LIZLLL);
                                    remoteViews = remoteViews3;
                                } else {
                                    remoteViews3.setViewVisibility(R.id.djy, 0);
                                    remoteViews3.setViewVisibility(R.id.djw, 8);
                                    C55902Lwo.LJII(context, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)), C7MY.LIZIZ(56), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 2)).LIZJ, R.id.eia, i2, C7MY.LIZIZ(28), remoteViews3);
                                    remoteViews3.setTextViewText(R.id.eif, ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 2)).LIZLLL);
                                    remoteViews = remoteViews3;
                                }
                            } else {
                                remoteViews3.setViewVisibility(R.id.djy, 4);
                                remoteViews3.setViewVisibility(R.id.djw, 8);
                                remoteViews = remoteViews3;
                            }
                        }
                    }
                    try {
                        appWidgetManager.updateAppWidget(i2, remoteViews);
                    } catch (Exception e) {
                        C0NB.LJI("FollowBigWidgetProvider", e);
                    }
                    i++;
                    r6 = 0;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v24 */
    public static final Object call$1(ACallableS86S0200000_9 aCallableS86S0200000_9) {
        boolean z;
        Bitmap bitmap;
        Context context = (Context) aCallableS86S0200000_9.l0;
        if (context != null) {
            MAW maw = (MAW) aCallableS86S0200000_9.l1;
            ?? r5 = 0;
            int[] LJI = C55902Lwo.LJI(context, false);
            boolean z2 = true;
            if (LJI.length != 0) {
                int length = LJI.length;
                int i = 0;
                while (i < length) {
                    int i2 = LJI[i];
                    maw.getClass();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.bp_);
                    if (C55902Lwo.LIZIZ <= 0 || !BaseUserService.createIUserServicebyMonsterPlugin(r5).isLogin()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C55902Lwo.LJ().storeInt("follow_anchor_live_num", r5);
                        Drawable LIZ = C15490jB.LIZ(CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_outside_demand_1"), "live_samll_widget_default_bg.png");
                        if (LIZ != null) {
                            bitmap = C1DH.LJJJ(LIZ, r5, r5, 7);
                        } else {
                            bitmap = null;
                        }
                        remoteViews.setViewVisibility(R.id.dko, r5);
                        remoteViews.setViewVisibility(R.id.dkp, 8);
                        if (bitmap != null) {
                            float LIZIZ = C7MY.LIZIZ(26);
                            Bitmap roundBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            Paint LIZIZ2 = C6D8.LIZIZ(z2);
                            Rect rect = new Rect(r5, r5, bitmap.getWidth(), bitmap.getHeight());
                            RectF rectF = new RectF(rect);
                            Canvas canvas = new Canvas(roundBitmap);
                            canvas.drawRoundRect(rectF, LIZIZ, LIZIZ, LIZIZ2);
                            LIZIZ2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                            canvas.drawBitmap(bitmap, rect, rect, LIZIZ2);
                            o.LJIIIIZZ(roundBitmap, "roundBitmap");
                            remoteViews.setImageViewBitmap(R.id.ehx, roundBitmap);
                        }
                        if (!BaseUserService.createIUserServicebyMonsterPlugin(r5).isLogin()) {
                            remoteViews.setTextViewText(R.id.mih, C86V.LJFF(R.string.m02));
                            remoteViews.setTextViewText(R.id.mig, C86V.LJFF(R.string.m01));
                        } else {
                            remoteViews.setTextViewText(R.id.mih, C86V.LJFF(R.string.lzx));
                            remoteViews.setTextViewText(R.id.mig, C86V.LJFF(R.string.lzy));
                        }
                        remoteViews.setOnClickPendingIntent(R.id.dko, C55902Lwo.LIZJ(context, r5, r5));
                    } else {
                        remoteViews.setViewVisibility(R.id.dko, 8);
                        remoteViews.setViewVisibility(R.id.dkp, r5);
                        remoteViews.setTextViewText(R.id.mif, C86V.LJFF(R.string.som));
                        remoteViews.setOnClickPendingIntent(R.id.dkp, C55902Lwo.LIZJ(context, r5, r5));
                        int i3 = C55902Lwo.LIZIZ;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                remoteViews.setViewVisibility(R.id.ehw, 8);
                                remoteViews.setViewVisibility(R.id.dkr, 8);
                                remoteViews.setViewVisibility(R.id.dkq, r5);
                                C55902Lwo.LJII(context, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)), C7MY.LIZIZ(56), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, r5)).LIZJ, R.id.eh8, i2, C7MY.LIZIZ(28), remoteViews);
                                C55902Lwo.LJII(context, C7MY.LIZIZ(56), C7MY.LIZIZ(56), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 1)).LIZJ, R.id.eh_, i2, C7MY.LIZIZ(28), remoteViews);
                                C55902Lwo.LJII(context, C7MY.LIZIZ(56), C7MY.LIZIZ(56), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 2)).LIZJ, R.id.eh9, i2, C7MY.LIZIZ(28), remoteViews);
                                String LJFF = C86V.LJFF(R.string.m05);
                                if (LJFF != null) {
                                    String LLLZ = C16880lQ.LLLZ(LJFF, Arrays.copyOf(new Object[]{((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 0)).LIZLLL, Integer.valueOf(i3 - 1)}, 2));
                                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                                    remoteViews.setTextViewText(R.id.mie, LLLZ);
                                }
                            } else {
                                remoteViews.setViewVisibility(R.id.ehw, 8);
                                remoteViews.setViewVisibility(R.id.dkr, 0);
                                remoteViews.setViewVisibility(R.id.dkq, 8);
                                C55902Lwo.LJII(context, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)), C7MY.LIZIZ(56), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 0)).LIZJ, R.id.eha, i2, C7MY.LIZIZ(28), remoteViews);
                                C55902Lwo.LJII(context, C7MY.LIZIZ(56), C7MY.LIZIZ(56), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 1)).LIZJ, R.id.ehb, i2, C7MY.LIZIZ(28), remoteViews);
                                String LJFF2 = C86V.LJFF(R.string.m04);
                                if (LJFF2 != null) {
                                    String LLLZ2 = C16880lQ.LLLZ(LJFF2, Arrays.copyOf(new Object[]{((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 0)).LIZLLL, ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 1)).LIZLLL}, 2));
                                    o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                                    remoteViews.setTextViewText(R.id.mie, LLLZ2);
                                }
                            }
                        } else {
                            remoteViews.setViewVisibility(R.id.ehw, 0);
                            remoteViews.setViewVisibility(R.id.dkr, 8);
                            remoteViews.setViewVisibility(R.id.dkq, 8);
                            C55902Lwo.LJII(context, O6R.LJJIIZ(C32151Nz.LJIIZILJ(68)), C7MY.LIZIZ(68), ((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 0)).LIZJ, R.id.ehw, i2, C7MY.LIZIZ(34), remoteViews);
                            String LJFF3 = C86V.LJFF(R.string.m03);
                            if (LJFF3 != null) {
                                String LLLZ3 = C16880lQ.LLLZ(LJFF3, Arrays.copyOf(new Object[]{((C55906Lws) ListProtector.get(C55902Lwo.LIZJ, 0)).LIZLLL}, 1));
                                o.LJIIIIZZ(LLLZ3, "format(format, *args)");
                                remoteViews.setTextViewText(R.id.mie, LLLZ3);
                            }
                        }
                    }
                    try {
                        appWidgetManager.updateAppWidget(i2, remoteViews);
                    } catch (Exception e) {
                        C0NB.LJI("FollowSmallWidgetProvider", e);
                    }
                    i++;
                    z2 = true;
                    r5 = 0;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS86S0200000_9 aCallableS86S0200000_9) {
        Aweme aweme = (Aweme) aCallableS86S0200000_9.l0;
        String str = ((IDP) aCallableS86S0200000_9.l1).LJLJI;
        if (aweme.getPreload().commentPreload >= 0) {
            C55001LiH.LIZ().LIZJ(new C55002LiI(aweme, aweme.getPreload().commentPreload * 1000, str, EnumC55042Liw.COMMENT));
        }
        Aweme aweme2 = (Aweme) aCallableS86S0200000_9.l0;
        if (aweme2.getPreload().profilePreload >= 0) {
            C55001LiH.LIZ().LIZJ(new C55002LiI(aweme2, aweme2.getPreload().profilePreload, "", EnumC55042Liw.PROFILE));
            C55001LiH.LIZ().LIZJ(new C55002LiI(aweme2, aweme2.getPreload().profilePreload, "", EnumC55042Liw.POST));
            return null;
        }
        return null;
    }

    public static final Object call$3(ACallableS86S0200000_9 aCallableS86S0200000_9) {
        Throwable th;
        int i;
        String LIZIZ;
        C64799Pbv c64799Pbv;
        C38333F2r c38333F2r;
        C38306F1q c38306F1q;
        String string;
        Bundle bundle = ((FriendsFeedPreload) aCallableS86S0200000_9.l1).preloadBundle;
        String str = "";
        if (bundle != null && (string = bundle.getString(WM7.SCENE_SERVICE, "")) != null) {
            str = string;
        }
        Bundle bundle2 = ((FriendsFeedPreload) aCallableS86S0200000_9.l1).preloadBundle;
        long j = 0;
        if (bundle2 != null) {
            j = bundle2.getLong("start_time", 0L);
        }
        long j2 = j - C56662Kg.LIZ().LJIIJJI;
        Exception exc = (Exception) aCallableS86S0200000_9.l0;
        if ((exc instanceof ExecutionException) && exc != null) {
            th = exc.getCause();
        } else {
            th = null;
        }
        Throwable th2 = (Exception) aCallableS86S0200000_9.l0;
        while (true) {
            if (th2 != null) {
                if (th2 instanceof UnknownHostException) {
                    break;
                }
                th2 = th2.getCause();
            } else {
                th2 = new Throwable("cause null fallback");
                break;
            }
        }
        boolean z = th instanceof C38333F2r;
        if (z && (c38306F1q = (C38306F1q) th) != null) {
            i = c38306F1q.getErrorCode();
        } else {
            i = -3;
        }
        if (!z || (c38333F2r = (C38333F2r) th) == null || (LIZIZ = c38333F2r.getErrorMsg()) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleException ");
            LIZ.append(C65352Pkq.LIZ(((Exception) aCallableS86S0200000_9.l0).getClass()).LJFF());
            LIZ.append(" cause simpleName: ");
            LIZ.append(C65352Pkq.LIZ(th2.getClass()).LJFF());
            LIZ.append(" cause_http_request_status_code: ");
            LIZ.append(C64920Pds.LIZIZ(th2, null));
            LIZ.append(" cause_sub_status_code: ");
            LIZ.append(C64920Pds.LIZJ(th2));
            LIZ.append(" cause_api_exception_status_code: ");
            LIZ.append(C64920Pds.LIZ(EF7.LIZIZ(), th2));
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        LX1.LIZJ(i, j2, elapsedRealtime, str, LIZIZ, false);
        OSZ[] oszArr = new OSZ[10];
        int i2 = 0;
        oszArr[0] = new OSZ("statusCode", String.valueOf(i));
        StringBuilder LIZJ = b1.LIZJ(LIZIZ, " stackTrace: ");
        LIZJ.append(Log.getStackTraceString((Exception) aCallableS86S0200000_9.l0));
        oszArr[1] = new OSZ("statusMsg", X1D.LIZIZ(LIZJ));
        oszArr[2] = new OSZ("duration", String.valueOf(elapsedRealtime));
        oszArr[3] = new OSZ("http_request_status_code", String.valueOf(C64920Pds.LIZIZ((Exception) aCallableS86S0200000_9.l0, null)));
        oszArr[4] = new OSZ("sub_status_code", String.valueOf(C64920Pds.LIZJ((Exception) aCallableS86S0200000_9.l0)));
        oszArr[5] = new OSZ("api_exception_status_code", String.valueOf(C64920Pds.LIZ(EF7.LIZIZ(), (Exception) aCallableS86S0200000_9.l0)));
        Exception exc2 = (Exception) aCallableS86S0200000_9.l0;
        if ((exc2 instanceof C64799Pbv) && (c64799Pbv = (C64799Pbv) exc2) != null) {
            i2 = c64799Pbv.getCronetInternalErrorCode();
        }
        oszArr[6] = new OSZ("cronet_internal_error_code", String.valueOf(i2));
        oszArr[7] = new OSZ("cause_http_request_status_code", String.valueOf(C64920Pds.LIZIZ(th2, null)));
        oszArr[8] = new OSZ("cause_sub_status_code", String.valueOf(C64920Pds.LIZJ(th2)));
        oszArr[9] = new OSZ("cause_api_exception_status_code", String.valueOf(C64920Pds.LIZ(EF7.LIZIZ(), th2)));
        C78983UzD.LJIJI(th2, "friends_feed_preload_error", C113554cx.LJJL(oszArr));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$4(ACallableS86S0200000_9 aCallableS86S0200000_9) {
        long j;
        C55693LtR c55693LtR = (C55693LtR) aCallableS86S0200000_9.l0;
        Object[] objArr = (Object[]) aCallableS86S0200000_9.l1;
        String str = c55693LtR.LJLJI;
        int i = c55693LtR.LJLIL;
        T t = c55693LtR.mData;
        if (t == 0) {
            j = 0;
        } else {
            j = ((FeedItemList) t).maxCursor;
        }
        return c55693LtR.LJIILL(false, str, i, j, 0, (String) objArr[5], c55693LtR.LJLJL, c55693LtR.LJLJLJ, true, c55693LtR.LJLLI);
    }

    public static final Object call$5(ACallableS86S0200000_9 aCallableS86S0200000_9) {
        List<FriendsFeed> list;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        LWX lwx = (LWX) aCallableS86S0200000_9.l0;
        FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) aCallableS86S0200000_9.l1;
        lwx.getClass();
        try {
            C35585Dxt redDotMetadataBeforeEnteringTab = LHM.LIZIZ.LIZIZ().getRedDotMetadataBeforeEnteringTab();
            boolean z2 = redDotMetadataBeforeEnteringTab.LJLJI;
            if (z2) {
                lwx.LJLL = redDotMetadataBeforeEnteringTab.LJLILLLLZI;
                lwx.LJLLI = redDotMetadataBeforeEnteringTab.LJLIL.size();
            }
            if (friendsFeedResponse == null) {
                list = null;
            } else {
                list = friendsFeedResponse.friendFeedData;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null && !C79004UzY.LJJIFFI(list)) {
                z = false;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i = 0;
                for (FriendsFeed friendsFeed : list) {
                    Aweme aweme = friendsFeed.getAweme();
                    int source = friendsFeed.getSource();
                    if (source == LII.SORT.getDataLevel()) {
                        i++;
                        if (aweme != null) {
                            if (aweme.getFollowStatus() == 1) {
                                if (aweme.getIsTikTokStory()) {
                                    lwx.LJLJLJ++;
                                } else {
                                    lwx.LJLJJLL++;
                                }
                            } else if (aweme.getFollowStatus() == 2) {
                                if (aweme.getIsTikTokStory()) {
                                    lwx.LJLJLLL++;
                                } else {
                                    lwx.LJLJL++;
                                }
                            } else if (aweme.getFollowStatus() == 0) {
                                i2++;
                            }
                            if (!LHM.LIZIZ.LIZIZ().originalNumberDotList().contains(aweme.getAid())) {
                                String aid = aweme.getAid();
                                o.LJIIIIZZ(aid, "feedAweme.aid");
                                arrayList.add(aid);
                            }
                        }
                    } else {
                        if (source == LII.HISTORY_UNVIEWED.getDataLevel() && aweme != null) {
                            if (aweme.getIsTikTokStory()) {
                                i3++;
                            } else {
                                i4++;
                            }
                        }
                        z = true;
                    }
                }
            } else {
                z = false;
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            String str2 = "";
            if (friendsFeedResponse != null && friendsFeedResponse.extra != null && (str = friendsFeedResponse.extra.logid) != null) {
                str2 = str;
            }
            if (z2 || (z && (lwx.LJLLI != 0 || lwx.LJLL != 0))) {
                int i6 = lwx.LJLLI;
                int i7 = lwx.LJLL;
                int i8 = lwx.LJLJLJ;
                int i9 = lwx.LJLJJLL;
                int i10 = lwx.LJLJLLL;
                int i11 = lwx.LJLJL;
                String redDotRequestId = LHM.LIZIZ.LIZIZ().getRedDotRequestId();
                if (z) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                C54024LIe.LIZJ(str2, i6, i7, i, i8, i9, i10, i11, i2, i3, i4, arrayList, redDotRequestId, i5, z2);
                if (z) {
                    lwx.LJLJLLL = 0;
                    lwx.LJLJL = 0;
                    lwx.LJLJLJ = 0;
                    lwx.LJLJJLL = 0;
                    lwx.LJLL = 0;
                    lwx.LJLLI = 0;
                }
            }
        } catch (Exception e) {
            StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "reportRedDotAccuracyMob error ");
            LIZIZ.append(e.getMessage());
            C36922EeM.LJ(X1D.LIZIZ(LIZIZ));
        }
        ((LWX) aCallableS86S0200000_9.l0).handleData((FriendsFeedResponse) aCallableS86S0200000_9.l1);
        return null;
    }

    public static final Object call$6(ACallableS86S0200000_9 aCallableS86S0200000_9) {
        C36922EeM.LIZLLL(2, ((FollowingBottomTabProtocolAssem) aCallableS86S0200000_9.l0).LJLIL, "schedule async task");
        return ((FollowingBottomTabProtocolAssem) aCallableS86S0200000_9.l0).x3((ActivityC45651qj) aCallableS86S0200000_9.l1);
    }

    public static final Object call$7(ACallableS86S0200000_9 aCallableS86S0200000_9) {
        C36922EeM.LIZLLL(2, "landing_2860", "schedule async task");
        return ((FriendsTabProtocolAssem) aCallableS86S0200000_9.l0).x3((ActivityC45651qj) aCallableS86S0200000_9.l1);
    }

    public static final Object call$8(ACallableS86S0200000_9 aCallableS86S0200000_9) {
        boolean z;
        int i;
        Integer LIZJ;
        C81154Vt8 LIZ = FlyMainColor.LIZ.LIZ(new C23220ve((Bitmap) aCallableS86S0200000_9.l0, null));
        ActivityC45651qj activityC45651qj = ((ChooseMusicSelectView) aCallableS86S0200000_9.l1).LJLLILLLL;
        if (activityC45651qj != null) {
            Integer LJ = C79045V0n.LJ(R.attr.bpu, activityC45651qj);
            if (LJ == null || LJ.intValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LIZ.LJI(10.0f);
                LIZ.LJII(10.0f);
                LIZ.LJFF(0.001f, 0.018f, 0.93f, 0.95f, 0.0f);
            } else {
                LIZ.LJI(0.0f);
                LIZ.LJII(10.0f);
                LIZ.LJFF(0.001f, 0.035f, 0.36f, 0.38f, 0.0f);
            }
            if (LIZ.LIZLLL >= 0 && (LIZJ = LIZ.LIZJ()) != null) {
                i = LIZJ.intValue();
            } else {
                i = R.attr.d7;
            }
            return Integer.valueOf(i);
        }
        o.LJIJI("mActivity");
        throw null;
    }

    public ACallableS86S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
