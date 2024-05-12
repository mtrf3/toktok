package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C32014ChO;
import X.C34K;
import X.C36835Ecx;
import X.C3C5;
import X.C45804HyK;
import X.C55748LuK;
import X.C64626PXy;
import X.C65896Ptc;
import X.C65901Pth;
import X.C65902Pti;
import X.C65907Ptn;
import X.C65908Pto;
import X.C65922Pu2;
import X.C65935PuF;
import X.C66168Py0;
import X.C66208Pye;
import X.C66210Pyg;
import X.C66215Pyl;
import X.C66300Q0i;
import X.C66310Q0s;
import X.C66645QDp;
import X.C68322mC;
import X.C72242sW;
import X.C76800UCe;
import X.EJ6;
import X.EnumC66158Pxq;
import X.FYO;
import X.InterfaceC65784Pro;
import X.InterfaceC66214Pyk;
import X.InterfaceC88472Yns;
import X.JBR;
import X.OSZ;
import X.PNN;
import X.PYQ;
import X.Q0E;
import X.Q0I;
import X.Q0J;
import X.Q11;
import X.QBA;
import X.QBC;
import X.QBH;
import X.QBJ;
import X.R2S;
import X.R2U;
import X.R2V;
import X.R6M;
import X.U7U;
import X.X1D;
import X.XKX;
import Y.ARunnableS17S0110000_11;
import Y.AfS63S0100000_11;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.helios.api.config.FuseConfig;
import com.bytedance.helios.api.config.SkynetConfig;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.network.okhttp.impl.OkHttpServiceImpl;
import com.bytedance.helios.network.pipeline.ModifyConfig;
import com.bytedance.helios.network.ttnet.impl.TTNetServiceImpl;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.scalpel.bigjank.IBigJankApi;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.internal.j;
import com.ss.android.ugc.aweme.account.utils.SmartLockSaveHelper;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.services.SmartLockEventHelper;
import com.ss.android.ugc.aweme.services.SmartLockService;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AqS158S0200000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    public static /* bridge */ /* synthetic */ Object invoke$20(AqS158S0200000_11 aqS158S0200000_11) {
        aqS158S0200000_11.invoke$2();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        ((C34K) this.l0).element = true;
        SmartLockSaveHelper.LJ();
        SmartLockEventHelper.INSTANCE.onSaveCredentialFail$account_awemeaccount_release(((SmartLockService) this.l1).scene, "timeout");
    }

    public final void invoke$1() {
        Q11 LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll((Map) this.l0);
        linkedHashMap.put("source", "guard");
        Iterator it = ((List) this.l1).iterator();
        while (it.hasNext()) {
            InterfaceC66214Pyk interfaceC66214Pyk = ((C66168Py0) it.next()).LJLILLLLZI;
            if (interfaceC66214Pyk != null) {
                interfaceC66214Pyk.LIZIZ(EnumC66158Pxq.ASYNC, linkedHashMap);
            }
        }
        LIZLLL = C66208Pye.LIZ.LIZLLL(linkedHashMap, C113554cx.LJJJLIIL());
        Iterator it2 = ((List) this.l1).iterator();
        while (it2.hasNext()) {
            InterfaceC66214Pyk interfaceC66214Pyk2 = ((C66168Py0) it2.next()).LJLILLLLZI;
            if (interfaceC66214Pyk2 != null) {
                interfaceC66214Pyk2.LIZ(EnumC66158Pxq.ASYNC, new C66210Pyg(null, linkedHashMap, LIZLLL, 23));
            }
        }
        if (C66215Pyl.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("executeRulerAsync[");
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
            LIZ.append(LLLLIIIILLL.getName());
            LIZ.append("] result<<<<<< ");
            LIZ.append(LIZLLL);
            j.LIZLLL(X1D.LIZIZ(LIZ));
        }
    }

    public final void invoke$2() {
        Object LIZ;
        Q0E.LIZIZ();
        Application context = ((C65935PuF) this.l0).LJLIL;
        o.LJIIIZ(context, "context");
        AqS172S0100000_6 aqS172S0100000_6 = new AqS172S0100000_6((Context) context, 132);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray optJSONArray = new JSONObject((String) aqS172S0100000_6.invoke("bpea/collect_cert_fact_detail.json")).optJSONArray("certs");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String token = optJSONObject.optString("certToken");
                        o.LJIIIIZZ(token, "token");
                        if (token.length() > 0) {
                            jSONObject.put(token, optJSONObject);
                        }
                    }
                }
            }
            Q0J.LIZ = jSONObject;
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        Q0I addProcessName = (Q0I) this.l1;
        Application application = ((C65935PuF) this.l0).LJLIL;
        o.LJIIIZ(addProcessName, "$this$addProcessName");
        if (application != null) {
            String LIZ2 = C36835Ecx.LIZ(application);
            if (LIZ2 == null) {
                LIZ2 = "";
            }
            addProcessName.LIZIZ.put("processName", LIZ2);
        }
        Q0I q0i = (Q0I) this.l1;
        q0i.getClass();
        C66310Q0s.LIZIZ.monitorEvent(q0i.LIZLLL, q0i.LIZIZ, q0i.LIZ, q0i.LIZJ);
    }

    public static final Object invoke$0(AqS158S0200000_11 aqS158S0200000_11) {
        Integer num;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OkHttpServiceImpl.getQueries isHitCache:false size: ");
        LIZ.append(((HashMap) aqS158S0200000_11.l0).size());
        LIZ.append(" url: ");
        C64626PXy c64626PXy = (C64626PXy) aqS158S0200000_11.l1;
        if (c64626PXy != null && (str = c64626PXy.LJIIIIZZ) != null) {
            num = Integer.valueOf(str.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(" lruCache: ");
        LIZ.append(OkHttpServiceImpl.queryLruCache);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS158S0200000_11 aqS158S0200000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ModifyConfig.modify id: ");
        LIZ.append(((C65902Pti) aqS158S0200000_11.l1).LJLIL.LJLIL.LIZ);
        LIZ.append(" modifyConfig: ");
        LIZ.append((ModifyConfig) aqS158S0200000_11.l0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$10(AqS158S0200000_11 aqS158S0200000_11) {
        String str;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS158S0200000_11.l0;
        if (interfaceC88472Yns != null) {
            ButtonActionInfo buttonActionInfo = ((ButtonAction) aqS158S0200000_11.l1).getButtonActionInfo();
            if (buttonActionInfo == null || (str = buttonActionInfo.getSchema()) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS158S0200000_11 aqS158S0200000_11) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================(CostTimeline)\nOkHttp_intercept(cost = ");
        LIZ.append(((C72242sW) aqS158S0200000_11.l0).element / 1000000);
        LIZ.append(" millisecond)\n");
        C65902Pti c65902Pti = (C65902Pti) aqS158S0200000_11.l1;
        if (c65902Pti != null) {
            str = c65902Pti.getUrl();
        } else {
            str = null;
        }
        return JBR.LJFF(LIZ, str, "\n========================================================", LIZ);
    }

    public static final Object invoke$12(AqS158S0200000_11 aqS158S0200000_11) {
        Context context = (Context) aqS158S0200000_11.l0;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS158S0200000_11.l1;
        C66645QDp.LIZ(1, "mlbb");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(LJJIFFI), null, null, new C55748LuK(LJJIFFI, interfaceC65784Pro, null), 3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS158S0200000_11 aqS158S0200000_11) {
        ActivityC45651qj activityC45651qj;
        Context context = (Context) aqS158S0200000_11.l0;
        QBC qbc = (QBC) aqS158S0200000_11.l1;
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if ((LJIJJ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIJJ) != null) {
            QBJ qbj = new QBJ(activityC45651qj);
            qbj.LIZ = "facebook";
            qbj.LIZJ = qbc;
            QBH qbh = new QBH(qbj);
            QBA.LIZIZ().getClass();
            QBA.LIZJ(qbh);
            C66645QDp.LIZ(0, "fb");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS158S0200000_11 aqS158S0200000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================(NetworkReportManager)\nNetworkReportManager.report id:");
        LIZ.append(((PYQ) aqS158S0200000_11.l0).LJJJJL().LJLIL.LIZ);
        LIZ.append(" invokeType:");
        LIZ.append(((PYQ) aqS158S0200000_11.l0).LJJJJL().LJLIL.LIZIZ);
        LIZ.append(" uuid:");
        LIZ.append(((PYQ) aqS158S0200000_11.l0).LJJJJL().LL);
        LIZ.append("\ncategory:");
        LIZ.append(((ApmEvent) aqS158S0200000_11.l1).mCategories);
        LIZ.append("\nmetric:");
        LIZ.append(((ApmEvent) aqS158S0200000_11.l1).mMetrics);
        LIZ.append("\nlogExtra:");
        LIZ.append(((ApmEvent) aqS158S0200000_11.l1).mExtras);
        LIZ.append("\n========================================================");
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$15(AqS158S0200000_11 aqS158S0200000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShutdownManager id:");
        LIZ.append(((PYQ) aqS158S0200000_11.l1).LJJJJL().LJLIL.LIZ);
        LIZ.append(" uuid:");
        LIZ.append(((PYQ) aqS158S0200000_11.l1).LJJJJL().LL);
        LIZ.append(" \nhandleResult:");
        LIZ.append(((PYQ) aqS158S0200000_11.l1).LJJJJL().LJZI);
        LIZ.append(" fuseConfig:");
        LIZ.append((FuseConfig) aqS158S0200000_11.l0);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:22|23|24|(1:26)|27|(2:28|29)|(2:31|(9:33|(3:35|(1:39)|40)|41|42|43|44|(3:48|(1:52)|53)|54|55))|61|42|43|44|(4:46|48|(2:50|52)|53)|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0131, code lost:
    
        r8 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$16(kotlin.jvm.internal.AqS158S0200000_11 r11) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS158S0200000_11.invoke$16(kotlin.jvm.internal.AqS158S0200000_11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AqS158S0200000_11 aqS158S0200000_11) {
        int i;
        C65901Pth c65901Pth;
        C65922Pu2 c65922Pu2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StackEventCacheManager pairCacheEvent id: ");
        C65896Ptc c65896Ptc = (C65896Ptc) ((C68322mC) aqS158S0200000_11.l0).element;
        if (c65896Ptc != null && (c65901Pth = c65896Ptc.LJLIL) != null && (c65922Pu2 = c65901Pth.LJLIL) != null) {
            i = c65922Pu2.LIZ;
        } else {
            i = -1;
        }
        LIZ.append(i);
        LIZ.append(" uniquePairKey:");
        LIZ.append(aqS158S0200000_11.l1);
        LIZ.append(" rest:(");
        C65908Pto<C65896Ptc> c65908Pto = C65907Ptn.LIZ;
        LIZ.append(c65908Pto.size());
        LIZ.append(", ");
        LIZ.append(c65908Pto.getMapSize());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$18(AqS158S0200000_11 aqS158S0200000_11) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================(CostTimeline)\nUrlConnection_onConnect(cost = ");
        LIZ.append(((C72242sW) aqS158S0200000_11.l0).element / 1000000);
        LIZ.append(" millisecond)\n");
        C65902Pti c65902Pti = (C65902Pti) aqS158S0200000_11.l1;
        if (c65902Pti != null) {
            str = c65902Pti.getUrl();
        } else {
            str = null;
        }
        return JBR.LJFF(LIZ, str, "\n========================================================", LIZ);
    }

    public static final Object invoke$19(AqS158S0200000_11 aqS158S0200000_11) {
        return ((InterfaceC88472Yns) aqS158S0200000_11.l0).invoke((C66300Q0i) aqS158S0200000_11.l1);
    }

    public static final Object invoke$2(AqS158S0200000_11 aqS158S0200000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \nBaseIniter.initDns(sampleRate: ");
        LIZ.append(((ARunnableS17S0110000_11) aqS158S0200000_11.l0).z1);
        LIZ.append(", domainBlockList: ");
        LIZ.append(((SkynetConfig) aqS158S0200000_11.l1).domainBlockList);
        LIZ.append(")\n ");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:24|25|26|(1:28)|29|(2:30|31)|(2:33|(9:35|(3:37|(1:41)|42)|43|44|45|46|(3:50|(1:54)|55)|56|57))|63|44|45|46|(4:48|50|(2:52|54)|55)|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015f, code lost:
    
        r8 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AqS158S0200000_11 r11) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS158S0200000_11.invoke$21(kotlin.jvm.internal.AqS158S0200000_11):java.lang.Object");
    }

    public static final Object invoke$22(AqS158S0200000_11 aqS158S0200000_11) {
        int i = ((U7U) aqS158S0200000_11.l0).LJJIL;
        if (i > 0) {
            ((ILiveStream) aqS158S0200000_11.l1).changeVideoFps(i);
        }
        ((U7U) aqS158S0200000_11.l0).LJJIL = 0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS158S0200000_11 aqS158S0200000_11) {
        LiveCore.Builder builder = ((LiveCore) aqS158S0200000_11.l0).getBuilder();
        U7U u7u = (U7U) aqS158S0200000_11.l1;
        if (u7u.LJJII == null) {
            u7u.LJJII = new OSZ<>(Integer.valueOf(builder.getVideoCaptureWidth()), Integer.valueOf(builder.getVideoCaptureHeight()));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("split on rtc, storeParams, originCapResolution: ");
            LIZ.append(u7u.LJJII);
            C32014ChO.LJFF("RtcManager", X1D.LIZIZ(LIZ));
        }
        if (u7u.LJJIII == null) {
            u7u.LJJIII = new OSZ<>(Integer.valueOf(builder.getCaptureAdaptedWidth()), Integer.valueOf(builder.getCaptureAdaptedHeight()));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("split on rtc, storeParams, originClipResolution: ");
            LIZ2.append(u7u.LJJIII);
            C32014ChO.LJFF("RtcManager", X1D.LIZIZ(LIZ2));
        }
        if (u7u.LJJIIJ == null) {
            u7u.LJJIIJ = new OSZ<>(Integer.valueOf(builder.getVideoCaptureMinFps()), Integer.valueOf(builder.getVideoCaptureFps()));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("split on rtc, storeParams, originCapFps: ");
            LIZ3.append(u7u.LJJIIJ);
            LIZ3.append(", enable: ");
            LIZ3.append(builder.getVideoCaptureParams().enableChangeCameraFpsWhenRunning);
            C32014ChO.LJFF("RtcManager", X1D.LIZIZ(LIZ3));
        }
        if (u7u.LJJIIJ() && u7u.LJJIL <= 0) {
            u7u.LJJIL = builder.getVideoFps();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("storeParams videoFps:");
            LIZ4.append(u7u.LJJIL);
            C32014ChO.LJFF("RtcManager", X1D.LIZIZ(LIZ4));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS158S0200000_11 aqS158S0200000_11) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================(CostTimeline)\nTTNet_intercept(cost = ");
        LIZ.append(((C72242sW) aqS158S0200000_11.l0).element / 1000000);
        LIZ.append(" millisecond)\n");
        C65902Pti c65902Pti = (C65902Pti) aqS158S0200000_11.l1;
        if (c65902Pti != null) {
            str = c65902Pti.getUrl();
        } else {
            str = null;
        }
        return JBR.LJFF(LIZ, str, "\n========================================================", LIZ);
    }

    public static final Object invoke$4(AqS158S0200000_11 aqS158S0200000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTNetServiceImpl.getCookies isHitCache:true size: ");
        LIZ.append(((Map) aqS158S0200000_11.l0).size());
        LIZ.append(" cookie: ");
        EJ6 header = (EJ6) aqS158S0200000_11.l1;
        o.LJIIIIZZ(header, "header");
        LIZ.append(header.LIZIZ.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(TTNetServiceImpl.cookieLruCache);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$5(AqS158S0200000_11 aqS158S0200000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTNetServiceImpl.getCookies isHitCache:false size: ");
        LIZ.append(((HashMap) aqS158S0200000_11.l0).size());
        LIZ.append(" cookie: ");
        EJ6 header = (EJ6) aqS158S0200000_11.l1;
        o.LJIIIIZZ(header, "header");
        LIZ.append(header.LIZIZ.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(TTNetServiceImpl.cookieLruCache);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$6(AqS158S0200000_11 aqS158S0200000_11) {
        AbstractC73672Svk<String> reportBigJank;
        if (((R2U) aqS158S0200000_11.l1).LIZ().LJLIL != null) {
            ((R2S) aqS158S0200000_11.l0).getClass();
            IBigJankApi iBigJankApi = (IBigJankApi) R2S.LIZ.getValue();
            if (iBigJankApi != null && (reportBigJank = iBigJankApi.reportBigJank(new TypedByteArray("application/octet-stream", (byte[]) ((R2U) aqS158S0200000_11.l1).LIZ().LJLIL, new String[0]), 10485760, FYO.LIZJ.invoke())) != null) {
                reportBigJank.LJJJLIIL(new AfS63S0100000_11(aqS158S0200000_11, 1), new AfS63S0100000_11(aqS158S0200000_11, 2));
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AqS158S0200000_11 aqS158S0200000_11) {
        aqS158S0200000_11.invoke$0();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AqS158S0200000_11 aqS158S0200000_11) {
        aqS158S0200000_11.invoke$1();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS158S0200000_11 aqS158S0200000_11) {
        long LJII = ((PNN) aqS158S0200000_11.l0).LJII();
        long LJIIIIZZ = ((PNN) aqS158S0200000_11.l0).LJIIIIZZ();
        try {
            Thread.sleep(360L);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        long LJII2 = ((PNN) aqS158S0200000_11.l0).LJII();
        long LJIIIIZZ2 = ((PNN) aqS158S0200000_11.l0).LJIIIIZZ();
        if (LJIIIIZZ2 - LJIIIIZZ > 0) {
            float f = ((((float) LJII) - ((float) LJII2)) / ((float) (LJIIIIZZ - LJIIIIZZ2))) * 100;
            ((PNN) aqS158S0200000_11.l0).LJLL = f;
            ((InterfaceC88472Yns) aqS158S0200000_11.l1).invoke(Float.valueOf(f));
        } else {
            ((InterfaceC88472Yns) aqS158S0200000_11.l1).invoke(Float.valueOf(-1.0f));
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS158S0200000_11(X.C66930QOo r3, org.json.JSONObject r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 16: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS158S0200000_11.<init>(X.QOo, org.json.JSONObject, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(C68322mC c68322mC, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c68322mC;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(C72242sW c72242sW, C65902Pti c65902Pti, int i) {
        super(0);
        this.$t = i;
        this.l0 = c72242sW;
        this.l1 = c65902Pti;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(C34K c34k, SmartLockService smartLockService, int i) {
        super(0);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = smartLockService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(PNN pnn, AqS119S0300000_15 aqS119S0300000_15, int i) {
        super(0);
        this.$t = i;
        this.l0 = pnn;
        this.l1 = aqS119S0300000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(C65935PuF c65935PuF, Q0I q0i, int i) {
        super(0);
        this.$t = i;
        this.l0 = c65935PuF;
        this.l1 = q0i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(R2S r2s, R2V r2v, int i) {
        super(0);
        this.$t = i;
        this.l0 = r2s;
        this.l1 = r2v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(U7U u7u, ILiveStream iLiveStream, int i) {
        super(0);
        this.$t = i;
        this.l0 = u7u;
        this.l1 = iLiveStream;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(U7U u7u, LiveCore liveCore, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveCore;
        this.l1 = u7u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(InterfaceC88472Yns interfaceC88472Yns, C66300Q0i c66300Q0i, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = c66300Q0i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS158S0200000_11(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, ButtonAction buttonAction) {
        super(0);
        this.$t = buttonAction;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(ARunnableS17S0110000_11 aRunnableS17S0110000_11, SkynetConfig skynetConfig, int i) {
        super(0);
        this.$t = i;
        this.l0 = aRunnableS17S0110000_11;
        this.l1 = skynetConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(Context context, R6M r6m, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = r6m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(Context context, AqS162S0100000_12 aqS162S0100000_12, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = aqS162S0100000_12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(FuseConfig fuseConfig, PYQ pyq, int i) {
        super(0);
        this.$t = i;
        this.l0 = fuseConfig;
        this.l1 = pyq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(ApmEvent apmEvent, PYQ pyq, int i) {
        super(0);
        this.$t = i;
        this.l0 = pyq;
        this.l1 = apmEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(ModifyConfig modifyConfig, C65902Pti c65902Pti, int i) {
        super(0);
        this.$t = i;
        this.l0 = modifyConfig;
        this.l1 = c65902Pti;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(HashMap hashMap, EJ6 ej6, int i) {
        super(0);
        this.$t = i;
        this.l0 = hashMap;
        this.l1 = ej6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(HashMap hashMap, C64626PXy c64626PXy, int i) {
        super(0);
        this.$t = i;
        this.l0 = hashMap;
        this.l1 = c64626PXy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(Map map, EJ6 ej6, int i) {
        super(0);
        this.$t = i;
        this.l0 = map;
        this.l1 = ej6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS158S0200000_11(Map map, List list, int i) {
        super(0);
        this.$t = i;
        this.l0 = map;
        this.l1 = list;
    }
}
