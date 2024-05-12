package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.QkS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67876QkS extends AbstractC67789Qj3 {
    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 13000000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
    }

    @Override // X.AbstractC67863QkF
    public final boolean LJJIJIIJIL() {
        return true;
    }

    @Override // X.AbstractC67863QkF
    public final Bundle LJJII() {
        return C0H1.LIZ("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        if (queryLocalInterface instanceof C67975Qm3) {
            return queryLocalInterface;
        }
        return new C67975Qm3(iBinder);
    }

    public C67876QkS(Context context, Looper looper, C67736QiC c67736QiC, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        super(context, looper, 119, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
    }
}
