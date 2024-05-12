package X;

import android.os.Parcel;

/* renamed from: X.Qzs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68832Qzs extends BinderC68756Qye {
    public AbstractBinderC68832Qzs() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            ((BinderC68831Qzr) this).LJLIL.onCancel();
        } else {
            ((BinderC68831Qzr) this).LJLIL.LIZ();
        }
        parcel2.writeNoException();
        return true;
    }
}
