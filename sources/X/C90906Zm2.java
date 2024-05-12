package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: X.Zm2, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90906Zm2 extends AbstractC67789Qj3<C90823Zkh> {
    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 12451000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // X.AbstractC67863QkF
    public final boolean LJJIJIIJIL() {
        return true;
    }

    @Override // X.AbstractC67863QkF
    public final Feature[] LJJ() {
        return C90069ZWn.LJ;
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof C90823Zkh) {
            return queryLocalInterface;
        }
        return new C90823Zkh(iBinder);
    }

    public C90906Zm2(Context context, Looper looper, C67736QiC c67736QiC, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        super(context, looper, 161, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
    }
}
