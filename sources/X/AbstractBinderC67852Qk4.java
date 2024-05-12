package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;

/* renamed from: X.Qk4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC67852Qk4 extends BinderC67895Qkl implements InterfaceC67967Qlv {
    public AbstractBinderC67852Qk4() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // X.BinderC67895Qkl
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                C36492ETw.LIZ(parcel, ConnectionResult.CREATOR);
                C36492ETw.LIZ(parcel, zaa.CREATOR);
                break;
            case 4:
                C36492ETw.LIZ(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                C36492ETw.LIZ(parcel, Status.CREATOR);
                break;
            case 7:
                C36492ETw.LIZ(parcel, Status.CREATOR);
                C36492ETw.LIZ(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                LLIIJLIL((zak) C36492ETw.LIZ(parcel, zak.CREATOR));
                break;
            case 9:
                C36492ETw.LIZ(parcel, zag.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
