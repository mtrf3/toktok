package kotlin.jvm.internal;

import X.ASL;
import X.AbstractC40713FyP;
import X.AbstractC62515OgB;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188727au;
import X.C26045AKb;
import X.C268713r;
import X.C27740Aue;
import X.C2U8;
import X.C32I;
import X.C38891fp;
import X.C3C8;
import X.C55045Liz;
import X.C57430MgM;
import X.C58655N0h;
import X.C58704N2e;
import X.C59753Ncj;
import X.C59895Nf1;
import X.C60079Nhz;
import X.C61296O3w;
import X.C61298O3y;
import X.C61878OQg;
import X.C62180Oam;
import X.C62822Ol8;
import X.C62876Om0;
import X.C62889OmD;
import X.C68322mC;
import X.C73305Spp;
import X.C76800UCe;
import X.C77125UOr;
import X.C79165V5d;
import X.ED5;
import X.EnumC57366MfK;
import X.F3T;
import X.HG3;
import X.InterfaceC35811ar;
import X.InterfaceC59440NUm;
import X.InterfaceC62225ObV;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.NNV;
import X.NOJ;
import X.NR5;
import X.NRF;
import X.NUT;
import X.NWF;
import X.O0F;
import X.O0J;
import X.O4A;
import X.O4B;
import X.O4I;
import X.O8Y;
import X.OFJ;
import X.OP1;
import X.OP4;
import X.OZ4;
import X.P1J;
import X.P1K;
import X.RBX;
import X.SY4;
import X.X1D;
import Y.ACListenerS30S0100000_10;
import Y.ARunnableS21S0300000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AbsAdPopUpWebPageAssem;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.AuthMaFPowerCell;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public class AqS99S0300000_10 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public final void invoke$0() {
        ((NetworkStandardUIServiceImpl) this.l2).autoRetryListener.put(new WeakReference<>((C73305Spp) this.l1), new WeakReference<>((InterfaceC65784Pro) this.l0));
    }

    public final void invoke$1() {
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        C62822Ol8 c62822Ol8 = OP4.LIZ;
        Object value = c62822Ol8.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showed_tips_");
        if (!C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, (Keva) value, false)) {
            Object value2 = c62822Ol8.getValue();
            o.LJIIIIZZ(value2, "<get-keva>(...)");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("showed_tips_");
            LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
            ((Keva) value2).storeBoolean(X1D.LIZIZ(LIZ2), true);
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(((OP1) this.l0).getContext()), R.layout.agu, (OP1) this.l0, false);
            C16880lQ.LJJIZ((SY4) LLLLIILL.findViewById(R.id.h_t), new ACListenerS30S0100000_10(LLLLIILL, 119));
            Activity LIZIZ = C27740Aue.LIZIZ((OP1) this.l0);
            if ((LIZIZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LIZIZ) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                TuxSheet tuxSheet = new ASL().LIZ;
                tuxSheet.LJLLI = LLLLIILL;
                tuxSheet.show(supportFragmentManager, "hashtag_tips");
            }
        } else {
            Activity LIZ3 = C27740Aue.LIZ((Context) this.l1);
            o.LJIIIIZZ(LIZ3, "getActivity(context)");
            C26045AKb c26045AKb = new C26045AKb(LIZ3);
            c26045AKb.LJIIIIZZ(R.string.hmi);
            c26045AKb.LJIIJ();
        }
        ((SY4) ((OP1) this.l0).LIZ(R.id.kpi)).setLoading(false);
        if (((OP1) this.l0).getShouldDislike()) {
            C2U8.LIZ(new C55045Liz("homepage_hot", ((OP1) this.l0).getMAweme(), "FUNCTION_FROM_DEFAULT"));
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke((OP1) this.l0);
        }
    }

    public static final Object invoke$0(AqS99S0300000_10 aqS99S0300000_10) {
        OZ4.LIZ((Context) aqS99S0300000_10.l0, (View) aqS99S0300000_10.l1, (C62180Oam) aqS99S0300000_10.l2, true, false, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS99S0300000_10 aqS99S0300000_10) {
        O4I<O4B> o4i;
        Map map = (Map) ((C68322mC) aqS99S0300000_10.l1).element;
        AqS114S0300000_10 aqS114S0300000_10 = (AqS114S0300000_10) aqS99S0300000_10.l0;
        if (C61298O3y.LJII(map, (AbstractC40713FyP) aqS114S0300000_10.l1, (C61296O3w) aqS114S0300000_10.l2, (O4B) aqS99S0300000_10.l2, true) && (o4i = ((C61296O3w) ((AqS114S0300000_10) aqS99S0300000_10.l0).l2).LJFF) != null) {
            o4i.LIZ = true;
            O4A.LIZIZ(o4i, ((AbstractC40713FyP) ((AqS114S0300000_10) aqS99S0300000_10.l0).l1).LIZIZ);
        }
        AqS114S0300000_10 aqS114S0300000_102 = (AqS114S0300000_10) aqS99S0300000_10.l0;
        if (!((C61296O3w) aqS114S0300000_102.l2).LJII) {
            C61298O3y.LIZIZ.remove(((AbstractC40713FyP) aqS114S0300000_102.l1).toString());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS99S0300000_10 aqS99S0300000_10) {
        C59753Ncj LJIIZILJ;
        NR5 nr5 = (NR5) aqS99S0300000_10.l0;
        NRF data = (NRF) aqS99S0300000_10.l1;
        Context context = (Context) aqS99S0300000_10.l2;
        int i = nr5.LJIIIIZZ;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(context, "context");
        if (i == 0 && (LJIIZILJ = nr5.LJIIZILJ(data, context, null, C61878OQg.INSTANCE)) != null) {
            C38891fp.LJIIIIZZ(LJIIZILJ.LIZ);
            LJIIZILJ.LIZ.LJ.LIZIZ("firstQuartile");
        }
        AwemeRawAd awemeRawAd = data.LJIIIIZZ;
        if (awemeRawAd != null) {
            List<String> LIZJ = NNV.LIZJ(25, awemeRawAd);
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            new AqS192S0100000_10(awemeRawAd, 37);
            O8Y.LIZIZ("play_25", LIZJ, creativeId, logExtra);
            C58655N0h LIZLLL = C58704N2e.LIZLLL(nr5.LJIILL(), "first_quartile", awemeRawAd);
            LIZLLL.LIZIZ(Integer.valueOf(nr5.LJIIIIZZ + 1), "play_order");
            C77125UOr.LJIILL(LIZLLL, nr5.LJIILLIIL(), data);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS99S0300000_10 aqS99S0300000_10) {
        C59753Ncj LJIIZILJ;
        NR5 nr5 = (NR5) aqS99S0300000_10.l0;
        NRF data = (NRF) aqS99S0300000_10.l1;
        Context context = (Context) aqS99S0300000_10.l2;
        int i = nr5.LJIIIIZZ;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(context, "context");
        if (i == 0 && (LJIIZILJ = nr5.LJIIZILJ(data, context, null, C61878OQg.INSTANCE)) != null) {
            C38891fp.LJIIIIZZ(LJIIZILJ.LIZ);
            LJIIZILJ.LIZ.LJ.LIZIZ("midpoint");
        }
        AwemeRawAd awemeRawAd = data.LJIIIIZZ;
        if (awemeRawAd != null) {
            List<String> LIZJ = NNV.LIZJ(50, awemeRawAd);
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            new AqS192S0100000_10(awemeRawAd, 38);
            O8Y.LIZIZ("play_50", LIZJ, creativeId, logExtra);
            C58655N0h LIZLLL = C58704N2e.LIZLLL(nr5.LJIILL(), "midpoint", awemeRawAd);
            LIZLLL.LIZIZ(Integer.valueOf(nr5.LJIIIIZZ + 1), "play_order");
            C77125UOr.LJIILL(LIZLLL, nr5.LJIILLIIL(), data);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS99S0300000_10 aqS99S0300000_10) {
        C59753Ncj LJIIZILJ;
        NR5 nr5 = (NR5) aqS99S0300000_10.l0;
        NRF data = (NRF) aqS99S0300000_10.l1;
        Context context = (Context) aqS99S0300000_10.l2;
        int i = nr5.LJIIIIZZ;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(context, "context");
        if (i == 0 && (LJIIZILJ = nr5.LJIIZILJ(data, context, null, C61878OQg.INSTANCE)) != null) {
            C38891fp.LJIIIIZZ(LJIIZILJ.LIZ);
            LJIIZILJ.LIZ.LJ.LIZIZ("thirdQuartile");
        }
        AwemeRawAd awemeRawAd = data.LJIIIIZZ;
        if (awemeRawAd != null) {
            List<String> LIZJ = NNV.LIZJ(75, awemeRawAd);
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            new AqS192S0100000_10(awemeRawAd, 39);
            O8Y.LIZIZ("play_75", LIZJ, creativeId, logExtra);
            C58655N0h LIZLLL = C58704N2e.LIZLLL(nr5.LJIILL(), "third_quartile", awemeRawAd);
            LIZLLL.LIZIZ(Integer.valueOf(nr5.LJIIIIZZ + 1), "play_order");
            C77125UOr.LJIILL(LIZLLL, nr5.LJIILLIIL(), data);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea A[Catch: Exception -> 0x0125, TryCatch #1 {Exception -> 0x0125, blocks: (B:56:0x00df, B:58:0x00ea, B:60:0x00f2, B:62:0x00f8, B:64:0x0108, B:65:0x010c, B:67:0x0112), top: B:55:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AqS99S0300000_10 r5) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS99S0300000_10.invoke$13(kotlin.jvm.internal.AqS99S0300000_10):java.lang.Object");
    }

    public static final Object invoke$14(AqS99S0300000_10 aqS99S0300000_10) {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) ((NUT) aqS99S0300000_10.l0).LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            return new AqS99S0300000_10(adWebStatBusiness, (InterfaceC59440NUm) aqS99S0300000_10.l1, (F3T) aqS99S0300000_10.l2, 13);
        }
        return null;
    }

    public static final Object invoke$15(AqS99S0300000_10 aqS99S0300000_10) {
        String aid = ((C62876Om0) aqS99S0300000_10.l0).LIZIZ.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        ChooseReasonAPI.LIZIZ(aid, ((C62876Om0) aqS99S0300000_10.l0).LJIILIIL.LIZLLL(), ((C62876Om0) aqS99S0300000_10.l0).LJIIJJI.LIZJ());
        List<DislikeHashTag> LIZLLL = ((C62876Om0) aqS99S0300000_10.l0).LJIILIIL.LIZLLL();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZLLL, 10));
        Iterator<DislikeHashTag> it = LIZLLL.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        ChooseReasonAPI.LIZ(arrayList);
        ((TuxSheet) aqS99S0300000_10.l1).dismiss();
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS99S0300000_10.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS99S0300000_10 aqS99S0300000_10) {
        String aid = ((C62876Om0) aqS99S0300000_10.l0).LIZIZ.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        ChooseReasonAPI.LIZIZ(aid, ((C62876Om0) aqS99S0300000_10.l0).LJIILIIL.LIZLLL(), ((C62876Om0) aqS99S0300000_10.l0).LJIIJJI.LIZJ());
        List<DislikeHashTag> LIZLLL = ((C62876Om0) aqS99S0300000_10.l0).LJIILIIL.LIZLLL();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZLLL, 10));
        Iterator<DislikeHashTag> it = LIZLLL.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        ChooseReasonAPI.LIZ(arrayList);
        ((TuxSheet) aqS99S0300000_10.l1).dismiss();
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS99S0300000_10.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS99S0300000_10 aqS99S0300000_10) {
        ((O0F) aqS99S0300000_10.l0).setImageBitmap((Bitmap) aqS99S0300000_10.l1);
        ((CompletionBlock) aqS99S0300000_10.l2).onSuccess((XBaseResultModel) ED5.LIZJ(O0J.class, null), "");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS99S0300000_10 aqS99S0300000_10) {
        Object obj = aqS99S0300000_10.l1;
        if (obj != null) {
            return obj;
        }
        return ((OFJ) aqS99S0300000_10.l0).LJLJJI.invoke(aqS99S0300000_10.l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AqS99S0300000_10 aqS99S0300000_10) {
        Integer num;
        P1J p1j = (P1J) aqS99S0300000_10.l0;
        String str = p1j.LJLIL;
        User user = (User) aqS99S0300000_10.l1;
        String str2 = p1j.LJLJI;
        String str3 = p1j.LJLILLLLZI;
        String str4 = p1j.LJLJJI;
        P1K p1k = (P1K) ((AuthMaFPowerCell) aqS99S0300000_10.l2).getItem();
        if (p1k != null) {
            num = Integer.valueOf(p1k.LIZ());
        } else {
            num = null;
        }
        return new C57430MgM(str, user, str2, null, str3, str4, num, null, null, null, EnumC57366MfK.CARD.name(), null, null, null, null, null, null, 0, 0, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -1144, 511);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS99S0300000_10 aqS99S0300000_10) {
        aqS99S0300000_10.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS99S0300000_10 aqS99S0300000_10) {
        boolean z = !C79165V5d.LIZIZ((InterfaceC35811ar) aqS99S0300000_10.l2).booleanValue();
        Boolean nonPersonalized = C79165V5d.LIZIZ((InterfaceC35811ar) aqS99S0300000_10.l2);
        o.LJIIIIZZ(nonPersonalized, "nonPersonalized");
        boolean booleanValue = nonPersonalized.booleanValue();
        ((InterfaceC88472Yns) aqS99S0300000_10.l0).invoke(Boolean.valueOf(booleanValue));
        if (C62889OmD.LIZLLL(z)) {
            ((InterfaceC88472Yns) aqS99S0300000_10.l1).invoke(Boolean.valueOf(booleanValue));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS99S0300000_10 aqS99S0300000_10) {
        C60079Nhz c60079Nhz = (C60079Nhz) aqS99S0300000_10.l0;
        C188727au c188727au = (C188727au) aqS99S0300000_10.l1;
        Integer num = (Integer) aqS99S0300000_10.l2;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long nanoTime = System.nanoTime();
        C60079Nhz c60079Nhz2 = (C60079Nhz) aqS99S0300000_10.l0;
        c60079Nhz.LJJJJJL(c188727au, num, timeUnit.toMillis((nanoTime - c60079Nhz2.LJLJLLL) - c60079Nhz2.LJLL));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS99S0300000_10 aqS99S0300000_10) {
        ((AbstractC62515OgB) aqS99S0300000_10.l0).LIZ((InterfaceC62225ObV) aqS99S0300000_10.l1, (View) aqS99S0300000_10.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS99S0300000_10 aqS99S0300000_10) {
        NWF nwf = (NWF) aqS99S0300000_10.l0;
        return Boolean.valueOf(nwf.post(new ARunnableS21S0300000_10(nwf, (NOJ) aqS99S0300000_10.l1, (AbsAdPopUpWebPageAssem) aqS99S0300000_10.l2, 11)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AqS99S0300000_10 aqS99S0300000_10) {
        aqS99S0300000_10.invoke$1();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS99S0300000_10 aqS99S0300000_10) {
        Context context = (Context) aqS99S0300000_10.l0;
        String url = ((RecReasonsStruct) aqS99S0300000_10.l1).getUrl();
        if (url == null) {
            url = "";
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS99S0300000_10.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C59895Nf1.LIZLLL(context, "//webview", "url", url);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0300000_10(ActivityC45651qj activityC45651qj, RecReasonsStruct recReasonsStruct, AqS157S0200000_10 aqS157S0200000_10, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = recReasonsStruct;
        this.l2 = aqS157S0200000_10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0300000_10(NR5 nr5, NRF nrf, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = nr5;
        this.l1 = nrf;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0300000_10(NUT nut, InterfaceC59440NUm interfaceC59440NUm, F3T f3t, int i) {
        super(0);
        this.$t = i;
        this.l0 = nut;
        this.l1 = interfaceC59440NUm;
        this.l2 = f3t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS99S0300000_10(NWF nwf, NWF nwf2, NOJ noj, AbsAdPopUpWebPageAssem<C3C8> absAdPopUpWebPageAssem) {
        super(0);
        this.$t = absAdPopUpWebPageAssem;
        this.l0 = nwf;
        this.l1 = nwf2;
        this.l2 = noj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0300000_10(C60079Nhz c60079Nhz, C188727au c188727au, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = c60079Nhz;
        this.l1 = c188727au;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS99S0300000_10(O0F o0f, O0F o0f2, Bitmap bitmap, CompletionBlock<O0J> completionBlock) {
        super(0);
        this.$t = completionBlock;
        this.l0 = o0f;
        this.l1 = o0f2;
        this.l2 = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0300000_10(OFJ ofj, Object obj, Object obj2, int i) {
        super(0);
        this.$t = i;
        this.l0 = ofj;
        this.l1 = obj;
        this.l2 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS99S0300000_10(OP1 op1, OP1 op12, Context context, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        super(0);
        this.$t = interfaceC88472Yns;
        this.l0 = op1;
        this.l1 = op12;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0300000_10(AbstractC62515OgB abstractC62515OgB, InterfaceC62225ObV interfaceC62225ObV, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC62515OgB;
        this.l1 = interfaceC62225ObV;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0300000_10(C62876Om0 c62876Om0, TuxSheet tuxSheet, AqS160S0100000_10 aqS160S0100000_10, int i) {
        super(0);
        this.$t = i;
        this.l0 = c62876Om0;
        this.l1 = tuxSheet;
        this.l2 = aqS160S0100000_10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS99S0300000_10(P1J p1j, P1J p1j2, User user, AuthMaFPowerCell<T> authMaFPowerCell) {
        super(0);
        this.$t = authMaFPowerCell;
        this.l0 = p1j;
        this.l1 = p1j2;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS99S0300000_10(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns3, InterfaceC35811ar<Boolean> interfaceC35811ar) {
        super(0);
        this.$t = interfaceC35811ar;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = interfaceC88472Yns3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0300000_10(Context context, View view, C62180Oam c62180Oam, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = view;
        this.l2 = c62180Oam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0300000_10(AdWebStatBusiness adWebStatBusiness, InterfaceC59440NUm interfaceC59440NUm, F3T f3t, int i) {
        super(0);
        this.$t = i;
        this.l0 = adWebStatBusiness;
        this.l1 = interfaceC59440NUm;
        this.l2 = f3t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS99S0300000_10(NetworkStandardUIServiceImpl networkStandardUIServiceImpl, NetworkStandardUIServiceImpl networkStandardUIServiceImpl2, C73305Spp c73305Spp, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l2 = networkStandardUIServiceImpl;
        this.l1 = networkStandardUIServiceImpl2;
        this.l0 = c73305Spp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0300000_10(AqS114S0300000_10 aqS114S0300000_10, C68322mC c68322mC, O4B o4b, int i) {
        super(0);
        this.$t = i;
        this.l0 = aqS114S0300000_10;
        this.l1 = c68322mC;
        this.l2 = o4b;
    }
}
