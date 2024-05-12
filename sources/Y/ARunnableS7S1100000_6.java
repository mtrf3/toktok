package Y;

import X.AnonymousClass172;
import X.C03090Af;
import X.C141335gf;
import X.C16880lQ;
import X.C221018lt;
import X.C2NW;
import X.C35692Dzc;
import X.C36093EEn;
import X.C37054EgU;
import X.C37057EgX;
import X.C37062Egc;
import X.C37499Enf;
import X.C37505Enl;
import X.C38065Ewn;
import X.C38066Ewo;
import X.C38097ExJ;
import X.C38115Exb;
import X.C38504F9g;
import X.C38509F9l;
import X.C38698FGs;
import X.C38699FGt;
import X.C38836FMa;
import X.C39048FUe;
import X.C39223FaN;
import X.C39902FlK;
import X.C3C5;
import X.C5S1;
import X.C60737Nsb;
import X.C60882aC;
import X.C63611Oxr;
import X.C76800UCe;
import X.C79600VLw;
import X.C79604VMa;
import X.C79605VMb;
import X.EEB;
import X.EEJ;
import X.EER;
import X.EVM;
import X.EnumC39866Fkk;
import X.EnumC40073Fo5;
import X.FGN;
import X.InterfaceC40525FvN;
import X.InterfaceC61488OBg;
import X.InterfaceC65784Pro;
import X.JNN;
import X.JVR;
import X.OFH;
import X.VMI;
import X.X1D;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewInterceptReport;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS7S1100000_6 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    public final void LIZ$5() {
        List LJIIIIZZ = IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIIIIZZ(this.s0, ((MufListPageViewModel) this.l1).LJLJJI);
        ((MufListPageViewModel) this.l1).setState(new AqS65S1100000_12(this.s0, (String) LJIIIIZZ, (List<IMUser>) 18));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("search:[");
        LIZ.append(this.s0);
        LIZ.append("] result(");
        LIZ.append(LJIIIIZZ.size());
        LIZ.append(')');
        C221018lt.LJFF("MUF-LIST VM", X1D.LIZIZ(LIZ));
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
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str = this.s0;
        WebViewInterceptReport webViewInterceptReport = (WebViewInterceptReport) this.l1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("metrics");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("category");
            String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
            VMI vmi = VMI.LJ;
            WebView webView = webViewInterceptReport.LIZ;
            C79605VMb c79605VMb = new C79605VMb(optString);
            c79605VMb.LIZ = string;
            c79605VMb.LIZLLL = optJSONObject2;
            c79605VMb.LJ = optJSONObject;
            c79605VMb.LIZIZ = "tiktok_webview_hook";
            c79605VMb.LIZIZ(0);
            vmi.LJIILL(webView, c79605VMb.LIZ());
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void LIZ$1() {
        Runnable runnable = (Runnable) this.l1;
        String str = this.s0;
        synchronized (runnable) {
            try {
                Map<String, Runnable> map = FGN.LJFF;
                if (map.get(str) != null) {
                    runnable.run();
                    map.remove(str);
                }
            } catch (Exception unused) {
                Handler handler = FGN.LIZJ;
                if (handler != null) {
                    handler.post(new ARunnableS7S1100000_6(runnable, str, 6));
                } else {
                    o.LJIJI("sMainHandler");
                    throw null;
                }
            }
        }
    }

    public final void LIZ$2() {
        long j;
        if (o.LJ(((C35692Dzc) this.l1).LIZIZ.get(this.s0), Boolean.TRUE)) {
            ((C35692Dzc) this.l1).LIZIZ.remove(this.s0);
            HashMap<String, String> hashMap = ((C35692Dzc) this.l1).LIZ.get(this.s0);
            ((C35692Dzc) this.l1).LIZ.remove(this.s0);
            if (hashMap != null) {
                String str = hashMap.get(C35692Dzc.LIZLLL.get(this.s0));
                if (str != null) {
                    j = CastLongProtector.parseLong(str);
                } else {
                    j = 0;
                }
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    hashMap.put(entry.getKey(), String.valueOf(CastLongProtector.parseLong(entry.getValue()) - j));
                }
                AnonymousClass172.LIZ(this.s0, hashMap);
            }
        }
    }

    public final void LIZ$3() {
        try {
            C37057EgX c37057EgX = ((C37062Egc) this.l1).LIZ;
            if (c37057EgX.LIZ != null && this.s0.equals(c37057EgX.LJ)) {
                C37057EgX c37057EgX2 = ((C37062Egc) this.l1).LIZ;
                C16880lQ.LLZZ(c37057EgX2.LIZ, C37054EgU.LIZ(-1, this.s0, c37057EgX2.LIZIZ));
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onSuccess url is not same with current，task url: ");
                LIZ.append(this.s0);
                LIZ.append(" urlFromOverride : ");
                LIZ.append(((C37062Egc) this.l1).LIZ.LJ);
                X1D.LIZIZ(LIZ);
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZ$4() {
        Object LIZ;
        String str;
        C38504F9g c38504F9g = new C38504F9g((C60737Nsb) this.l1, this.s0);
        try {
            C79605VMb c79605VMb = new C79605VMb("bd_hybrid_monitor_infra_service");
            c79605VMb.LJIIJJI = EnumC40073Fo5.Tea;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hybrid_module", "lynxprefetch");
            jSONObject.put("infra_service", "vmsdk");
            c79605VMb.LIZLLL = jSONObject;
            C60737Nsb c60737Nsb = c38504F9g.LJIIJ;
            if (c60737Nsb != null) {
                str = c60737Nsb.containerId;
            } else {
                str = null;
            }
            c79605VMb.LJIIIIZZ = str;
            C79604VMa LIZ2 = c79605VMb.LIZ();
            OFH.LIZLLL.getClass();
            OFH.LIZLLL(LIZ2);
        } catch (Throwable th) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            c39048FUe.LIZ(C03090Af.LIZJ(LIZ3, "report usage failed ", th, LIZ3), EnumC39866Fkk.E, "PREFETCH");
        }
        o.LJ(C60882aC.LIZ.getLooper(), Looper.myLooper());
        c38504F9g.LJIIJ.LJII(C38504F9g.class, c38504F9g);
        try {
            InterfaceC61488OBg interfaceC61488OBg = c38504F9g.LIZJ;
            if (interfaceC61488OBg instanceof IResourceService) {
                c38504F9g.LJFF(c38504F9g.LJIIIZ, c38504F9g.LJIIJ, (IResourceService) interfaceC61488OBg);
            } else if (interfaceC61488OBg instanceof C39902FlK) {
                c38504F9g.LIZLLL((C39902FlK) interfaceC61488OBg, c38504F9g.LJIIIZ, c38504F9g.LJIIJ);
            } else {
                C38097ExJ.LIZIZ("hybrid_prefetch_file_load_state", c38504F9g.LJIIJ, c38504F9g.LJIIIZ, new JSONObject().put("success", 0).put("errorCode", -997).put("errorMsg", "ResourceLoader prefetch load error, no resource service"));
                c38504F9g.LJIIIZ(-997, "resource service is not as expected", null);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th2) {
            LIZ = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C38504F9g.LJIIJ(c38504F9g, Integer.valueOf(C63611Oxr.LIZIZ), null, m10exceptionOrNullimpl, 2);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("exception happened in Prefetch Runtime, ");
            LIZ4.append(m10exceptionOrNullimpl.getMessage());
            String message = X1D.LIZIZ(LIZ4);
            o.LJIIJ(message, "message");
        }
    }

    public final void LIZ$6() {
        String str = this.s0;
        JSONObject jSONObject = (JSONObject) this.l1;
        try {
            if (o.LJ("search_refactor_mob_validator_key", str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            Set<String> set = JNN.LJIILLIIL.get(str);
            if (set != null) {
                for (String str2 : set) {
                    if (JVR.LIZ(str2, jSONObject)) {
                        jSONObject2.put(str2, jSONObject.optString(str2));
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str2);
                        LIZ.append("_x");
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str2);
                        LIZ2.append("_x");
                        jSONObject2.put(LIZIZ, jSONObject.optString(X1D.LIZIZ(LIZ2)));
                    }
                }
            }
            if (jSONObject2.length() == 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("search_refactor_diff_event", str);
            jSONObject3.put("search_refactor_diff_param", jSONObject2.toString());
            jSONObject3.put("old_params", jSONObject.toString());
            AppLogNewUtils.onEventV3("search_refactor_mob_validator_key", jSONObject3);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("diff :");
            LIZ3.append(jSONObject3);
            C3C5.m7constructorimpl(Integer.valueOf(Log.d("steven1", X1D.LIZIZ(LIZ3))));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void LIZ$7() {
        String str = this.s0;
        Map map = (Map) this.l1;
        try {
            if (o.LJ("search_refactor_mob_validator_key", str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry != null && (entry.getValue() instanceof String) && entry.getKey() != null) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            Set<String> set = JNN.LJIILLIIL.get(str);
            if (set != null) {
                for (String str2 : set) {
                    if (JVR.LIZ(str2, jSONObject)) {
                        jSONObject2.put(str2, jSONObject.optString(str2));
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str2);
                        LIZ.append("_x");
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str2);
                        LIZ2.append("_x");
                        jSONObject2.put(LIZIZ, jSONObject.optString(X1D.LIZIZ(LIZ2)));
                    }
                }
            }
            if (jSONObject2.length() == 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("search_refactor_diff_event", str);
            jSONObject3.put("search_refactor_diff_param", jSONObject2.toString());
            jSONObject3.put("old_params", jSONObject.toString());
            AppLogNewUtils.onEventV3("search_refactor_mob_validator_key", jSONObject3);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("diff :");
            LIZ3.append(jSONObject3);
            C3C5.m7constructorimpl(Integer.valueOf(Log.d("steven1", X1D.LIZIZ(LIZ3))));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void run$0(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        String str = aRunnableS7S1100000_6.s0;
        FutureTask<C37499Enf> futureTask = (FutureTask) aRunnableS7S1100000_6.l1;
        try {
            ConcurrentHashMap<String, FutureTask<C37499Enf>> concurrentHashMap = C37505Enl.LIZ;
            if (concurrentHashMap.get(str) == futureTask) {
                concurrentHashMap.remove(str);
                C37499Enf c37499Enf = futureTask.get();
                if (c37499Enf != null) {
                    c37499Enf.release();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static final void run$1(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            C38065Ewn.LJ(aRunnableS7S1100000_6.s0, "from_network", ((C38066Ewo) aRunnableS7S1100000_6.l1).LIZJ.LJ);
            C38066Ewo c38066Ewo = (C38066Ewo) aRunnableS7S1100000_6.l1;
            c38066Ewo.LIZJ.LIZLLL(false, aRunnableS7S1100000_6.s0, c38066Ewo.LIZ);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            aRunnableS7S1100000_6.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        try {
            C38836FMa.LIZ(aRunnableS7S1100000_6.s0, (Map) aRunnableS7S1100000_6.l1);
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static final void run$12(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZLLL.LIZIZ(aRunnableS7S1100000_6.s0);
            ((EEJ) aRunnableS7S1100000_6.l1).LJLJI.LIZ(1206);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZLLL.LIZIZ(aRunnableS7S1100000_6.s0);
            ((EEB) aRunnableS7S1100000_6.l1).LJLILLLLZI.LIZ(1206);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZLLL.LIZIZ(aRunnableS7S1100000_6.s0);
            ((EER) aRunnableS7S1100000_6.l1).LJLILLLLZI.LIZ(LinkMicRtcMixBitrateSetting.DEFAULT);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            C38699FGt c38699FGt = C38698FGs.LIZ;
            if (c38699FGt != null) {
                String str = aRunnableS7S1100000_6.s0;
                JSONObject jSONObject = (JSONObject) aRunnableS7S1100000_6.l1;
                if (c38699FGt.LIZ == null) {
                    ((HashMap) c38699FGt.LIZIZ).put(str, jSONObject);
                } else {
                    try {
                        C38699FGt.LIZ(c38699FGt.LIZ, new Object[]{str, jSONObject});
                    } catch (Throwable unused) {
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            aRunnableS7S1100000_6.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            WebView webView = (WebView) aRunnableS7S1100000_6.l1;
            if (webView != null) {
                webView.evaluateJavascript(aRunnableS7S1100000_6.s0, C38509F9l.LIZ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            C16880lQ.LLZZ((WebView) aRunnableS7S1100000_6.l1, aRunnableS7S1100000_6.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            EVM.LIZ(Process.myTid(), -20);
            C2NW.LIZ().LJIIIZ(aRunnableS7S1100000_6.s0, (InterfaceC65784Pro) aRunnableS7S1100000_6.l1);
            JatoXL.resetPriority();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            if (!((C79600VLw) aRunnableS7S1100000_6.l1).LJIIIIZZ.contains(aRunnableS7S1100000_6.s0)) {
                ((C79600VLw) aRunnableS7S1100000_6.l1).LJIIIIZZ.add(aRunnableS7S1100000_6.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            ((InterfaceC40525FvN) aRunnableS7S1100000_6.l1).onFailed(aRunnableS7S1100000_6.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            aRunnableS7S1100000_6.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            aRunnableS7S1100000_6.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            aRunnableS7S1100000_6.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            ((HashSet) ((C79600VLw) aRunnableS7S1100000_6.l1).LJIIIZ).add(aRunnableS7S1100000_6.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            aRunnableS7S1100000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            C5S1 c5s1 = new C5S1((Context) aRunnableS7S1100000_6.l1);
            c5s1.LIZLLL(aRunnableS7S1100000_6.s0);
            c5s1.LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            Map<String, Runnable> map = FGN.LJFF;
            if (map.get(aRunnableS7S1100000_6.s0) != null) {
                Runnable runnable = (Runnable) aRunnableS7S1100000_6.l1;
                String str = aRunnableS7S1100000_6.s0;
                runnable.run();
                map.remove(str);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            aRunnableS7S1100000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            if (!((C38115Exb) aRunnableS7S1100000_6.l1).LJFF) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Invoking Jsb using evaluateJavascript: ");
                LIZ2.append(aRunnableS7S1100000_6.s0);
                X1D.LIZIZ(LIZ2);
                ((C38115Exb) aRunnableS7S1100000_6.l1).LJIIL.evaluateJavascript(aRunnableS7S1100000_6.s0, null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS7S1100000_6 aRunnableS7S1100000_6) {
        boolean LIZ;
        try {
            aRunnableS7S1100000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S1100000_6(C35692Dzc c35692Dzc, int i) {
        this.$t = i;
        this.l1 = c35692Dzc;
        this.s0 = "push_cold_start";
    }

    public ARunnableS7S1100000_6(JSONObject jSONObject, int i) {
        this.$t = i;
        this.s0 = "local_strategy";
        this.l1 = jSONObject;
    }

    public ARunnableS7S1100000_6(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
