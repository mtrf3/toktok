package X;

import Y.AObjectS47S0101000_2;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BTi */
/* loaded from: classes6.dex */
public final class C28834BTi implements IHostLongPressCallback {
    public final /* synthetic */ AbsAudienceInteractionFragment LIZ;

    @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
    public final void onDislikePressed() {
        if (C28835BTj.LIZLLL(this.LIZ.mDataChannel)) {
            AdLiveEnterRoomConfig LJII = C28835BTj.LJII(this.LIZ.mDataChannel);
            AbsAudienceInteractionFragment absAudienceInteractionFragment = this.LIZ;
            if (absAudienceInteractionFragment.mRoom != null && absAudienceInteractionFragment.getContext() != null && LJII != null && LJII.aid != null) {
                ((IAdLiveHelperService) CN1.LIZ(IAdLiveHelperService.class)).Tg0(this.LIZ.getContext(), LJII, new AObjectS47S0101000_2(1, this, 3));
                return;
            }
            return;
        }
        C73943T0h.LIZ().LIZIZ(new B4R(this.LIZ.mRoom.getId()));
        C30868C9o.LIZJ(R.string.mg9);
    }

    @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
    public final void onReportPressed() {
        if (C28835BTj.LIZLLL(this.LIZ.mDataChannel)) {
            AdLiveEnterRoomConfig LJII = C28835BTj.LJII(this.LIZ.mDataChannel);
            AbsAudienceInteractionFragment absAudienceInteractionFragment = this.LIZ;
            if (absAudienceInteractionFragment.mRoom != null && absAudienceInteractionFragment.getContext() != null && LJII != null && LJII.aid != null) {
                ((IAdLiveHelperService) CN1.LIZ(IAdLiveHelperService.class)).Pu0(this.LIZ.getContext(), LJII, this.LIZ.mRoom.getOwner().getId());
                return;
            }
            return;
        }
        AbsAudienceInteractionFragment absAudienceInteractionFragment2 = this.LIZ;
        if (absAudienceInteractionFragment2.mRoom == null || absAudienceInteractionFragment2.getContext() == null) {
            return;
        }
        B83.LIZ().LIZIZ().getClass();
        C28555BIp c28555BIp = new C28555BIp(this.LIZ.mRoom.getId(), this.LIZ.mRoom.getOwner().getId(), this.LIZ.mRoom.getOwner().getId(), this.LIZ.mRoom.getOwner().getSecUid(), "long_press", BJM.LJFF(), BJM.LJIIIIZZ(), BJM.LIZLLL(), "report_anchor", BJM.LJIILIIL(), C28835BTj.LIZIZ(null, this.LIZ.mDataChannel, "user_live_duration"));
        c28555BIp.LJJI = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Qp0(this.LIZ.getContext(), c28555BIp);
    }

    public C28834BTi(AbsAudienceInteractionFragment absAudienceInteractionFragment) {
        this.LIZ = absAudienceInteractionFragment;
    }

    public static /* synthetic */ void LIZ(C28834BTi c28834BTi) {
        c28834BTi.getClass();
        C73943T0h.LIZ().LIZIZ(new B4R(c28834BTi.LIZ.mRoom.getId()));
    }
}
