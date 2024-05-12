package X;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.livesdk.container.ui.PopupContainerFragment;

/* loaded from: classes6.dex */
public final class CNC extends Dialog {
    public final /* synthetic */ PopupContainerFragment LJLIL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        PopupContainerFragment popupContainerFragment = this.LJLIL;
        if (popupContainerFragment.mCancelable) {
            popupContainerFragment.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CNC(PopupContainerFragment popupContainerFragment, Context context, int i) {
        super(context, i);
        this.LJLIL = popupContainerFragment;
    }
}
