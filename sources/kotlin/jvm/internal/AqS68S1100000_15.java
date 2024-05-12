package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C25848ACm;
import X.C2VP;
import X.C45927I0t;
import X.C73969T1h;
import X.C76800UCe;
import X.C85114Xao;
import X.C85116Xaq;
import X.C85144XbI;
import X.C85507Xh9;
import X.C85509XhB;
import X.C85799Xlr;
import X.C85800Xls;
import X.C85938Xo6;
import X.DialogC86015XpL;
import X.EnumC85506Xh8;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.QQN;
import X.R9U;
import X.T16;
import X.V1B;
import X.WM7;
import X.YH2;
import Y.AfS61S0100000_9;
import Y.AfS67S0100000_15;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditApi;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewState;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.ug.amplify.api.AmplifyApi;
import com.zhiliaoapp.musically.R;
import java.io.File;

/* loaded from: classes16.dex */
public class AqS68S1100000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS68S1100000_15 aqS68S1100000_15, Object obj) {
        C85114Xao verifiedWay = (C85114Xao) obj;
        o.LJIIIZ(verifiedWay, "verifiedWay");
        ((TwoStepVerificationManageActivity) aqS68S1100000_15.l1).LLILLJJLI(aqS68S1100000_15.s0, verifiedWay.LIZ, C85144XbI.LJI(verifiedWay.LIZIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS68S1100000_15 aqS68S1100000_15, Object obj) {
        C85114Xao verifiedWay = (C85114Xao) obj;
        o.LJIIIZ(verifiedWay, "verifiedWay");
        ((TwoStepVerificationManageActivity) aqS68S1100000_15.l1).LLJILLL(aqS68S1100000_15.s0, verifiedWay.LIZ, C85144XbI.LJI(verifiedWay.LIZIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS68S1100000_15 aqS68S1100000_15, Object obj) {
        AmplifyApi doAction = (AmplifyApi) obj;
        o.LJIIIZ(doAction, "$this$doAction");
        DialogC86015XpL dialogC86015XpL = (DialogC86015XpL) aqS68S1100000_15.l1;
        String str = aqS68S1100000_15.s0;
        dialogC86015XpL.getClass();
        if (o.LJ(str, "/aweme/v2/ug/ugc/permission/item/perm/submit")) {
            return doAction.confirmAction(aqS68S1100000_15.s0, "select_period_all");
        }
        return doAction.confirmAction(aqS68S1100000_15.s0, null);
    }

    public static final Object invoke$11(AqS68S1100000_15 aqS68S1100000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C85800Xls.LIZJ(((C85799Xlr) aqS68S1100000_15.l1).LJFF(), 0, null, 0, aqS68S1100000_15.s0, false, 959);
    }

    public static final Object invoke$12(AqS68S1100000_15 aqS68S1100000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C85800Xls.LIZJ(((C85799Xlr) aqS68S1100000_15.l1).LJFF(), 0, aqS68S1100000_15.s0, 0, null, false, 1007);
    }

    public static final Object invoke$2(AqS68S1100000_15 aqS68S1100000_15, Object it) {
        TwoStepVerificationManageActivity twoStepVerificationManageActivity;
        o.LJIIIZ(it, "it");
        String str = aqS68S1100000_15.s0;
        String enterFrom = ((TwoStepVerificationDetailFragment) aqS68S1100000_15.l1).getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LIZIZ(str, enterFrom);
        String enterFrom2 = ((TwoStepVerificationDetailFragment) aqS68S1100000_15.l1).getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        C85144XbI.LJIL(enterFrom2);
        ActivityC45651qj mo49getActivity = ((TwoStepVerificationDetailFragment) aqS68S1100000_15.l1).mo49getActivity();
        if ((mo49getActivity instanceof TwoStepVerificationManageActivity) && (twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) mo49getActivity) != null) {
            V1B.LJLJJL(twoStepVerificationManageActivity.LLIIIJ());
            QQN qqn = new QQN();
            qqn.LIZ = "/passport/shark/safe_verify/verification_manage/";
            qqn.LIZJ(WM7.SCENE_SERVICE, "two_step_manage");
            new R9U(twoStepVerificationManageActivity, qqn.LIZIZ(), new C85116Xaq(twoStepVerificationManageActivity)).LJIIIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS68S1100000_15 aqS68S1100000_15, Object obj) {
        ((Boolean) obj).booleanValue();
        if (o.LJ(aqS68S1100000_15.s0, "break")) {
            YH2 yh2 = (YH2) aqS68S1100000_15.l1;
            yh2.LJII.LIZ();
            yh2.LJ.clear();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS68S1100000_15 aqS68S1100000_15, Object it) {
        boolean z;
        o.LJIIIZ(it, "it");
        C85507Xh9 LLIIIJ = ((CreatorCaptionEditActivity) aqS68S1100000_15.l1).LLIIIJ();
        EnumC85506Xh8 enumC85506Xh8 = EnumC85506Xh8.TRASH;
        if (((Boolean) ((CreatorCaptionEditActivity) aqS68S1100000_15.l1).LLII().LJLJI.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        LLIIIJ.LIZJ(enumC85506Xh8, true, z);
        CreatorCaptionEditViewModel LLII = ((CreatorCaptionEditActivity) aqS68S1100000_15.l1).LLII();
        String awemeId = aqS68S1100000_15.s0;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15((CreatorCaptionEditActivity) aqS68S1100000_15.l1, 256);
        AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9((CreatorCaptionEditActivity) aqS68S1100000_15.l1, 28);
        LLII.getClass();
        o.LJIIIZ(awemeId, "awemeId");
        CreatorCaptionEditApi.LIZ.getClass();
        C85509XhB.LIZ().toggleAutoCaptionSetting(awemeId, false).LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS67S0100000_15(aqS165S0100000_15, 74), new AfS61S0100000_9(aqS175S0100000_9, 48));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS68S1100000_15 aqS68S1100000_15, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.fij, new AqS68S1100000_15((CreatorCaptionEditActivity) aqS68S1100000_15.l1, aqS68S1100000_15.s0, 4));
        actionGroup.LJIIIIZZ(R.string.fii, new AqS181S0100000_15((CreatorCaptionEditActivity) aqS68S1100000_15.l1, 49));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS68S1100000_15 aqS68S1100000_15, Object obj) {
        EditTextStickerViewState setState = (EditTextStickerViewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EditTextStickerViewState.copy$default(setState, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C45927I0t(new OSZ((TextStickerData) aqS68S1100000_15.l1, aqS68S1100000_15.s0)), null, null, null, null, null, null, null, null, null, null, null, null, -33554433, 63, null);
    }

    public static final Object invoke$7(AqS68S1100000_15 aqS68S1100000_15, Object obj) {
        File file = (File) obj;
        if (file != null) {
            C2VP.LIZIZ(new AqS68S1200000_15((FullEpisodeDetailFragment) aqS68S1100000_15.l1, aqS68S1100000_15.s0, file, 1));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS68S1100000_15 aqS68S1100000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C25848ACm.LJIILJJIL(((C85938Xo6) aqS68S1100000_15.l1).LJFF(), false, aqS68S1100000_15.s0, null, false, null, null, null, false, false, false, 65533);
    }

    public static final Object invoke$9(AqS68S1100000_15 aqS68S1100000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C25848ACm.LJIILJJIL(((C85938Xo6) aqS68S1100000_15.l1).LJFF(), false, null, null, false, null, null, aqS68S1100000_15.s0, false, false, false, 64511);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1100000_15(C85799Xlr c85799Xlr, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c85799Xlr;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1100000_15(C85938Xo6 c85938Xo6, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c85938Xo6;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1100000_15(DialogC86015XpL dialogC86015XpL, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = dialogC86015XpL;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1100000_15(TwoStepVerificationDetailFragment twoStepVerificationDetailFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = twoStepVerificationDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1100000_15(TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = twoStepVerificationManageActivity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1100000_15(FullEpisodeDetailFragment fullEpisodeDetailFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = fullEpisodeDetailFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1100000_15(CreatorCaptionEditActivity creatorCaptionEditActivity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = creatorCaptionEditActivity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1100000_15(TextStickerData textStickerData, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = textStickerData;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1100000_15(String str, YH2 yh2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = yh2;
    }
}
