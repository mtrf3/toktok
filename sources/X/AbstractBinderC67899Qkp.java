package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Qkp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC67899Qkp extends BinderC67895Qkl {
    public AbstractBinderC67899Qkp() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // X.BinderC67895Qkl
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            C78923UyF.LJIIZILJ((Status) C36492ETw.LIZ(parcel, Status.CREATOR), null, ((BinderC67955Qlj) this).LJLIL);
            return true;
        }
        return false;
    }
}
