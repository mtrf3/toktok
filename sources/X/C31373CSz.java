package X;

import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;

/* renamed from: X.CSz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31373CSz extends C0A4 {
    public final /* synthetic */ PublicScreenWidget LIZ;

    public C31373CSz(PublicScreenWidget publicScreenWidget) {
        this.LIZ = publicScreenWidget;
    }

    @Override // X.C0A4
    public final boolean LIZ(int i, int i2) {
        int i3;
        if (i2 == 0) {
            if (!this.LIZ.LLIIII.LIZ()) {
                this.LIZ.LLILL(CT0.NORMAL, true);
            } else {
                this.LIZ.LLILL(CT0.FOCUS, true);
                SmoothLinearLayoutManager smoothLinearLayoutManager = this.LIZ.LLIIII.LIZLLL;
                if (smoothLinearLayoutManager != null) {
                    i3 = smoothLinearLayoutManager.LLILLJJLI();
                } else {
                    i3 = 0;
                }
                PublicScreenWidget publicScreenWidget = this.LIZ;
                int i4 = publicScreenWidget.LJLLL;
                if (i3 > i4) {
                    publicScreenWidget.LLILII(publicScreenWidget.LJLLJ - (i3 - i4));
                    this.LIZ.LJLLL = i3;
                }
            }
        }
        return false;
    }
}
