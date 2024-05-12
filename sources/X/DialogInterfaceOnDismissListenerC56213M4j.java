package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.app.SharePrefCache;

/* renamed from: X.M4j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnDismissListenerC56213M4j implements DialogInterface.OnDismissListener {
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        SharePrefCache.inst().getShowPromoteLicense().LIZLLL(0);
        C56215M4l.LIZ = null;
    }
}
