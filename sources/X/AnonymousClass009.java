package X;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: X.009, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass009 {
    public final InterfaceC10080aS LIZ;
    public final PendingIntent LIZIZ;

    public final IBinder LIZ() {
        InterfaceC10080aS interfaceC10080aS = this.LIZ;
        if (interfaceC10080aS != null) {
            return interfaceC10080aS.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.LIZIZ;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return LIZ().hashCode();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof AnonymousClass009)) {
            return false;
        }
        AnonymousClass009 anonymousClass009 = (AnonymousClass009) obj;
        PendingIntent pendingIntent = anonymousClass009.LIZIZ;
        PendingIntent pendingIntent2 = this.LIZIZ;
        boolean z2 = true;
        if (pendingIntent2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (pendingIntent != null) {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        return LIZ().equals(anonymousClass009.LIZ());
    }

    public AnonymousClass009(InterfaceC10080aS interfaceC10080aS, PendingIntent pendingIntent) {
        if (interfaceC10080aS != null || pendingIntent != null) {
            this.LIZ = interfaceC10080aS;
            this.LIZIZ = pendingIntent;
            if (interfaceC10080aS == null) {
                return;
            }
            new C17J() { // from class: X.1gz
                @Override // X.C17J
                public final void LJJJI(Bundle bundle) {
                    try {
                        AnonymousClass009.this.LIZ.LLJLILLLLZIIL(bundle);
                    } catch (RemoteException unused) {
                    }
                }

                @Override // X.C17J
                public final void LJIJI(Bundle bundle, String str) {
                    try {
                        AnonymousClass009.this.LIZ.LLLL(bundle, str);
                    } catch (RemoteException unused) {
                    }
                }

                @Override // X.C17J
                public final Bundle LJIJJ(Bundle bundle, String str) {
                    try {
                        return AnonymousClass009.this.LIZ.LLILZIL(bundle, str);
                    } catch (RemoteException unused) {
                        return null;
                    }
                }

                @Override // X.C17J
                public final void LJJJIL(int i, Bundle bundle) {
                    try {
                        AnonymousClass009.this.LIZ.g(i, bundle);
                    } catch (RemoteException unused) {
                    }
                }

                @Override // X.C17J
                public final void LJJJJ(Bundle bundle, String str) {
                    try {
                        AnonymousClass009.this.LIZ.LLLLILI(bundle, str);
                    } catch (RemoteException unused) {
                    }
                }

                @Override // X.C17J
                public final void LJJJJI(int i, android.net.Uri uri, boolean z, Bundle bundle) {
                    try {
                        AnonymousClass009.this.LIZ.y0(i, uri, z, bundle);
                    } catch (RemoteException unused) {
                    }
                }
            };
            return;
        }
        throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
    }
}
