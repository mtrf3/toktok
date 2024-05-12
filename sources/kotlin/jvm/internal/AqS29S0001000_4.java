package kotlin.jvm.internal;

import X.A37;
import X.A3V;
import X.AD3;
import X.AbstractC65781Prl;
import X.C239829b8;
import X.C25615A3n;
import X.C43I;
import X.C72922tc;
import X.C76800UCe;
import X.C82B;
import X.C98Q;
import X.C99Z;
import X.C9S3;
import X.InterfaceC88472Yns;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailState;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AqS29S0001000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0001000_4(int i) {
        super(1);
        this.$t = i;
        this.i0 = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0001000_4(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        AddressEditState setState = (AddressEditState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AddressEditState.copy$default(setState, aqS29S0001000_4.i0, null, null, null, null, false, null, null, null, null, null, null, false, 8190, null);
    }

    public static final Object invoke$1(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        AddressListState setState = (AddressListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AddressListState.copy$default(setState, aqS29S0001000_4.i0, null, null, null, null, 30, null);
    }

    public static final Object invoke$10(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        boolean z;
        AD3 it = (AD3) obj;
        o.LJIIIZ(it, "it");
        if (aqS29S0001000_4.i0 == 0) {
            z = true;
        } else {
            z = false;
        }
        return AD3.LJIILJJIL(it, null, z, null, false, false, 130815);
    }

    public static final Object invoke$11(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        ProfileState setState = (ProfileState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ProfileState.copy$default(setState, null, null, null, null, null, 0, aqS29S0001000_4.i0, false, null, null, null, false, null, null, null, null, null, null, false, null, false, false, null, false, null, null, null, null, null, null, null, null, null, -65, 1, null);
    }

    public static final Object invoke$12(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        ProfileState setState = (ProfileState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ProfileState.copy$default(setState, null, null, null, null, null, 0, 0, false, null, null, null, false, null, null, null, null, null, null, false, null, false, false, Integer.valueOf(aqS29S0001000_4.i0), false, null, null, null, null, null, null, null, null, null, -4194305, 1, null);
    }

    public static final Object invoke$13(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("has_blocked_account", aqS29S0001000_4.i0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        int i;
        C98Q setState = (C98Q) obj;
        o.LJIIIZ(setState, "$this$setState");
        Integer valueOf = Integer.valueOf(aqS29S0001000_4.i0);
        int intValue = valueOf.intValue();
        if (intValue == 3 || intValue == -1) {
            i = setState.LJLJI;
        } else {
            valueOf.intValue();
            i = 2;
        }
        return C98Q.LIZ(setState, false, aqS29S0001000_4.i0, i, false, new C72922tc(), null, null, null, false, false, 1001);
    }

    public static final Object invoke$15(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        FollowRelationState setState = (FollowRelationState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FollowRelationState.copy$default(setState, 0, aqS29S0001000_4.i0, 0, false, null, false, false, 125, null);
    }

    public static final Object invoke$16(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        OrderSubmitState setState = (OrderSubmitState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return OrderSubmitState.copy$default(setState, 0, null, null, false, null, null, false, false, null, null, null, 0, null, aqS29S0001000_4.i0, 0, null, null, false, false, false, null, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, false, -8193, 67108863, null);
    }

    public static final Object invoke$17(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        OrderSubmitState setState = (OrderSubmitState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return OrderSubmitState.copy$default(setState, 0, null, null, false, null, null, false, false, null, null, null, 0, null, 0, aqS29S0001000_4.i0, null, null, false, false, false, null, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, false, -16385, 67108863, null);
    }

    public static final Object invoke$18(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        Window setWindowParams = (Window) obj;
        o.LJIIIZ(setWindowParams, "$this$setWindowParams");
        setWindowParams.getAttributes().height = aqS29S0001000_4.i0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        Window setWindowParams = (Window) obj;
        o.LJIIIZ(setWindowParams, "$this$setWindowParams");
        setWindowParams.getAttributes().height = aqS29S0001000_4.i0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("rank", Integer.valueOf(aqS29S0001000_4.i0 + 1));
        logView.plusAssign("option_name", "zipcode");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        CustomDialogFragment add = (CustomDialogFragment) obj;
        o.LJIIIZ(add, "$this$add");
        add.vl(new AqS29S0001000_4(aqS29S0001000_4.i0, 19));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        Window setWindowParams = (Window) obj;
        o.LJIIIZ(setWindowParams, "$this$setWindowParams");
        setWindowParams.getAttributes().height = aqS29S0001000_4.i0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        DistrictPickerState setState = (DistrictPickerState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return DistrictPickerState.copy$default(setState, null, null, null, null, aqS29S0001000_4.i0, 15, null);
    }

    public static final Object invoke$23(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        C82B setState = (C82B) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82B.LIZ(setState, null, null, null, null, null, new C43I(Integer.valueOf(aqS29S0001000_4.i0)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217695);
    }

    public static final Object invoke$24(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        AddressEditDetailState setState = (AddressEditDetailState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AddressEditDetailState.copy$default(setState, aqS29S0001000_4.i0, null, null, false, null, 30, null);
    }

    public static final Object invoke$25(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        C239829b8 setState = (C239829b8) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C239829b8.LIZ(setState, false, null, null, null, new C43I(Integer.valueOf(aqS29S0001000_4.i0)), null, 47);
    }

    public static final Object invoke$26(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        C239829b8 setState = (C239829b8) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C239829b8.LIZ(setState, false, null, null, null, new C43I(Integer.valueOf(aqS29S0001000_4.i0)), null, 47);
    }

    public static final Object invoke$27(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        DeliveryPanelState setState = (DeliveryPanelState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return DeliveryPanelState.copy$default(setState, null, false, null, null, null, aqS29S0001000_4.i0, null, null, null, null, null, null, null, null, 16351, null);
    }

    public static final Object invoke$3(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        OrderSubmitState setState = (OrderSubmitState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return OrderSubmitState.copy$default(setState, aqS29S0001000_4.i0, null, null, false, null, null, false, false, null, null, null, 0, null, 0, 0, null, null, false, false, false, null, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, false, -2, 67108863, null);
    }

    public static final Object invoke$4(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        C82B setState = (C82B) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82B.LIZ(setState, null, null, new C43I(Integer.valueOf(aqS29S0001000_4.i0)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217723);
    }

    public static final Object invoke$5(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        C9S3 setState = (C9S3) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C9S3.LIZ(setState, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, aqS29S0001000_4.i0, null, false, 0, null, null, null, null, null, null, null, null, 8189);
    }

    public static final Object invoke$6(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        C9S3 setState = (C9S3) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C9S3.LIZ(setState, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0, null, false, aqS29S0001000_4.i0, null, null, null, null, null, null, null, null, 8175);
    }

    public static final Object invoke$7(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        A3V setState = (A3V) obj;
        o.LJIIIZ(setState, "$this$setState");
        return A3V.LIZ(setState, new C25615A3n(true, false, false, aqS29S0001000_4.i0), null, null, null, null, 30);
    }

    public static final Object invoke$8(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        if (obj != null) {
            return new C99Z(new C43I(Integer.valueOf(aqS29S0001000_4.i0)));
        }
        return null;
    }

    public static final Object invoke$9(AqS29S0001000_4 aqS29S0001000_4, Object obj) {
        A37 setState = (A37) obj;
        o.LJIIIZ(setState, "$this$setState");
        return A37.LIZ(setState, null, null, null, null, false, true, aqS29S0001000_4.i0, null, 159);
    }
}
