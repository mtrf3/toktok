package com.google.android.gms.auth.api.credentials;

import X.C67731Qi7;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C67731Qi7();
    public final int LJLIL;
    public final boolean zbb;
    public final boolean zbc;
    public final int zbd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        boolean z = true;
        C79057V0z.LJJJZ(parcel, 1, this.zbb);
        C79057V0z.LJJJZ(parcel, 2, this.zbc);
        if (this.zbd != 3) {
            z = false;
        }
        C79057V0z.LJJJZ(parcel, 3, z);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zbd);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1000, this.LJLIL);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CredentialPickerConfig(boolean z, boolean z2, int i, int i2, boolean z3) {
        this.LJLIL = i;
        this.zbb = z;
        this.zbc = z2;
        if (i < 2) {
            this.zbd = true == z3 ? 3 : 1;
        } else {
            this.zbd = i2;
        }
    }
}
