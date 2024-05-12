package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.QzZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68813QzZ extends BinderC68756Qye implements R04 {
    public static R04 LLJI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof R04) {
            return (R04) queryLocalInterface;
        }
        return new C68812QzY(iBinder);
    }
}
