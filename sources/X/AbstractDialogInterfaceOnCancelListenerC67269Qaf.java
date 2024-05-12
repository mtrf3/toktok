package X;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qaf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC67269Qaf extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean LJLILLLLZI;
    public final AtomicReference<C67271Qah> LJLJI;
    public final HandlerC67272Qai LJLJJI;
    public final GoogleApiAvailability LJLJJL;

    public abstract void LJIIIZ(ConnectionResult connectionResult, int i);

    public abstract void LJIIJ();

    public final void LJIIJJI() {
        this.LJLJI.set(null);
        LJIIJ();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJ(Bundle bundle) {
        C67271Qah c67271Qah;
        if (bundle != null) {
            AtomicReference<C67271Qah> atomicReference = this.LJLJI;
            if (bundle.getBoolean("resolving_error", false)) {
                c67271Qah = new C67271Qah(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                c67271Qah = null;
            }
            atomicReference.set(c67271Qah);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJI(Bundle bundle) {
        C67271Qah c67271Qah = this.LJLJI.get();
        if (c67271Qah == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c67271Qah.LIZ);
        bundle.putInt("failed_status", c67271Qah.LIZIZ.zzb);
        bundle.putParcelable("failed_resolution", c67271Qah.LIZIZ.zzc);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i;
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        C67271Qah c67271Qah = this.LJLJI.get();
        if (c67271Qah == null) {
            i = -1;
        } else {
            i = c67271Qah.LIZ;
        }
        this.LJLJI.set(null);
        LJIIIZ(connectionResult, i);
    }

    public AbstractDialogInterfaceOnCancelListenerC67269Qaf(InterfaceC67296Qb6 interfaceC67296Qb6, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC67296Qb6);
        this.LJLJI = new AtomicReference<>(null);
        this.LJLJJI = new HandlerC67272Qai(C16880lQ.LLJJJJ());
        this.LJLJJL = googleApiAvailability;
    }

    public final void LJIIL(ConnectionResult connectionResult, int i) {
        C67271Qah c67271Qah = new C67271Qah(connectionResult, i);
        AtomicReference<C67271Qah> atomicReference = this.LJLJI;
        while (!atomicReference.compareAndSet(null, c67271Qah)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.LJLJJI.post(new RunnableC67268Qae(this, c67271Qah));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LIZLLL(int i, int i2, Intent intent) {
        C67271Qah c67271Qah = this.LJLJI.get();
        if (i != 1) {
            if (i == 2) {
                int LLLLLZIL = C16880lQ.LLLLLZIL(this.LJLJJL, LIZIZ());
                if (LLLLLZIL == 0) {
                    LJIIJJI();
                    return;
                }
                if (c67271Qah == null) {
                    return;
                }
                if (c67271Qah.LIZIZ.zzb == 18 && LLLLLZIL == 18) {
                    return;
                }
                ConnectionResult connectionResult = c67271Qah.LIZIZ;
                int i3 = c67271Qah.LIZ;
                this.LJLJI.set(null);
                LJIIIZ(connectionResult, i3);
            }
        } else {
            if (i2 == -1) {
                LJIIJJI();
                return;
            }
            if (i2 == 0) {
                if (c67271Qah == null) {
                    return;
                }
                int i4 = 13;
                if (intent != null) {
                    i4 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                ConnectionResult connectionResult2 = new ConnectionResult(1, i4, null, c67271Qah.LIZIZ.toString());
                int i5 = c67271Qah.LIZ;
                this.LJLJI.set(null);
                LJIIIZ(connectionResult2, i5);
                return;
            }
        }
        if (c67271Qah == null) {
            return;
        }
        ConnectionResult connectionResult3 = c67271Qah.LIZIZ;
        int i32 = c67271Qah.LIZ;
        this.LJLJI.set(null);
        LJIIIZ(connectionResult3, i32);
    }
}
