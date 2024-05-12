package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import java.util.HashSet;

/* renamed from: X.ALh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnDismissListenerC26077ALh implements DialogInterface.OnDismissListener {
    public final /* synthetic */ NotificationLiveBottomDialog LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;

    public DialogInterfaceOnDismissListenerC26077ALh(NotificationLiveBottomDialog notificationLiveBottomDialog, Activity activity) {
        this.LJLIL = notificationLiveBottomDialog;
        this.LJLILLLLZI = activity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        java.util.Set<DialogFragment> set;
        this.LJLIL.LJLZ.onDismiss(dialogInterface);
        C14A c14a = AnonymousClass149.LIZ;
        Fragment LJJJIL = ((ActivityC45651qj) this.LJLILLLLZI).getSupportFragmentManager().LJJJIL("NotificationLiveDialog");
        if ((LJJJIL instanceof DialogFragment) && LJJJIL != null && (set = c14a.LIZIZ) != null) {
            ((HashSet) set).remove(LJJJIL);
        }
    }
}
