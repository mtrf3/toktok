package X;

import Y.AgS126S0100000_9;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;

/* renamed from: X.McO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57184McO implements PopupWindow.OnDismissListener {
    public final /* synthetic */ InnerPushMessage LJLIL;

    public C57184McO(InnerPushMessage innerPushMessage) {
        this.LJLIL = innerPushMessage;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C86478Xwo.LIZIZ("InnerPushWindowManager", "popup window will dismiss");
        this.LJLIL.getTracker().LIZLLL = System.currentTimeMillis() - this.LJLIL.getTracker().LIZJ;
        C10K.LJII(5000L).LIZLLL(new AgS126S0100000_9(this.LJLIL, 9));
    }
}
