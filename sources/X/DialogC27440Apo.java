package X;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;

/* renamed from: X.Apo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC27440Apo extends DialogC27439Apn {
    @Override // X.DialogC27439Apn, X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(48);
        }
    }

    public DialogC27440Apo(Context context, int i) {
        super(context, i);
    }
}
