package X;

import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Ca8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31564Ca8 implements InterfaceC31571CaF {
    public final /* synthetic */ C31563Ca7 LIZ;
    public final /* synthetic */ C76732zl LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ C29800Bmm LIZLLL;

    @Override // X.InterfaceC31571CaF
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC31571CaF
    public final void LIZ() {
        long j;
        String str;
        this.LIZ.getClass();
        C31563Ca7.LJJZZIII(true);
        C29813Bmz c29813Bmz = C29813Bmz.LIZ;
        int i = this.LIZIZ.element;
        int i2 = this.LIZJ;
        c29813Bmz.getClass();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        long j2 = 0;
        if (room != null) {
            j = room.getId();
            if (room.getOwner() != null) {
                j2 = room.getOwner().getId();
            }
        } else {
            j = 0;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        IUserLevelService iUserLevelService = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
        if (iUserLevelService != null && iUserLevelService.rh(i)) {
            str = "big";
        } else {
            str = "small";
        }
        if (i <= 0) {
            str = "new";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_user_level_progress_level_up");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(j), "room_id");
        LIZ.LJIJJ(Long.valueOf(j2), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(currentUserId), "user_id");
        LIZ.LJIJJ(str, "level_up_type");
        LIZ.LJIJJ(Integer.valueOf(i2), "user_level");
        LIZ.LJIJJ(((IUserLevelService) CN1.LIZ(IUserLevelService.class)).eK(), "trigger_payment");
        LIZ.LJJIIJZLJL();
        this.LIZ.LJLJJI.setVisibility(0);
        this.LIZ.LJLJJL.setVisibility(8);
        this.LIZ.LJLLLLLL.setVisibility(0);
        this.LIZ.setMaxProgress(this.LIZLLL);
        ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).Qm0();
        C29800Bmm c29800Bmm = this.LIZLLL;
        long j3 = c29800Bmm.LIZIZ - c29800Bmm.LJI;
        if (this.LIZJ == ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).Xy()) {
            this.LIZ.LJLILLLLZI.setText(C15380j0.LJIILJJIL(R.string.k_6));
            C31563Ca7 c31563Ca7 = this.LIZ;
            c31563Ca7.LJLJLJ = c31563Ca7.LJLJL;
            C31576CaK c31576CaK = c31563Ca7.LJLJJI;
            c31576CaK.LJLJJL = c31576CaK.LJLJJI;
            c31576CaK.invalidate();
            ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).Qm0();
            this.LIZ.setUpdateProgressBar(false);
            this.LIZ.setPlayingBarAnimation(false);
            this.LIZ.LJJLJLI();
            return;
        }
        C31563Ca7 c31563Ca72 = this.LIZ;
        float f = (float) j3;
        C31567CaB c31567CaB = new C31567CaB(c31563Ca72);
        c31563Ca72.LJLJLJ = f;
        c31563Ca72.LJLJJI.LIZ(0.0f, f, c31567CaB);
    }

    public C31564Ca8(int i, C29800Bmm c29800Bmm, C31563Ca7 c31563Ca7, C76732zl c76732zl) {
        this.LIZ = c31563Ca7;
        this.LIZIZ = c76732zl;
        this.LIZJ = i;
        this.LIZLLL = c29800Bmm;
    }
}
