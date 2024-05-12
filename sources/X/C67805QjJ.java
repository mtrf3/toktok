package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: X.QjJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67805QjJ extends AbstractC67789Qj3 {
    public final Bundle LLIIIL;

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 17895000;
    }

    @Override // X.AbstractC67863QkF
    public final Bundle LJJII() {
        return this.LLIIIL;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // X.AbstractC67863QkF
    public final boolean LJJIIZI() {
        return true;
    }

    @Override // X.AbstractC67863QkF
    public final Feature[] LJJ() {
        return C67811QjP.LIZLLL;
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof C67809QjN) {
            return queryLocalInterface;
        }
        return new C67809QjN(iBinder);
    }

    public C67805QjJ(Context context, Looper looper, C67736QiC c67736QiC, InterfaceC67784Qiy interfaceC67784Qiy, InterfaceC67712Qho interfaceC67712Qho) {
        super(context, looper, 212, c67736QiC, interfaceC67784Qiy, interfaceC67712Qho);
        this.LLIIIL = new Bundle();
    }
}
