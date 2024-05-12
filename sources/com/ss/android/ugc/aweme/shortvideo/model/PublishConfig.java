package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<PublishConfig> CREATOR = new Creator();

    @InterfaceC65349Pkn("mature_theme")
    public int matureTheme;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<PublishConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PublishConfig createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new PublishConfig(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PublishConfig[] newArray(int i) {
            return new PublishConfig[i];
        }
    }

    public PublishConfig() {
        this(0, 1, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.matureTheme);
    }

    public final int getMatureTheme() {
        return this.matureTheme;
    }

    public PublishConfig(int i) {
        this.matureTheme = i;
    }

    public final void setMatureTheme(int i) {
        this.matureTheme = i;
    }

    public /* synthetic */ PublishConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
