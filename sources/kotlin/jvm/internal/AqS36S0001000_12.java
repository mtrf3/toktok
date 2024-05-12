package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC70686Rog;
import X.C2068389v;
import X.C212518Vr;
import X.C26092ALw;
import X.C43I;
import X.C65352Pkq;
import X.C69947Rcl;
import X.C70677RoX;
import X.C76800UCe;
import X.C8V5;
import X.E33;
import X.InterfaceC88472Yns;
import X.SIN;
import X.SSU;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.assem.FeedSkylightBubbleAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState;
import java.util.HashMap;

/* loaded from: classes13.dex */
public class AqS36S0001000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS36S0001000_12(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        PdpMainState setState = (PdpMainState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return PdpMainState.copy$default(setState, false, null, null, false, 0, null, null, 0.0f, aqS36S0001000_12.i0, null, 0, false, null, null, null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, -257, null);
    }

    public static final Object invoke$1(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        PdpMainState setStateImmediate = (PdpMainState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return PdpMainState.copy$default(setStateImmediate, false, null, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, null, null, aqS36S0001000_12.i0, null, false, null, null, null, null, null, null, null, null, null, null, -524289, null);
    }

    public static final Object invoke$10(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        FollowingRelationState setState = (FollowingRelationState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FollowingRelationState.copy$default(setState, null, null, false, null, null, false, 0, null, null, null, null, null, aqS36S0001000_12.i0, 4095, null);
    }

    public static final Object invoke$11(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        SkuState setState = (SkuState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return SkuState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, aqS36S0001000_12.i0, null, null, false, null, null, null, false, null, null, null, false, null, null, null, null, 2147450879, null);
    }

    public static final Object invoke$12(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        C69947Rcl setState = (C69947Rcl) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C69947Rcl.L(setState, false, aqS36S0001000_12.i0, 0, false, 0.0f, false, 125);
    }

    public static final Object invoke$13(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("drop_down_list_name", "CPF");
        logView.plusAssign("action_type", "show");
        logView.plusAssign("item_num", Integer.valueOf(aqS36S0001000_12.i0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        ProductReviewState setState = (ProductReviewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        ListState substate = setState.getSubstate();
        C26092ALw c26092ALw = C26092ALw.LIZ;
        return ProductReviewState.copy$default(setState, 0, null, null, null, ListState.copy$default(substate, null, null, c26092ALw, c26092ALw, null, 19, null), null, null, null, null, 0, Integer.valueOf(aqS36S0001000_12.i0), null, null, null, null, null, null, null, null, 523247, null);
    }

    public static final Object invoke$15(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        AbstractC70686Rog modifyFirst = (AbstractC70686Rog) obj;
        o.LJIIIZ(modifyFirst, "$this$modifyFirst");
        C70677RoX c70677RoX = (C70677RoX) modifyFirst;
        int i = aqS36S0001000_12.i0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return modifyFirst;
                    }
                    return C70677RoX.LIZ(c70677RoX, c70677RoX.LIZ, false, false, false, true, 894);
                }
                return C70677RoX.LIZ(c70677RoX, c70677RoX.LIZ, false, false, true, false, 958);
            }
            return C70677RoX.LIZ(c70677RoX, c70677RoX.LIZ, false, true, false, false, 990);
        }
        return C70677RoX.LIZ(c70677RoX, c70677RoX.LIZ, true, false, false, false, 1006);
    }

    public static final Object invoke$16(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        ReviewGalleryState setState = (ReviewGalleryState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ReviewGalleryState.copy$default(setState, null, null, null, null, null, null, 0, null, false, 0, 0, aqS36S0001000_12.i0, null, null, false, null, null, 129023, null);
    }

    public static final Object invoke$17(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        NaviAvatarListViewState setState = (NaviAvatarListViewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return NaviAvatarListViewState.copy$default(setState, null, 0, 0, null, Integer.valueOf(aqS36S0001000_12.i0), false, 39, null);
    }

    public static final Object invoke$2(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        C2068389v tuxIcon = (C2068389v) obj;
        o.LJIIIZ(tuxIcon, "$this$tuxIcon");
        tuxIcon.LIZ = aqS36S0001000_12.i0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        PdpMainState setState = (PdpMainState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return PdpMainState.copy$default(setState, false, null, null, false, aqS36S0001000_12.i0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, -17, null);
    }

    public static final Object invoke$4(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        C69947Rcl setState = (C69947Rcl) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C69947Rcl.L(setState, false, 0, aqS36S0001000_12.i0, false, 0.0f, false, 123);
    }

    public static final Object invoke$5(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        HashMap logWhenShow = (HashMap) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.put("rank", Integer.valueOf(aqS36S0001000_12.i0 + 1));
        logWhenShow.put("module_name", "head_pic");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        SIN setState = (SIN) obj;
        o.LJIIIZ(setState, "$this$setState");
        return SIN.LIZ(setState, null, null, null, null, null, null, null, new C43I(new E33(SSU.DOWNLOADING, aqS36S0001000_12.i0, 4)), null, 895);
    }

    public static final Object invoke$7(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        C8V5 uiSlotAssem = (C8V5) obj;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LJI = aqS36S0001000_12.i0;
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZLLL;
        uiSlotAssem.LIZ = C65352Pkq.LIZ(FeedSkylightBubbleAssem.class);
        uiSlotAssem.LJIIIZ = new FeedSkylightBubbleAssem();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        ProfileNaviEditorState setStateImmediate = (ProfileNaviEditorState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviEditorState.copy$default(setStateImmediate, null, aqS36S0001000_12.i0, null, null, null, null, null, false, false, false, false, false, false, false, 0, 32765, null);
    }

    public static final Object invoke$9(AqS36S0001000_12 aqS36S0001000_12, Object obj) {
        ProfileNaviOnboardingState setState = (ProfileNaviOnboardingState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ProfileNaviOnboardingState.copy$default(setState, null, null, Integer.valueOf(aqS36S0001000_12.i0), null, false, false, false, 123, null);
    }
}
