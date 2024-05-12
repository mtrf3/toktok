package X;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qn9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68043Qn9 implements Runnable {
    public final /* synthetic */ AtomicReference LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ zzq LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ C68022Qmo LJLJJLL;

    public RunnableC68043Qn9(C68022Qmo c68022Qmo, AtomicReference atomicReference, String str, String str2, zzq zzqVar, boolean z) {
        this.LJLJJLL = c68022Qmo;
        this.LJLIL = atomicReference;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = zzqVar;
        this.LJLJJL = z;
    }

    public final void LIZ() {
        AtomicReference atomicReference;
        C68022Qmo c68022Qmo;
        InterfaceC68041Qn7 interfaceC68041Qn7;
        synchronized (this.LJLIL) {
            try {
                try {
                    c68022Qmo = this.LJLJJLL;
                    interfaceC68041Qn7 = c68022Qmo.LIZLLL;
                } catch (RemoteException e) {
                    this.LJLJJLL.LIZ.LIZJ().LJFF.LIZLLL(null, this.LJLILLLLZI, e, "(legacy) Failed to get user properties; remote exception");
                    this.LJLIL.set(Collections.emptyList());
                    atomicReference = this.LJLIL;
                }
                if (interfaceC68041Qn7 == null) {
                    c68022Qmo.LIZ.LIZJ().LJFF.LIZLLL(null, this.LJLILLLLZI, this.LJLJI, "(legacy) Failed to get user properties; not connected to service");
                    this.LJLIL.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    QH7.LJIIIIZZ(this.LJLJJI);
                    this.LJLIL.set(interfaceC68041Qn7.E(this.LJLILLLLZI, this.LJLJI, this.LJLJJL, this.LJLJJI));
                } else {
                    this.LJLIL.set(interfaceC68041Qn7.R(null, this.LJLILLLLZI, this.LJLJI, this.LJLJJL));
                }
                this.LJLJJLL.LJIILLIIL();
                atomicReference = this.LJLIL;
                atomicReference.notify();
            } finally {
                this.LJLIL.notify();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
