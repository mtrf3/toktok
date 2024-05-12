package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: X.Qae, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67268Qae implements Runnable {
    public final C67271Qah LJLIL;
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC67269Qaf LJLILLLLZI;

    public RunnableC67268Qae(AbstractDialogInterfaceOnCancelListenerC67269Qaf abstractDialogInterfaceOnCancelListenerC67269Qaf, C67271Qah c67271Qah) {
        this.LJLILLLLZI = abstractDialogInterfaceOnCancelListenerC67269Qaf;
        this.LJLIL = c67271Qah;
    }

    public final void LIZ() {
        if (!this.LJLILLLLZI.LJLILLLLZI) {
            return;
        }
        ConnectionResult connectionResult = this.LJLIL.LIZIZ;
        if (connectionResult.LJJJJL()) {
            AbstractDialogInterfaceOnCancelListenerC67269Qaf abstractDialogInterfaceOnCancelListenerC67269Qaf = this.LJLILLLLZI;
            InterfaceC67296Qb6 interfaceC67296Qb6 = abstractDialogInterfaceOnCancelListenerC67269Qaf.LJLIL;
            Activity LIZIZ = abstractDialogInterfaceOnCancelListenerC67269Qaf.LIZIZ();
            PendingIntent pendingIntent = connectionResult.zzc;
            QH7.LJIIIIZZ(pendingIntent);
            int i = this.LJLIL.LIZ;
            Intent intent = new Intent(LIZIZ, (Class<?>) GoogleApiActivity.class);
            intent.putExtra("pending_intent", pendingIntent);
            intent.putExtra("failing_client_id", i);
            intent.putExtra("notify_manager", false);
            interfaceC67296Qb6.startActivityForResult(intent, 1);
            return;
        }
        AbstractDialogInterfaceOnCancelListenerC67269Qaf abstractDialogInterfaceOnCancelListenerC67269Qaf2 = this.LJLILLLLZI;
        if (abstractDialogInterfaceOnCancelListenerC67269Qaf2.LJLJJL.getErrorResolutionIntent(abstractDialogInterfaceOnCancelListenerC67269Qaf2.LIZIZ(), connectionResult.zzb, null) != null) {
            AbstractDialogInterfaceOnCancelListenerC67269Qaf abstractDialogInterfaceOnCancelListenerC67269Qaf3 = this.LJLILLLLZI;
            GoogleApiAvailability googleApiAvailability = abstractDialogInterfaceOnCancelListenerC67269Qaf3.LJLJJL;
            Activity LIZIZ2 = abstractDialogInterfaceOnCancelListenerC67269Qaf3.LIZIZ();
            AbstractDialogInterfaceOnCancelListenerC67269Qaf abstractDialogInterfaceOnCancelListenerC67269Qaf4 = this.LJLILLLLZI;
            googleApiAvailability.zag(LIZIZ2, abstractDialogInterfaceOnCancelListenerC67269Qaf4.LJLIL, connectionResult.zzb, 2, abstractDialogInterfaceOnCancelListenerC67269Qaf4);
            return;
        }
        if (connectionResult.zzb == 18) {
            AbstractDialogInterfaceOnCancelListenerC67269Qaf abstractDialogInterfaceOnCancelListenerC67269Qaf5 = this.LJLILLLLZI;
            Dialog zab = abstractDialogInterfaceOnCancelListenerC67269Qaf5.LJLJJL.zab(abstractDialogInterfaceOnCancelListenerC67269Qaf5.LIZIZ(), this.LJLILLLLZI);
            AbstractDialogInterfaceOnCancelListenerC67269Qaf abstractDialogInterfaceOnCancelListenerC67269Qaf6 = this.LJLILLLLZI;
            abstractDialogInterfaceOnCancelListenerC67269Qaf6.LJLJJL.zac(C16880lQ.LLLLJ(abstractDialogInterfaceOnCancelListenerC67269Qaf6.LIZIZ()), new C67270Qag(this, zab));
            return;
        }
        AbstractDialogInterfaceOnCancelListenerC67269Qaf abstractDialogInterfaceOnCancelListenerC67269Qaf7 = this.LJLILLLLZI;
        int i2 = this.LJLIL.LIZ;
        abstractDialogInterfaceOnCancelListenerC67269Qaf7.LJLJI.set(null);
        abstractDialogInterfaceOnCancelListenerC67269Qaf7.LJIIIZ(connectionResult, i2);
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
