package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Qt2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68408Qt2 extends BinderC68417QtB {
    public AbstractBinderC68408Qt2() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override // X.BinderC68417QtB
    public final boolean LJLJI(int i, Parcel parcel) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) C67636Qga.LIZ(parcel, Status.CREATOR);
            Parcelable LIZ = C67636Qga.LIZ(parcel, RetrieveBytesResponse.CREATOR);
            C67636Qga.LIZIZ(parcel);
            C78923UyF.LJIIZILJ(status, LIZ, ((BinderC68407Qt1) this).LJLIL);
            return true;
        }
        C67636Qga.LIZ(parcel, Status.CREATOR);
        parcel.createByteArray();
        C67636Qga.LIZIZ(parcel);
        throw new UnsupportedOperationException();
    }
}
