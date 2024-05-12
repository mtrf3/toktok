package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;

/* renamed from: X.Apr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnKeyListenerC27443Apr implements DialogInterface.OnKeyListener {
    public final /* synthetic */ CommerceBottomSheetDialogFragment LJLIL;

    public DialogInterfaceOnKeyListenerC27443Apr(CommerceBottomSheetDialogFragment commerceBottomSheetDialogFragment) {
        this.LJLIL = commerceBottomSheetDialogFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL.onBackListener;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            CommerceBottomSheetDialogFragment.onActivityCreated$checkKeyBoardAndDismiss(this.LJLIL);
            return false;
        }
        return false;
    }
}
