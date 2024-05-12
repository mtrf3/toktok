package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QmI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC67990QmI extends BinderC67696QhY {
    public AbstractBinderC67990QmI() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // X.BinderC67696QhY
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) C67988QmG.LIZ(parcel, Status.CREATOR);
            Parcelable LIZ = C67988QmG.LIZ(parcel, BeginSignInResult.CREATOR);
            C67988QmG.LIZIZ(parcel);
            C78923UyF.LJIIZILJ(status, LIZ, ((BinderC68011Qmd) this).LJLIL);
            return true;
        }
        return false;
    }
}
