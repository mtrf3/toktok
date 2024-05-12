package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.RegionPickerDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Aq1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnKeyListenerC27453Aq1 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ RegionPickerDialogFragment LJLIL;

    public DialogInterfaceOnKeyListenerC27453Aq1(RegionPickerDialogFragment regionPickerDialogFragment) {
        this.LJLIL = regionPickerDialogFragment;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, X.AqH] */
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent == null || keyEvent.getAction() != 1) {
            return false;
        }
        ?? r0 = this.LJLIL.LJLLJ;
        if (r0 != 0) {
            if (!r0.onBackPressed()) {
                return false;
            }
            return true;
        }
        o.LJIJI("onBack");
        throw null;
    }
}
