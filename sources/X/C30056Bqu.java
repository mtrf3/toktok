package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;

/* renamed from: X.Bqu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30056Bqu extends C1E1 {
    public final /* synthetic */ AbsAudienceInteractionFragment LIZ;

    public C30056Bqu(AbsAudienceInteractionFragment absAudienceInteractionFragment) {
        this.LIZ = absAudienceInteractionFragment;
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LIZLLL(C04120Ee c04120Ee) {
        if (c04120Ee.LJ) {
            EnumC30204BtI enumC30204BtI = EnumC30204BtI.CUSTOM_POLL;
            if (!enumC30204BtI.isShowing(this.LIZ.mDataChannel)) {
                if (!enumC30204BtI.isShowingInInteractionDialog(this.LIZ.mDataChannel) || !this.LIZ.isScreenPortrait()) {
                    ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nj0(this.LIZ.mDataChannel);
                    return;
                }
                return;
            }
            return;
        }
        EnumC30204BtI.CUSTOM_POLL.unload(this.LIZ.mDataChannel);
    }
}
