package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* renamed from: X.008, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass008 {
    public final InterfaceC10090aT LIZ;
    public final InterfaceC10080aS LIZIZ;
    public final ComponentName LIZJ;
    public final PendingIntent LIZLLL = null;

    public final void LIZ(android.net.Uri uri, List list) {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.LIZLLL;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        try {
            this.LIZ.LLIIIL(this.LIZIZ, uri, bundle, list);
        } catch (RemoteException unused) {
        }
    }

    public AnonymousClass008(InterfaceC10090aT interfaceC10090aT, BinderC39601gy binderC39601gy, ComponentName componentName) {
        this.LIZ = interfaceC10090aT;
        this.LIZIZ = binderC39601gy;
        this.LIZJ = componentName;
    }
}
