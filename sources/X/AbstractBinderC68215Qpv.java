package X;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: X.Qpv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68215Qpv extends BinderC68226Qq6 implements InterfaceC68139Qoh {
    public AbstractBinderC68215Qpv() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // X.BinderC68226Qq6
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
            C68209Qpp.LIZIZ(parcel);
            ((BinderC68193QpZ) this).LJJJZ(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
