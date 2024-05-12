package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;

/* renamed from: X.QDg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC66636QDg implements DialogInterface.OnClickListener {
    public abstract void LIZ();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            LIZ();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains("generic");
        } finally {
            dialogInterface.dismiss();
        }
    }
}
