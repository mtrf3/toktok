package Y;

import X.AnonymousClass744;
import X.C12460eI;
import X.C13930gf;
import X.C181937Cb;
import X.C188727au;
import X.C46591IQh;
import X.C55063LjH;
import X.C72074SQk;
import X.C84923XUp;
import X.C84942XVi;
import X.C84987XXb;
import X.FMX;
import X.InterfaceC87404YSa;
import X.SGH;
import X.X4A;
import X.XWQ;
import X.XX7;
import X.YAB;
import X.YAE;
import X.YHR;
import X.YHS;
import X.YHV;
import X.YHW;
import X.YHX;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.FeedActionData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceRerankInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.videoshop.controller.VideoController;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ARunnableS18S0201000_15 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        AwemeRawAd awemeRawAd;
        long currentTimeMillis;
        long j;
        Long originalItemGap;
        YHR yhr = (YHR) this.l0;
        int i = this.i2;
        Aweme aweme = (Aweme) this.l1;
        int i2 = yhr.LJIIJJI;
        if (i2 != 0 && i2 == i) {
            return;
        }
        yhr.LJIIJJI = i;
        if (aweme == null || !yhr.LJIJI()) {
            return;
        }
        yhr.LJIJJ();
        Map<String, YHV> map = yhr.LJI;
        if (aweme == null) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        YHV yhv = (YHV) linkedHashMap.get(aweme.getAid());
        if (yhv == null) {
            FeedActionData feedActionData = new FeedActionData(System.currentTimeMillis() / 1000);
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            int value = YHW.SHOWN.getValue();
            RankData.Companion.getClass();
            YHV yhv2 = new YHV(aid, value, feedActionData, C72074SQk.LIZ(aweme));
            String aid2 = aweme.getAid();
            o.LJIIIIZZ(aid2, "aweme.aid");
            linkedHashMap.put(aid2, yhv2);
        } else if (yhv.getFeedStatus() == YHW.SHOWN.getValue()) {
            return;
        }
        if (aweme.isAd()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (awemeRawAd = aweme.getAwemeRawAd()) != null && !o.LJ(String.valueOf(awemeRawAd.getAdId()), yhr.LJIILIIL.LIZ)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("cid", String.valueOf(awemeRawAd.getCreativeId()));
            c188727au.LJIIIZ("last_cid", yhr.LJIILIIL.LIZIZ);
            c188727au.LJIIIZ("ad_id", String.valueOf(awemeRawAd.getAdId()));
            c188727au.LJIIIZ("last_ad_id", yhr.LJIILIIL.LIZ);
            int i3 = yhr.LJIILIIL.LIZJ;
            int i4 = -1;
            if (i3 != -1) {
                i4 = Math.abs(i - i3);
            }
            c188727au.LIZLLL(i4, "cur_item_gap");
            if (yhr.LJIILIIL.LIZLLL == -1) {
                currentTimeMillis = -1;
            } else {
                currentTimeMillis = (System.currentTimeMillis() / 1000) - yhr.LJIILIIL.LIZLLL;
            }
            c188727au.LJ(currentTimeMillis, "cur_time_gap");
            CommerceRerankInfo commerceRerankInfo = aweme.getCommerceRerankInfo();
            if (commerceRerankInfo != null && (originalItemGap = commerceRerankInfo.getOriginalItemGap()) != null) {
                j = originalItemGap.longValue();
            } else {
                j = -1;
            }
            c188727au.LJ(j, "original_item_gap");
            FMX.LJIIL("ad_gap_info", c188727au.LIZ);
            yhr.LJIILIIL.LJ = null;
            C46591IQh c46591IQh = new C46591IQh(0);
            c46591IQh.LIZIZ = String.valueOf(awemeRawAd.getCreativeId());
            c46591IQh.LIZ = String.valueOf(awemeRawAd.getAdId());
            c46591IQh.LIZJ = i;
            c46591IQh.LIZLLL = System.currentTimeMillis() / 1000;
            c46591IQh.LJ = yhr.LJIILIIL;
            yhr.LJIILIIL = c46591IQh;
        }
        Map<String, YHV> map2 = yhr.LJI;
        YHW yhw = YHW.SHOWN;
        o.LJI(aweme);
        String aid3 = aweme.getAid();
        o.LJIIIIZZ(aid3, "aweme!!.aid");
        YHR.LJIJJLI(map2, yhw, aid3);
        Map<String, YHV> map3 = yhr.LJI;
        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
        String aid4 = aweme.getAid();
        o.LJIIIIZZ(aid4, "aweme!!.aid");
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map3;
        YHV yhv3 = (YHV) linkedHashMap2.get(aid4);
        if (yhv3 != null) {
            linkedHashMap2.put(aid4, new YHV(yhv3.getId(), yhv3.getFeedStatus(), new FeedActionData(currentTimeMillis2), yhv3.getRankData()));
        }
        int intValue = ((Number) yhr.LJIIZILJ.getValue()).intValue();
        for (int i5 = 1; i5 < intValue; i5++) {
            Map<String, YHV> map4 = yhr.LJI;
            YHW yhw2 = YHW.UNSHOWN_NONADJUSTABLE;
            YHS yhs = YHS.LIZ;
            C55063LjH c55063LjH = yhr.LJFF;
            yhs.getClass();
            List LIZ = YHS.LIZ(c55063LjH);
            int i6 = i + i5;
            if (i6 >= 0 && i6 < LIZ.size()) {
                Aweme aweme2 = (Aweme) ListProtector.get(LIZ, i6);
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) map4;
                YHV yhv4 = (YHV) linkedHashMap3.get(aweme2.getAid());
                if (yhv4 != null && Integer.valueOf(yhv4.getFeedStatus()) != null && yhv4.getFeedStatus() != YHW.SHOWN.getValue()) {
                    String aid5 = aweme2.getAid();
                    o.LJIIIIZZ(aid5, "aweme.aid");
                    YHR.LJIJJLI(linkedHashMap3, yhw2, aid5);
                }
            }
        }
        yhr.LJIL(YHX.ON_SELECTED);
    }

    public final void LIZ$1() {
        ((X4A) this.l1).B0();
        if (X4A.LJLJJLL == null) {
            return;
        }
        X4A x4a = (X4A) this.l1;
        int i = this.i2;
        ContentValues contentValues = (ContentValues) this.l0;
        x4a.getClass();
        int i2 = 10;
        while (X4A.LJLJJLL.isDbLockedByCurrentThread() && i2 - 1 >= 0) {
            try {
                try {
                    Thread.sleep(5L);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        X4A.LJLJJLL.update("downloader", contentValues, "_id = ? ", new String[]{String.valueOf(i)});
    }

    public static final void run$0(ARunnableS18S0201000_15 aRunnableS18S0201000_15) {
        boolean LIZ;
        Notification notification;
        try {
            DownloadNotificationService downloadNotificationService = (DownloadNotificationService) aRunnableS18S0201000_15.l1;
            NotificationManager notificationManager = (NotificationManager) aRunnableS18S0201000_15.l0;
            int i = aRunnableS18S0201000_15.i2;
            synchronized (downloadNotificationService.LJLILLLLZI) {
                notification = downloadNotificationService.LJLILLLLZI.get(i);
                downloadNotificationService.LJLILLLLZI.remove(i);
            }
            if (notification != null) {
                DownloadNotificationService.LIZJ(notificationManager, i, notification);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS18S0201000_15 aRunnableS18S0201000_15) {
        boolean LIZ;
        try {
            VideoController videoController = (VideoController) aRunnableS18S0201000_15.l1;
            InterfaceC87404YSa interfaceC87404YSa = videoController.videoPlayListener;
            if (interfaceC87404YSa != null) {
                interfaceC87404YSa.onFrameDraw(videoController.videoStateInquirer, videoController.playEntity, aRunnableS18S0201000_15.i2, (Map) aRunnableS18S0201000_15.l0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS18S0201000_15 aRunnableS18S0201000_15) {
        boolean LIZ;
        SGH sgh;
        try {
            List<SGH> list = ((YAB) aRunnableS18S0201000_15.l0).LJLJL;
            if (list != null && (sgh = (SGH) ListProtector.get(list, aRunnableS18S0201000_15.i2)) != null) {
                YAB yab = (YAB) aRunnableS18S0201000_15.l0;
                View view = (View) aRunnableS18S0201000_15.l1;
                YAE yae = yab.LJLJJI;
                if (yae != null) {
                    yae.LIZ(view, sgh.LIZ, false);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS18S0201000_15 aRunnableS18S0201000_15) {
        boolean LIZ;
        try {
            ((YAB) aRunnableS18S0201000_15.l0).LJLIL.LJLIL(aRunnableS18S0201000_15.i2);
            YAB yab = (YAB) aRunnableS18S0201000_15.l0;
            yab.LJLJJI = (YAE) aRunnableS18S0201000_15.l1;
            yab.LJLJJL = aRunnableS18S0201000_15.i2;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS18S0201000_15 aRunnableS18S0201000_15) {
        boolean LIZ;
        try {
            C84942XVi c84942XVi = (C84942XVi) aRunnableS18S0201000_15.l1;
            int i = c84942XVi.LJJJJLL + 1;
            c84942XVi.LJJJJLL = i;
            if (aRunnableS18S0201000_15.i2 < 20 && !c84942XVi.LJJJJZ) {
                C84942XVi.LJIIIZ((Dialog) aRunnableS18S0201000_15.l0, i);
                C84942XVi c84942XVi2 = (C84942XVi) aRunnableS18S0201000_15.l1;
                c84942XVi2.LJIIJJI((Dialog) aRunnableS18S0201000_15.l0, c84942XVi2.LJJJJLL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS18S0201000_15 aRunnableS18S0201000_15) {
        switch (aRunnableS18S0201000_15.i2) {
            case 0:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) aRunnableS18S0201000_15.l0;
                ViewTreeObserver.OnDrawListener onDrawListener = (ViewTreeObserver.OnDrawListener) aRunnableS18S0201000_15.l1;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnDrawListener(onDrawListener);
                    return;
                }
                return;
            default:
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = (NetworkChangeNotifierAutoDetect) aRunnableS18S0201000_15.l0;
                Runnable runnable = (Runnable) aRunnableS18S0201000_15.l1;
                if (networkChangeNotifierAutoDetect.LJIIJ) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public static final void run$6(ARunnableS18S0201000_15 aRunnableS18S0201000_15) {
        boolean LIZ;
        try {
            aRunnableS18S0201000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS18S0201000_15 aRunnableS18S0201000_15) {
        switch (aRunnableS18S0201000_15.i2) {
            case 0:
                AnonymousClass744 anonymousClass744 = (AnonymousClass744) aRunnableS18S0201000_15.l0;
                View view = (View) aRunnableS18S0201000_15.l1;
                C181937Cb c181937Cb = anonymousClass744.LLIILZL;
                if (c181937Cb != null) {
                    C12460eI.LIZJ(view, c181937Cb);
                    C13930gf.LIZLLL(false);
                    return;
                }
                return;
            default:
                C84923XUp c84923XUp = (C84923XUp) aRunnableS18S0201000_15.l0;
                c84923XUp.LJFF.LJ.LLLZZIL(null, (MusicModel) aRunnableS18S0201000_15.l1);
                return;
        }
    }

    public static final void run$8(ARunnableS18S0201000_15 aRunnableS18S0201000_15) {
        boolean LIZ;
        try {
            aRunnableS18S0201000_15.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS18S0201000_15 aRunnableS18S0201000_15) {
        XWQ xwq = (XWQ) aRunnableS18S0201000_15.l0;
        int i = aRunnableS18S0201000_15.i2;
        MusicModel musicModel = (MusicModel) aRunnableS18S0201000_15.l1;
        RecyclerView.ViewHolder LJJIZ = xwq.LIZIZ.LJJIZ(i);
        if (LJJIZ instanceof C84987XXb) {
            ((XX7) xwq.LJFF).LJLZ((C84987XXb) LJJIZ, musicModel);
        }
    }

    public ARunnableS18S0201000_15(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
