package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Qzo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68828Qzo extends BinderC68756Qye {
    public AbstractBinderC68828Qzo() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC68016Qmi c68827Qzn;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c68827Qzn = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (queryLocalInterface instanceof InterfaceC68016Qmi) {
                    c68827Qzn = (InterfaceC68016Qmi) queryLocalInterface;
                } else {
                    c68827Qzn = new C68827Qzn(readStrongBinder);
                }
            }
            C68223Qq3.LIZ(parcel);
            InterfaceC68834Qzu interfaceC68834Qzu = ((BinderC68829Qzp) this).LJLIL;
            new C67942QlW(c68827Qzn);
            interfaceC68834Qzu.LIZ();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
