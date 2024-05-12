package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.qa.LoadCustomPollWidget;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;

/* renamed from: X.Bqt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30055Bqt extends C1E1 {
    public boolean LIZ;
    public final /* synthetic */ PortraitAudienceInteractionFragment LIZIZ;

    public C30055Bqt(PortraitAudienceInteractionFragment portraitAudienceInteractionFragment) {
        this.LIZIZ = portraitAudienceInteractionFragment;
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LIZIZ(C04120Ee c04120Ee) {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZIZ.mDataChannel.pv0(LoadCustomPollWidget.class);
        }
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LIZLLL(C04120Ee c04120Ee) {
        if (c04120Ee.LJ) {
            EnumC30204BtI enumC30204BtI = EnumC30204BtI.CUSTOM_POLL;
            if (!enumC30204BtI.isShowing(this.LIZIZ.mDataChannel) && !enumC30204BtI.isShowingInInteractionDialog(this.LIZIZ.mDataChannel)) {
                ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nj0(this.LIZIZ.mDataChannel);
                return;
            }
            return;
        }
        EnumC30204BtI.CUSTOM_POLL.unload(this.LIZIZ.mDataChannel);
    }
}
