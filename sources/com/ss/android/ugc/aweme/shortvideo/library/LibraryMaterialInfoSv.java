package com.ss.android.ugc.aweme.shortvideo.library;

import X.C05040Hs;
import X.C1FJ;
import X.HBV;
import X.HBW;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.library.LibraryMaterialInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LibraryMaterialInfoSv implements Parcelable, Serializable {

    @InterfaceC65349Pkn("author")
    public final String author;

    @InterfaceC65349Pkn("cover")
    public final UrlModel cover;

    @InterfaceC65349Pkn("end_time")
    public Long endTime;

    @InterfaceC65349Pkn("height")
    public final Integer height;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("is_from_search")
    public final boolean isFromSearch;

    @InterfaceC65349Pkn("is_material_consumed")
    public boolean isLibraryMaterialConsumed;

    @InterfaceC65349Pkn("name")
    public final String materialName;

    @InterfaceC65349Pkn("material_provider")
    public final Integer materialProvider;

    @InterfaceC65349Pkn("material_type")
    public final Integer materialType;

    @InterfaceC65349Pkn("preview_webp")
    public final String preview;

    @InterfaceC65349Pkn("raw_file_path")
    public String rawFilePath;

    @InterfaceC65349Pkn("split_audio_path")
    public String splitAudioPath;

    @InterfaceC65349Pkn("split_video_path")
    public String splitVideoPath;

    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    @InterfaceC65349Pkn("used_count")
    public final Long usedCount;

    @InterfaceC65349Pkn("width")
    public final Integer width;
    public static final HBW Companion = new HBW();
    public static final Parcelable.Creator<LibraryMaterialInfoSv> CREATOR = new Parcelable.Creator<LibraryMaterialInfoSv>() { // from class: X.5T5
        @Override // android.os.Parcelable.Creator
        public final LibraryMaterialInfoSv createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            Long valueOf3;
            Long valueOf4;
            Long valueOf5;
            boolean z;
            Integer valueOf6;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Long.valueOf(parcel.readLong());
            }
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new LibraryMaterialInfoSv(readString, readString2, valueOf, valueOf2, urlModel, readString3, valueOf3, valueOf4, valueOf5, readString4, readString5, readString6, readString7, z, z2, valueOf6, num);
        }

        @Override // android.os.Parcelable.Creator
        public final LibraryMaterialInfoSv[] newArray(int i) {
            return new LibraryMaterialInfoSv[i];
        }
    };

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LibraryMaterialInfoSv() {
        /*
            r20 = this;
            r1 = 0
            r14 = 0
            r18 = 131071(0x1ffff, float:1.8367E-40)
            r0 = r20
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r15 = r14
            r16 = r1
            r17 = r1
            r19 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv.<init>():void");
    }

    public static final LibraryMaterialInfoSv convertFromMediaModel(MediaModel mediaModel, boolean z) {
        Companion.getClass();
        return HBW.LIZ(mediaModel, z);
    }

    public static /* synthetic */ LibraryMaterialInfoSv copy$default(LibraryMaterialInfoSv libraryMaterialInfoSv, String str, String str2, Integer num, Integer num2, UrlModel urlModel, String str3, Long l, Long l2, Long l3, String str4, String str5, String str6, String str7, boolean z, boolean z2, Integer num3, Integer num4, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        UrlModel urlModel2 = urlModel;
        Integer num5 = num;
        Integer num6 = num2;
        String str11 = str4;
        Long l4 = l3;
        Long l5 = l;
        Long l6 = l2;
        String str12 = str7;
        String str13 = str5;
        boolean z3 = z;
        String str14 = str6;
        Integer num7 = num4;
        boolean z4 = z2;
        Integer num8 = num3;
        if ((i & 1) != 0) {
            str8 = libraryMaterialInfoSv.id;
        }
        if ((i & 2) != 0) {
            str9 = libraryMaterialInfoSv.materialName;
        }
        if ((i & 4) != 0) {
            num5 = libraryMaterialInfoSv.materialProvider;
        }
        if ((i & 8) != 0) {
            num6 = libraryMaterialInfoSv.materialType;
        }
        if ((i & 16) != 0) {
            urlModel2 = libraryMaterialInfoSv.cover;
        }
        if ((i & 32) != 0) {
            str10 = libraryMaterialInfoSv.preview;
        }
        if ((i & 64) != 0) {
            l5 = libraryMaterialInfoSv.usedCount;
        }
        if ((i & 128) != 0) {
            l6 = libraryMaterialInfoSv.startTime;
        }
        if ((i & 256) != 0) {
            l4 = libraryMaterialInfoSv.endTime;
        }
        if ((i & 512) != 0) {
            str11 = libraryMaterialInfoSv.author;
        }
        if ((i & 1024) != 0) {
            str13 = libraryMaterialInfoSv.rawFilePath;
        }
        if ((i & 2048) != 0) {
            str14 = libraryMaterialInfoSv.splitAudioPath;
        }
        if ((i & 4096) != 0) {
            str12 = libraryMaterialInfoSv.splitVideoPath;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z3 = libraryMaterialInfoSv.isLibraryMaterialConsumed;
        }
        if ((i & 16384) != 0) {
            z4 = libraryMaterialInfoSv.isFromSearch;
        }
        if ((32768 & i) != 0) {
            num8 = libraryMaterialInfoSv.width;
        }
        if ((i & 65536) != 0) {
            num7 = libraryMaterialInfoSv.height;
        }
        UrlModel urlModel3 = urlModel2;
        return libraryMaterialInfoSv.copy(str8, str9, num5, num6, urlModel3, str10, l5, l6, l4, str11, str13, str14, str12, z3, z4, num8, num7);
    }

    public static final LibraryMaterialInfoSv libraryMaterialConversion(LibraryMaterialInfo libraryMaterialInfo) {
        Companion.getClass();
        return HBW.LIZIZ(libraryMaterialInfo);
    }

    public final LibraryMaterialInfoSv copy(String str, String str2, Integer num, Integer num2, UrlModel urlModel, String str3, Long l, Long l2, Long l3, String str4, String str5, String str6, String str7, boolean z, boolean z2, Integer num3, Integer num4) {
        return new LibraryMaterialInfoSv(str, str2, num, num2, urlModel, str3, l, l2, l3, str4, str5, str6, str7, z, z2, num3, num4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryMaterialInfoSv)) {
            return false;
        }
        LibraryMaterialInfoSv libraryMaterialInfoSv = (LibraryMaterialInfoSv) obj;
        return o.LJ(this.id, libraryMaterialInfoSv.id) && o.LJ(this.materialName, libraryMaterialInfoSv.materialName) && o.LJ(this.materialProvider, libraryMaterialInfoSv.materialProvider) && o.LJ(this.materialType, libraryMaterialInfoSv.materialType) && o.LJ(this.cover, libraryMaterialInfoSv.cover) && o.LJ(this.preview, libraryMaterialInfoSv.preview) && o.LJ(this.usedCount, libraryMaterialInfoSv.usedCount) && o.LJ(this.startTime, libraryMaterialInfoSv.startTime) && o.LJ(this.endTime, libraryMaterialInfoSv.endTime) && o.LJ(this.author, libraryMaterialInfoSv.author) && o.LJ(this.rawFilePath, libraryMaterialInfoSv.rawFilePath) && o.LJ(this.splitAudioPath, libraryMaterialInfoSv.splitAudioPath) && o.LJ(this.splitVideoPath, libraryMaterialInfoSv.splitVideoPath) && this.isLibraryMaterialConsumed == libraryMaterialInfoSv.isLibraryMaterialConsumed && this.isFromSearch == libraryMaterialInfoSv.isFromSearch && o.LJ(this.width, libraryMaterialInfoSv.width) && o.LJ(this.height, libraryMaterialInfoSv.height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.materialName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.materialProvider;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.materialType;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int hashCode5 = (hashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.preview;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.usedCount;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.startTime;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endTime;
        int hashCode9 = (hashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str4 = this.author;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rawFilePath;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.splitAudioPath;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.splitVideoPath;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        boolean z = this.isLibraryMaterialConsumed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode13 + i) * 31) + (this.isFromSearch ? 1 : 0)) * 31;
        Integer num3 = this.width;
        int hashCode14 = (i2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.height;
        return hashCode14 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LibraryMaterialInfoSv(id=");
        sb.append(this.id);
        sb.append(", materialName=");
        sb.append(this.materialName);
        sb.append(", materialProvider=");
        sb.append(this.materialProvider);
        sb.append(", materialType=");
        sb.append(this.materialType);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", usedCount=");
        sb.append(this.usedCount);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", rawFilePath=");
        sb.append(this.rawFilePath);
        sb.append(", splitAudioPath=");
        sb.append(this.splitAudioPath);
        sb.append(", splitVideoPath=");
        sb.append(this.splitVideoPath);
        sb.append(", isLibraryMaterialConsumed=");
        sb.append(this.isLibraryMaterialConsumed);
        sb.append(", isFromSearch=");
        sb.append(this.isFromSearch);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return UC7.LIZ(sb, this.height, ')');
    }

    public final String getAuthor() {
        return this.author;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMaterialName() {
        return this.materialName;
    }

    public final Integer getMaterialProvider() {
        return this.materialProvider;
    }

    public final Integer getMaterialType() {
        return this.materialType;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final String getRawFilePath() {
        return this.rawFilePath;
    }

    public final String getSplitAudioPath() {
        return this.splitAudioPath;
    }

    public final String getSplitVideoPath() {
        return this.splitVideoPath;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final Long getUsedCount() {
        return this.usedCount;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final boolean isFromSearch() {
        return this.isFromSearch;
    }

    public final boolean isLibraryMaterialConsumed() {
        return this.isLibraryMaterialConsumed;
    }

    public static final byte[] bundleToBytes(Bundle bundle) {
        Companion.getClass();
        o.LJIIIZ(bundle, "bundle");
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "obtain()");
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static final Bundle bytesToBundle(byte[] bytes) {
        Companion.getClass();
        o.LJIIIZ(bytes, "bytes");
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "obtain()");
        obtain.unmarshall(bytes, 0, bytes.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(LibraryMaterialInfoSv.class.getClassLoader());
        obtain.recycle();
        o.LJI(readBundle);
        return readBundle;
    }

    public static final void register(HBV mapping) {
        Companion.getClass();
        o.LJIIIZ(mapping, "mapping");
        mapping.LIZ(LibraryMaterialInfoSv.class, "extra_key_library_material");
    }

    public final void setEndTime(Long l) {
        this.endTime = l;
    }

    public final void setLibraryMaterialConsumed(boolean z) {
        this.isLibraryMaterialConsumed = z;
    }

    public final void setRawFilePath(String str) {
        this.rawFilePath = str;
    }

    public final void setSplitAudioPath(String str) {
        this.splitAudioPath = str;
    }

    public final void setSplitVideoPath(String str) {
        this.splitVideoPath = str;
    }

    public final void setStartTime(Long l) {
        this.startTime = l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        out.writeString(this.materialName);
        Integer num = this.materialProvider;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.materialType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeSerializable(this.cover);
        out.writeString(this.preview);
        Long l = this.usedCount;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Long l2 = this.startTime;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
        Long l3 = this.endTime;
        if (l3 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l3);
        }
        out.writeString(this.author);
        out.writeString(this.rawFilePath);
        out.writeString(this.splitAudioPath);
        out.writeString(this.splitVideoPath);
        out.writeInt(this.isLibraryMaterialConsumed ? 1 : 0);
        out.writeInt(this.isFromSearch ? 1 : 0);
        Integer num3 = this.width;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        Integer num4 = this.height;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num4);
        }
    }

    public LibraryMaterialInfoSv(String str, String str2, Integer num, Integer num2, UrlModel urlModel, String str3, Long l, Long l2, Long l3, String str4, String str5, String str6, String str7, boolean z, boolean z2, Integer num3, Integer num4) {
        this.id = str;
        this.materialName = str2;
        this.materialProvider = num;
        this.materialType = num2;
        this.cover = urlModel;
        this.preview = str3;
        this.usedCount = l;
        this.startTime = l2;
        this.endTime = l3;
        this.author = str4;
        this.rawFilePath = str5;
        this.splitAudioPath = str6;
        this.splitVideoPath = str7;
        this.isLibraryMaterialConsumed = z;
        this.isFromSearch = z2;
        this.width = num3;
        this.height = num4;
    }

    public /* synthetic */ LibraryMaterialInfoSv(String str, String str2, Integer num, Integer num2, UrlModel urlModel, String str3, Long l, Long l2, Long l3, String str4, String str5, String str6, String str7, boolean z, boolean z2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? 1 : num, (i & 8) != 0 ? 0 : num2, (i & 16) != 0 ? null : urlModel, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? 0L : l, (i & 128) != 0 ? 0L : l2, (i & 256) != 0 ? 0L : l3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & FileUtils.BUFFER_SIZE) != 0 ? false : z, (i & 16384) != 0 ? false : z2, (32768 & i) != 0 ? null : num3, (i & 65536) != 0 ? null : num4);
    }
}
