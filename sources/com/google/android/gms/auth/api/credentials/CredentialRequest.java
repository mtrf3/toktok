package com.google.android.gms.auth.api.credentials;

import X.C67729Qi5;
import X.C67730Qi6;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new C67730Qi6();
    public final int LJLIL;
    public final boolean zbb;
    public final String[] zbc;
    public final CredentialPickerConfig zbd;
    public final CredentialPickerConfig zbe;
    public final boolean zbf;
    public final String zbg;
    public final String zbh;
    public final boolean zbi;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJJZ(parcel, 1, this.zbb);
        C79057V0z.LJL(parcel, 2, this.zbc);
        C79057V0z.LJJZZI(parcel, 3, this.zbd, i, false);
        C79057V0z.LJJZZI(parcel, 4, this.zbe, i, false);
        C79057V0z.LJJJZ(parcel, 5, this.zbf);
        C79057V0z.LJJZZIII(parcel, 6, this.zbg, false);
        C79057V0z.LJJZZIII(parcel, 7, this.zbh, false);
        C79057V0z.LJJJZ(parcel, 8, this.zbi);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1000, this.LJLIL);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.LJLIL = i;
        this.zbb = z;
        QH7.LJIIIIZZ(strArr);
        this.zbc = strArr;
        this.zbd = credentialPickerConfig == null ? new C67729Qi5().LIZ() : credentialPickerConfig;
        this.zbe = credentialPickerConfig2 == null ? new C67729Qi5().LIZ() : credentialPickerConfig2;
        if (i < 3) {
            this.zbf = true;
            this.zbg = null;
            this.zbh = null;
        } else {
            this.zbf = z2;
            this.zbg = str;
            this.zbh = str2;
        }
        this.zbi = z3;
    }
}
