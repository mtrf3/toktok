package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C133765Mu;
import X.C150575vZ;
import X.C44716Hgm;
import X.C44880HjQ;
import X.C45054HmE;
import X.C5MG;
import X.C63A;
import X.C72037SOz;
import X.C76800UCe;
import X.G9B;
import X.GUX;
import X.H9C;
import X.HJJ;
import X.InterfaceC81454Vxy;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes8.dex */
public class AqS95S0101000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        C5MG WS;
        o.LJIIIZ(it, "it");
        ((C45054HmE) aqS95S0101000_7.l0).LLIIIL();
        ((C45054HmE) aqS95S0101000_7.l0).LLLZZ();
        if (aqS95S0101000_7.i1 < 0) {
            Map<OSZ<Integer, C63A>, C44716Hgm> map = ((C45054HmE) aqS95S0101000_7.l0).LLILII;
            C63A c63a = C63A.SOUND_SYNC;
            C44716Hgm c44716Hgm = map.get(new OSZ(0, c63a));
            ((C45054HmE) aqS95S0101000_7.l0).LLILII.clear();
            ((C45054HmE) aqS95S0101000_7.l0).LLILIL.clear();
            ((C45054HmE) aqS95S0101000_7.l0).LLILII.put(new OSZ<>(0, c63a), c44716Hgm);
        }
        MvCreateVideoData mvCreateVideoData = ((C45054HmE) aqS95S0101000_7.l0).LLJLIL().mvCreateVideoData;
        if (mvCreateVideoData != null && (WS = ((C45054HmE) aqS95S0101000_7.l0).Ll0().WS()) != null) {
            ((C133765Mu) WS.LJJ()).LJIIIZ(mvCreateVideoData.resDestWidth, mvCreateVideoData.resDestHeight, mvCreateVideoData.resFillMode);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.e27, new AqS95S0101000_7((C45054HmE) aqS95S0101000_7.l0, aqS95S0101000_7.i1, 0));
        actionGroup.LJIIIIZZ(R.string.e26, C44880HjQ.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((C72037SOz) aqS95S0101000_7.l0).LLIIL(aqS95S0101000_7.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.rua, new AqS95S0101000_7((C72037SOz) aqS95S0101000_7.l0, aqS95S0101000_7.i1, 10));
        actionGroup.LJIIIIZZ(R.string.ruc, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((C72037SOz) aqS95S0101000_7.l0).LLIIL(aqS95S0101000_7.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.rud, new AqS95S0101000_7((C72037SOz) aqS95S0101000_7.l0, aqS95S0101000_7.i1, 12));
        actionGroup.LJIIIIZZ(R.string.ruc, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((C72037SOz) aqS95S0101000_7.l0).LLIIL(aqS95S0101000_7.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.rud, new AqS95S0101000_7((C72037SOz) aqS95S0101000_7.l0, aqS95S0101000_7.i1, 14));
        actionGroup.LJIIIIZZ(R.string.ruc, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        GUX invokeCallback = (GUX) obj;
        o.LJIIIZ(invokeCallback, "$this$invokeCallback");
        invokeCallback.onProgress(aqS95S0101000_7.i1, aqS95S0101000_7.l0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((String[]) aqS95S0101000_7.l0)[aqS95S0101000_7.i1] = it;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$18(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((String[]) aqS95S0101000_7.l0)[aqS95S0101000_7.i1] = it;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$19(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((String[]) aqS95S0101000_7.l0)[aqS95S0101000_7.i1] = it;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        EditAdjustClipsBottomViewState setStateImmediate = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return EditAdjustClipsBottomViewState.copy$default(setStateImmediate, 0, 0, 0, 0, null, null, null, null, null, null, new C150575vZ(new OSZ(Integer.valueOf(aqS95S0101000_7.i1), (VideoSegment) aqS95S0101000_7.l0)), null, null, null, null, null, null, 130047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$20(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((String[]) aqS95S0101000_7.l0)[aqS95S0101000_7.i1] = it;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((InterfaceC81454Vxy) aqS95S0101000_7.l0).C("cancel", aqS95S0101000_7.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        Long l;
        o.LJIIIZ(it, "it");
        H9C h9c = new H9C();
        AwemeCommerceStruct commerceVideoAuthInfo = ((HJJ) aqS95S0101000_7.l0).LJLIL.getAweme().getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null) {
            l = Long.valueOf(commerceVideoAuthInfo.getMissionId());
        } else {
            l = null;
        }
        h9c.LJIILIIL(8, l);
        ((HJJ) aqS95S0101000_7.l0).LJLIL.LJIILJJIL(aqS95S0101000_7.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.ce7, new AqS95S0101000_7((HJJ) aqS95S0101000_7.l0, aqS95S0101000_7.i1, 22));
        actionGroup.LJIIIIZZ(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        EditAdjustClipsBottomViewState setStateImmediate = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return EditAdjustClipsBottomViewState.copy$default(setStateImmediate, 0, 0, 0, 0, null, null, null, null, null, null, null, new C150575vZ(new OSZ(Integer.valueOf(aqS95S0101000_7.i1), (VideoSegment) aqS95S0101000_7.l0)), null, null, null, null, null, 129023, null);
    }

    public static final Object invoke$4(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((G9B) aqS95S0101000_7.l0).LIZJ.setValue(new C150575vZ<>(new OSZ(Integer.valueOf(aqS95S0101000_7.i1), Boolean.TRUE)));
        ((G9B) aqS95S0101000_7.l0).LJI = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.dsg, new AqS95S0101000_7((G9B) aqS95S0101000_7.l0, aqS95S0101000_7.i1, 4));
        actionGroup.LJIIIIZZ(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.dsg, new AqS95S0101000_7((C72037SOz) aqS95S0101000_7.l0, aqS95S0101000_7.i1, 7));
        actionGroup.LJIIIIZZ(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((C72037SOz) aqS95S0101000_7.l0).LLIIL(aqS95S0101000_7.i1);
        ((C72037SOz) aqS95S0101000_7.l0).LJLLLLLL = "";
        IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).updateFeedEvent();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS95S0101000_7 aqS95S0101000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((C72037SOz) aqS95S0101000_7.l0).LLIIL(aqS95S0101000_7.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS95S0101000_7 aqS95S0101000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.rud, new AqS95S0101000_7((C72037SOz) aqS95S0101000_7.l0, aqS95S0101000_7.i1, 8));
        actionGroup.LJIIIIZZ(R.string.ruc, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS95S0101000_7(int i, VideoSegment videoSegment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = videoSegment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS95S0101000_7(int i, Object obj, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS95S0101000_7(int i, String[] strArr, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = strArr;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS95S0101000_7(G9B g9b, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = g9b;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS95S0101000_7(HJJ hjj, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = hjj;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS95S0101000_7(C45054HmE c45054HmE, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c45054HmE;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS95S0101000_7(C72037SOz c72037SOz, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c72037SOz;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS95S0101000_7(InterfaceC81454Vxy interfaceC81454Vxy, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC81454Vxy;
        this.i1 = i;
    }
}
