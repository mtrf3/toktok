package com.ss.android.ugc.aweme.creative.model.video2sticker;

import X.C43588H8u;
import X.F9E;
import X.GPV;
import X.InterfaceC36436ERs;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class OriginVideoInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<OriginVideoInfo> CREATOR = new Parcelable.Creator<OriginVideoInfo>() { // from class: X.5mA
        @Override // android.os.Parcelable.Creator
        public final OriginVideoInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new OriginVideoInfo(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OriginVideoInfo[] newArray(int i) {
            return new OriginVideoInfo[i];
        }
    };

    @GPV
    public String awemeId;

    @GPV
    public long coverTsp;

    @GPV
    public long duration;

    @InterfaceC36436ERs
    @GPV
    public String filePath;

    @InterfaceC65349Pkn("height")
    public int height;

    @GPV
    public String secUserId;

    @GPV
    public String userId;

    @GPV
    public int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OriginVideoInfo() {
        /*
            r13 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r11 = 255(0xff, float:3.57E-43)
            r0 = r13
            r5 = r2
            r6 = r1
            r7 = r1
            r8 = r3
            r10 = r1
            r12 = r1
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.filePath, Integer.valueOf(this.width), Long.valueOf(this.duration), Integer.valueOf(this.height), this.awemeId, this.userId, Long.valueOf(this.coverTsp), this.secUserId};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.filePath);
        out.writeInt(this.width);
        out.writeLong(this.duration);
        out.writeInt(this.height);
        out.writeString(this.awemeId);
        out.writeString(this.userId);
        out.writeLong(this.coverTsp);
        out.writeString(this.secUserId);
    }

    public OriginVideoInfo(String str, int i, long j, int i2, String str2, String str3, long j2, String str4) {
        C43588H8u.LIZLLL(str, "filePath", str2, "awemeId", str3, "userId", str4, "secUserId");
        this.filePath = str;
        this.width = i;
        this.duration = j;
        this.height = i2;
        this.awemeId = str2;
        this.userId = str3;
        this.coverTsp = j2;
        this.secUserId = str4;
    }

    public /* synthetic */ OriginVideoInfo(String str, int i, long j, int i2, String str2, String str3, long j2, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0L : j, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) == 0 ? j2 : 0L, (i3 & 128) == 0 ? str4 : "");
    }
}
