package X;

import Y.IDDListenerS152S0100000_13;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.Tps, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75856Tps implements InterfaceC75855Tpr {
    public LiveDialog LIZ;

    @Override // X.InterfaceC75855Tpr
    public String tag() {
        return "LiveDialog";
    }

    @Override // X.InterfaceC75855Tpr
    public final void dismiss() {
        LiveDialog liveDialog = this.LIZ;
        if (liveDialog != null) {
            liveDialog.dismiss();
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC75855Tpr
    public final boolean isVisible() {
        LiveDialog liveDialog = this.LIZ;
        if (liveDialog != null && liveDialog.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75855Tpr
    public final void LIZ(AqS163S0100000_13 aqS163S0100000_13) {
        LiveDialog liveDialog = this.LIZ;
        if (liveDialog != null) {
            liveDialog.setOnDismissListener(new IDDListenerS152S0100000_13(aqS163S0100000_13, 13));
        }
    }
}
