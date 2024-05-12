package X;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.QkQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67874QkQ extends AbstractC67875QkR<Boolean> {
    public final int LIZLLL;
    public final Bundle LJ;
    public final /* synthetic */ AbstractC67863QkF LJFF;

    @Override // X.AbstractC67875QkR
    public final void LIZIZ() {
    }

    public abstract void LJ(ConnectionResult connectionResult);

    public abstract boolean LJFF();

    @Override // X.AbstractC67875QkR
    public final /* bridge */ /* synthetic */ void LIZ() {
        PendingIntent pendingIntent = null;
        if (this.LIZLLL == 0) {
            if (!LJFF()) {
                this.LJFF.LJJIJLIJ(1, null);
                LJ(new ConnectionResult(8, null));
                return;
            }
            return;
        }
        this.LJFF.LJJIJLIJ(1, null);
        Bundle bundle = this.LJ;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        LJ(new ConnectionResult(this.LIZLLL, pendingIntent));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC67874QkQ(AbstractC67863QkF abstractC67863QkF, int i, Bundle bundle) {
        super(abstractC67863QkF, Boolean.TRUE);
        this.LJFF = abstractC67863QkF;
        this.LIZLLL = i;
        this.LJ = bundle;
    }
}
