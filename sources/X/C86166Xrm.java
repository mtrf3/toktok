package X;

import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Xrm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86166Xrm implements InterfaceC86180Xs0 {
    public final /* synthetic */ CropActivity LIZ;

    @Override // X.InterfaceC86180Xs0
    public final void LIZIZ() {
        CropActivity cropActivity = this.LIZ;
        cropActivity.LLFII(cropActivity.LL);
    }

    @Override // X.InterfaceC86180Xs0
    public final void LIZJ() {
        CropActivity cropActivity = this.LIZ;
        cropActivity.LLILLL(cropActivity.LJLLLL);
    }

    public C86166Xrm(CropActivity cropActivity) {
        this.LIZ = cropActivity;
    }

    @Override // X.InterfaceC86180Xs0
    public final void LIZ(boolean z) {
        this.LIZ.LLJJIJIIJIL(z, true);
        C71897SJp c71897SJp = this.LIZ.LJLJLLL;
        if (c71897SJp != null) {
            C244309iM.LIZ(c71897SJp.isChecked());
            C71897SJp c71897SJp2 = this.LIZ.LJLJLLL;
            if (c71897SJp2 != null) {
                C86179Xrz.LIZ(c71897SJp2.isChecked());
                return;
            } else {
                o.LJIJI("postToStoryCheckBox");
                throw null;
            }
        }
        o.LJIJI("postToStoryCheckBox");
        throw null;
    }
}
