package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.android.live.walletnew.ui.LocationList;

/* renamed from: X.UfU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnKeyListenerC77760UfU implements DialogInterface.OnKeyListener {
    public final /* synthetic */ LocationList LJLIL;

    public DialogInterfaceOnKeyListenerC77760UfU(LocationList locationList) {
        this.LJLIL = locationList;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            LocationList locationList = this.LJLIL;
            int i2 = locationList.LJLJLLL;
            int i3 = locationList.LJLL;
            if (2 <= i3 && i3 <= i2) {
                locationList.wl(i3, -1);
                return true;
            }
        }
        return false;
    }
}
