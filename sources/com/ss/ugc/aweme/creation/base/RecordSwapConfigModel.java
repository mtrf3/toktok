package com.ss.ugc.aweme.creation.base;

import X.C64481PSj;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class RecordSwapConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordSwapConfigModel> CREATOR = new C64481PSj();

    @InterfaceC65349Pkn("default_position")
    public String defaultPosition;

    @InterfaceC65349Pkn("forbid_save_apply_last_swap")
    public Boolean forbidSaveApplyLastSwap;

    /* JADX WARN: Multi-variable type inference failed */
    public RecordSwapConfigModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
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
        Boolean bool = this.forbidSaveApplyLastSwap;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.defaultPosition);
    }

    public final String getDefaultPosition() {
        return this.defaultPosition;
    }

    public final Boolean getForbidSaveApplyLastSwap() {
        return this.forbidSaveApplyLastSwap;
    }

    public final void setDefaultPosition(String str) {
        this.defaultPosition = str;
    }

    public final void setForbidSaveApplyLastSwap(Boolean bool) {
        this.forbidSaveApplyLastSwap = bool;
    }

    public RecordSwapConfigModel(Boolean bool, String str) {
        this.forbidSaveApplyLastSwap = bool;
        this.defaultPosition = str;
    }

    public /* synthetic */ RecordSwapConfigModel(Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
    }
}
