package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.QkT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67877QkT extends AbstractC67863QkF {
    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 12451000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof InterfaceC68041Qn7) {
            return queryLocalInterface;
        }
        return new C68210Qpq(iBinder);
    }

    public C67877QkT(Context context, Looper looper, ServiceConnectionC67949Qld serviceConnectionC67949Qld, ServiceConnectionC67949Qld serviceConnectionC67949Qld2) {
        super(context, looper, AbstractC67866QkI.LIZ(context), C67258QaU.getInstance(), 93, serviceConnectionC67949Qld, serviceConnectionC67949Qld2, null);
    }
}
