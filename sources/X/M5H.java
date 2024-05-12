package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.promote.PromoteGdprManager;

/* loaded from: classes10.dex */
public final class M5H implements DialogInterface.OnDismissListener {
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        PromoteGdprManager.sPromoteNotificationDialog = null;
    }
}
