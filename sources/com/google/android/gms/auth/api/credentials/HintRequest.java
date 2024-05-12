package com.google.android.gms.auth.api.credentials;

import X.C67716Qhs;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new C67716Qhs();
    public final int LJLIL;
    public final CredentialPickerConfig zbb;
    public final boolean zbc;
    public final boolean zbd;
    public final String[] zbe;
    public final boolean zbf;
    public final String zbg;
    public final String zbh;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.zbb, i, false);
        C79057V0z.LJJJZ(parcel, 2, this.zbc);
        C79057V0z.LJJJZ(parcel, 3, this.zbd);
        C79057V0z.LJL(parcel, 4, this.zbe);
        C79057V0z.LJJJZ(parcel, 5, this.zbf);
        C79057V0z.LJJZZIII(parcel, 6, this.zbg, false);
        C79057V0z.LJJZZIII(parcel, 7, this.zbh, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1000, this.LJLIL);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.LJLIL = i;
        QH7.LJIIIIZZ(credentialPickerConfig);
        this.zbb = credentialPickerConfig;
        this.zbc = z;
        this.zbd = z2;
        QH7.LJIIIIZZ(strArr);
        this.zbe = strArr;
        if (i < 2) {
            this.zbf = true;
            this.zbg = null;
            this.zbh = null;
        } else {
            this.zbf = z3;
            this.zbg = str;
            this.zbh = str2;
        }
    }
}
