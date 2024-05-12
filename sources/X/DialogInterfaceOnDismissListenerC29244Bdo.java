package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;

/* renamed from: X.Bdo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnDismissListenerC29244Bdo implements DialogInterface.OnDismissListener {
    public static final DialogInterfaceOnDismissListenerC29244Bdo LJLIL = new DialogInterfaceOnDismissListenerC29244Bdo();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIILLIIL(false);
        }
    }
}
