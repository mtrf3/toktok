package com.ss.ugc.android.editor.core.api.params;

import X.C05040Hs;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditMedia implements Parcelable {
    public static final Parcelable.Creator<EditMedia> CREATOR = new Parcelable.Creator<EditMedia>() { // from class: X.5RZ
        @Override // android.os.Parcelable.Creator
        public final EditMedia createFromParcel(Parcel parcel) {
            boolean z;
            Long valueOf;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Long l = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new EditMedia(readString, z, readString2, readString3, valueOf, l);
        }

        @Override // android.os.Parcelable.Creator
        public final EditMedia[] newArray(int i) {
            return new EditMedia[i];
        }
    };
    public final String absolutePath;
    public final Long clipEndTime;
    public final Long clipStartTime;
    public final boolean isVideo;
    public final String libraryId;
    public final String path;

    public static /* synthetic */ EditMedia copy$default(EditMedia editMedia, String str, boolean z, String str2, String str3, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editMedia.path;
        }
        if ((i & 2) != 0) {
            z = editMedia.isVideo;
        }
        if ((i & 4) != 0) {
            str2 = editMedia.absolutePath;
        }
        if ((i & 8) != 0) {
            str3 = editMedia.libraryId;
        }
        if ((i & 16) != 0) {
            l = editMedia.clipStartTime;
        }
        if ((i & 32) != 0) {
            l2 = editMedia.clipEndTime;
        }
        return editMedia.copy(str, z, str2, str3, l, l2);
    }

    public final EditMedia copy(String path, boolean z, String str, String str2, Long l, Long l2) {
        o.LJIIIZ(path, "path");
        return new EditMedia(path, z, str, str2, l, l2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditMedia)) {
            return false;
        }
        EditMedia editMedia = (EditMedia) obj;
        return o.LJ(this.path, editMedia.path) && this.isVideo == editMedia.isVideo && o.LJ(this.absolutePath, editMedia.absolutePath) && o.LJ(this.libraryId, editMedia.libraryId) && o.LJ(this.clipStartTime, editMedia.clipStartTime) && o.LJ(this.clipEndTime, editMedia.clipEndTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.path.hashCode() * 31;
        boolean z = this.isVideo;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.absolutePath;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.libraryId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.clipStartTime;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.clipEndTime;
        return hashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditMedia(path=");
        LIZ.append(this.path);
        LIZ.append(", isVideo=");
        LIZ.append(this.isVideo);
        LIZ.append(", absolutePath=");
        LIZ.append(this.absolutePath);
        LIZ.append(", libraryId=");
        LIZ.append(this.libraryId);
        LIZ.append(", clipStartTime=");
        LIZ.append(this.clipStartTime);
        LIZ.append(", clipEndTime=");
        return JBR.LJ(LIZ, this.clipEndTime, ')', LIZ);
    }

    public final String getAbsolutePath() {
        return this.absolutePath;
    }

    public final Long getClipEndTime() {
        return this.clipEndTime;
    }

    public final Long getClipStartTime() {
        return this.clipStartTime;
    }

    public final String getLibraryId() {
        return this.libraryId;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.path);
        out.writeInt(this.isVideo ? 1 : 0);
        out.writeString(this.absolutePath);
        out.writeString(this.libraryId);
        Long l = this.clipStartTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Long l2 = this.clipEndTime;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
    }

    public EditMedia(String path, boolean z, String str, String str2, Long l, Long l2) {
        o.LJIIIZ(path, "path");
        this.path = path;
        this.isVideo = z;
        this.absolutePath = str;
        this.libraryId = str2;
        this.clipStartTime = l;
        this.clipEndTime = l2;
    }

    public /* synthetic */ EditMedia(String str, boolean z, String str2, String str3, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l, (i & 32) == 0 ? l2 : null);
    }
}
