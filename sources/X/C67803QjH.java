package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: X.QjH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67803QjH extends AbstractC67789Qj3 {
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
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
        return C67811QjP.LIZLLL;
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        if (queryLocalInterface instanceof C67810QjO) {
            return queryLocalInterface;
        }
        return new C67810QjO(iBinder);
    }

    public C67803QjH(Context context, Looper looper, C67736QiC c67736QiC, InterfaceC67784Qiy interfaceC67784Qiy, InterfaceC67712Qho interfaceC67712Qho) {
        super(context, looper, 223, c67736QiC, interfaceC67784Qiy, interfaceC67712Qho);
        this.LLIIIL = new Bundle();
    }
}
