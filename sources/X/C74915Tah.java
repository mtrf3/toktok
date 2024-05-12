package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.Tah, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C74915Tah implements InterfaceC75203TfL {
    public final /* synthetic */ MultiGuestPreviewFragment LIZ;

    @Override // X.InterfaceC75203TfL
    public final void LIZJ() {
        MultiGuestPreviewFragment multiGuestPreviewFragment = this.LIZ;
        if (multiGuestPreviewFragment.LLJI) {
            C75460TjU.LIZLLL(C74740TUy.LIZLLL().LJ, "video_anchor_connect_page");
            multiGuestPreviewFragment.LLJI = false;
        }
    }

    @Override // X.InterfaceC75203TfL
    public final LiveEffect LJ() {
        return C74740TUy.LIZLLL().LJFF;
    }

    @Override // X.InterfaceC75203TfL
    public final int LJFF() {
        return C74740TUy.LIZLLL().LJ;
    }

    public C74915Tah(MultiGuestPreviewFragment multiGuestPreviewFragment) {
        this.LIZ = multiGuestPreviewFragment;
    }

    @Override // X.InterfaceC75203TfL
    public final void LIZIZ(LiveEffect liveEffect) {
        this.LIZ.Zl(liveEffect);
    }

    @Override // X.InterfaceC75203TfL
    public final void LJI(int i) {
        this.LIZ.Yl(i);
    }

    @Override // X.InterfaceC75203TfL
    public final void LIZLLL(int i, boolean z) {
        this.LIZ.LLJJL = C58410MwA.LIZ(i);
        if (!z) {
            this.LIZ.Sl("switch_tab");
        }
    }
}
