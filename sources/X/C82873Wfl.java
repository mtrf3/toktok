package X;

import android.content.Context;
import android.widget.Toast;

/* renamed from: X.Wfl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82873Wfl implements InterfaceC82888Wg0 {
    public static final C82873Wfl LIZ = new C82873Wfl();

    @Override // X.InterfaceC82888Wg0
    public final void LIZ(Context context, int i, String str) {
        if (context == null || str == null || str.length() == 0) {
            return;
        }
        C16880lQ.LLZILL(Toast.makeText(context, str, i));
    }
}
