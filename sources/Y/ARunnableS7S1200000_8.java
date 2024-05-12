package Y;

import X.C141335gf;
import X.C38350F3i;
import X.C3C5;
import X.C47560IlY;
import X.C47570Ili;
import X.C48658J7u;
import X.C49615Jdb;
import X.C50948Jz6;
import X.C51282KAs;
import X.C78253UnR;
import X.C78685UuP;
import X.C78926UyI;
import X.C78983UzD;
import X.EnumC47567Ilf;
import X.EnumC51281KAr;
import X.IPG;
import X.IPH;
import X.ITG;
import X.ITW;
import X.IUH;
import X.JPM;
import X.KB1;
import X.VNL;
import X.VNU;
import X.WM7;
import X.X1D;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportService;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ARunnableS7S1200000_8 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        VNU vnu;
        VNL vnl;
        LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) this.l1;
        String str = this.s0;
        Map map = (Map) this.l2;
        Set<String> set = lynxAlphaVideo.LJLILLLLZI;
        if (set == null || !set.contains(str) || (vnu = lynxAlphaVideo.mContext) == null || (vnl = vnu.LJLJJL) == null) {
            return;
        }
        C49615Jdb c49615Jdb = new C49615Jdb(lynxAlphaVideo.getSign(), str);
        for (Map.Entry entry : map.entrySet()) {
            c49615Jdb.LIZJ(entry.getValue(), (String) entry.getKey());
        }
        vnl.LIZIZ(c49615Jdb);
    }

    public final void LIZ$1() {
        String str;
        String str2;
        String str3;
        Object LIZ;
        int value;
        try {
            JSONObject jSONObject = new JSONObject();
            SearchResultParam searchResultParam = (SearchResultParam) this.l1;
            Uri uri = (Uri) this.l2;
            String str4 = this.s0;
            Integer num = null;
            if (searchResultParam != null) {
                C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
                if (searchEnterParam != null) {
                    str2 = searchEnterParam.getEnterSearchFrom();
                } else {
                    str2 = null;
                }
                C50948Jz6 searchEnterParam2 = searchResultParam.getSearchEnterParam();
                if (searchEnterParam2 != null) {
                    value = searchEnterParam2.getEcSearchEntranceValue();
                } else {
                    value = EnumC51281KAr.DEFAULT.getValue();
                }
                num = Integer.valueOf(value);
                if (!KB1.LJII(num.intValue())) {
                    return;
                }
                str3 = searchResultParam.getEnterMethod();
                str = searchResultParam.getKeyword();
            } else {
                str = "";
                if (uri == null) {
                    str2 = "";
                    str3 = "";
                } else {
                    str2 = C78926UyI.LJJJJI(uri, "enter_from");
                    String LJJJJI = C78926UyI.LJJJJI(uri, "root_enter_from_type");
                    if (LJJJJI != null) {
                        try {
                            LIZ = C38350F3i.LJJIL(LJJJJI);
                            C3C5.m7constructorimpl(LIZ);
                        } catch (Throwable th) {
                            LIZ = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(LIZ);
                        }
                        if (C3C5.m12isFailureimpl(LIZ)) {
                            LIZ = null;
                        }
                        num = (Integer) LIZ;
                    }
                    C51282KAs c51282KAs = EnumC51281KAr.Companion;
                    if (str2 != null) {
                        str = str2;
                    }
                    c51282KAs.getClass();
                    num = Integer.valueOf(C51282KAs.LIZ(num, str).getValue());
                    if (!KB1.LJII(num.intValue())) {
                        return;
                    }
                    str3 = C78926UyI.LJJJJI(uri, "enter_method");
                    str = C78926UyI.LJJJJI(uri, "keyword");
                }
            }
            if (C78685UuP.LJJJZ(str3) && str3 != null) {
                jSONObject.put("enter_method", str3);
            }
            if (C78685UuP.LJJJZ(str2) && str2 != null) {
                jSONObject.put("enter_from", str2);
            }
            if (str != null) {
                jSONObject.put("search_keyword", str);
            }
            if (num != null) {
                jSONObject.put("root_enter_from_type", num.intValue());
            }
            jSONObject.put(WM7.SCENE_SERVICE, str4);
            C48658J7u.LIZIZ("rd_ec_search_trace", jSONObject);
        } catch (Throwable unused) {
            C78983UzD.LJIILJJIL();
        }
    }

    public static final void run$0(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            ((JPM) aRunnableS7S1200000_8.l1).LJLLLL.LIZ(aRunnableS7S1200000_8.s0, (SearchSpot) aRunnableS7S1200000_8.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            aRunnableS7S1200000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            if (((OnUIPlayListener) aRunnableS7S1200000_8.l1) != null) {
                SystemClock.elapsedRealtime();
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onBuffering(false);
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onBuffering(aRunnableS7S1200000_8.s0, false, (IPH) aRunnableS7S1200000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS7S1200000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRetryOnError((IPG) aRunnableS7S1200000_8.l2);
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onRetryOnError(aRunnableS7S1200000_8.s0, (IPG) aRunnableS7S1200000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS7S1200000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onResumePlay(aRunnableS7S1200000_8.s0, (IPH) aRunnableS7S1200000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            if (((OnUIPlayListener) aRunnableS7S1200000_8.l1) != null) {
                SimRadar.traceGroup("SimBuffer").LIZ("d-buffer").LIZLLL();
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onDecoderBuffering(true);
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onDecoderBuffering(aRunnableS7S1200000_8.s0, true, (IPH) aRunnableS7S1200000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            if (((OnUIPlayListener) aRunnableS7S1200000_8.l1) != null) {
                SimRadar.traceGroup("SimBuffer").LIZ("d-buffer").LJ();
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onDecoderBuffering(false);
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onDecoderBuffering(aRunnableS7S1200000_8.s0, false, (IPH) aRunnableS7S1200000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        C47570Ili c47570Ili = (C47570Ili) aRunnableS7S1200000_8.l1;
        String str = aRunnableS7S1200000_8.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS7S1200000_8.l2;
        c47570Ili.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEvent event ");
        LIZ.append(str);
        C78253UnR.LJI("AppLogEngineUploader", X1D.LIZIZ(LIZ));
        C47570Ili.LIZIZ();
        if (C47570Ili.LIZIZ != null && C47570Ili.LIZJ != null) {
            try {
                jSONObject.put("session_id", (String) C47570Ili.LIZ(C47570Ili.LIZIZ, new Object[0]));
                jSONObject.put("auto_report", 1);
                AtomicInteger atomicInteger = C47570Ili.LJ;
                if (1 == atomicInteger.get()) {
                    C47570Ili.LIZ(C47570Ili.LIZJ, new Object[]{c47570Ili.LIZ, str, jSONObject});
                } else if (2 == atomicInteger.get()) {
                    C47570Ili.LIZ(C47570Ili.LIZJ, new Object[]{str, jSONObject});
                }
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("upload error ");
                LIZ2.append(e.toString());
                C78253UnR.LIZLLL("AppLogEngineUploader", X1D.LIZIZ(LIZ2));
            }
        }
        EnumC47567Ilf.LIZLLL(jSONObject);
        C47560IlY.LIZ.getClass();
    }

    public static final void run$16(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            aRunnableS7S1200000_8.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        SimDtReportService.m177reportVideoPlayTime$lambda8((SimDtReportService) aRunnableS7S1200000_8.l1, aRunnableS7S1200000_8.s0, (Callable) aRunnableS7S1200000_8.l2);
    }

    public static final void run$18(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        SimDtReportServiceV2.m189reportVideoPlayFirstFinish$lambda4((SimDtReportServiceV2) aRunnableS7S1200000_8.l1, aRunnableS7S1200000_8.s0, (Callable) aRunnableS7S1200000_8.l2);
    }

    public static final void run$2(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS7S1200000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayCompletedFirstTime(aRunnableS7S1200000_8.s0, (IPH) aRunnableS7S1200000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS7S1200000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayCompleted(aRunnableS7S1200000_8.s0);
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onPlayCompleted(aRunnableS7S1200000_8.s0, ((ITG) aRunnableS7S1200000_8.l2).LIZ.LJIILIIL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS7S1200000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onCompleteLoaded(aRunnableS7S1200000_8.s0, ((ITG) aRunnableS7S1200000_8.l2).LIZ.LJIIIZ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS7S1200000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlaying(aRunnableS7S1200000_8.s0, (IPH) aRunnableS7S1200000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            if (((OnUIPlayListener) aRunnableS7S1200000_8.l1) != null && !IUH.LIZ(((ITG) aRunnableS7S1200000_8.l2).LIZ.LJ)) {
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onPlayPrepare(aRunnableS7S1200000_8.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS7S1200000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onMaskInfoCallback(aRunnableS7S1200000_8.s0, (ITW) aRunnableS7S1200000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            if (((OnUIPlayListener) aRunnableS7S1200000_8.l1) != null && !IUH.LIZ(((ITG) aRunnableS7S1200000_8.l2).LIZ.LJ)) {
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onPlayPrepared(aRunnableS7S1200000_8.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS7S1200000_8 aRunnableS7S1200000_8) {
        boolean LIZ;
        try {
            if (((OnUIPlayListener) aRunnableS7S1200000_8.l1) != null) {
                SystemClock.elapsedRealtime();
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onBuffering(true);
                ((OnUIPlayListener) aRunnableS7S1200000_8.l1).onBuffering(aRunnableS7S1200000_8.s0, true, (IPH) aRunnableS7S1200000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S1200000_8(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.l2 = obj;
        this.s0 = str;
    }
}
