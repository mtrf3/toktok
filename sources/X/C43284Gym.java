package X;

import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Gym, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43284Gym implements InterfaceC72852SiW {
    public final ShortVideoContext LIZ;

    public C43284Gym(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    @Override // X.InterfaceC72852SiW
    public final void LIZ(String effectId) {
        o.LJIIIZ(effectId, "effectId");
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("prop_id", effectId);
        String str = this.LIZ.shootWay;
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("shoot_way", str);
        oszArr[2] = new OSZ("carrier_type", "prop_panel");
        C78880UxY.LJJLIIIJL("click_transform_link", C113554cx.LJJJLZIJ(oszArr));
    }

    @Override // X.InterfaceC72852SiW
    public final void LIZIZ(String str) {
        C78880UxY.LJJLIIIJL("show_toast", C113554cx.LJJJLZIJ(new OSZ("toast_type", "prop"), new OSZ("prop_id", str), new OSZ("enter_from", "video_shoot_page")));
    }

    @Override // X.InterfaceC72852SiW
    public final void LIZJ(String effectId) {
        o.LJIIIZ(effectId, "effectId");
        CommerceToolsModel commerceToolsModel = this.LIZ.creativeModel.commerceModel;
        if (commerceToolsModel.isShowedCommerceTransformButton()) {
            commerceToolsModel.setShowedCommerceTransformButton(false);
            return;
        }
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("prop_id", effectId);
        String str = this.LIZ.shootWay;
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("shoot_way", str);
        oszArr[2] = new OSZ("carrier_type", "prop_panel");
        C78880UxY.LJJLIIIJL("show_transform_link", C113554cx.LJJJLZIJ(oszArr));
        commerceToolsModel.setShowedCommerceTransformButton(true);
        commerceToolsModel.setShowedCommerceTransformBottomButton(true);
    }
}
