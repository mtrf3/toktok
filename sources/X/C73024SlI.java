package X;

import com.ss.android.ugc.aweme.video.SubOnlyVideoContentFragment;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoViewModel;

/* renamed from: X.SlI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73024SlI implements InterfaceC191547fS {
    public final /* synthetic */ SubOnlyVideoContentFragment LJLIL;

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        SubOnlyVideoViewModel subOnlyVideoViewModel = this.LJLIL.LJLLI;
        if (subOnlyVideoViewModel != null) {
            subOnlyVideoViewModel.manualListRetry(SZP.Next);
        }
    }

    public C73024SlI(SubOnlyVideoContentFragment subOnlyVideoContentFragment) {
        this.LJLIL = subOnlyVideoContentFragment;
    }
}
