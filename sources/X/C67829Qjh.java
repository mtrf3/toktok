package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Qjh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67829Qjh implements InterfaceC67783Qix, InterfaceC68019Qml {
    public final InterfaceC67836Qjo LIZ;
    public final C67719Qhv<?> LIZIZ;
    public InterfaceC67936QlQ LIZJ;
    public java.util.Set<Scope> LIZLLL;
    public boolean LJ;
    public final /* synthetic */ C67824Qjc LJFF;

    public C67829Qjh(C67824Qjc c67824Qjc, InterfaceC67836Qjo interfaceC67836Qjo, C67719Qhv<?> c67719Qhv) {
        this.LJFF = c67824Qjc;
        this.LIZ = interfaceC67836Qjo;
        this.LIZIZ = c67719Qhv;
    }

    @Override // X.InterfaceC67783Qix
    public final void LIZ(ConnectionResult connectionResult) {
        this.LJFF.LJLLL.post(new RunnableC67835Qjn(this, connectionResult));
    }

    public final void LIZIZ(ConnectionResult connectionResult) {
        C67825Qjd c67825Qjd = (C67825Qjd) ((ConcurrentHashMap) this.LJFF.LJLL).get(this.LIZIZ);
        if (c67825Qjd != null) {
            QH7.LIZJ(c67825Qjd.LJLLJ.LJLLL);
            InterfaceC67836Qjo interfaceC67836Qjo = c67825Qjd.LJLILLLLZI;
            String name = interfaceC67836Qjo.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            interfaceC67836Qjo.LJIIJ(sb.toString());
            c67825Qjd.LJIILJJIL(connectionResult, null);
        }
    }
}
