package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.QjW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67818QjW extends AbstractC67789Qj3 {
    public final C67819QjX LLIIIL;

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 12800000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // X.AbstractC67863QkF
    public final Bundle LJJII() {
        C67819QjX c67819QjX = this.LLIIIL;
        c67819QjX.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", c67819QjX.LJLIL);
        bundle.putString("log_session_id", c67819QjX.LJLILLLLZI);
        return bundle;
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C67929QlJ) {
            return queryLocalInterface;
        }
        return new C67929QlJ(iBinder);
    }

    public C67818QjW(Context context, Looper looper, C67736QiC c67736QiC, C67819QjX c67819QjX, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        super(context, looper, 68, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
        C67860QkC c67860QkC = new C67860QkC(c67819QjX == null ? C67819QjX.LJLJI : c67819QjX);
        c67860QkC.LIZIZ = C66574QAw.LIZ();
        this.LLIIIL = new C67819QjX(c67860QkC);
    }
}
