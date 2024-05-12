package X;

import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.Qhm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67710Qhm extends AbstractDialogInterfaceOnCancelListenerC67269Qaf {
    public final SparseArray<C67711Qhn> LJLJJLL;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJII() {
        this.LJLILLLLZI = true;
        new StringBuilder(String.valueOf(this.LJLJJLL).length() + 14);
        if (this.LJLJI.get() == null) {
            for (int i = 0; i < this.LJLJJLL.size(); i++) {
                C67711Qhn LJIILIIL = LJIILIIL(i);
                if (LJIILIIL != null) {
                    LJIILIIL.LJLILLLLZI.LIZLLL();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJIIIIZZ() {
        this.LJLILLLLZI = false;
        for (int i = 0; i < this.LJLJJLL.size(); i++) {
            C67711Qhn LJIILIIL = LJIILIIL(i);
            if (LJIILIIL != null) {
                LJIILIIL.LJLILLLLZI.LJ();
            }
        }
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC67269Qaf
    public final void LJIIJ() {
        for (int i = 0; i < this.LJLJJLL.size(); i++) {
            C67711Qhn LJIILIIL = LJIILIIL(i);
            if (LJIILIIL != null) {
                LJIILIIL.LJLILLLLZI.LIZLLL();
            }
        }
    }

    public C67710Qhm(InterfaceC67296Qb6 interfaceC67296Qb6) {
        super(interfaceC67296Qb6, GoogleApiAvailability.getInstance());
        this.LJLJJLL = new SparseArray<>();
        interfaceC67296Qb6.lg("AutoManageHelper", this);
    }

    public final C67711Qhn LJIILIIL(int i) {
        if (this.LJLJJLL.size() <= i) {
            return null;
        }
        SparseArray<C67711Qhn> sparseArray = this.LJLJJLL;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC67269Qaf
    public final void LJIIIZ(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            android.util.Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C67711Qhn c67711Qhn = this.LJLJJLL.get(i);
        if (c67711Qhn != null) {
            C67711Qhn c67711Qhn2 = this.LJLJJLL.get(i);
            this.LJLJJLL.remove(i);
            if (c67711Qhn2 != null) {
                c67711Qhn2.LJLILLLLZI.LJIILIIL(c67711Qhn2);
                c67711Qhn2.LJLILLLLZI.LJ();
            }
            InterfaceC67707Qhj interfaceC67707Qhj = c67711Qhn.LJLJI;
            if (interfaceC67707Qhj != null) {
                interfaceC67707Qhj.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LIZ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.LJLJJLL.size(); i++) {
            C67711Qhn LJIILIIL = LJIILIIL(i);
            if (LJIILIIL != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(LJIILIIL.LJLIL);
                printWriter.println(":");
                LJIILIIL.LJLILLLLZI.LJFF(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }
}
