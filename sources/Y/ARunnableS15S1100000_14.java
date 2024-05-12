package Y;

import X.C16880lQ;
import X.C171196nj;
import X.C221018lt;
import X.C61259O2l;
import X.C77117UOj;
import X.C77123UOp;
import X.C78605Ut7;
import X.C79411VEp;
import X.C79578VLa;
import X.C79614VMk;
import X.C81262Vus;
import X.C81263Vut;
import X.C81264Vuu;
import X.C82197WNt;
import X.C87698YbO;
import X.HRE;
import X.I3X;
import X.InterfaceC79400VEe;
import X.InterfaceC82199WNv;
import X.J0G;
import X.J0Y;
import X.O3D;
import X.VA1;
import X.VEZ;
import X.VMI;
import X.VML;
import X.VOE;
import X.VOL;
import X.VOR;
import X.VU3;
import X.Y5K;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import ccb.t;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.component.svg.UISvg;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.gamora.editorpro.anchor.EditorProAnchorActivity;
import com.ss.android.ugc.gamora.recorder.voicechange.sticker.SVCStickerHandler;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS81S1100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class ARunnableS15S1100000_14 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    public final void LIZ$2() {
        JSONObject LJJJLL = C77123UOp.LJJJLL(this.s0);
        JSONObject LJJJLL2 = C77123UOp.LJJJLL(C77123UOp.LJJJJLI("performance", LJJJLL));
        JSONObject LJJJLL3 = C77123UOp.LJJJLL(C77123UOp.LJJJJLI("resource", LJJJLL));
        ((WebViewMonitorJsBridge) this.l1).mainHandler.post(new ARunnableS5S1400000_14(this, C77123UOp.LJJJJLI("url", LJJJLL), LJJJLL2, LJJJLL3, C77123UOp.LJJJLL(C77123UOp.LJJJJLI("cacheData", LJJJLL)), 0));
    }

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
        try {
            JSONObject LJJJLL = C77123UOp.LJJJLL(this.s0);
            VMI.LJ.LJIJI(((WebViewMonitorJsBridge) this.l1).webViewDataManager.LIZLLL(), C77123UOp.LJJJJLI("type", LJJJLL), C77123UOp.LJJJJJ("category", LJJJLL), C77123UOp.LJJJJJ("metrics", LJJJLL));
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    public final void LIZ$1() {
        long j;
        VML navigationManager = ((WebViewMonitorJsBridge) this.l1).getNavigationManager();
        if (navigationManager != null) {
            String str = this.s0;
            C79578VLa LIZIZ = navigationManager.LIZIZ();
            if (LIZIZ.LIZ.LJLLL != 0) {
                LIZIZ.LJIIL = true;
                try {
                    j = CastLongProtector.parseLong(str);
                } catch (NumberFormatException e) {
                    C77117UOj.LJIIZILJ(e);
                    j = 0;
                }
                long j2 = j - LIZIZ.LIZ.LJLLL;
                LIZIZ.LJIIJ = j2;
                if (j2 < 0) {
                    LIZIZ.LJIIJ = 0L;
                }
            }
            navigationManager.LJIIIIZZ();
        }
    }

    public final void LIZ$3() {
        LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) ((ARunnableS15S1100000_14) this.l1).l1;
        String directUrl = this.s0;
        o.LJFF(directUrl, "directUrl");
        lynxAlphaVideo.LJLL = directUrl;
        LynxAlphaVideo lynxAlphaVideo2 = (LynxAlphaVideo) ((ARunnableS15S1100000_14) this.l1).l1;
        J0G<C61259O2l> j0g = lynxAlphaVideo2.LJLJLJ;
        if (j0g != null) {
            lynxAlphaVideo2.getClass();
            String directUrl2 = this.s0;
            o.LJFF(directUrl2, "directUrl");
            String directUrl3 = this.s0;
            o.LJFF(directUrl3, "directUrl");
            O3D o3d = new O3D((LynxAlphaVideo) ((ARunnableS15S1100000_14) this.l1).l1, directUrl3);
            String directUrl4 = this.s0;
            o.LJFF(directUrl4, "directUrl");
            j0g.LIZ(directUrl2, o3d, new J0Y((LynxAlphaVideo) ((ARunnableS15S1100000_14) this.l1).l1, directUrl4));
            return;
        }
        lynxAlphaVideo2.LJJIFFI(this.s0);
    }

    public final void LIZ$4() {
        if (((VOE) this.l1).LJIILL.get(this.s0) == null) {
            return;
        }
        if (((VOE) this.l1).LJIILL.get(this.s0).get() != null) {
            ((VOE) this.l1).LJIILL.remove(this.s0);
        }
        if (((VOE) this.l1).LJIILL.isEmpty()) {
            ((VOE) this.l1).LJIIJJI();
        }
    }

    public final void LIZ$5() {
        SVCStickerHandler sVCStickerHandler = (SVCStickerHandler) this.l1;
        if (!((I3X) sVCStickerHandler.LJLJLLL.LIZ(sVCStickerHandler, SVCStickerHandler.LJLLILLLL[2])).isRecording().LIZ().booleanValue()) {
            if (C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
                SVCStickerHandler sVCStickerHandler2 = (SVCStickerHandler) this.l1;
                sVCStickerHandler2.LJLJJI = true;
                InterfaceC82199WNv interfaceC82199WNv = (InterfaceC82199WNv) sVCStickerHandler2.LJLL.getValue();
                if (interfaceC82199WNv != null) {
                    interfaceC82199WNv.sf(this.s0);
                    return;
                }
                return;
            }
            SVCStickerHandler sVCStickerHandler3 = (SVCStickerHandler) this.l1;
            HRE.LIZ(sVCStickerHandler3.LJLJI, new C82197WNt(), new AqS81S1100000_14(sVCStickerHandler3, this.s0, 0), C171196nj.LIZJ);
            return;
        }
        C221018lt.LIZ("SVCStickerHandler", "recording! msg is lost");
    }

    public final void LIZ$7() {
        C81264Vuu c81264Vuu = new C81264Vuu((Y5K) this.l1);
        int i = ((Y5K) this.l1).LJLLJ;
        C81263Vut c81263Vut = c81264Vuu.LIZ;
        c81263Vut.LJLLI = i;
        c81263Vut.LJLJJL = 1600L;
        String str = this.s0;
        c81263Vut.LJLILLLLZI = str;
        Context context = c81264Vuu.LIZIZ;
        View view = c81264Vuu.LIZJ;
        if (context != null && view != null && str != null && str.length() > 0) {
            C81262Vus c81262Vus = new C81262Vus(context, view, c81264Vuu.LIZ);
            try {
                c81262Vus.LJ.LJLIL = Long.valueOf(System.currentTimeMillis() + c81262Vus.LJ.LJLJJL);
                View view2 = c81262Vus.LIZ;
                if (view2 != null) {
                    view2.measure(0, 0);
                    C16880lQ.LLLIIII(c81262Vus, c81262Vus.LIZLLL);
                    c81262Vus.LIZ(true);
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS50S0100000_14(c81262Vus, 207), c81262Vus.LJ.LJLJJL);
                    return;
                }
                o.LJIJI("root");
                throw null;
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZ$8() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("component_name", this.s0);
            if (((VOR) this.l1).LIZJ.LJI() != null && ((VOR) this.l1).LIZJ.LJI().getLynxGenericInfo() != null) {
                JSONObject LIZ = ((VOR) this.l1).LIZJ.LJI().getLynxGenericInfo().LIZ();
                InterfaceC79400VEe interfaceC79400VEe = (InterfaceC79400VEe) VEZ.LIZIZ().LIZ(InterfaceC79400VEe.class);
                if (interfaceC79400VEe != null) {
                    interfaceC79400VEe.onReportEvent("lynxsdk_component_statistic", jSONObject, LIZ);
                    return;
                } else {
                    LLog.LIZLLL(4, "LynxUIOwner", "LynxApplogService is null");
                    throw new Exception();
                }
            }
            LLog.LIZLLL(4, "LynxUIOwner", "LynxView or LynxGenericInfo is null");
            throw new Exception();
        } catch (Exception e) {
            LLog.LIZLLL(3, "LynxUIOwner", "component statistic report failed");
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZ$9() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag_name", this.s0);
            if (((VOL) this.l1).LIZJ.LJI() != null && ((VOL) this.l1).LIZJ.LJI().getLynxGenericInfo() != null) {
                JSONObject LIZ = ((VOL) this.l1).LIZJ.LJI().getLynxGenericInfo().LIZ();
                InterfaceC79400VEe interfaceC79400VEe = (InterfaceC79400VEe) VEZ.LIZIZ().LIZ(InterfaceC79400VEe.class);
                if (interfaceC79400VEe != null) {
                    interfaceC79400VEe.onReportEvent("lynxsdk_shadownode_statistic", jSONObject, LIZ);
                    return;
                } else {
                    LLog.LIZLLL(4, "ShadowNodeOwner", "LynxApplogService is null");
                    throw new Exception();
                }
            }
            LLog.LIZLLL(4, "ShadowNodeOwner", "LynxView or LynxGenericInfo is null");
            throw new Exception();
        } catch (Exception e) {
            LLog.LIZLLL(3, "ShadowNodeOwner", "shadownode statistic report failed");
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZ$6() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        ((DnsOptimizer) this.l1).LJIIJ = new Handler(Looper.myLooper());
        DnsOptimizer dnsOptimizer = (DnsOptimizer) this.l1;
        dnsOptimizer.LJIIJ.postDelayed(new ARunnableS50S0100000_14(this, 135), dnsOptimizer.LJJIL);
        Looper.loop();
    }

    public static final void run$0(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            ((t) aRunnableS15S1100000_14.l1).LLZLLIL(aRunnableS15S1100000_14.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            ((t) aRunnableS15S1100000_14.l1).LLZLLIL(aRunnableS15S1100000_14.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            if (((EditorProAnchorActivity) aRunnableS15S1100000_14.l1).isActive()) {
                ((EditorProAnchorActivity) aRunnableS15S1100000_14.l1).LLIIIJ(aRunnableS15S1100000_14.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            aRunnableS15S1100000_14.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            DnsOptimizer dnsOptimizer = (DnsOptimizer) aRunnableS15S1100000_14.l1;
            dnsOptimizer.LJIIJ(dnsOptimizer.LIZ, aRunnableS15S1100000_14.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            aRunnableS15S1100000_14.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            ((DnsOptimizer) aRunnableS15S1100000_14.l1).nativeStartIPRace(aRunnableS15S1100000_14.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            aRunnableS15S1100000_14.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            aRunnableS15S1100000_14.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            aRunnableS15S1100000_14.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            AtomicInteger atomicInteger = ((C79614VMk) aRunnableS15S1100000_14.l1).LIZ.LIZ;
            String it = aRunnableS15S1100000_14.s0;
            o.LJFF(it, "it");
            atomicInteger.set(CastIntegerProtector.parseInt(it));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            aRunnableS15S1100000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            try {
                JSONArray jSONArray = new JSONArray(aRunnableS15S1100000_14.s0);
                for (int i = 0; i < jSONArray.length(); i++) {
                    ((WebViewMonitorJsBridge) aRunnableS15S1100000_14.l1).webViewDataManager.LJFF(JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            aRunnableS15S1100000_14.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            aRunnableS15S1100000_14.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            aRunnableS15S1100000_14.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        String str;
        try {
            LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) aRunnableS15S1100000_14.l1;
            lynxAlphaVideo.LJLJI = null;
            lynxAlphaVideo.LJLL = "";
            if (lynxAlphaVideo.LJLJL) {
                str = VA1.LIZ(lynxAlphaVideo.mContext, aRunnableS15S1100000_14.s0, false);
            } else {
                str = aRunnableS15S1100000_14.s0;
            }
            C79411VEp.LIZJ(new ARunnableS15S1100000_14(aRunnableS15S1100000_14, URLDecoder.decode(str, "UTF-8"), 6));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            try {
                C87698YbO LIZJ = C87698YbO.LIZJ(aRunnableS15S1100000_14.s0);
                UISvg uISvg = (UISvg) aRunnableS15S1100000_14.l1;
                uISvg.getClass();
                C79411VEp.LIZJ(new ARunnableS33S0200000_14(uISvg, LIZJ, 82));
            } catch (VU3 e) {
                LLog.LIZLLL(4, "lynx_UISvg", e.toString());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS15S1100000_14 aRunnableS15S1100000_14) {
        boolean LIZ;
        try {
            aRunnableS15S1100000_14.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS15S1100000_14(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
