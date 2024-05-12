package X;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.1hV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class BinderC39931hV extends AbstractBinderC32441Pc {
    public final /* synthetic */ CustomTabsService LJLILLLLZI;

    public BinderC39931hV(CustomTabsService customTabsService) {
        this.LJLILLLLZI = customTabsService;
    }

    public static PendingIntent LJLJI(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
        bundle.remove("android.support.customtabs.extra.SESSION_ID");
        return pendingIntent;
    }

    @Override // X.InterfaceC10090aT
    public final boolean LLLLLJLJLL(BinderC39601gy binderC39601gy) {
        return LLJI(binderC39601gy, null);
    }

    @Override // X.InterfaceC10090aT
    public final boolean LLZLLIL(long j) {
        return this.LJLILLLLZI.LJIIIIZZ();
    }

    public final boolean LLJI(InterfaceC10080aS interfaceC10080aS, PendingIntent pendingIntent) {
        final AnonymousClass009 anonymousClass009 = new AnonymousClass009(interfaceC10080aS, pendingIntent);
        try {
            IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: X.006
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    IBinder asBinder;
                    BinderC39931hV binderC39931hV = BinderC39931hV.this;
                    AnonymousClass009 anonymousClass0092 = anonymousClass009;
                    CustomTabsService customTabsService = binderC39931hV.LJLILLLLZI;
                    customTabsService.getClass();
                    try {
                        synchronized (customTabsService.LJLIL) {
                            InterfaceC10080aS interfaceC10080aS2 = anonymousClass0092.LIZ;
                            if (interfaceC10080aS2 != null && (asBinder = interfaceC10080aS2.asBinder()) != null) {
                                asBinder.unlinkToDeath(customTabsService.LJLIL.getOrDefault(asBinder, null), 0);
                                customTabsService.LJLIL.remove(asBinder);
                            }
                        }
                    } catch (NoSuchElementException unused) {
                    }
                }
            };
            synchronized (this.LJLILLLLZI.LJLIL) {
                interfaceC10080aS.asBinder().linkToDeath(deathRecipient, 0);
                this.LJLILLLLZI.LJLIL.put(interfaceC10080aS.asBinder(), deathRecipient);
            }
            return this.LJLILLLLZI.LIZJ();
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // X.InterfaceC10090aT
    public final boolean LLIIIL(InterfaceC10080aS interfaceC10080aS, android.net.Uri uri, Bundle bundle, List<Bundle> list) {
        CustomTabsService customTabsService = this.LJLILLLLZI;
        new AnonymousClass009(interfaceC10080aS, LJLJI(bundle));
        return customTabsService.LIZIZ();
    }
}
