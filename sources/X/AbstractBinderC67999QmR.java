package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QmR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC67999QmR extends BinderC67696QhY {
    public AbstractBinderC67999QmR() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // X.BinderC67696QhY
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) C67988QmG.LIZ(parcel, Status.CREATOR);
            Parcelable LIZ = C67988QmG.LIZ(parcel, SavePasswordResult.CREATOR);
            C67988QmG.LIZIZ(parcel);
            C78923UyF.LJIIZILJ(status, LIZ, ((BinderC68008Qma) this).LJLIL);
            return true;
        }
        return false;
    }
}
