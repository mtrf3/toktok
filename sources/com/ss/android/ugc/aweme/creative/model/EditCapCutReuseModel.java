package com.ss.android.ugc.aweme.creative.model;

import X.C41337GKf;
import X.C43588H8u;
import X.C48339Iy7;
import X.C79062V1e;
import X.GPV;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditCapCutReuseModel implements Parcelable {
    public static final Parcelable.Creator<EditCapCutReuseModel> CREATOR = new Parcelable.Creator<EditCapCutReuseModel>() { // from class: X.6bL
        @Override // android.os.Parcelable.Creator
        public final EditCapCutReuseModel createFromParcel(Parcel parcel) {
            EditCapCutReuseModel.MusicInfo createFromParcel;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = EditCapCutReuseModel.MusicInfo.CREATOR.createFromParcel(parcel);
            }
            return new EditCapCutReuseModel(readString, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EditCapCutReuseModel[] newArray(int i) {
            return new EditCapCutReuseModel[i];
        }
    };

    @GPV
    @InterfaceC65349Pkn("creation_id")
    public final String creationId;

    @InterfaceC65349Pkn("music_info")
    public MusicInfo musicInfo;

    /* loaded from: classes8.dex */
    public static final class MusicInfo implements Parcelable, Serializable {
        public static final Parcelable.Creator<MusicInfo> CREATOR = new C41337GKf();

        @InterfaceC65349Pkn("author_name")
        public final String authorName;

        @InterfaceC65349Pkn("cover_uri")
        public final String coverUri;

        @GPV
        public final boolean isPgc;

        @InterfaceC65349Pkn("music_id")
        public final String musicId;

        @InterfaceC65349Pkn("music_name")
        public final String musicName;

        public MusicInfo() {
            this(null, null, null, null, false, 31, null);
        }

        public static /* synthetic */ MusicInfo copy$default(MusicInfo musicInfo, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = musicInfo.musicId;
            }
            if ((i & 2) != 0) {
                str2 = musicInfo.musicName;
            }
            if ((i & 4) != 0) {
                str3 = musicInfo.authorName;
            }
            if ((i & 8) != 0) {
                str4 = musicInfo.coverUri;
            }
            if ((i & 16) != 0) {
                z = musicInfo.isPgc;
            }
            return musicInfo.copy(str, str2, str3, str4, z);
        }

        public final MusicInfo copy(String musicId, String musicName, String authorName, String coverUri, boolean z) {
            o.LJIIIZ(musicId, "musicId");
            o.LJIIIZ(musicName, "musicName");
            o.LJIIIZ(authorName, "authorName");
            o.LJIIIZ(coverUri, "coverUri");
            return new MusicInfo(musicId, musicName, authorName, coverUri, z);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicInfo)) {
                return false;
            }
            MusicInfo musicInfo = (MusicInfo) obj;
            return o.LJ(this.musicId, musicInfo.musicId) && o.LJ(this.musicName, musicInfo.musicName) && o.LJ(this.authorName, musicInfo.authorName) && o.LJ(this.coverUri, musicInfo.coverUri) && this.isPgc == musicInfo.isPgc;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.musicId);
            out.writeString(this.musicName);
            out.writeString(this.authorName);
            out.writeString(this.coverUri);
            out.writeInt(this.isPgc ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int LJ = C79062V1e.LJ(this.coverUri, C79062V1e.LJ(this.authorName, C79062V1e.LJ(this.musicName, this.musicId.hashCode() * 31, 31), 31), 31);
            boolean z = this.isPgc;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return LJ + i;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MusicInfo(musicId=");
            LIZ.append(this.musicId);
            LIZ.append(", musicName=");
            LIZ.append(this.musicName);
            LIZ.append(", authorName=");
            LIZ.append(this.authorName);
            LIZ.append(", coverUri=");
            LIZ.append(this.coverUri);
            LIZ.append(", isPgc=");
            return C48339Iy7.LIZJ(LIZ, this.isPgc, ')', LIZ);
        }

        public final String getAuthorName() {
            return this.authorName;
        }

        public final String getCoverUri() {
            return this.coverUri;
        }

        public final String getMusicId() {
            return this.musicId;
        }

        public final String getMusicName() {
            return this.musicName;
        }

        public final boolean isPgc() {
            return this.isPgc;
        }

        public MusicInfo(String str, String str2, String str3, String str4, boolean z) {
            C43588H8u.LIZLLL(str, "musicId", str2, "musicName", str3, "authorName", str4, "coverUri");
            this.musicId = str;
            this.musicName = str2;
            this.authorName = str3;
            this.coverUri = str4;
            this.isPgc = z;
        }

        public /* synthetic */ MusicInfo(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z);
        }
    }

    public EditCapCutReuseModel() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.creationId);
        MusicInfo musicInfo = this.musicInfo;
        if (musicInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            musicInfo.writeToParcel(out, i);
        }
    }

    public EditCapCutReuseModel(String creationId, MusicInfo musicInfo) {
        o.LJIIIZ(creationId, "creationId");
        this.creationId = creationId;
        this.musicInfo = musicInfo;
    }

    public /* synthetic */ EditCapCutReuseModel(String str, MusicInfo musicInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : musicInfo);
    }
}
