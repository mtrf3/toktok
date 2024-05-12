package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* renamed from: X.Zlm, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90890Zlm extends AbstractC67789Qj3<C90691ZiZ> implements IBinder.DeathRecipient {
    public static final C90469Zez LLIIIL = new C90469Zez("CastRemoteDisplayClientImpl");

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 12451000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final void LIZLLL() {
        LLIIIL.getClass();
        try {
            C90691ZiZ c90691ZiZ = (C90691ZiZ) LJJIIJ();
            c90691ZiZ.LLZZJLIL(c90691ZiZ.LJLJI(), 3);
        } catch (RemoteException | IllegalStateException unused) {
        } finally {
            super.LIZLLL();
        }
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (queryLocalInterface instanceof C90691ZiZ) {
            return queryLocalInterface;
        }
        return new C90691ZiZ(iBinder);
    }

    public C90890Zlm(Context context, Looper looper, C67736QiC c67736QiC, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        super(context, looper, 83, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
        LLIIIL.getClass();
    }
}
