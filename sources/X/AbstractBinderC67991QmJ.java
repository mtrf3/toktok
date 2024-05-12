package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QmJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC67991QmJ extends BinderC67696QhY implements InterfaceC68009Qmb {
    public AbstractBinderC67991QmJ() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // X.BinderC67696QhY
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                C67988QmG.LIZ(parcel, GoogleSignInAccount.CREATOR);
                C67988QmG.LIZ(parcel, Status.CREATOR);
                C67988QmG.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) C67988QmG.LIZ(parcel, Status.CREATOR);
                C67988QmG.LIZIZ(parcel);
                LJJL(status);
                break;
            case 103:
                Status status2 = (Status) C67988QmG.LIZ(parcel, Status.CREATOR);
                C67988QmG.LIZIZ(parcel);
                LLZZ(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
