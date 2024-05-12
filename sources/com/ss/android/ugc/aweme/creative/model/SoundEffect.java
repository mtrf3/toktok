package com.ss.android.ugc.aweme.creative.model;

import X.C08880Wm;
import X.C16880lQ;
import X.C79062V1e;
import X.GPV;
import X.InterfaceC36436ERs;
import X.InterfaceC65349Pkn;
import X.JBR;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SoundEffect implements Parcelable {
    public static final Parcelable.Creator<SoundEffect> CREATOR = new Parcelable.Creator<SoundEffect>() { // from class: X.5V4
        @Override // android.os.Parcelable.Creator
        public final SoundEffect createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String readString2 = parcel.readString();
            long readLong2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new SoundEffect(readLong, readString, urlModel, readInt, readInt2, z, readInt3, readInt4, z2, readString2, readLong2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final SoundEffect[] newArray(int i) {
            return new SoundEffect[i];
        }
    };

    @InterfaceC65349Pkn("audition_duration")
    public final int auditionDuration;

    @InterfaceC65349Pkn("collect_stat")
    public final int collectStatus;

    @InterfaceC65349Pkn("duration")
    public final int duration;

    @InterfaceC65349Pkn("file_duration")
    public long fileDuration;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("file_local_path")
    public String fileLocalPath;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("is_commerce_music")
    public final boolean isCommerceMusic;

    @GPV
    public boolean isLocalFileExist;

    @InterfaceC65349Pkn("title")
    public final String musicName;

    @InterfaceC65349Pkn("is_audio_url_with_cookie")
    public final boolean needSetCookie;

    @InterfaceC65349Pkn("play_url")
    public final UrlModel playUrl;

    @InterfaceC65349Pkn("shoot_duration")
    public final int shootDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SoundEffect() {
        /*
            r17 = this;
            r1 = 0
            r3 = 0
            r5 = 0
            r15 = 4095(0xfff, float:5.738E-42)
            r0 = r17
            r4 = r3
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r3
            r12 = r1
            r14 = r5
            r16 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.SoundEffect.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoundEffect)) {
            return false;
        }
        SoundEffect soundEffect = (SoundEffect) obj;
        return this.id == soundEffect.id && o.LJ(this.musicName, soundEffect.musicName) && o.LJ(this.playUrl, soundEffect.playUrl) && this.duration == soundEffect.duration && this.collectStatus == soundEffect.collectStatus && this.isCommerceMusic == soundEffect.isCommerceMusic && this.shootDuration == soundEffect.shootDuration && this.auditionDuration == soundEffect.auditionDuration && this.needSetCookie == soundEffect.needSetCookie && o.LJ(this.fileLocalPath, soundEffect.fileLocalPath) && this.fileDuration == soundEffect.fileDuration && this.isLocalFileExist == soundEffect.isLocalFileExist;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.id);
        out.writeString(this.musicName);
        out.writeSerializable(this.playUrl);
        out.writeInt(this.duration);
        out.writeInt(this.collectStatus);
        out.writeInt(this.isCommerceMusic ? 1 : 0);
        out.writeInt(this.shootDuration);
        out.writeInt(this.auditionDuration);
        out.writeInt(this.needSetCookie ? 1 : 0);
        out.writeString(this.fileLocalPath);
        out.writeLong(this.fileDuration);
        out.writeInt(this.isLocalFileExist ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LLJIJIL = C16880lQ.LLJIJIL(this.id) * 31;
        String str = this.musicName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        UrlModel urlModel = this.playUrl;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        int i3 = (((((i2 + i) * 31) + this.duration) * 31) + this.collectStatus) * 31;
        boolean z = this.isCommerceMusic;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (((((i3 + i5) * 31) + this.shootDuration) * 31) + this.auditionDuration) * 31;
        boolean z2 = this.needSetCookie;
        int i7 = z2;
        if (z2 != 0) {
            i7 = 1;
        }
        int LIZJ = JBR.LIZJ(this.fileDuration, C79062V1e.LJ(this.fileLocalPath, (i6 + i7) * 31, 31), 31);
        if (!this.isLocalFileExist) {
            i4 = 0;
        }
        return LIZJ + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SoundEffect(id=");
        sb.append(this.id);
        sb.append(", musicName=");
        sb.append(this.musicName);
        sb.append(", playUrl=");
        sb.append(this.playUrl);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", collectStatus=");
        sb.append(this.collectStatus);
        sb.append(", isCommerceMusic=");
        sb.append(this.isCommerceMusic);
        sb.append(", shootDuration=");
        sb.append(this.shootDuration);
        sb.append(", auditionDuration=");
        sb.append(this.auditionDuration);
        sb.append(", needSetCookie=");
        sb.append(this.needSetCookie);
        sb.append(", fileLocalPath=");
        sb.append(this.fileLocalPath);
        sb.append(", fileDuration=");
        sb.append(this.fileDuration);
        sb.append(", isLocalFileExist=");
        return C08880Wm.LIZJ(sb, this.isLocalFileExist, ')');
    }

    public static SoundEffect LIZ(SoundEffect soundEffect) {
        long j = soundEffect.id;
        String str = soundEffect.musicName;
        UrlModel urlModel = soundEffect.playUrl;
        int i = soundEffect.duration;
        int i2 = soundEffect.collectStatus;
        boolean z = soundEffect.isCommerceMusic;
        int i3 = soundEffect.shootDuration;
        int i4 = soundEffect.auditionDuration;
        boolean z2 = soundEffect.needSetCookie;
        String fileLocalPath = soundEffect.fileLocalPath;
        long j2 = soundEffect.fileDuration;
        boolean z3 = soundEffect.isLocalFileExist;
        soundEffect.getClass();
        o.LJIIIZ(fileLocalPath, "fileLocalPath");
        return new SoundEffect(j, str, urlModel, i, i2, z, i3, i4, z2, fileLocalPath, j2, z3);
    }

    public SoundEffect(long j, String str, UrlModel urlModel, int i, int i2, boolean z, int i3, int i4, boolean z2, String fileLocalPath, long j2, boolean z3) {
        o.LJIIIZ(fileLocalPath, "fileLocalPath");
        this.id = j;
        this.musicName = str;
        this.playUrl = urlModel;
        this.duration = i;
        this.collectStatus = i2;
        this.isCommerceMusic = z;
        this.shootDuration = i3;
        this.auditionDuration = i4;
        this.needSetCookie = z2;
        this.fileLocalPath = fileLocalPath;
        this.fileDuration = j2;
        this.isLocalFileExist = z3;
    }

    public /* synthetic */ SoundEffect(long j, String str, UrlModel urlModel, int i, int i2, boolean z, int i3, int i4, boolean z2, String str2, long j2, boolean z3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) != 0 ? null : str, (i5 & 4) == 0 ? urlModel : null, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? false : z, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 0 : i4, (i5 & 256) != 0 ? false : z2, (i5 & 512) != 0 ? "" : str2, (i5 & 1024) == 0 ? j2 : 0L, (i5 & 2048) == 0 ? z3 : false);
    }
}
