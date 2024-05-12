package X;

import Y.ACallableS41S0000000_6;
import Y.ACallableS78S0101000_6;
import Y.ARunnableS0S2000000_6;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS6S0210000_6;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FW5 {
    public static Boolean LIZ = null;
    public static long LIZIZ = -1;
    public static volatile Boolean LIZJ = null;
    public static boolean LIZLLL = false;
    public static long LJ = -1;
    public static long LJFF = -1;
    public static long LJI = -1;
    public static volatile boolean LJII;
    public static HandlerC39072FVc LJIIIIZZ;
    public static Queue<Runnable> LJIIIZ;
    public static boolean LJIIJ;
    public static ARunnableS6S0210000_6 LJIIJJI;
    public static final long LJIIL = TimeUnit.SECONDS.toMillis(3);

    public static boolean LJI() {
        Boolean bool = LIZ;
        if (bool != null && bool.booleanValue() && LJIIIIZZ != null) {
            return true;
        }
        return false;
    }

    public static String LIZIZ(FeedItemList feedItemList) {
        StringBuilder sb = new StringBuilder();
        if (!C79004UzY.LJJIFFI(feedItemList.getItems())) {
            Iterator<Aweme> it = feedItemList.getItems().iterator();
            while (it.hasNext()) {
                sb.append(it.next().getAid());
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void LJ(Runnable runnable) {
        if (LJFF != -1) {
            C38816FLg.LJ(runnable);
            return;
        }
        if (LJIIIZ == null) {
            LJIIIZ = new LinkedBlockingQueue();
        }
        ((LinkedBlockingQueue) LJIIIZ).offer(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r11 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r11 == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r11 == 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(r3[r2]);
        r1.append("/with_uid.json");
        r1 = X.X1D.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        r3 = X.C36946Eek.LIZ(X.EF7.LIZIZ(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r11 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if (r11 == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r11 == 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r9 = "default.json";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        r7 = new X.C188727au();
        r1 = X.X1D.LIZ();
        r1.append(r10);
        r1.append('#');
        r1.append(r9);
        r7.LJIIIZ("language", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c1, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        r0 = "empty";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        r7.LJIIIZ("isLanguageDefault", r0);
        X.FMX.LJIIL("use_default_json", r7.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        r0 = "languageDefault";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        r9 = "with_uid.json";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0094, code lost:
    
        r9 = "with_did.json";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0097, code lost:
    
        r9 = "without_did.json";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(r3[r2]);
        r1.append("/with_did.json");
        r1 = X.X1D.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006e, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(r3[r2]);
        r1.append("/without_did.json");
        r1 = X.X1D.LIZIZ(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132 A[LOOP:1: B:38:0x012c->B:40:0x0132, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.FeedItemList LJFF(int r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FW5.LJFF(int):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    public static void LJIIIIZZ(String str) {
        LJIIIZ(str, "");
    }

    public static void LIZ(String str, String str2) {
        LJ(new ARunnableS0S2000000_6(str, str2, 2));
    }

    public static void LIZJ(String str, List list) {
        if (C1A7.LJIILIIL().LIZ(0, "cold_start_times") <= 1) {
            if (C79004UzY.LJJIFFI(list)) {
                LJIIIZ("Aweme_Items_is_null", str);
                return;
            }
            Aweme aweme = (Aweme) ListProtector.get(list, 0);
            if (aweme == null) {
                LJIIIZ("Aweme_is_null", str);
                return;
            }
            if (aweme.getVideo() == null) {
                LJIIIZ("video_is_null", str);
                return;
            }
            if (aweme.getVideo().getPlayAddr() == null) {
                LJIIIZ("playAddr_is_null", str);
            } else if (C79004UzY.LJJIFFI(aweme.getVideo().getPlayAddr().getUrlList())) {
                LJIIIZ("UrlList_is_null", str);
            } else if (TextUtils.isEmpty((CharSequence) ListProtector.get(aweme.getVideo().getPlayAddr().getUrlList(), 0))) {
                LJIIIZ("first_video_url_is_null", str);
            }
        }
    }

    public static void LJIIIZ(String str, String str2) {
        LJ(new ARunnableS0S2000000_6(str, str2, 1));
    }

    public static void LJIIJ(FeedItemList feedItemList, int i) {
        int i2;
        Object obj;
        java.util.Map<String, String> map;
        NPC.LJIIJJI(i, feedItemList.getItems(), new C43881HKb());
        FWC fwc = (FWC) C73340SqO.LJIJJ();
        fwc.getClass();
        if (!C79004UzY.LJJIFFI(feedItemList.getItems())) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (fwc.LIZ.LIZ(currentTimeMillis)) {
                    ((HashMap) fwc.LIZLLL).clear();
                    C10K.LIZ(new ACallableS41S0000000_6(4));
                }
                fwc.LIZ.LIZJ(currentTimeMillis);
                Iterator<Aweme> it = feedItemList.getItems().iterator();
                EF7.LIZIZ();
                while (it.hasNext()) {
                    Aweme next = it.next();
                    if (next != null && next.isAd()) {
                        String aid = next.getAid();
                        String str = "2";
                        if (fwc.LIZLLL(next)) {
                            it.remove();
                            if (C63081OpJ.LLJJIJI(next)) {
                                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "show_failed", next.getAwemeRawAd());
                                LIZLLL2.LIZIZ("12", "ad_show_fail_type");
                                LIZLLL2.LIZIZ(fwc.LIZJ(aid), "repeat_cid");
                                if (C55511LqV.LIZIZ) {
                                    str = "1";
                                }
                                LIZLLL2.LIZIZ(str, "awemelaunch");
                                LIZLLL2.LJI();
                            }
                            if (next.isAd()) {
                                C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "item_repeat", next.getAwemeRawAd());
                                LIZLLL3.LIZIZ(1, "filter_reason");
                                LIZLLL3.LIZIZ(fwc.LIZJ(aid), "repeat_cid");
                                LIZLLL3.LIZIZ(2, "repeat_type");
                                LIZLLL3.LJI();
                            }
                        } else if (fwc.LIZIZ != null && !next.getAwemeRawAd().isDiableAdShowFilter()) {
                            for (Aweme aweme : fwc.LIZIZ.getItems()) {
                                if (aweme != null && TextUtils.equals(aid, aweme.getAid())) {
                                    it.remove();
                                    if (C63081OpJ.LLJJIJI(next)) {
                                        C58655N0h LIZLLL4 = C58704N2e.LIZLLL("draw_ad", "show_failed", next.getAwemeRawAd());
                                        LIZLLL4.LIZIZ("8", "ad_show_fail_type");
                                        if (C55511LqV.LIZIZ) {
                                            obj = "1";
                                        } else {
                                            obj = "2";
                                        }
                                        LIZLLL4.LIZIZ(obj, "awemelaunch");
                                        LIZLLL4.LIZIZ(fwc.LIZJ(aid), "repeat_cid");
                                        LIZLLL4.LJI();
                                    }
                                    C58655N0h LIZLLL5 = C58704N2e.LIZLLL("draw_ad", "item_repeat", next.getAwemeRawAd());
                                    if (aweme.isAd()) {
                                        i2 = 1;
                                    } else {
                                        i2 = 2;
                                    }
                                    LIZLLL5.LIZIZ(Integer.valueOf(i2), "filter_reason");
                                    LIZLLL5.LIZIZ(fwc.LIZJ(aid), "repeat_cid");
                                    LIZLLL5.LIZIZ(2, "repeat_type");
                                    LIZLLL5.LJI();
                                }
                            }
                        }
                    }
                }
                fwc.LIZIZ = feedItemList;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        NPC.LIZ(feedItemList.getItems(), new C63144OqK());
        LJIIJJI(i, feedItemList.getRequestId(), feedItemList.getItems());
        AdSessionPositionHelper.LJIIJJI("fyp", feedItemList.getItems());
        C2NJ.LIZ(feedItemList.getItems());
        if (EU0.LIZ && (map = feedItemList.localExtra) != null) {
            String str2 = map.get("aweme_id");
            FW1 fw1 = (FW1) FW1.LJFF.LIZJ();
            List<Aweme> items = feedItemList.getItems();
            if (items == null) {
                fw1.getClass();
            } else {
                synchronized (fw1) {
                    fw1.LIZIZ();
                    Iterator<Aweme> it2 = items.iterator();
                    while (it2.hasNext()) {
                        Aweme next2 = it2.next();
                        if (next2 != null && !C38354F3m.LIZJ(str2, next2.getAid())) {
                            Iterator it3 = ((ArrayList) fw1.LIZIZ).iterator();
                            while (it3.hasNext()) {
                                FW2 fw2 = (FW2) it3.next();
                                if (fw2 != null && C38354F3m.LIZJ(fw2.LIZ, next2.getAid())) {
                                    it2.remove();
                                }
                            }
                        }
                    }
                }
            }
        }
        List<Aweme> items2 = feedItemList.getItems();
        if (items2 != null) {
            int size = items2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((Aweme) ListProtector.get(items2, i3)).getUploadMiscInfoStruct();
            }
        }
    }

    public static void LJII(long j, Object obj, boolean z) {
        if (!FMX.LIZJ("pull_out_cache_video")) {
            return;
        }
        C188727au c188727au = new C188727au();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (obj != null && (obj instanceof FeedItemList)) {
            c188727au.LJIIIZ("is_cache", "1");
            if (z) {
                str = "1";
            }
            c188727au.LJIIIZ("is_timeout", str);
            FeedItemList feedItemList = (FeedItemList) obj;
            c188727au.LIZLLL(feedItemList.getItems().size(), "cache_num");
            c188727au.LJIIIZ("group_id_list", LIZIZ(feedItemList));
            c188727au.LJ(j, "cache_time");
            String string = IOK.LIZLLL().getString("feed_cache_source", "def");
            o.LJIIIIZZ(string, "keva.getString(KEY_CACHE…TYPE, CACHE_FROM_DEFAULT)");
            c188727au.LJI("from_type", string);
        } else {
            c188727au.LJIIIZ("is_cache", CardStruct.IStatusCode.DEFAULT);
            c188727au.LJIIIZ("is_timeout", CardStruct.IStatusCode.DEFAULT);
            c188727au.LIZLLL(0, "cache_num");
            c188727au.LJIIIZ("group_id_list", "");
            c188727au.LJ(j, "cache_time");
        }
        FMX.LJIIL("pull_out_cache_video", c188727au.LIZ);
    }

    public static void LJIIJJI(int i, String str, List list) {
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme = (Aweme) ListProtector.get(list, i2);
                aweme.setRequestId(str);
                if (!aweme.isLiveNoDeduplicate() || !FW9.LIZ()) {
                    aweme = AwemeService.LIZ().R1(aweme);
                }
                IRequestIdService LJ2 = RequestIdService.LJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(aweme.getAid());
                LIZ2.append(i);
                LJ2.LIZJ(i2, X1D.LIZIZ(LIZ2), str);
                if (!(list instanceof ArrayList)) {
                    list = new ArrayList(list);
                }
                ListProtector.set(list, i2, aweme);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(final int i, int i2, WeakHandler weakHandler, Callable callable, final int i3, boolean z, final Lock lock) {
        final WeakHandler weakHandler2;
        final Callable callable2;
        if (z && i == 0 && ((LIZ == null || i2 == 0) && weakHandler != null)) {
            LIZ = Boolean.TRUE;
            if (LJ != -1) {
                LJI = SystemClock.elapsedRealtime() - LJ;
            }
            HandlerC39072FVc handlerC39072FVc = new HandlerC39072FVc(weakHandler);
            LJIIIIZZ = handlerC39072FVc;
            callable2 = new CallableC39092FVw(callable);
            weakHandler2 = handlerC39072FVc;
        } else {
            weakHandler2 = weakHandler;
            callable2 = callable;
        }
        if (C1DH.LJIL() && ((i == 1 || i == 0) && C1DH.LJIL())) {
            synchronized (LXV.LJIJJ) {
                LXV.LJIJI = new FW6(weakHandler);
            }
        }
        C10K.LIZIZ(new ACallableS78S0101000_6(0, new Runnable() { // from class: X.FAh
            @Override // java.lang.Runnable
            public final void run() {
                Throwable th;
                Object obj;
                boolean z2;
                boolean z3;
                boolean z4;
                Callable callable3 = callable2;
                Handler handler = weakHandler2;
                int i4 = i;
                int i5 = i3;
                Lock lock2 = lock;
                try {
                    th = null;
                    obj = callable3.call();
                } catch (Exception e) {
                    th = e;
                    obj = e;
                }
                boolean z5 = true;
                if (handler != null && obj != null) {
                    if ((obj instanceof FeedItemList) && !C79004UzY.LJJIFFI(((FeedItemList) obj).getItems())) {
                        try {
                            FW5.LJIIJ((FeedItemList) obj, i4);
                            FeedItemList feedItemList = (FeedItemList) obj;
                            if (((Boolean) C99O.LJFF.getValue()).booleanValue() && !C79004UzY.LJJIFFI(feedItemList.getItems())) {
                                for (Aweme aweme : feedItemList.getItems()) {
                                    if (aweme != null) {
                                        C38995FSd.LIZLLL().execute(new ARunnableS15S0101000_11(4, aweme, 12));
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = new IllegalArgumentException(th2);
                            obj = th;
                        }
                    }
                    C36922EeM.LIZLLL(4, "Feed0VVManager", "start to post message,type:" + i4);
                    Message obtainMessage = handler.obtainMessage(i5);
                    obtainMessage.obj = obj;
                    if (FR4.LJFF) {
                        Object obj2 = FR4.LJII;
                        try {
                            synchronized (obj2) {
                                if (FR4.LJFF) {
                                    obj2.wait(5000L);
                                }
                            }
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (lock2 != null) {
                        O5Y.LJJLIIIIJ(lock2);
                    }
                    if (C36152EGu.LJI() == 3 && C33842DPy.LIZIZ()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((lock2 == null || z3) && !FW5.LJIIJ) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ARunnableS6S0210000_6 aRunnableS6S0210000_6 = new ARunnableS6S0210000_6(z4, handler, obtainMessage, 2);
                    if (FW5.LJIIJJI == null && C38985FRt.LIZIZ.LJIILIIL() && E1L.LIZ()) {
                        if (((Boolean) C33842DPy.LIZJ.getValue()).booleanValue() && C35478DwA.LIZJ && C35478DwA.LIZ() == 3) {
                            aRunnableS6S0210000_6.run();
                        } else {
                            FW5.LJIIJJI = aRunnableS6S0210000_6;
                        }
                    } else {
                        aRunnableS6S0210000_6.run();
                    }
                    C36922EeM.LIZLLL(4, "Feed0VVManager", "end to post message,type:" + i4);
                    C56662Kg.LIZ().LJFF("feed_ui_response_to_post_msg", false);
                    C56662Kg.LIZ().LIZJ("feed_ui_post_msg_to_feed_ui", false);
                } else {
                    StringBuilder sb = new StringBuilder("callHandler is null:");
                    if (handler == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sb.append(z2);
                    sb.append(",result is null:");
                    if (obj != null) {
                        z5 = false;
                    }
                    sb.append(z5);
                    C36922EeM.LIZLLL(6, "Feed0VVManager", sb.toString());
                }
                if (th instanceof IllegalArgumentException) {
                    C36922EeM.LIZLLL(6, "Feed0VVManager", "commit#targetRunnable error:" + th.toString());
                    C36922EeM.LJFF(th);
                    PEH.LIZJ(th);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        String stackTraceString = android.util.Log.getStackTraceString(th);
                        if (stackTraceString.length() > 4096) {
                            stackTraceString = stackTraceString.substring(0, 4096);
                        }
                        jSONObject.put("error_stack", stackTraceString);
                        jSONObject.put("errorType", "feed_load_error");
                        FUA.LIZJ("aweme_error_find_bug", jSONObject);
                        return;
                    } catch (Throwable th3) {
                        C36922EeM.LIZLLL(4, "Feed0VVManager", "report error:" + th3);
                        return;
                    }
                }
                if (th != null) {
                    C36922EeM.LIZLLL(6, "Feed0VVManager", "commit#targetRunnable error:" + th);
                    return;
                }
                C36922EeM.LIZLLL(4, "Feed0VVManager", "commit#targetRunnable success");
            }
        }, 6), C38995FSd.LIZLLL(), null);
    }
}
