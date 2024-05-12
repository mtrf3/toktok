package com.ss.android.ugc.aweme.creative.model.common;

import X.C42826GrO;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LogPbBean implements Serializable, Parcelable {
    public static final Parcelable.Creator<LogPbBean> CREATOR = new C42826GrO();

    @InterfaceC65349Pkn("impr_id")
    public String imprId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public final String getImprId() {
        return this.imprId;
    }

    public final void setImprId(String str) {
        this.imprId = str;
    }
}
