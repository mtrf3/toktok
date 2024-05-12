package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QmK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC67992QmK extends BinderC67696QhY implements InterfaceC68006QmY {
    public AbstractBinderC67992QmK() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // X.BinderC67696QhY
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                C67988QmG.LIZ(parcel, Status.CREATOR);
                parcel.readString();
                C67988QmG.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            }
            Status status = (Status) C67988QmG.LIZ(parcel, Status.CREATOR);
            C67988QmG.LIZIZ(parcel);
            LJJL(status);
        } else {
            Status status2 = (Status) C67988QmG.LIZ(parcel, Status.CREATOR);
            Credential credential = (Credential) C67988QmG.LIZ(parcel, Credential.CREATOR);
            C67988QmG.LIZIZ(parcel);
            I(status2, credential);
        }
        parcel2.writeNoException();
        return true;
    }
}
