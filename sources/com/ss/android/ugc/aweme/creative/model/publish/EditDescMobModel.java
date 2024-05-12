package com.ss.android.ugc.aweme.creative.model.publish;

import X.GPV;
import X.H8Q;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditDescMobModel implements Parcelable {
    public static final Parcelable.Creator<EditDescMobModel> CREATOR = new H8Q();

    @GPV
    public boolean isMobAutoExpandTriggered;

    @GPV
    public boolean isMobClickTagButton;

    @GPV
    public boolean isMobExceedDescLimitToastPopUp;

    @GPV
    public boolean isMobExceedTitleLimitToastPopUp;

    @GPV
    public boolean isMobTypeMoreThanLimitTriggered;

    public EditDescMobModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isMobTypeMoreThanLimitTriggered ? 1 : 0);
        out.writeInt(this.isMobClickTagButton ? 1 : 0);
        out.writeInt(this.isMobAutoExpandTriggered ? 1 : 0);
        out.writeInt(this.isMobExceedTitleLimitToastPopUp ? 1 : 0);
        out.writeInt(this.isMobExceedDescLimitToastPopUp ? 1 : 0);
    }

    public /* synthetic */ EditDescMobModel(int i) {
        this(false, false, false, false, false);
    }

    public EditDescMobModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isMobTypeMoreThanLimitTriggered = z;
        this.isMobClickTagButton = z2;
        this.isMobAutoExpandTriggered = z3;
        this.isMobExceedTitleLimitToastPopUp = z4;
        this.isMobExceedDescLimitToastPopUp = z5;
    }
}
