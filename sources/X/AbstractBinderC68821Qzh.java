package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Qzh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68821Qzh extends BinderC68756Qye {
    public AbstractBinderC68821Qzh() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC68823Qzj c68822Qzi;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c68822Qzi = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (queryLocalInterface instanceof InterfaceC68823Qzj) {
                    c68822Qzi = (InterfaceC68823Qzj) queryLocalInterface;
                } else {
                    c68822Qzi = new C68822Qzi(readStrongBinder);
                }
            }
            C68223Qq3.LIZ(parcel);
            ((BinderC68820Qzg) this).LJLIL.LIZ(new C68824Qzk(c68822Qzi));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
