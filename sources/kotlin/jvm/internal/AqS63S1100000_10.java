package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC60673NrZ;
import X.AbstractC65781Prl;
import X.BZI;
import X.C03090Af;
import X.C113554cx;
import X.C116484hg;
import X.C26045AKb;
import X.C28787BRn;
import X.C31043CGh;
import X.C31811Ce7;
import X.C32444CoK;
import X.C39048FUe;
import X.C56593MIz;
import X.C58620MzY;
import X.C58684N1k;
import X.C58692N1s;
import X.C58773N4v;
import X.C58991NDf;
import X.C59977NgL;
import X.C60704Ns4;
import X.C60726NsQ;
import X.C60757Nsv;
import X.C61295O3v;
import X.C61659OHv;
import X.C62945On7;
import X.C68322mC;
import X.C76800UCe;
import X.C78983UzD;
import X.C82544WaS;
import X.EnumC39866Fkk;
import X.FCG;
import X.FCH;
import X.FD5;
import X.InterfaceC30442Bx8;
import X.InterfaceC58691N1r;
import X.InterfaceC88472Yns;
import X.N0W;
import X.N1V;
import X.N4D;
import X.N5J;
import X.NNK;
import X.NNL;
import X.O26;
import X.OBS;
import X.OHT;
import X.OSZ;
import X.PVC;
import X.RunnableC60754Nss;
import X.VEH;
import X.X1D;
import Y.ARunnableS9S1200000_10;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.os.SystemClock;
import com.bytedance.android.livesdk.gift.base.platform.business.utils.liveaudio.GiftAudioPlayer;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.cct.OpenCCTUtils;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes11.dex */
public class AqS63S1100000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        C61295O3v it = (C61295O3v) obj;
        o.LJIIIZ(it, "it");
        if (it.LJZL) {
            String filePath = it.getFilePath();
            if (filePath == null) {
                filePath = "";
            }
            GiftAudioPlayer.LJLJJL = filePath;
            String str = GiftAudioPlayer.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("filepath ");
            LIZ.append((GiftAudioPlayer) aqS63S1100000_10.l1);
            LIZ.append(".url");
            C32444CoK.LIZ(str, X1D.LIZIZ(LIZ));
        } else {
            C32444CoK.LIZ(GiftAudioPlayer.LJLILLLLZI, "download file fail");
            GiftAudioPlayer.LJLJJL = aqS63S1100000_10.s0;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        Long l;
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        N0W.LIZ.getClass();
        log.LJII(N0W.LJIIIZ, aqS63S1100000_10.s0);
        C56593MIz c56593MIz = N0W.LJIIJJI;
        C58991NDf c58991NDf = (C58991NDf) aqS63S1100000_10.l1;
        Long l2 = c58991NDf.LJI;
        if (l2 != null) {
            l = Long.valueOf(l2.longValue() - c58991NDf.LJ);
        } else {
            l = null;
        }
        log.LJII(c56593MIz, l);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(((N1V) aqS63S1100000_10.l1).LIZIZ));
        logAd.LJII(C58684N1k.LJIILL, ((N1V) aqS63S1100000_10.l1).LJII);
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        logAd.LJII(C58684N1k.LJJIJIL, Integer.valueOf(((N1V) aqS63S1100000_10.l1).LJIILLIIL));
        logAd.LJII(C58684N1k.LJJLIIIJJIZ, aqS63S1100000_10.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(((N1V) aqS63S1100000_10.l1).LIZIZ));
        logAd.LJII(C58684N1k.LJIILL, ((N1V) aqS63S1100000_10.l1).LJII);
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        logAd.LJII(C58684N1k.LJJIJIL, Integer.valueOf(((N1V) aqS63S1100000_10.l1).LJIILLIIL));
        logAd.LJII(C58684N1k.LJJLIIIJL, aqS63S1100000_10.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        O26 it = (O26) obj;
        o.LJIIIZ(it, "it");
        OBS obs = (OBS) aqS63S1100000_10.l1;
        String str = aqS63S1100000_10.s0;
        obs.getClass();
        C82544WaS.LIZ(new ARunnableS9S1200000_10(obs, it, str, 8));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        C60726NsQ c60726NsQ = (C60726NsQ) aqS63S1100000_10.l1;
        String str = c60726NsQ.getHybridContext().containerId;
        StringBuilder LIZ = X1D.LIZ();
        String LIZJ = C03090Af.LIZJ(LIZ, "ResoureLoader template load error, ", it, LIZ);
        String str2 = ((C60726NsQ) aqS63S1100000_10.l1).getHybridContext().vaid;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = ((C60726NsQ) aqS63S1100000_10.l1).getHybridContext().bid;
        if (str4 != null) {
            str3 = str4;
        }
        FD5.LJIIIIZZ(c60726NsQ, str, new C61659OHv(204, LIZJ, str2, str3));
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        c39048FUe.LIZ(C03090Af.LIZJ(LIZ2, "ResoureLoader template load error, ", it, LIZ2), EnumC39866Fkk.E, "LynxKit");
        C60726NsQ c60726NsQ2 = (C60726NsQ) aqS63S1100000_10.l1;
        AbstractC60673NrZ abstractC60673NrZ = c60726NsQ2.LJLJJL;
        if (abstractC60673NrZ != null) {
            String str5 = aqS63S1100000_10.s0;
            C60704Ns4 c60704Ns4 = new C60704Ns4();
            c60704Ns4.LIZ = 204;
            StringBuilder LIZ3 = X1D.LIZ();
            c60704Ns4.LIZIZ = C03090Af.LIZJ(LIZ3, "ResoureLoader template load error, ", it, LIZ3);
            c60704Ns4.LIZLLL = it.getMessage();
            abstractC60673NrZ.LJJJJIZL(c60726NsQ2, str5, c60704Ns4);
        }
        C60726NsQ c60726NsQ3 = (C60726NsQ) aqS63S1100000_10.l1;
        AbstractC60673NrZ abstractC60673NrZ2 = c60726NsQ3.LJLJJL;
        if (abstractC60673NrZ2 != null) {
            abstractC60673NrZ2.LJJJJJ(c60726NsQ3);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    public static final Object invoke$14(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        C61295O3v it = (C61295O3v) obj;
        o.LJIIJ(it, "it");
        C68322mC c68322mC = new C68322mC();
        if (it.LJZL) {
            byte[] S = it.S();
            if (S != null) {
                String str = new String(S, PVC.LIZ);
                RunnableC60754Nss runnableC60754Nss = (RunnableC60754Nss) aqS63S1100000_10.l1;
                C60757Nsv.LIZLLL(runnableC60754Nss.LJLIL.LIZIZ, it, true, runnableC60754Nss.LJLJJI, aqS63S1100000_10.s0);
                ((RunnableC60754Nss) aqS63S1100000_10.l1).LJLJI.LLLILZJ(VEH.LIZ(str));
                return C76800UCe.LIZ;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("forest load succeeded but bytes null, ");
            LIZ.append(it.LL);
            c68322mC.element = X1D.LIZIZ(LIZ);
        } else {
            c68322mC.element = String.valueOf(it.LL);
        }
        RunnableC60754Nss runnableC60754Nss2 = (RunnableC60754Nss) aqS63S1100000_10.l1;
        C60757Nsv.LIZLLL(runnableC60754Nss2.LJLIL.LIZIZ, it, false, runnableC60754Nss2.LJLJJI, null);
        ((RunnableC60754Nss) aqS63S1100000_10.l1).LJLJI.LLLILZJ(new VEH(-1, new Throwable((String) c68322mC.element)));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        C58773N4v fill = (C58773N4v) obj;
        o.LJIIIZ(fill, "$this$fill");
        fill.LIZIZ = ((NNK) aqS63S1100000_10.l1).LIZLLL().LIZ.LIZJ;
        fill.LIZJ = ((NNK) aqS63S1100000_10.l1).LIZLLL().LIZ.LIZLLL;
        fill.LIZLLL = ((NNK) aqS63S1100000_10.l1).LIZLLL().LIZ.LJ;
        fill.LIZ = aqS63S1100000_10.s0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS63S1100000_10 aqS63S1100000_10, Object it) {
        o.LJIIIZ(it, "it");
        ((C59977NgL) aqS63S1100000_10.l1).LIZIZ(2);
        C59977NgL c59977NgL = (C59977NgL) aqS63S1100000_10.l1;
        String str = aqS63S1100000_10.s0;
        c59977NgL.getClass();
        if (str.length() != 0) {
            FCH.LIZIZ.getClass();
            Activity LIZIZ = FCG.LIZIZ();
            if (LIZIZ != null) {
                try {
                    IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
                    if (!ujb.o.LJJJLIIL(str, "https://", false) && !ujb.o.LJJJLIIL(str, "http://", false)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("http://");
                        LIZ.append(str);
                        str = X1D.LIZIZ(LIZ);
                    }
                    createIMainServicebyMonsterPlugin.openSystemBrowser(LIZIZ, str);
                } catch (ActivityNotFoundException e) {
                    C78983UzD.LJIIZILJ(e);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS63S1100000_10 aqS63S1100000_10, Object it) {
        o.LJIIIZ(it, "it");
        ((C59977NgL) aqS63S1100000_10.l1).LIZIZ(3);
        C59977NgL c59977NgL = (C59977NgL) aqS63S1100000_10.l1;
        String str = aqS63S1100000_10.s0;
        c59977NgL.getClass();
        if (str.length() != 0) {
            FCH.LIZIZ.getClass();
            Activity LIZIZ = FCG.LIZIZ();
            if (LIZIZ != null) {
                OHT.LIZ("ba_product_link", str, LIZIZ, TokenCert.Companion.with("bpea-ba_product_link"));
                C26045AKb c26045AKb = new C26045AKb(LIZIZ);
                c26045AKb.LJIIIIZZ(R.string.dwc);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJJ, aqS63S1100000_10.s0);
        logAd.LJII(C58684N1k.LJIILL, ((OpenCCTUtils) aqS63S1100000_10.l1).LJIILL);
        logAd.LJII(C58684N1k.LJJJJZI, ((OpenCCTUtils) aqS63S1100000_10.l1).LJIIJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        int i;
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJJJZ, Integer.valueOf(((C58692N1s) aqS63S1100000_10.l1).LIZJ.ordinal()));
        logAd.LJII(C58684N1k.LJIILL, aqS63S1100000_10.s0);
        C56593MIz c56593MIz = C58684N1k.LJJL;
        InterfaceC58691N1r interfaceC58691N1r = ((C58692N1s) aqS63S1100000_10.l1).LIZ;
        if (interfaceC58691N1r != null) {
            i = interfaceC58691N1r.LIZ();
        } else {
            i = -1;
        }
        logAd.LJII(c56593MIz, Integer.valueOf(i));
        logAd.LJII(C58684N1k.LJJIIJZLJL, 0);
        logAd.LJII(C58684N1k.LJJIIJ, "");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS63S1100000_10 aqS63S1100000_10, Object it) {
        o.LJIIIZ(it, "it");
        C62945On7.LIZ((Activity) aqS63S1100000_10.l1);
        C116484hg.LIZ("enter_from", aqS63S1100000_10.s0, "show_public_notice");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        C58773N4v fill = (C58773N4v) obj;
        o.LJIIIZ(fill, "$this$fill");
        NNL nnl = (NNL) aqS63S1100000_10.l1;
        fill.LIZIZ = nnl.LIZJ;
        fill.LIZJ = nnl.LIZLLL;
        fill.LIZLLL = nnl.LJ;
        fill.LIZ = aqS63S1100000_10.s0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String str = aqS63S1100000_10.s0;
        if (str == null) {
            str = "confirm";
        }
        actionGroup.LJII(str, new AqS176S0100000_10((DialogBuilder) aqS63S1100000_10.l1, 154));
        if (((DialogBuilder) aqS63S1100000_10.l1).getNegativeBtnText() != null && ((DialogBuilder) aqS63S1100000_10.l1).getNegativeClickListener() != null) {
            String negativeBtnText = ((DialogBuilder) aqS63S1100000_10.l1).getNegativeBtnText();
            if (negativeBtnText == null) {
                negativeBtnText = "cancel";
            }
            actionGroup.LJIIIZ(negativeBtnText, new AqS176S0100000_10((DialogBuilder) aqS63S1100000_10.l1, 155));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        long j;
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        N5J n5j = (N5J) aqS63S1100000_10.l1;
        log.LJIIJ(n5j.LJLJJI.hv0(((Number) n5j.LJLJLJ.getValue()).intValue()));
        N4D.LIZ.getClass();
        log.LJII(N4D.LJ, aqS63S1100000_10.s0);
        log.LJII(N4D.LJFF, ((N5J) aqS63S1100000_10.l1).LJLJLJ.getValue());
        log.LJII(N4D.LJIIZILJ, Boolean.FALSE);
        C56593MIz c56593MIz = N4D.LJIJ;
        Long l = ((N5J) aqS63S1100000_10.l1).LJLJJLL;
        if (l != null) {
            j = SystemClock.uptimeMillis() - l.longValue();
        } else {
            j = 0;
        }
        log.LJII(c56593MIz, Long.valueOf(j));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        Map LJJL;
        C61295O3v it = (C61295O3v) obj;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryPreDownloadGameCardLynxTemplate isSucceed =");
        LIZ.append(it.LJZL);
        LIZ.append(", isCache = ");
        LIZ.append(it.LLFF);
        LIZ.append(", from = ");
        C31811Ce7.LJ(LIZ, it.LLD, LIZ, "GamePartnershipGeckoHandler");
        C31043CGh c31043CGh = (C31043CGh) aqS63S1100000_10.l1;
        String str = aqS63S1100000_10.s0;
        c31043CGh.getClass();
        Boolean valueOf = Boolean.valueOf(it.LJZL);
        Boolean valueOf2 = Boolean.valueOf(it.LLFF);
        String P = it.P(it.LLD);
        int i = 0;
        if (it.LJZL) {
            LJJL = C113554cx.LJJJLIIL();
        } else {
            LJJL = C113554cx.LJJL(new OSZ("error_code", String.valueOf(it.LL.LIZIZ)), new OSZ("gecko_error_code", String.valueOf(it.LL.LIZJ)), new OSZ("net_library_error_code", String.valueOf(it.LL.LIZLLL)), new OSZ("http_status_code", String.valueOf(it.LL.LJ)), new OSZ("gecko_error", it.LL.LJIIIIZZ), new OSZ("builtin_error", it.LL.LJIIIZ), new OSZ("cdn_error", it.LL.LJIIJ), new OSZ("pipeline_error", it.LL.LJIIJJI));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_pre_download_game_intro_card");
        LIZ2.LJIJJ(str, "channel");
        LIZ2.LJIJJ(valueOf, "succeed");
        LIZ2.LJIJJ(valueOf2, "cache");
        LIZ2.LJIJJ(P, "from");
        LIZ2.LJJIFFI(LJJL);
        LIZ2.LJJIIJZLJL();
        if (it.LJZL) {
            InterfaceC30442Bx8.l3.LIZ(aqS63S1100000_10.s0);
            i = 1;
        }
        C31043CGh.LIZ = i;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(((N1V) aqS63S1100000_10.l1).LIZIZ));
        logAd.LJII(C58684N1k.LJIILL, aqS63S1100000_10.s0);
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        logAd.LJII(C58684N1k.LJJIJIL, Integer.valueOf(((N1V) aqS63S1100000_10.l1).LJIILLIIL));
        logAd.LJII(C58684N1k.LJJIIZI, Integer.valueOf(((N1V) aqS63S1100000_10.l1).LJIILIIL));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS63S1100000_10 aqS63S1100000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIIZILJ, Long.valueOf(((N1V) aqS63S1100000_10.l1).LIZJ));
        logAd.LJII(C58684N1k.LJIILL, aqS63S1100000_10.s0);
        logAd.LJII(C58684N1k.LJIILJJIL, 1);
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(C31043CGh c31043CGh, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c31043CGh;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(N1V n1v, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = n1v;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(C58692N1s c58692N1s, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c58692N1s;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(N5J n5j, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = n5j;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(NNK nnk, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = nnk;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(NNL nnl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = nnl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(C59977NgL c59977NgL, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c59977NgL;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(C60726NsQ c60726NsQ, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c60726NsQ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(OBS obs, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = obs;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(Activity activity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(GiftAudioPlayer giftAudioPlayer, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = giftAudioPlayer;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(String str, C58991NDf c58991NDf, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c58991NDf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(String str, RunnableC60754Nss runnableC60754Nss, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = runnableC60754Nss;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(String str, DialogBuilder dialogBuilder, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = dialogBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1100000_10(String str, OpenCCTUtils openCCTUtils, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = openCCTUtils;
    }
}
