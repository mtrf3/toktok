package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.Tan, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C74921Tan implements InterfaceC75203TfL {
    public final /* synthetic */ GuestMediaManageFragment LIZ;

    @Override // X.InterfaceC75203TfL
    public final void LIZJ() {
        GuestMediaManageFragment guestMediaManageFragment = this.LIZ;
        if (guestMediaManageFragment.LLJL) {
            C75460TjU.LIZLLL(guestMediaManageFragment.LLILII, "video_anchor_connect_detail");
            guestMediaManageFragment.LLJL = false;
        }
    }

    @Override // X.InterfaceC75203TfL
    public final LiveEffect LJ() {
        return this.LIZ.LLILIL;
    }

    @Override // X.InterfaceC75203TfL
    public final int LJFF() {
        return this.LIZ.LLILII;
    }

    public C74921Tan(GuestMediaManageFragment guestMediaManageFragment) {
        this.LIZ = guestMediaManageFragment;
    }

    @Override // X.InterfaceC75203TfL
    public final void LIZIZ(LiveEffect liveEffect) {
        this.LIZ.LLILIL = liveEffect;
    }

    @Override // X.InterfaceC75203TfL
    public final void LJI(int i) {
        GuestMediaManageFragment guestMediaManageFragment = this.LIZ;
        if (i != guestMediaManageFragment.LLILII) {
            guestMediaManageFragment.LLJL = true;
        }
        guestMediaManageFragment.LLILII = i;
    }

    @Override // X.InterfaceC75203TfL
    public final void LIZLLL(int i, boolean z) {
        this.LIZ.LLJJJIL = C58410MwA.LIZ(i);
    }
}
