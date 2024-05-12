package X;

import android.os.Bundle;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.dialog.GameDualDeviceDialog;

/* renamed from: X.0Ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05350Ix {
    public static void LIZ(FragmentManager fragmentManager, String str, int i, boolean z) {
        if (fragmentManager.LJJJIL(C16880lQ.LJLLILLLL(GameDualDeviceDialog.class)) != null) {
            return;
        }
        GameDualDeviceDialog gameDualDeviceDialog = new GameDualDeviceDialog();
        Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("is_landscape", z, "event_page", str);
        m.putInt("current_page", i);
        gameDualDeviceDialog.setArguments(m);
        gameDualDeviceDialog.show(fragmentManager, C16880lQ.LJLLILLLL(GameDualDeviceDialog.class));
    }
}
