package com.ss.ugc.aweme.creation.base;

import X.C1FL;
import X.C64486PSo;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class RecordBeautyConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordBeautyConfigModel> CREATOR = new C64486PSo();

    @InterfaceC65349Pkn("forbid_save_apply_last_beauty")
    public Boolean forbidSaveApplyLastBeauty;

    @InterfaceC65349Pkn("force_use_switch")
    public Boolean forceUseSwitch;

    /* JADX WARN: Multi-variable type inference failed */
    public RecordBeautyConfigModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Boolean getForbidSaveApplyLastBeauty() {
        return this.forbidSaveApplyLastBeauty;
    }

    public final Boolean getForceUseSwitch() {
        return this.forceUseSwitch;
    }

    public final void setForbidSaveApplyLastBeauty(Boolean bool) {
        this.forbidSaveApplyLastBeauty = bool;
    }

    public final void setForceUseSwitch(Boolean bool) {
        this.forceUseSwitch = bool;
    }

    public RecordBeautyConfigModel(Boolean bool, Boolean bool2) {
        this.forbidSaveApplyLastBeauty = bool;
        this.forceUseSwitch = bool2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        Boolean bool = this.forbidSaveApplyLastBeauty;
        if (bool != null) {
            C1FL.LJ(parcel, 1, bool);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.forceUseSwitch;
        if (bool2 != null) {
            C1FL.LJ(parcel, 1, bool2);
        } else {
            parcel.writeInt(0);
        }
    }

    public /* synthetic */ RecordBeautyConfigModel(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
