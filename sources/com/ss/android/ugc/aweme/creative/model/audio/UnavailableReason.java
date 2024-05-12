package com.ss.android.ugc.aweme.creative.model.audio;

import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class UnavailableReason implements Parcelable {
    public static final Parcelable.Creator<UnavailableReason> CREATOR = new Parcelable.Creator<UnavailableReason>() { // from class: X.6Eo
        @Override // android.os.Parcelable.Creator
        public final UnavailableReason createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new UnavailableReason(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UnavailableReason[] newArray(int i) {
            return new UnavailableReason[i];
        }
    };

    @GPV
    @InterfaceC65349Pkn("code")
    public final int code;

    @GPV
    @InterfaceC65349Pkn("desc")
    public final String desc;

    @GPV
    @InterfaceC65349Pkn("region")
    public final String region;

    /* JADX WARN: Multi-variable type inference failed */
    public UnavailableReason() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.code);
        out.writeString(this.desc);
        out.writeString(this.region);
    }

    public UnavailableReason(int i, String desc, String region) {
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(region, "region");
        this.code = i;
        this.desc = desc;
        this.region = region;
    }

    public /* synthetic */ UnavailableReason(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
