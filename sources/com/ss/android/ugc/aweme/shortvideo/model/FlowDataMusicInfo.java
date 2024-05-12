package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FlowDataMusicInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<FlowDataMusicInfo> CREATOR = new Creator();

    @InterfaceC65349Pkn("is_selected_by_auto")
    public boolean isSelectedByAuto;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<FlowDataMusicInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlowDataMusicInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new FlowDataMusicInfo(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlowDataMusicInfo[] newArray(int i) {
            return new FlowDataMusicInfo[i];
        }
    }

    public FlowDataMusicInfo() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isSelectedByAuto ? 1 : 0);
    }

    public final boolean isSelectedByAuto() {
        return this.isSelectedByAuto;
    }

    public FlowDataMusicInfo(boolean z) {
        this.isSelectedByAuto = z;
    }

    public final void setSelectedByAuto(boolean z) {
        this.isSelectedByAuto = z;
    }

    public /* synthetic */ FlowDataMusicInfo(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
