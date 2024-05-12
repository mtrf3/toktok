package X;

import Y.ACallableS11S0102000_6;
import Y.ACallableS24S0001000_6;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.IwS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48236IwS {
    public static volatile FeedItemList LIZ;
    public static volatile FeedItemList LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJI;
    public static volatile boolean LJII;
    public static volatile boolean LJIIIIZZ;
    public static volatile boolean LJIIIZ;
    public static volatile boolean LJIIJ;
    public static volatile boolean LJIILJJIL;
    public static volatile boolean LJIILL;
    public static volatile boolean LJIILLIIL;
    public static boolean LJIJ;
    public static FeedItemList LJIJI;
    public static final CountDownLatch LJ = new CountDownLatch(1);
    public static volatile String LJFF = "";
    public static final Object LJIIJJI = new Object();
    public static volatile boolean LJIIL = true;
    public static final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(C48240IwW.LJLIL);
    public static final C5H3 LJIIZILJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, FRS.LJLIL);

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:384|(2:386|(3:392|(3:394|(2:396|(2:398|(2:400|(2:402|(2:404|(2:406|(2:408|(2:410|(2:412|(1:417)(2:414|415))(1:418))(1:419))(1:420))(1:421))(1:422))(1:423))(1:424))(1:425))(1:426)|416)|427)))|3|(2:9|(2:11|(2:13|(4:15|(2:19|(8:21|(1:23)|24|(1:45)(1:28)|29|(1:44)(1:35)|36|(2:38|(1:40))(2:41|(1:43))))|46|(1:332)(2:50|(4:52|(4:55|(4:69|(1:321)(1:73)|74|(8:78|(5:80|(1:167)(2:83|(7:91|(4:93|(4:96|(2:103|104)|105|94)|109|110)|111|(1:113)(1:123)|(1:115)(2:120|(1:122))|116|(1:118)(1:119)))|124|(1:126)|127)(2:168|(5:312|(3:318|195|(1:303)(2:197|(5:201|202|203|204|(3:212|(3:218|(4:221|(3:223|224|226)(1:229)|227|219)|230)|(1:293)(3:232|(1:234)(1:292)|(1:291)(10:236|237|238|(4:239|240|(3:268|269|270)(2:242|(2:244|245)(1:247))|246)|248|(4:250|(2:257|258)|266|258)(1:267)|259|260|261|(1:263)))))))|306|195|(0)(0))(7:171|(4:175|(4:178|(2:185|186)|184|176)|188|(3:194|195|(0)(0)))|304|(3:311|195|(0)(0))|306|195|(0)(0)))|128|(1:132)|133|(2:137|(1:140))|141|(2:145|(4:147|(1:152)|149|150)(2:153|(4:155|(1:159)|157|158)(4:160|(1:164)|162|163)))))|151|53)|329|330)(1:331)))(1:334))))|335|(1:337)|338|339|340|(3:358|359|(3:363|(4:366|(2:374|375)|376|364)|380))|342|(1:351)|355|(1:357)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x05da, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x05db, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05f0  */
    /* JADX WARN: Type inference failed for: r0v164 */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v90, types: [int] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48236IwS.LIZ():void");
    }

    public static boolean LIZLLL() {
        if (LJIIIIZZ("feed.pb") != null || LJIIIIZZ("feed.json") != null || LJIIIIZZ("feed2.pb") != null || LJIIIIZZ("feed2.json") != null || LJIIIIZZ("feed3.pb") != null || LJIIIIZZ("feed3.json") != null) {
            return true;
        }
        return false;
    }

    public static FeedItemList LJFF() {
        File LJIIIIZZ2;
        FeedItemList feedItemList;
        C65385PlN c65385PlN;
        FeedItemList feedItemList2;
        if (LJIIJ) {
            LJIIIIZZ2 = LJIIIIZZ("feed3.json");
        } else if (LJIIIIZZ) {
            LJIIIIZZ2 = LJIIIIZZ("feed2.json");
        } else {
            LJIIIIZZ2 = LJIIIIZZ("feed.json");
        }
        FeedItemList feedItemList3 = null;
        FeedItemList feedItemList4 = null;
        C65385PlN c65385PlN2 = null;
        C65385PlN c65385PlN3 = null;
        if (LJIIIIZZ2 != null) {
            try {
                c65385PlN = new C65385PlN(new FileReader(LJIIIIZZ2));
                try {
                    try {
                        feedItemList2 = (FeedItemList) GsonHolder.LIZLLL().LIZ().LJIIIIZZ(c65385PlN, FeedItemList.class);
                    } catch (Exception unused) {
                    }
                } catch (Throwable th) {
                    th = th;
                    c65385PlN3 = c65385PlN;
                    LJIL(-3, 0, 0);
                    C37247Ejb.LIZ.getClass();
                    C36871EdX.LIZ(c65385PlN3);
                    throw th;
                }
            } catch (Exception unused2) {
                feedItemList = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (feedItemList2 != null) {
                try {
                } catch (Exception unused3) {
                    feedItemList4 = feedItemList2;
                    feedItemList = feedItemList4;
                    c65385PlN2 = c65385PlN;
                    LJIL(-3, 0, 0);
                    C37247Ejb.LIZ.getClass();
                    C36871EdX.LIZ(c65385PlN2);
                    feedItemList3 = feedItemList;
                    C16880lQ.LLLZZIL(LJIIIIZZ2);
                    return feedItemList3;
                }
                if (feedItemList2.getItems() != null && feedItemList2.getItems().size() > 0) {
                    LJIL(-3, 0, Integer.valueOf(feedItemList2.getItems().size()));
                    C37247Ejb.LIZ.getClass();
                    C36871EdX.LIZ(c65385PlN);
                    feedItemList3 = feedItemList2;
                    C16880lQ.LLLZZIL(LJIIIIZZ2);
                }
            }
            LJIL(-3, 0, 0);
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(c65385PlN);
            return null;
        }
        return feedItemList3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r4.getItems().size() > 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        LJIL(-2, 0, java.lang.Integer.valueOf(r4.getItems().size()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
    
        if (r4.getItems().size() > 0) goto L54;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.FeedItemList LJI() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48236IwS.LJI():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    public static int LJII() {
        Long valueOf;
        String LJ2;
        int intValue = ((Number) LJIILIIL.getValue()).intValue() * 3600000;
        if (LJIIJ) {
            valueOf = Long.valueOf(IOK.LIZJ());
            LJ2 = IOK.LJI();
        } else if (LJIIIIZZ) {
            valueOf = Long.valueOf(IOK.LIZIZ());
            LJ2 = IOK.LJFF();
        } else {
            valueOf = Long.valueOf(IOK.LIZ());
            LJ2 = IOK.LJ();
        }
        if (intValue <= 0) {
            return 4;
        }
        if (TextUtils.isEmpty(LJ2)) {
            return 2;
        }
        if (System.currentTimeMillis() - valueOf.longValue() >= intValue) {
            return 3;
        }
        return 1;
    }

    public static void LJIIJJI() {
        Boolean bool;
        if (LIZ != null && C35971E9v.LIZ()) {
            C48237IwT predicate = C48237IwT.LJLIL;
            o.LJIIIZ(predicate, "predicate");
            if (((Boolean) predicate.invoke()).booleanValue() ^ C90383gg.LIZ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("clear cache>>> data=");
                FeedItemList feedItemList = LIZ;
                if (feedItemList != null) {
                    bool = Boolean.valueOf(feedItemList.isNonPersonalized);
                } else {
                    bool = null;
                }
                LIZ2.append(bool);
                LIZ2.append(", setting=");
                LIZ2.append(C90383gg.LIZ());
                C60392Yp.LIZ("FeedNonPersonalized", X1D.LIZIZ(LIZ2), 12);
                LIZ = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (r10 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        if (r11 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0106 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILIIL() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48236IwS.LJIILIIL():boolean");
    }

    public static void LJIIZILJ() {
        synchronized (LJIIJJI) {
            C56662Kg.LIZ().LIZJ("feed_get_cache_duration", false);
            LJIJ();
            if (LIZ == null) {
                LJIJI();
            }
            LJIIJJI();
            C56662Kg.LIZ().LJFF("feed_get_cache_duration", false);
            C56662Kg.LIZ().LIZJ("feed_get_cache_to_use_cache", false);
            C56662Kg.LIZ().LIZJ("feed_get_cache_to_render", false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x021a, code lost:
    
        if (r0.isEmpty() == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:49:0x00b8, B:51:0x00be), top: B:48:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI() {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48236IwS.LJIJI():void");
    }

    public static FeedItemList LJJ() {
        FeedItemList feedItemList;
        List<Aweme> items;
        synchronized (LJIIJJI) {
            feedItemList = LIZ;
        }
        if (feedItemList != null) {
            LJIILL = true;
            LJIILLIIL = true;
        }
        LIZ = null;
        if (feedItemList != null && (items = feedItemList.getItems()) != null && !items.isEmpty()) {
            try {
                String secUid = AV1.LIZIZ().getSecUid();
                if (secUid == null) {
                    secUid = "";
                }
                String string = IOK.LIZLLL().getString("feed_video_cache_current_uid", "");
                if (string == null) {
                    string = "";
                }
                if (!o.LJ(string, secUid)) {
                    List<Aweme> items2 = feedItemList.getItems();
                    if (items2 != null) {
                        items2.clear();
                    }
                    LJFF = "";
                }
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("filter error:");
                LIZ2.append(e.getMessage());
                C36922EeM.LIZLLL(6, "filterCacheByUid", X1D.LIZIZ(LIZ2));
            }
        }
        return feedItemList;
    }

    public static void LJJI() {
        if (LJIIIZ) {
            IOK.LIZLLL().storeLong("feed_video_cache_time_v3", System.currentTimeMillis());
            IOK.LJIIIZ("");
        } else if (LJII) {
            IOK.LIZLLL().storeLong("feed_video_cache_time2", System.currentTimeMillis());
            IOK.LJIIIIZZ("");
        } else {
            IOK.LIZLLL().storeLong("feed_video_cache_time", System.currentTimeMillis());
            IOK.LJII("");
        }
        IOK.LIZLLL().storeString("feed_cache_source", "def");
    }

    public static String LJIIIZ() {
        return C16880lQ.LLIIIL(EF7.LIZIZ()).getAbsolutePath();
    }

    public static boolean LJIIJ() {
        String str;
        if (FAJ.LJI()) {
            return true;
        }
        if (IOK.LJ().length() != 0 && (LJIIIIZZ("feed.pb") != null || LJIIIIZZ("feed.json") != null)) {
            String LIZ2 = IVT.LIZ(IOK.LJ());
            if (LIZ2 == null || (str = (String) ListProtector.get(s.LJLJJL(LIZ2, new String[]{","}, 0, 6), 0)) == null) {
                str = "";
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILJJIL() {
        if (!LIZLLL()) {
            return false;
        }
        String LJ2 = IOK.LJ();
        String LJFF2 = IOK.LJFF();
        boolean LJIILL2 = LJIILL(LJ2);
        boolean LJIILL3 = LJIILL(LJFF2);
        if (!LJIILL2) {
            IOK.LJII("");
        }
        if (!LJIILL3) {
            IOK.LJIIIIZZ("");
        }
        boolean LJIILL4 = LJIILL(IOK.LJI());
        if (!LJIILL4) {
            IOK.LJIIIZ("");
        }
        if (!LJIILL2 && !LJIILL3 && !LJIILL4) {
            return false;
        }
        return true;
    }

    public static void LJIJ() {
        String LJ2;
        FeedItemList LJI2;
        boolean z;
        int i;
        Integer num = null;
        if (!LJIILIIL()) {
            if (LJIIJ) {
                LJ2 = IOK.LJI();
                C56662Kg.LIZ().LIZLLL(TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - IOK.LIZJ()), "feed_back_cache_used_duration");
            } else if (LJIIIIZZ) {
                LJ2 = IOK.LJFF();
                C56662Kg.LIZ().LIZLLL(TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - IOK.LIZIZ()), "feed_back_cache_used_duration");
            } else {
                LJ2 = IOK.LJ();
                C56662Kg.LIZ().LIZLLL(TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - IOK.LIZ()), "feed_origin_cache_used_duration");
            }
            LJFF = LJ2;
            LIZLLL = true;
            LJ.countDown();
            FFX.LIZ(2, "data_cache_is_expired");
            if (TextUtils.isEmpty(LJ2)) {
                FFX.LIZ(2, "data_cache_is_exist");
                return;
            }
            if (!LJIILL(LJ2)) {
                if (LIZLLL()) {
                    i = 7;
                } else {
                    i = 6;
                }
                C10K.LIZJ(new ACallableS24S0001000_6(i, 6));
                LJFF = "";
                FFX.LIZ(2, "data_cache_is_exist");
                return;
            }
            FFX.LIZ(1, "data_cache_is_exist");
            if (C00F.LIZ(31744, 0, "feed_cache_type_exp", true) == 1) {
                LJI2 = LJFF();
                if (LJI2 == null) {
                    LJI2 = LJI();
                }
            } else {
                LJI2 = LJI();
                if (LJI2 == null) {
                    LJI2 = LJFF();
                }
            }
            if (LJIIJ) {
                IOK.LJIIIZ("");
            } else if (LJIIIIZZ) {
                IOK.LJIIIIZZ("");
            } else {
                IOK.LJII("");
            }
            if (LJI2 != null) {
                List<Aweme> items = LJI2.getItems();
                if (items != null) {
                    ArrayList arrayList = new ArrayList(C32I.LJJL(items, 10));
                    Iterator<Aweme> it = items.iterator();
                    while (it.hasNext()) {
                        it.next().setItemSourceCategory(1);
                        arrayList.add(C76800UCe.LIZ);
                    }
                }
                FFX.LIZ(1, "data_cache_is_exist");
                FFX.LIZ(1, "data_cache_is_valid");
                if (!TextUtils.isEmpty(LJFF)) {
                    ArrayList arrayList2 = new ArrayList();
                    List<Aweme> items2 = LJI2.getItems();
                    o.LJIIIIZZ(items2, "itemList.items");
                    ArrayList arrayList3 = new ArrayList(C32I.LJJL(items2, 10));
                    for (Aweme aweme : items2) {
                        Video video = aweme.getVideo();
                        if (video != null && !TextUtils.isEmpty(video.getVideoModelStr())) {
                            video.setVideoModelStr(null);
                        }
                        String str = LJFF;
                        String aid = aweme.getAid();
                        o.LJIIIIZZ(aid, "it.aid");
                        boolean LJJJLZIJ = s.LJJJLZIJ(str, aid, false);
                        if (((Boolean) C34337Ddl.LIZ.getValue()).booleanValue()) {
                            if (aweme.isAd() || aweme.isLive() || C54838Lfe.LJJI(aweme)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (LJJJLZIJ && !z) {
                                arrayList2.add(aweme);
                            }
                        } else if (LJJJLZIJ) {
                            arrayList2.add(aweme);
                        }
                        arrayList3.add(C76800UCe.LIZ);
                    }
                    LJI2.items = arrayList2;
                }
                LJIL(1, 0, Integer.valueOf(LJI2.getItems().size()));
                LIZ = LJI2;
                LJIJI = LJI2;
                FeedItemList feedItemList = LIZ;
                if (feedItemList != null && feedItemList.getItems() != null && !TextUtils.isEmpty(feedItemList.getRequestId())) {
                    try {
                        C3A5.LIZ.LJFF(feedItemList.getRequestId(), feedItemList.logPb);
                    } catch (Throwable unused) {
                        C36922EeM.LIZLLL(2, "CacheDataProcessor", "putAwemeLogPbData error");
                    }
                }
                C46368IHs.LIZ(LIZ);
                return;
            }
            C10K.LIZJ(new ACallableS24S0001000_6(5, 6));
            return;
        }
        FFX.LIZ(1, "data_cache_is_expired");
        EF7.LIZIZ();
        String LJIIIZ2 = LJIIIZ();
        if (LJIIIZ2 == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIIIZ2);
        File file = new File(JBR.LJFF(LIZ2, File.separator, "feedCache", LIZ2));
        if (file.exists()) {
            FFX.LIZ(1, "data_cache_is_exist");
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                num = Integer.valueOf(listFiles.length);
            }
            OR7.LLLIIL(file);
        } else {
            FFX.LIZ(2, "data_cache_is_exist");
        }
        LJIL(1, LJII(), num);
    }

    public static boolean LJIJJ() {
        if (FAJ.LJI()) {
            return true;
        }
        if (LJIILJJIL() && !LJIILIIL()) {
            return true;
        }
        return false;
    }

    public static void LJ(int i) {
        File[] listFiles;
        EF7.LIZIZ();
        String LJIIIZ2 = LJIIIZ();
        if (LJIIIZ2 == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIIIZ2);
        File file = new File(JBR.LJFF(LIZ2, File.separator, "feedCache", LIZ2));
        int i2 = 0;
        if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            ArrayList arrayList = new ArrayList(listFiles.length);
            int length = listFiles.length;
            int i3 = 0;
            while (i2 < length) {
                File file2 = listFiles[i2];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && ("feed3.pb".equals(file2.getName()) || "feed3.json".equals(file2.getName()))) {
                            C16880lQ.LLLZZIL(file2);
                            i3++;
                        }
                    } else if ("feed2.pb".equals(file2.getName()) || "feed2.json".equals(file2.getName())) {
                        C16880lQ.LLLZZIL(file2);
                        i3++;
                    }
                } else if ("feed.pb".equals(file2.getName()) || "feed.json".equals(file2.getName())) {
                    C16880lQ.LLLZZIL(file2);
                    i3++;
                }
                arrayList.add(C76800UCe.LIZ);
                i2++;
            }
            i2 = i3;
        }
        LJIL(1, LJII(), Integer.valueOf(i2));
    }

    public static File LJIIIIZZ(String str) {
        EF7.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIIIZ());
        String str2 = File.separator;
        YE1.LIZLLL(LIZ2, str2, "feedCache", str2, str);
        File file = new File(X1D.LIZIZ(LIZ2));
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    public static boolean LJIIL(String str) {
        String str2 = LJFF;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && s.LJJJLZIJ(str2, str, false)) {
            return true;
        }
        return false;
    }

    public static boolean LJIILL(String str) {
        boolean z;
        String LIZ2;
        if (str.length() == 0) {
            return false;
        }
        List<String> LJLJJI = s.LJLJJI(str, new char[]{','}, false, 6);
        if (!LJLJJI.isEmpty()) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJI, 10));
            for (String groupId : LJLJJI) {
                String LIZ3 = IVT.LIZ(groupId);
                if (!TextUtils.isEmpty(LIZ3) && C1B6.LIZIZ(LIZ3)) {
                    z = true;
                } else {
                    z = false;
                }
                boolean LIZ4 = C46616IRg.LIZ(groupId);
                if (!z) {
                    if (!LIZ4) {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("cache video file not exist background:");
                        LIZ5.append(z);
                        LIZ5.append(" foreground:");
                        LIZ5.append(LIZ4);
                        X1D.LIZIZ(LIZ5);
                        return false;
                    }
                } else if (!LIZ4) {
                    arrayList.add(C76800UCe.LIZ);
                }
                o.LJIIIZ(groupId, "groupId");
                String string = IOK.LIZLLL().getString("feed_video_file_key", "");
                if (string != null && string.length() != 0) {
                    List LJLJJL = s.LJLJJL(string, new String[]{":"}, 0, 6);
                    if (LJLJJL.size() == 2 && o.LJ(ListProtector.get(LJLJJL, 0), groupId) && (LIZ2 = IVT.LIZ(groupId)) != null) {
                        try {
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append(LIZ2);
                            LIZ6.append(".mdl");
                            File file = new File(X1D.LIZIZ(LIZ6));
                            StringBuilder LIZ7 = X1D.LIZ();
                            LIZ7.append((String) ListProtector.get(LJLJJL, 1));
                            LIZ7.append(".mdl");
                            OR7.LLLIIIL(file, new File(X1D.LIZIZ(LIZ7)), false, 4);
                        } catch (Exception unused) {
                        }
                        try {
                            OR7.LLLIIIL(new File(LIZ2.concat(".mdlnodeconf")), new File(((String) ListProtector.get(LJLJJL, 1)) + ".mdlnodeconf"), false, 4);
                        } catch (Exception unused2) {
                        }
                    }
                }
                arrayList.add(C76800UCe.LIZ);
            }
            return true;
        }
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("cache video file not exist aar:");
        LIZ8.append(LJLJJI);
        X1D.LIZIZ(LIZ8);
        return false;
    }

    public static boolean LJIILLIIL(String str) {
        String str2;
        Boolean valueOf;
        if (str == null || LJFF == null || (str2 = LJFF) == null || (valueOf = Boolean.valueOf(s.LJJJLZIJ(str2, str, false))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    public static void LJIJJLI(boolean z) {
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        String str3;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("call startCache from ");
        if (z) {
            str = "background";
        } else {
            str = "foreground";
        }
        LIZ2.append(str);
        LIZ2.append(" isCaching:");
        LIZ2.append(LJI);
        X1D.LIZIZ(LIZ2);
        if (C36152EGu.LIZLLL(1L) && ((Boolean) DR6.LIZIZ.getValue()).booleanValue() && LJIILL(IOK.LJ())) {
            return;
        }
        int intValue = ((Number) LJIILIIL.getValue()).intValue() * 3600000;
        long LIZ3 = IOK.LIZ();
        String LJ2 = IOK.LJ();
        long LIZIZ2 = IOK.LIZIZ();
        String LJFF2 = IOK.LJFF();
        long currentTimeMillis = System.currentTimeMillis() - LIZ3;
        long j = intValue;
        if (currentTimeMillis >= j || TextUtils.isEmpty(LJ2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (System.currentTimeMillis() - LIZIZ2 >= j || TextUtils.isEmpty(LJFF2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            IOK.LJII("");
        }
        if (z3) {
            IOK.LJIIIIZZ("");
        }
        long LIZJ2 = IOK.LIZJ();
        String LJI2 = IOK.LJI();
        if (System.currentTimeMillis() - LIZJ2 >= j || TextUtils.isEmpty(LJI2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 || z3 || z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean LJIILJJIL2 = LJIILJJIL();
        if (!z5 && LJIILJJIL2) {
            long LIZ4 = IOK.LIZ();
            long LIZIZ3 = IOK.LIZIZ();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!TextUtils.isEmpty(IOK.LJ())) {
                FAM LIZ5 = C56662Kg.LIZ();
                if (z) {
                    str3 = "feed_back_background_origin_cached_duration";
                } else {
                    str3 = "feed_back_foreground_origin_cached_duration";
                }
                LIZ5.LIZLLL(TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis2 - LIZ4), str3);
            }
            if (!TextUtils.isEmpty(IOK.LJFF())) {
                FAM LIZ6 = C56662Kg.LIZ();
                if (z) {
                    str2 = "feed_back_background_back_cached_duration";
                } else {
                    str2 = "feed_back_foreground_back_cached_duration";
                }
                LIZ6.LIZLLL(TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis2 - LIZIZ3), str2);
            }
        }
        if (!LJI) {
            if ((!z5 && LJIILJJIL2) || C46616IRg.LIZ != null) {
                return;
            }
            LJI = true;
            LJIIL = z;
            C38995FSd.LIZLLL().execute(RunnableC48239IwV.LJLIL);
        }
    }

    public static void LJJIFFI(FeedItemList feedItemList) {
        String string;
        if (LJIIJ) {
            string = IOK.LIZLLL().getString("feed_cache_request_id3", "");
            o.LJIIIIZZ(string, "keva.getString(KEY_REQUEST_ID_V3, \"\")");
            IOK.LIZLLL().storeString("feed_cache_request_id3", "");
        } else if (LJIIIIZZ) {
            string = IOK.LIZLLL().getString("feed_cache_request_id2", "");
            o.LJIIIIZZ(string, "keva.getString(KEY_REQUEST_ID_BACK, \"\")");
            IOK.LIZLLL().storeString("feed_cache_request_id2", "");
        } else {
            string = IOK.LIZLLL().getString("feed_cache_request_id", "");
            o.LJIIIIZZ(string, "keva.getString(KEY_REQUEST_ID, \"\")");
            IOK.LIZLLL().storeString("feed_cache_request_id", "");
        }
        if (!TextUtils.isEmpty(string)) {
            feedItemList.setRequestId(string);
        }
    }

    public static boolean LIZIZ(FeedItemList feedItemList, String str) {
        File file;
        FileOutputStream fileOutputStream;
        if (LJIIIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            file = new File(JBR.LJFF(LIZ2, File.separator, "feed3.json", LIZ2));
        } else if (LJII) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            file = new File(JBR.LJFF(LIZ3, File.separator, "feed2.json", LIZ3));
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str);
            file = new File(JBR.LJFF(LIZ4, File.separator, "feed.json", LIZ4));
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception unused) {
                return false;
            }
        }
        String value = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), feedItemList);
        if (TextUtils.isEmpty(value)) {
            return true;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Exception unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            o.LJIIIIZZ(value, "value");
            byte[] bytes = value.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            LJJI();
            IOK.LIZLLL().storeString("feed_video_cache_current_uid", AV1.LIZIZ().getSecUid());
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(fileOutputStream);
            return true;
        } catch (Exception unused3) {
            fileOutputStream2 = fileOutputStream;
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(fileOutputStream2);
            throw th;
        }
    }

    public static boolean LIZJ(FeedItemList feedItemList, String str) {
        File file;
        FileOutputStream fileOutputStream;
        if (feedItemList.pbData != null) {
            if (LJIIIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                file = new File(JBR.LJFF(LIZ2, File.separator, "feed3.pb", LIZ2));
            } else if (LJII) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str);
                file = new File(JBR.LJFF(LIZ3, File.separator, "feed2.pb", LIZ3));
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(str);
                file = new File(JBR.LJFF(LIZ4, File.separator, "feed.pb", LIZ4));
            }
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception unused) {
                }
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable unused2) {
                fileOutputStream = null;
            }
            try {
                feedItemList.pbData.encode(fileOutputStream);
                LJJI();
                String requestId = feedItemList.getRequestId();
                if (requestId != null && !TextUtils.isEmpty(requestId)) {
                    if (LJIIIZ) {
                        IOK.LIZLLL().storeString("feed_cache_request_id3", requestId);
                    } else if (LJII) {
                        IOK.LIZLLL().storeString("feed_cache_request_id2", requestId);
                    } else {
                        IOK.LIZLLL().storeString("feed_cache_request_id", requestId);
                    }
                }
                IOK.LIZLLL().storeString("feed_video_cache_current_uid", AV1.LIZIZ().getSecUid());
                return true;
            } catch (Throwable unused3) {
                try {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("pb_cache_error", "encode");
                    FMX.LJIIL("pb_cache_error", c188727au.LIZ);
                    return false;
                } finally {
                    C37247Ejb.LIZ.getClass();
                    C36871EdX.LIZ(fileOutputStream);
                }
            }
        }
        return false;
    }

    public static void LJIL(int i, int i2, Integer num) {
        C10K.LIZJ(new ACallableS11S0102000_6(i, i2, num, 1));
    }
}
