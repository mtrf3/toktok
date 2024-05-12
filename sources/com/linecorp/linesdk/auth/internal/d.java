package com.linecorp.linesdk.auth.internal;

import X.C66530Q9e;
import X.EnumC66528Q9c;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new IDCreatorS54S0000000_11(53);
    public C66530Q9e LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public d() {
        this.LJLJJI = 1;
    }

    public d(Parcel parcel) {
        C66530Q9e c66530Q9e;
        this.LJLJJI = 1;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (TextUtils.isEmpty(readString) || TextUtils.isEmpty(readString2)) {
            c66530Q9e = null;
        } else {
            c66530Q9e = new C66530Q9e(readString, readString2);
        }
        this.LJLIL = c66530Q9e;
        this.LJLILLLLZI = parcel.readString();
        this.LJLJJI = ((int[]) EnumC66528Q9c.LJLIL.clone())[parcel.readByte()];
        this.LJLJI = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C66530Q9e c66530Q9e = this.LJLIL;
        String str2 = null;
        if (c66530Q9e == null) {
            str = null;
        } else {
            str = c66530Q9e.LIZ;
        }
        parcel.writeString(str);
        C66530Q9e c66530Q9e2 = this.LJLIL;
        if (c66530Q9e2 != null) {
            str2 = c66530Q9e2.LIZIZ;
        }
        parcel.writeString(str2);
        parcel.writeString(this.LJLILLLLZI);
        parcel.writeByte((byte) (this.LJLJJI - 1));
        parcel.writeString(this.LJLJI);
    }
}
