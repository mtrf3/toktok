package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;

/* loaded from: classes5.dex */
public final class ATA implements DialogInterface.OnDismissListener {
    public static final ATA LJLIL = new ATA();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIILLIIL(false);
        }
    }
}
