package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Qt5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68411Qt5 extends BinderC68417QtB {
    public AbstractBinderC68411Qt5() {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }

    @Override // X.BinderC68417QtB
    public final boolean LJLJI(int i, Parcel parcel) {
        if (i == 1) {
            Status status = (Status) C67636Qga.LIZ(parcel, Status.CREATOR);
            int readInt = parcel.readInt();
            C67636Qga.LIZIZ(parcel);
            C78923UyF.LJIIZILJ(status, Integer.valueOf(readInt), ((BinderC68419QtD) this).LJLIL);
            return true;
        }
        return false;
    }
}
