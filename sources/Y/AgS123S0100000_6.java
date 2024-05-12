package Y;

import X.AXW;
import X.AbstractC37134Ehm;
import X.C03660Ck;
import X.C10I;
import X.C10K;
import X.C17N;
import X.C1DH;
import X.C2U8;
import X.C30868C9o;
import X.C31205CMn;
import X.C36089EEj;
import X.C36480ETk;
import X.C36605EYf;
import X.C36698Eak;
import X.C36754Ebe;
import X.C36779Ec3;
import X.C37100EhE;
import X.C37131Ehj;
import X.C37132Ehk;
import X.C38333F2r;
import X.C38422F6c;
import X.C39333Fc9;
import X.C40312Frw;
import X.C40410FtW;
import X.C40413FtZ;
import X.C40418Fte;
import X.C40426Ftm;
import X.C40431Ftr;
import X.C40467FuR;
import X.C76800UCe;
import X.EnumC35464Dvw;
import X.EnumC40416Ftc;
import X.F1E;
import X.F5Q;
import X.F5R;
import X.F6Z;
import X.InterfaceC26386AXe;
import X.InterfaceC36606EYg;
import X.InterfaceC37276Ek4;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.PVC;
import X.R41;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.m;
import com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver;
import com.ss.android.ugc.aweme.compliance.business.statemachine.PNSUserStateManager;
import com.ss.android.ugc.aweme.effect.EffectJobService;
import com.ss.android.ugc.aweme.lego.RunnableIdleTask;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponse;
import com.ss.android.ugc.aweme.main.PerformanceOptAssem;
import com.ss.android.ugc.aweme.modeo.ttep.moderation.PreviewMaterials;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.pitaya.IPitayaBundle;
import com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AgS123S0100000_6 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            case 7:
                return then$7(this, c10k);
            case 8:
                return then$8(this, c10k);
            case 9:
                return then$9(this, c10k);
            case 10:
                return then$10(this, c10k);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return then$11(this, c10k);
            case 12:
                return then$12(this, c10k);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return then$13(this, c10k);
            case 14:
                return then$14(this, c10k);
            case 15:
                return then$15(this, c10k);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return then$16(this, c10k);
            case 17:
                return then$17(this, c10k);
            case 18:
                return then$18(this, c10k);
            case 19:
                return then$19(this, c10k);
            case 20:
                return then$20(this, c10k);
            case 21:
                return then$21(this, c10k);
            case 22:
                return then$22(this, c10k);
            case 23:
                return then$23(this, c10k);
            case 24:
                return then$24(this, c10k);
            case 25:
                return then$25(this, c10k);
            case 26:
                return then$26(this, c10k);
            case 27:
                return then$27(this, c10k);
            default:
                return null;
        }
    }

    public AgS123S0100000_6(Bundle bundle, int i) {
        this.$t = i;
        switch (i) {
            case 5:
                this.l0 = bundle;
                return;
            default:
                this.l0 = bundle;
                return;
        }
    }

    public static final Object then$0(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        CharSequence charSequence;
        if (!c10k.LJIILIIL() || (charSequence = (CharSequence) ((OSZ) c10k.LJIIJJI()).getFirst()) == null || charSequence.length() == 0) {
            if (c10k.LJIILIIL()) {
                C30868C9o.LIZJ(((Number) ((OSZ) c10k.LJIIJJI()).getSecond()).intValue());
                return null;
            }
            C30868C9o.LIZJ(R.string.sp2);
            return null;
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) agS123S0100000_6.l0;
        Object first = ((OSZ) c10k.LJIIJJI()).getFirst();
        o.LJI(first);
        interfaceC88472Yns.invoke(first);
        return null;
    }

    public static final Object then$1(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        EffectJobService effectJobService = (EffectJobService) agS123S0100000_6.l0;
        effectJobService.getClass();
        InterfaceC26386AXe interfaceC26386AXe = (InterfaceC26386AXe) AXW.LIZ(effectJobService, InterfaceC26386AXe.class);
        interfaceC26386AXe.LIZ();
        interfaceC26386AXe.LJ(System.currentTimeMillis());
        effectJobService.stopSelf();
        return null;
    }

    public static final Object then$10(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        Boolean shouldShow = (Boolean) c10k.LJIIJJI();
        o.LJIIIIZZ(shouldShow, "shouldShow");
        if (shouldShow.booleanValue()) {
            Activity activity = (Activity) agS123S0100000_6.l0;
            if (activity != null) {
                PopupManager.LJIIL(new C40431Ftr(new C40426Ftm(activity, EnumC40416Ftc.LIKE)));
            }
            NoticeServiceImpl.LJJJJJ().LJIILIIL();
            return null;
        }
        Activity activity2 = (Activity) agS123S0100000_6.l0;
        if (activity2 == null) {
            return null;
        }
        NoticeServiceImpl.LJJJJJ().LJJ(activity2);
        return null;
    }

    public static final Object then$11(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        F1E f1e;
        JSONObject jSONObject;
        C36779Ec3 c36779Ec3 = (C36779Ec3) c10k.LJIIJJI();
        if (c36779Ec3 != null && (f1e = c36779Ec3.LIZIZ) != null && (jSONObject = f1e.LIZ) != null) {
            InterfaceC36606EYg interfaceC36606EYg = (InterfaceC36606EYg) agS123S0100000_6.l0;
            Object opt = jSONObject.opt("code");
            if ((opt instanceof Integer) && 1 == ((Number) opt).intValue()) {
                C36754Ebe c36754Ebe = new C36754Ebe();
                byte[] bytes = jSONObject.opt("response").toString().getBytes(PVC.LIZ);
                o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                c36754Ebe.LIZ = bytes;
                c36754Ebe.LIZJ = new HashMap();
                interfaceC36606EYg.LIZIZ(c36754Ebe);
            }
        }
        return null;
    }

    public static final Object then$12(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        F1E f1e;
        JSONObject jSONObject;
        C36779Ec3 c36779Ec3 = (C36779Ec3) c10k.LJIIJJI();
        if (c36779Ec3 != null && (f1e = c36779Ec3.LIZIZ) != null && (jSONObject = f1e.LIZ) != null) {
            InterfaceC36606EYg interfaceC36606EYg = (InterfaceC36606EYg) agS123S0100000_6.l0;
            Object opt = jSONObject.opt("code");
            if ((opt instanceof Integer) && 1 == ((Number) opt).intValue()) {
                C36754Ebe c36754Ebe = new C36754Ebe();
                byte[] bytes = jSONObject.opt("response").toString().getBytes(PVC.LIZ);
                o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                c36754Ebe.LIZ = bytes;
                c36754Ebe.LIZJ = new HashMap();
                interfaceC36606EYg.LIZIZ(c36754Ebe);
            }
        }
        return null;
    }

    public static final Object then$13(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        AbstractC37134Ehm abstractC37134Ehm = (AbstractC37134Ehm) agS123S0100000_6.l0;
        if (!c10k.LJIILJJIL()) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error while start downloading ");
        LIZ.append(abstractC37134Ehm.LIZ);
        throw new RuntimeException(X1D.LIZIZ(LIZ), c10k.LJIIJ());
    }

    public static final Object then$14(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        if (!c10k.LJIILJJIL()) {
            return C76800UCe.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error while start downloading ");
        LIZ.append(((C37100EhE) agS123S0100000_6.l0).LIZ);
        throw new RuntimeException(X1D.LIZIZ(LIZ), c10k.LJIIJ());
    }

    public static final Object then$15(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        if (C36480ETk.LIZIZ(c10k)) {
            try {
                PreviewMaterials previewMaterials = (PreviewMaterials) c10k.LJIIJJI();
                if (previewMaterials != null) {
                    ((InterfaceC88471Ynr) agS123S0100000_6.l0).invoke(previewMaterials, null);
                } else {
                    ((InterfaceC88471Ynr) agS123S0100000_6.l0).invoke(null, new Exception("Empty result."));
                }
                return previewMaterials;
            } catch (Exception e) {
                ((InterfaceC88471Ynr) agS123S0100000_6.l0).invoke(null, e);
                return C76800UCe.LIZ;
            }
        }
        ((InterfaceC88471Ynr) agS123S0100000_6.l0).invoke(null, c10k.LJIIJ());
        return C76800UCe.LIZ;
    }

    public static final Object then$16(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        if (((NetWorkStateReceiver) agS123S0100000_6.l0).LIZIZ && NetWorkStateReceiver.LIZJ) {
            C2U8.LIZ(new IEvent() { // from class: X.2Ky
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
            return null;
        }
        C2U8.LIZ(new IEvent() { // from class: X.2Ky
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C2U8.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C2U8.LIZIZ(this);
                return this;
            }
        });
        return null;
    }

    public static final Object then$17(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        CharSequence charSequence;
        if (!c10k.LJIILIIL() || (charSequence = (CharSequence) ((OSZ) c10k.LJIIJJI()).getFirst()) == null || charSequence.length() == 0) {
            if (c10k.LJIILIIL()) {
                C30868C9o.LIZJ(((Number) ((OSZ) c10k.LJIIJJI()).getSecond()).intValue());
                return null;
            }
            C30868C9o.LIZJ(R.string.sp2);
            return null;
        }
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) agS123S0100000_6.l0;
        Object first = ((OSZ) c10k.LJIIJJI()).getFirst();
        o.LJI(first);
        interfaceC88471Ynr.invoke(first, 0);
        return null;
    }

    public static final Object then$18(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        Bundle bundle = (Bundle) agS123S0100000_6.l0;
        o.LJI(bundle);
        return C40312Frw.LIZIZ(bundle);
    }

    public static final Object then$19(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        ((InterfaceC65784Pro) agS123S0100000_6.l0).invoke();
        return null;
    }

    public static final Object then$2(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        C36089EEj c36089EEj = new C36089EEj(false, false);
        c36089EEj.LIZIZ(new RunnableIdleTask(new ARunnableS40S0100000_4((PerformanceOptAssem) agS123S0100000_6.l0, 64), "LazyDoItTask"), true);
        c36089EEj.LIZJ();
        return null;
    }

    public static final Object then$20(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        ((InterfaceC88472Yns) agS123S0100000_6.l0).invoke(c10k.LJIIJJI());
        return C76800UCe.LIZ;
    }

    public static final Object then$21(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        ((InterfaceC88472Yns) agS123S0100000_6.l0).invoke(c10k.LJIIJJI());
        return C76800UCe.LIZ;
    }

    public static final Object then$22(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        ((C36698Eak) agS123S0100000_6.l0).LIZJ();
        return null;
    }

    public static final Object then$23(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        C36605EYf c36605EYf = (C36605EYf) c10k.LJIIJJI();
        if (c36605EYf.LIZ) {
            InterfaceC36606EYg interfaceC36606EYg = (InterfaceC36606EYg) agS123S0100000_6.l0;
            C36754Ebe c36754Ebe = new C36754Ebe();
            byte[] bArr = c36605EYf.LIZIZ;
            o.LJI(bArr);
            c36754Ebe.LIZ = bArr;
            c36754Ebe.LIZJ = new HashMap();
            interfaceC36606EYg.LIZIZ(c36754Ebe);
        } else {
            InterfaceC36606EYg interfaceC36606EYg2 = (InterfaceC36606EYg) agS123S0100000_6.l0;
            Throwable th = c36605EYf.LIZJ;
            o.LJI(th);
            interfaceC36606EYg2.LIZ(th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$24(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        C36605EYf c36605EYf = (C36605EYf) c10k.LJIIJJI();
        if (c36605EYf.LIZ) {
            InterfaceC36606EYg interfaceC36606EYg = (InterfaceC36606EYg) agS123S0100000_6.l0;
            C36754Ebe c36754Ebe = new C36754Ebe();
            byte[] bArr = c36605EYf.LIZIZ;
            o.LJI(bArr);
            c36754Ebe.LIZ = bArr;
            c36754Ebe.LIZJ = new HashMap();
            interfaceC36606EYg.LIZIZ(c36754Ebe);
        } else {
            InterfaceC36606EYg interfaceC36606EYg2 = (InterfaceC36606EYg) agS123S0100000_6.l0;
            Throwable th = c36605EYf.LIZJ;
            o.LJI(th);
            interfaceC36606EYg2.LIZ(th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$25(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        if (o.LJ(c10k.LJIIJJI(), Boolean.FALSE)) {
            C1DH.LJJIJIIJI(new ARunnableS42S0100000_6((Activity) agS123S0100000_6.l0, 161));
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$26(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        LiveSDKSettingResponse liveSDKSettingResponse;
        m mVar;
        Context context = (Context) agS123S0100000_6.l0;
        if (!c10k.LJIILJJIL() && (liveSDKSettingResponse = (LiveSDKSettingResponse) c10k.LJIIJJI()) != null && liveSDKSettingResponse.status_code == 0 && (mVar = liveSDKSettingResponse.data) != null) {
            C31205CMn.LJFF(context, mVar);
            return null;
        }
        return null;
    }

    public static final Object then$27(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        if (c10k.LJIILJJIL()) {
            Exception LJIIJ = c10k.LJIIJ();
            C17N.LJ(((InterfaceC37276Ek4) agS123S0100000_6.l0).request().getUrl(), LJIIJ);
            if (LJIIJ instanceof C38333F2r) {
                ((InterfaceC37276Ek4) agS123S0100000_6.l0).request().getUrl();
                throw LJIIJ;
            }
            throw LJIIJ;
        }
        if (!c10k.LJIIL()) {
            return c10k.LJIIJJI();
        }
        throw new CancellationException();
    }

    public static final Object then$3(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        boolean z;
        IPluginService LIZLLL;
        C38422F6c c38422F6c = (C38422F6c) agS123S0100000_6.l0;
        c38422F6c.getClass();
        PitayaExperiment.LIZ.getClass();
        if (PitayaExperiment.LIZIZ.enable == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c38422F6c.LIZ();
            if (c38422F6c.LIZ == null) {
                ARunnableS42S0100000_6 aRunnableS42S0100000_6 = new ARunnableS42S0100000_6(c38422F6c, 50);
                if (AabPluginServiceImpl.LIZLLL() != null && (LIZLLL = AabPluginServiceImpl.LIZLLL()) != null) {
                    LIZLLL.enableInstall();
                    if (!LIZLLL.checkPluginInstalled("com.ss.android.ugc.aweme.pitaya")) {
                        C37132Ehk c37132Ehk = new C37132Ehk();
                        c37132Ehk.LIZ = "com.ss.android.ugc.aweme.pitaya";
                        c37132Ehk.LIZIZ = true;
                        c37132Ehk.LIZLLL = new F6Z(aRunnableS42S0100000_6);
                        F5Q f5q = new F5Q();
                        f5q.LIZ = false;
                        f5q.LIZIZ = true;
                        f5q.LIZJ = true;
                        f5q.LIZLLL = true;
                        f5q.LJ = false;
                        c37132Ehk.LJ = new F5R(f5q);
                        LIZLLL.LIZ(new C37131Ehj(c37132Ehk));
                    }
                }
            }
            if (c38422F6c.LIZ != null) {
                C38422F6c.LJ *= 2;
                try {
                    IPitayaBundle iPitayaBundle = ((C38422F6c) agS123S0100000_6.l0).LIZ;
                    o.LJI(iPitayaBundle);
                    iPitayaBundle.initPitaya(((C38422F6c) agS123S0100000_6.l0).LIZIZ);
                } catch (AbstractMethodError e) {
                    e.printStackTrace();
                }
                return null;
            }
        }
        return null;
    }

    public static final Object then$4(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        Runnable runnable = (Runnable) agS123S0100000_6.l0;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }

    public static final Object then$5(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        String str;
        String message;
        Bundle bundle = (Bundle) agS123S0100000_6.l0;
        String str2 = "";
        if (c10k.LJIILJJIL()) {
            if (c10k.LJIIJ() instanceof C38333F2r) {
                C38333F2r c38333F2r = (C38333F2r) c10k.LJIIJ();
                str2 = String.valueOf(c38333F2r.getErrorCode());
                message = c38333F2r.getErrorMsg();
            } else {
                message = c10k.LJIIJ().getMessage();
            }
            C40467FuR.LIZJ(str2, message, EnumC35464Dvw.REFRESH_AWEME_USER);
        } else if (c10k.LJIIJJI() != null) {
            EnumC35464Dvw enumC35464Dvw = EnumC35464Dvw.REFRESH_AWEME_USER;
            String uid = ((User) c10k.LJIIJJI()).getUid();
            HashMap LIZJ = C03660Ck.LIZJ("event", "login part success");
            if (enumC35464Dvw == null || (str = enumC35464Dvw.name()) == null) {
                str = "";
            }
            LIZJ.put("part", str);
            LIZJ.put("loginMethod", "");
            if (uid != null) {
                str2 = uid;
            }
            LIZJ.put("extra", str2);
            C40467FuR c40467FuR = C40467FuR.LIZ;
            String abstractMap = LIZJ.toString();
            o.LJIIIIZZ(abstractMap, "map.toString()");
            c40467FuR.LIZIZ(abstractMap);
        } else {
            C40467FuR.LIZJ("", "user == null", EnumC35464Dvw.REFRESH_AWEME_USER);
        }
        if (!c10k.LJIILJJIL()) {
            if (c10k.LJIIJJI() != null) {
                R41.LIZ().queryUserSync((User) c10k.LJIIJJI());
            }
            return bundle;
        }
        throw c10k.LJIIJ();
    }

    public static final Object then$6(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        if (!c10k.LJIILJJIL() && !c10k.LJIIL()) {
            PNSUserStateManager pNSUserStateManager = (PNSUserStateManager) agS123S0100000_6.l0;
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "task.result");
            pNSUserStateManager.LJLILLLLZI = (HashSet) LJIIJJI;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$7(Y.AgS123S0100000_6 r17, X.C10K r18) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS123S0100000_6.then$7(Y.AgS123S0100000_6, X.10K):java.lang.Object");
    }

    public static final Object then$8(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        Activity activity;
        Boolean shouldShow = (Boolean) c10k.LJIIJJI();
        o.LJIIIIZZ(shouldShow, "shouldShow");
        if (shouldShow.booleanValue() && (activity = (Activity) agS123S0100000_6.l0) != null) {
            PopupManager.LJIIL(new C40431Ftr(new C40426Ftm(activity, EnumC40416Ftc.ACTIVATION)));
            return null;
        }
        return null;
    }

    public static final Object then$9(AgS123S0100000_6 agS123S0100000_6, C10K c10k) {
        boolean z;
        Activity activity = (Activity) agS123S0100000_6.l0;
        EnumC40416Ftc enumC40416Ftc = EnumC40416Ftc.LIKE;
        if (C40410FtW.LIZIZ(activity, enumC40416Ftc)) {
            C40413FtZ c40413FtZ = new C40413FtZ(enumC40416Ftc);
            if (c40413FtZ.LIZLLL || c40413FtZ.LJ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(enumC40416Ftc);
                LIZ.append(" :Clicked the like dialog feedback or submit button");
                C39333Fc9.LIZ(X1D.LIZIZ(LIZ));
            } else {
                EnumC40416Ftc enumC40416Ftc2 = EnumC40416Ftc.ACTIVATION;
                if (new C40413FtZ(enumC40416Ftc2).LJ) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(enumC40416Ftc2);
                    LIZ2.append(" :Clicked the active dialog submit button");
                    C39333Fc9.LIZ(X1D.LIZIZ(LIZ2));
                } else if (C40418Fte.LIZ()) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public AgS123S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
