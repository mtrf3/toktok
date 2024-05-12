package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Bkx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnKeyListenerC29687Bkx implements DialogInterface.OnKeyListener {
    public final /* synthetic */ LiveDialogFragment LJLIL;

    public DialogInterfaceOnKeyListenerC29687Bkx(LiveDialogFragment liveDialogFragment) {
        this.LJLIL = liveDialogFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        if (4 == i && 1 == event.getAction()) {
            return this.LJLIL.onBackPressed();
        }
        return false;
    }
}
