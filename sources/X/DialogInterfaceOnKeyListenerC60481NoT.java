package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHybridBottomSheetDialogFragment;

/* renamed from: X.NoT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnKeyListenerC60481NoT implements DialogInterface.OnKeyListener {
    public final /* synthetic */ CommerceHybridBottomSheetDialogFragment LJLIL;

    public DialogInterfaceOnKeyListenerC60481NoT(CommerceHybridBottomSheetDialogFragment commerceHybridBottomSheetDialogFragment) {
        this.LJLIL = commerceHybridBottomSheetDialogFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        AbstractC60482NoU abstractC60482NoU;
        C40127Fox.LIZ.getClass();
        if (C40127Fox.LIZ().enableSparkContainer) {
            abstractC60482NoU = this.LJLIL.LJLIL;
        } else {
            abstractC60482NoU = this.LJLIL.LJLILLLLZI;
        }
        if (i != 4 || keyEvent.getAction() != 1 || abstractC60482NoU == null || !abstractC60482NoU.onBackPressed()) {
            return false;
        }
        return true;
    }
}
