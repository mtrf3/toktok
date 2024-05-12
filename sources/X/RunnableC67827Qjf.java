package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qjf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67827Qjf implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    public final void LIZ() {
        InterfaceC67936QlQ c67883QkZ;
        BinderC67831Qjj binderC67831Qjj = (BinderC67831Qjj) this.LJLJI;
        zak zakVar = (zak) this.LJLILLLLZI;
        ConnectionResult connectionResult = zakVar.zab;
        if (connectionResult.LJJJJZ()) {
            zav zavVar = zakVar.zac;
            QH7.LJIIIIZZ(zavVar);
            ConnectionResult connectionResult2 = zavVar.zac;
            if (!connectionResult2.LJJJJZ()) {
                String valueOf = String.valueOf(connectionResult2);
                android.util.Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                ((C67829Qjh) binderC67831Qjj.LJLJL).LIZIZ(connectionResult2);
                binderC67831Qjj.LJLJJLL.LIZLLL();
                return;
            }
            InterfaceC68019Qml interfaceC68019Qml = binderC67831Qjj.LJLJL;
            IBinder iBinder = zavVar.LJLILLLLZI;
            if (iBinder == null) {
                c67883QkZ = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof InterfaceC67936QlQ) {
                    c67883QkZ = (InterfaceC67936QlQ) queryLocalInterface;
                } else {
                    c67883QkZ = new C67883QkZ(iBinder);
                }
            }
            java.util.Set<Scope> set = binderC67831Qjj.LJLJJI;
            C67829Qjh c67829Qjh = (C67829Qjh) interfaceC68019Qml;
            c67829Qjh.getClass();
            if (c67883QkZ == null || set == null) {
                android.util.Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                c67829Qjh.LIZIZ(new ConnectionResult(4));
            } else {
                c67829Qjh.LIZJ = c67883QkZ;
                c67829Qjh.LIZLLL = set;
                if (c67829Qjh.LJ) {
                    c67829Qjh.LIZ.LJIILIIL(c67883QkZ, set);
                }
            }
        } else {
            ((C67829Qjh) binderC67831Qjj.LJLJL).LIZIZ(connectionResult);
        }
        binderC67831Qjj.LJLJJLL.LIZLLL();
    }

    public final void LIZIZ() {
        C40551Fvn c40551Fvn = ((C40555Fvr) this.LJLJI).LIZIZ;
        C38398F5e c38398F5e = (C38398F5e) this.LJLILLLLZI;
        List<String> list = c38398F5e.LIZ;
        List<String> LJFF = C40555Fvr.LJFF(c38398F5e.LIZIZ);
        Bundle LIZLLL = C1DG.LIZLLL("session_id", 0, "status", 5);
        LIZLLL.putInt("error_code", 0);
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            LIZLLL.putStringArrayList("module_names", new ArrayList<>(arrayList));
        }
        if (!((ArrayList) LJFF).isEmpty()) {
            LIZLLL.putStringArrayList("languages", new ArrayList<>(LJFF));
        }
        LIZLLL.putLong("total_bytes_to_download", 0L);
        LIZLLL.putLong("bytes_downloaded", 0L);
        c40551Fvn.LJI(AbstractC40550Fvm.LJFF(LIZLLL));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    LIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                try {
                    LIZIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public /* synthetic */ RunnableC67827Qjf(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = obj2;
    }
}
