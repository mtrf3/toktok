package com.ugc.effectcreator.foundation.widgets.highlight;

import Y.IDCreatorS58S0000000_42;
import android.R;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes34.dex */
public class Configuration implements Parcelable {
    public static final Parcelable.Creator<Configuration> CREATOR = new IDCreatorS58S0000000_42(3);
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public View mTargetView;
    public int LJLJJLL = 255;
    public int LJLJL = -1;
    public int LJLJLJ = -1;
    public int LJLLI = R.color.black;
    public boolean LJLLILLLL = true;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LJLJJLL);
        parcel.writeInt(this.LJLJL);
        parcel.writeInt(this.LJLJLJ);
        parcel.writeInt(this.LJLLI);
        parcel.writeInt(this.LJLJLLL);
        parcel.writeInt(this.LJLIL);
        parcel.writeInt(this.LJLILLLLZI);
        parcel.writeInt(this.LJLJI);
        parcel.writeInt(this.LJLJJI);
        parcel.writeInt(this.LJLJJL);
        parcel.writeInt(this.LJLL);
        parcel.writeByte(this.LJLLILLLL ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LJLLLL ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LJLLJ ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LJLLL ? (byte) 1 : (byte) 0);
    }
}
