package com.google.android.gms.auth.api.identity;

import X.C64363PNv;
import X.C68514Quk;
import X.C68515Qul;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new C68514Quk();
    public final SignInPassword zba;
    public final String zbb;
    public final int zbc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb});
    }

    public static C68515Qul LJJJJL(SavePasswordRequest savePasswordRequest) {
        C68515Qul c68515Qul = new C68515Qul();
        c68515Qul.LIZ = savePasswordRequest.zba;
        c68515Qul.LIZJ = savePasswordRequest.zbc;
        String str = savePasswordRequest.zbb;
        if (str != null) {
            c68515Qul.LIZIZ = str;
        }
        return c68515Qul;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!C64363PNv.LIZ(this.zba, savePasswordRequest.zba) || !C64363PNv.LIZ(this.zbb, savePasswordRequest.zbb) || this.zbc != savePasswordRequest.zbc) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.zba, i, false);
        C79057V0z.LJJZZIII(parcel, 2, this.zbb, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zbc);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        QH7.LJIIIIZZ(signInPassword);
        this.zba = signInPassword;
        this.zbb = str;
        this.zbc = i;
    }
}
