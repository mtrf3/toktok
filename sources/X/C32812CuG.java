package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.postrechargeretention.PostRechargeRetentionViewModel;

/* renamed from: X.CuG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C32812CuG extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public C32812CuG(PostRechargeRetentionViewModel postRechargeRetentionViewModel) {
        super(1, postRechargeRetentionViewModel, PostRechargeRetentionViewModel.class, "onGiftPanelDismiss", "onGiftPanelDismiss(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        Gift gift;
        boolean booleanValue = bool.booleanValue();
        PostRechargeRetentionViewModel postRechargeRetentionViewModel = (PostRechargeRetentionViewModel) this.receiver;
        if (postRechargeRetentionViewModel.LJLILLLLZI == 2 && !booleanValue && (gift = postRechargeRetentionViewModel.LJLJJL) != null && postRechargeRetentionViewModel.LJLL + 0 >= gift.diamondCount && gift.id == postRechargeRetentionViewModel.LJLJL && postRechargeRetentionViewModel.LJLJLJ && UXR.LIZ() > postRechargeRetentionViewModel.LL.getLong("popup_cooldown_end", 0L)) {
            postRechargeRetentionViewModel.iv0();
            C76854UEg gv0 = postRechargeRetentionViewModel.gv0();
            BZI LIZ = C28787BRn.LIZ("livesdk_recharge_gift_retain_popup_show");
            LIZ.LJIIZILJ();
            C76855UEh.LIZ(LIZ, gv0);
            LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
            LIZ.LJJIIJZLJL();
        }
        postRechargeRetentionViewModel.LJLJJI = false;
        postRechargeRetentionViewModel.LJLJLJ = false;
        return C76800UCe.LIZ;
    }
}
