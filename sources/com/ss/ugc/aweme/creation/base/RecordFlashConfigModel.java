package com.ss.ugc.aweme.creation.base;

import X.C64488PSq;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class RecordFlashConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordFlashConfigModel> CREATOR = new C64488PSq();

    @InterfaceC65349Pkn("forbid_front_flash")
    public Boolean forbidFrontFlash;

    /* JADX WARN: Multi-variable type inference failed */
    public RecordFlashConfigModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        o.LJIIIZ(parcel, "parcel");
        Boolean bool = this.forbidFrontFlash;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public final Boolean getForbidFrontFlash() {
        return this.forbidFrontFlash;
    }

    public RecordFlashConfigModel(Boolean bool) {
        this.forbidFrontFlash = bool;
    }

    public final void setForbidFrontFlash(Boolean bool) {
        this.forbidFrontFlash = bool;
    }

    public /* synthetic */ RecordFlashConfigModel(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
