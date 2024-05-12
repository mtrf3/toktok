package com.ss.ugc.aweme.creation.base;

import X.C64487PSp;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class RecordFilterConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordFilterConfigModel> CREATOR = new C64487PSp();

    @InterfaceC65349Pkn("forbid_save_apply_last_filter")
    public Boolean forbidSaveApplyLastFilter;

    /* JADX WARN: Multi-variable type inference failed */
    public RecordFilterConfigModel() {
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
        Boolean bool = this.forbidSaveApplyLastFilter;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public final Boolean getForbidSaveApplyLastFilter() {
        return this.forbidSaveApplyLastFilter;
    }

    public RecordFilterConfigModel(Boolean bool) {
        this.forbidSaveApplyLastFilter = bool;
    }

    public final void setForbidSaveApplyLastFilter(Boolean bool) {
        this.forbidSaveApplyLastFilter = bool;
    }

    public /* synthetic */ RecordFilterConfigModel(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
