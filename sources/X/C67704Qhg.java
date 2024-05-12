package X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Qhg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67704Qhg extends AbstractC67789Qj3 {
    public final GoogleSignInOptions LLIIIL;

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 12451000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final Intent LJFF() {
        return C67692QhU.LIZ(this.LJLJLJ, this.LLIIIL);
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C67708Qhk) {
            return queryLocalInterface;
        }
        return new C67708Qhk(iBinder);
    }

    public C67704Qhg(Context context, Looper looper, C67736QiC c67736QiC, GoogleSignInOptions googleSignInOptions, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        super(context, looper, 91, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
        C67700Qhc c67700Qhc;
        if (googleSignInOptions != null) {
            c67700Qhc = new C67700Qhc(googleSignInOptions);
        } else {
            c67700Qhc = new C67700Qhc();
        }
        c67700Qhc.LJIIIIZZ = C66574QAw.LIZ();
        if (!c67736QiC.LIZJ.isEmpty()) {
            Iterator<Scope> it = c67736QiC.LIZJ.iterator();
            while (it.hasNext()) {
                ((HashSet) c67700Qhc.LIZ).add(it.next());
                c67700Qhc.LIZ.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.LLIIIL = c67700Qhc.LIZ();
    }
}
