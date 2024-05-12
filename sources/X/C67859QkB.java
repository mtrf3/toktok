package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: X.QkB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67859QkB extends AbstractC67789Qj3 {
    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 13000000;
    }

    @Override // X.AbstractC67863QkF
    public final Feature[] LJJ() {
        return new Feature[]{C67957Qll.LIZIZ, C67957Qll.LIZ};
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // X.AbstractC67863QkF
    public final boolean LJJIJIIJIL() {
        return true;
    }

    @Override // X.AbstractC67863QkF
    public final Bundle LJJII() {
        return C0H1.LIZ("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof C67974Qm2) {
            return queryLocalInterface;
        }
        return new C67974Qm2(iBinder);
    }

    public C67859QkB(Context context, Looper looper, C67736QiC c67736QiC, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        super(context, looper, 148, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
    }
}
