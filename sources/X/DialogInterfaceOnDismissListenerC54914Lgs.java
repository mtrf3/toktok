package X;

import android.content.DialogInterface;

/* renamed from: X.Lgs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnDismissListenerC54914Lgs implements DialogInterface.OnDismissListener {
    public static final DialogInterfaceOnDismissListenerC54914Lgs LJLIL = new DialogInterfaceOnDismissListenerC54914Lgs();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        FMX.onEventV3("close_first_stem_feed_prompt");
    }
}
