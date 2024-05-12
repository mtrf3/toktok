package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: X.QkD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67861QkD extends AbstractC67789Qj3 {
    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 17895000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    @Override // X.AbstractC67863QkF
    public final boolean LJJIIZI() {
        return true;
    }

    @Override // X.AbstractC67863QkF
    public final boolean LJJIJIIJIL() {
        return true;
    }

    @Override // X.AbstractC67863QkF
    public final Feature[] LJJ() {
        return C67947Qlb.LJ;
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        if (queryLocalInterface instanceof C67908Qky) {
            return queryLocalInterface;
        }
        return new C67908Qky(iBinder);
    }

    public C67861QkD(Context context, Looper looper, C67736QiC c67736QiC, InterfaceC67784Qiy interfaceC67784Qiy, InterfaceC67712Qho interfaceC67712Qho) {
        super(context, looper, 258, c67736QiC, interfaceC67784Qiy, interfaceC67712Qho);
    }
}
