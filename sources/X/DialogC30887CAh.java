package X;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;

/* renamed from: X.CAh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogC30887CAh extends Dialog {
    public final /* synthetic */ HybridDialogFragment LJLIL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        HybridDialogFragment hybridDialogFragment = this.LJLIL;
        if (hybridDialogFragment.mCancelable) {
            hybridDialogFragment.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC30887CAh(HybridDialogFragment hybridDialogFragment, Context context, int i) {
        super(context, i);
        this.LJLIL = hybridDialogFragment;
    }
}
