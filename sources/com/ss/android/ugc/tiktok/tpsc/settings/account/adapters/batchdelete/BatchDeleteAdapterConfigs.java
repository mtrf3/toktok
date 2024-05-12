package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.batchdelete;

import X.F9E;
import X.SHQ;
import X.SHR;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BatchDeleteAdapterConfigs extends F9E implements Parcelable {
    public static final Parcelable.Creator<BatchDeleteAdapterConfigs> CREATOR = new SHQ();
    public final SHR deleteType;
    public final int extraTopMargin;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.deleteType, Integer.valueOf(this.extraTopMargin)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.deleteType.name());
        out.writeInt(this.extraTopMargin);
    }

    public BatchDeleteAdapterConfigs(SHR deleteType, int i) {
        o.LJIIIZ(deleteType, "deleteType");
        this.deleteType = deleteType;
        this.extraTopMargin = i;
    }
}
