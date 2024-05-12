package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import X.HBV;
import X.InterfaceC65349Pkn;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GreenScreenMaterial extends F9E implements Parcelable, Serializable {

    @InterfaceC65349Pkn("author_name")
    public String authorName;

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("localPath")
    public String localPath;

    @InterfaceC65349Pkn("mediasource")
    public String mediasource;

    @InterfaceC65349Pkn("resource_id")
    public String resId;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("effect_id")
    public String stickerId;

    @InterfaceC65349Pkn("type")
    public int type;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<GreenScreenMaterial> CREATOR = new Creator();
    public static final String[] MEDIA_TYPE_STRING = {"all", "photo", "video", "giphy"};

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<GreenScreenMaterial> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GreenScreenMaterial createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new GreenScreenMaterial(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GreenScreenMaterial[] newArray(int i) {
            return new GreenScreenMaterial[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GreenScreenMaterial() {
        /*
            r13 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r11 = 255(0xff, float:3.57E-43)
            r0 = r13
            r4 = r2
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r12 = r6
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial.<init>():void");
    }

    public static final byte[] bundleToBytes(Bundle bundle) {
        return Companion.bundleToBytes(bundle);
    }

    public static final Bundle bytesToBundle(byte[] bArr) {
        return Companion.bytesToBundle(bArr);
    }

    public static /* synthetic */ GreenScreenMaterial copy$default(GreenScreenMaterial greenScreenMaterial, int i, long j, long j2, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = greenScreenMaterial.type;
        }
        if ((i2 & 2) != 0) {
            j = greenScreenMaterial.startTime;
        }
        if ((i2 & 4) != 0) {
            j2 = greenScreenMaterial.endTime;
        }
        if ((i2 & 8) != 0) {
            str = greenScreenMaterial.resId;
        }
        if ((i2 & 16) != 0) {
            str2 = greenScreenMaterial.authorName;
        }
        if ((i2 & 32) != 0) {
            str3 = greenScreenMaterial.stickerId;
        }
        if ((i2 & 64) != 0) {
            str4 = greenScreenMaterial.localPath;
        }
        if ((i2 & 128) != 0) {
            str5 = greenScreenMaterial.mediasource;
        }
        return greenScreenMaterial.copy(i, j, j2, str, str2, str3, str4, str5);
    }

    public static final void register(HBV hbv) {
        Companion.register(hbv);
    }

    public final GreenScreenMaterial copy(int i, long j, long j2, String resId, String authorName, String stickerId, String localPath, String mediasource) {
        o.LJIIIZ(resId, "resId");
        o.LJIIIZ(authorName, "authorName");
        o.LJIIIZ(stickerId, "stickerId");
        o.LJIIIZ(localPath, "localPath");
        o.LJIIIZ(mediasource, "mediasource");
        return new GreenScreenMaterial(i, j, j2, resId, authorName, stickerId, localPath, mediasource);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type), Long.valueOf(this.startTime), Long.valueOf(this.endTime), this.resId, this.authorName, this.stickerId, this.localPath, this.mediasource};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.type);
        out.writeLong(this.startTime);
        out.writeLong(this.endTime);
        out.writeString(this.resId);
        out.writeString(this.authorName);
        out.writeString(this.stickerId);
        out.writeString(this.localPath);
        out.writeString(this.mediasource);
    }

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final String[] getMEDIA_TYPE_STRING() {
            return GreenScreenMaterial.MEDIA_TYPE_STRING;
        }

        public final byte[] bundleToBytes(Bundle bundle) {
            o.LJIIIZ(bundle, "bundle");
            Parcel obtain = Parcel.obtain();
            o.LJIIIIZZ(obtain, "obtain()");
            obtain.writeBundle(bundle);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        }

        public final Bundle bytesToBundle(byte[] bytes) {
            o.LJIIIZ(bytes, "bytes");
            Parcel obtain = Parcel.obtain();
            o.LJIIIIZZ(obtain, "obtain()");
            obtain.unmarshall(bytes, 0, bytes.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(GreenScreenMaterial.class.getClassLoader());
            obtain.recycle();
            o.LJI(readBundle);
            return readBundle;
        }

        public final void register(HBV mapping) {
            o.LJIIIZ(mapping, "mapping");
            mapping.LIZ(GreenScreenMaterial.class, "extra_key_green_screen_material");
        }
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getMediasource() {
        return this.mediasource;
    }

    public final String getResId() {
        return this.resId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAuthorName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.authorName = str;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setLocalPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.localPath = str;
    }

    public final void setMediasource(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.mediasource = str;
    }

    public final void setResId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.resId = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStickerId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.stickerId = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public GreenScreenMaterial(int i, long j, long j2, String resId, String authorName, String stickerId, String localPath, String mediasource) {
        o.LJIIIZ(resId, "resId");
        o.LJIIIZ(authorName, "authorName");
        o.LJIIIZ(stickerId, "stickerId");
        o.LJIIIZ(localPath, "localPath");
        o.LJIIIZ(mediasource, "mediasource");
        this.type = i;
        this.startTime = j;
        this.endTime = j2;
        this.resId = resId;
        this.authorName = authorName;
        this.stickerId = stickerId;
        this.localPath = localPath;
        this.mediasource = mediasource;
    }

    public /* synthetic */ GreenScreenMaterial(int i, long j, long j2, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) == 0 ? j2 : 0L, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) == 0 ? str5 : "");
    }
}
