package com.ss.android.ugc.aweme.sticker.model;

import X.C05040Hs;
import X.C1FJ;
import X.HBS;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LibraryVideo implements Serializable, Parcelable {
    public static final Parcelable.Creator<LibraryVideo> CREATOR = new HBS();

    @InterfaceC65349Pkn(alternate = {"e"}, value = "audio_duration")
    public final Long audioDuration;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn(alternate = {"c"}, value = "audioPath")
    public final String audioPath;

    @InterfaceC65349Pkn(alternate = {"a"}, value = "id")
    public final String id;

    @InterfaceC65349Pkn(alternate = {"h"}, value = "material_provider")
    public final Integer materialProvider;

    @InterfaceC65349Pkn(alternate = {"j"}, value = "material_type")
    public final Integer materialType;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn(alternate = {"f"}, value = "original_image_copy_path")
    public final String originalImageCopyPath;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn(alternate = {"g"}, value = "raw_file_path")
    public final String rawFilePath;

    @InterfaceC65349Pkn(alternate = {"d"}, value = "video_duration")
    public final Long videoDuration;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn(alternate = {"b"}, value = "videoPath")
    public final String videoPath;

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryVideo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LibraryVideo copy$default(LibraryVideo libraryVideo, String str, String str2, String str3, Long l, Long l2, String str4, String str5, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = libraryVideo.id;
        }
        if ((i & 2) != 0) {
            str2 = libraryVideo.videoPath;
        }
        if ((i & 4) != 0) {
            str3 = libraryVideo.audioPath;
        }
        if ((i & 8) != 0) {
            l = libraryVideo.videoDuration;
        }
        if ((i & 16) != 0) {
            l2 = libraryVideo.audioDuration;
        }
        if ((i & 32) != 0) {
            str4 = libraryVideo.originalImageCopyPath;
        }
        if ((i & 64) != 0) {
            str5 = libraryVideo.rawFilePath;
        }
        if ((i & 128) != 0) {
            num = libraryVideo.materialProvider;
        }
        if ((i & 256) != 0) {
            num2 = libraryVideo.materialType;
        }
        return libraryVideo.copy(str, str2, str3, l, l2, str4, str5, num, num2);
    }

    public final LibraryVideo copy(String str, String str2, String str3, Long l, Long l2, String str4, String str5, Integer num, Integer num2) {
        return new LibraryVideo(str, str2, str3, l, l2, str4, str5, num, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryVideo(id=");
        LIZ.append(this.id);
        LIZ.append(", videoPath=");
        LIZ.append(this.videoPath);
        LIZ.append(", audioPath=");
        LIZ.append(this.audioPath);
        LIZ.append(", videoDuration=");
        LIZ.append(this.videoDuration);
        LIZ.append(", audioDuration=");
        LIZ.append(this.audioDuration);
        LIZ.append(", originalImageCopyPath=");
        LIZ.append(this.originalImageCopyPath);
        LIZ.append(", rawFilePath=");
        LIZ.append(this.rawFilePath);
        LIZ.append(", materialProvider=");
        LIZ.append(this.materialProvider);
        LIZ.append(", materialType=");
        LIZ.append(this.materialType);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        String str = this.videoPath;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final Long getAudioDuration() {
        return this.audioDuration;
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMaterialProvider() {
        return this.materialProvider;
    }

    public final Integer getMaterialType() {
        return this.materialType;
    }

    public final String getOriginalImageCopyPath() {
        return this.originalImageCopyPath;
    }

    public final String getRawFilePath() {
        return this.rawFilePath;
    }

    public final Long getVideoDuration() {
        return this.videoDuration;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LibraryVideo)) {
            return false;
        }
        LibraryVideo libraryVideo = (LibraryVideo) obj;
        if (!o.LJ(this.videoPath, libraryVideo.videoPath) || !o.LJ(this.audioPath, libraryVideo.audioPath)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.videoPath);
        parcel.writeString(this.audioPath);
        Long l = this.videoDuration;
        if (l != null) {
            C05040Hs.LIZLLL(parcel, 1, l);
        } else {
            parcel.writeInt(0);
        }
        Long l2 = this.audioDuration;
        if (l2 != null) {
            C05040Hs.LIZLLL(parcel, 1, l2);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.originalImageCopyPath);
        parcel.writeString(this.rawFilePath);
        Integer num = this.materialProvider;
        if (num != null) {
            C1FJ.LJ(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.materialType;
        if (num2 != null) {
            C1FJ.LJ(parcel, 1, num2);
        } else {
            parcel.writeInt(0);
        }
    }

    public LibraryVideo(String str, String str2, String str3, Long l, Long l2, String str4, String str5, Integer num, Integer num2) {
        this.id = str;
        this.videoPath = str2;
        this.audioPath = str3;
        this.videoDuration = l;
        this.audioDuration = l2;
        this.originalImageCopyPath = str4;
        this.rawFilePath = str5;
        this.materialProvider = num;
        this.materialType = num2;
    }

    public /* synthetic */ LibraryVideo(String str, String str2, String str3, Long l, Long l2, String str4, String str5, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num, (i & 256) == 0 ? num2 : null);
    }
}
