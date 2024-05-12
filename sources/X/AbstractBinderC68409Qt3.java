package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Qt3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68409Qt3 extends BinderC68417QtB {
    public AbstractBinderC68409Qt3() {
        super("com.google.android.gms.auth.blockstore.internal.IIsEndToEndEncryptionAvailableCallback");
    }

    @Override // X.BinderC68417QtB
    public final boolean LJLJI(int i, Parcel parcel) {
        boolean z = false;
        if (i != 1) {
            return false;
        }
        Status status = (Status) C67636Qga.LIZ(parcel, Status.CREATOR);
        if (parcel.readInt() != 0) {
            z = true;
        }
        C67636Qga.LIZIZ(parcel);
        C78923UyF.LJIIZILJ(status, Boolean.valueOf(z), ((BinderC68420QtE) this).LJLIL);
        return true;
    }
}
