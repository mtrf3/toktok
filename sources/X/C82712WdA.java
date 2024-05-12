package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.kids.commonfeed.panel.BaseFeedPanel;

/* renamed from: X.WdA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82712WdA implements InterfaceC81168VtM {
    public final /* synthetic */ BaseFeedPanel LIZ;

    @Override // X.InterfaceC81168VtM
    public final void LIZ() {
    }

    public C82712WdA(BaseFeedPanel baseFeedPanel) {
        this.LIZ = baseFeedPanel;
    }

    @Override // X.InterfaceC81168VtM
    public final void LJJJ(MotionEvent motionEvent) {
        this.LIZ.handleDoubleClick(motionEvent);
    }
}
