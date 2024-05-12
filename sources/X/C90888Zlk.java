package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.Zlk, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90888Zlk extends AbstractC67789Qj3<C90691ZiZ> {
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

    public C90888Zlk(Context context, Looper looper, C67736QiC c67736QiC, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        super(context, looper, 83, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
    }
}
