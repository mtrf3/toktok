package com.ss.android.ugc.cut_ui;

import X.C134955Rj;
import X.F9E;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.URLUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.cut_ui.ItemCrop;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MediaItem extends F9E implements Parcelable {
    public final String alignMode;
    public final int cartoonType;
    public final ItemCrop crop;
    public final float cropScale;
    public final long duration;
    public final String gamePlayAlgorithm;
    public final int height;
    public final boolean isMutable;
    public final boolean isReverse;
    public final boolean isSubVideo;
    public final String materialId;
    public final String mediaSrcPath;
    public final String source;
    public final long sourceStartTime;
    public final float speed;
    public final long targetEndTime;
    public final long targetStartTime;
    public final String type;
    public final float volume;
    public final int width;
    public static final C134955Rj Companion = new Object() { // from class: X.5Rj
    };
    public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: X.5Ri
        @Override // android.os.Parcelable.Creator
        public final MediaItem createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new MediaItem(readString, readLong, readLong2, z, readString2, z2, z3, parcel.readInt(), parcel.readString(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readFloat(), ItemCrop.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaItem[] newArray(int i) {
            return new MediaItem[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.materialId, Long.valueOf(this.targetStartTime), Long.valueOf(this.targetEndTime), Boolean.valueOf(this.isMutable), this.alignMode, Boolean.valueOf(this.isSubVideo), Boolean.valueOf(this.isReverse), Integer.valueOf(this.cartoonType), this.gamePlayAlgorithm, Float.valueOf(this.volume), Integer.valueOf(this.width), Integer.valueOf(this.height), Long.valueOf(this.duration), this.source, Long.valueOf(this.sourceStartTime), Float.valueOf(this.cropScale), this.crop, this.type, this.mediaSrcPath, Float.valueOf(this.speed)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.materialId);
        out.writeLong(this.targetStartTime);
        out.writeLong(this.targetEndTime);
        out.writeInt(this.isMutable ? 1 : 0);
        out.writeString(this.alignMode);
        out.writeInt(this.isSubVideo ? 1 : 0);
        out.writeInt(this.isReverse ? 1 : 0);
        out.writeInt(this.cartoonType);
        out.writeString(this.gamePlayAlgorithm);
        out.writeFloat(this.volume);
        out.writeInt(this.width);
        out.writeInt(this.height);
        out.writeLong(this.duration);
        out.writeString(this.source);
        out.writeLong(this.sourceStartTime);
        out.writeFloat(this.cropScale);
        this.crop.writeToParcel(out, i);
        out.writeString(this.type);
        out.writeString(this.mediaSrcPath);
        out.writeFloat(this.speed);
    }

    public final Uri M() {
        if (URLUtil.isValidUrl(this.source)) {
            Uri parse = UriProtector.parse(this.source);
            o.LJIIIIZZ(parse, "parse(source)");
            return parse;
        }
        File file = new File(this.source);
        if (file.exists() && file.isFile()) {
            Uri fromFile = Uri.fromFile(file);
            o.LJIIIIZZ(fromFile, "fromFile(file)");
            return fromFile;
        }
        Uri EMPTY = Uri.EMPTY;
        o.LJIIIIZZ(EMPTY, "EMPTY");
        return EMPTY;
    }

    public static MediaItem L(MediaItem mediaItem, long j, int i, int i2, String str, long j2, ItemCrop itemCrop, String str2, String str3, int i3) {
        String str4;
        long j3;
        boolean z;
        String str5;
        boolean z2;
        boolean z3;
        int i4;
        float f;
        float f2;
        float f3;
        String mediaSrcPath = str3;
        String type = str2;
        int i5 = i;
        long j4 = j2;
        long j5 = j;
        int i6 = i2;
        ItemCrop crop = itemCrop;
        String source = str;
        String gamePlayAlgorithm = null;
        if ((i3 & 1) != 0) {
            str4 = mediaItem.materialId;
        } else {
            str4 = null;
        }
        if ((i3 & 2) != 0) {
            j5 = mediaItem.targetStartTime;
        }
        long j6 = 0;
        if ((i3 & 4) != 0) {
            j3 = mediaItem.targetEndTime;
        } else {
            j3 = 0;
        }
        if ((i3 & 8) != 0) {
            z = mediaItem.isMutable;
        } else {
            z = false;
        }
        if ((i3 & 16) != 0) {
            str5 = mediaItem.alignMode;
        } else {
            str5 = null;
        }
        if ((i3 & 32) != 0) {
            z2 = mediaItem.isSubVideo;
        } else {
            z2 = false;
        }
        if ((i3 & 64) != 0) {
            z3 = mediaItem.isReverse;
        } else {
            z3 = false;
        }
        if ((i3 & 128) != 0) {
            i4 = mediaItem.cartoonType;
        } else {
            i4 = 0;
        }
        if ((i3 & 256) != 0) {
            gamePlayAlgorithm = mediaItem.gamePlayAlgorithm;
        }
        if ((i3 & 512) != 0) {
            f = mediaItem.volume;
        } else {
            f = 0.0f;
        }
        if ((i3 & 1024) != 0) {
            i5 = mediaItem.width;
        }
        if ((i3 & 2048) != 0) {
            i6 = mediaItem.height;
        }
        if ((i3 & 4096) != 0) {
            j6 = mediaItem.duration;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            source = mediaItem.source;
        }
        if ((i3 & 16384) != 0) {
            j4 = mediaItem.sourceStartTime;
        }
        if ((32768 & i3) != 0) {
            f2 = mediaItem.cropScale;
        } else {
            f2 = 0.0f;
        }
        if ((65536 & i3) != 0) {
            crop = mediaItem.crop;
        }
        if ((131072 & i3) != 0) {
            type = mediaItem.type;
        }
        if ((262144 & i3) != 0) {
            mediaSrcPath = mediaItem.mediaSrcPath;
        }
        if ((i3 & 524288) != 0) {
            f3 = mediaItem.speed;
        } else {
            f3 = 0.0f;
        }
        mediaItem.getClass();
        String materialId = str4;
        o.LJIIIZ(materialId, "materialId");
        String alignMode = str5;
        o.LJIIIZ(alignMode, "alignMode");
        o.LJIIIZ(gamePlayAlgorithm, "gamePlayAlgorithm");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(crop, "crop");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(mediaSrcPath, "mediaSrcPath");
        return new MediaItem(str4, j5, j3, z, str5, z2, z3, i4, gamePlayAlgorithm, f, i5, i6, j6, source, j4, f2, crop, type, mediaSrcPath, f3);
    }

    public MediaItem(String materialId, long j, long j2, boolean z, String alignMode, boolean z2, boolean z3, int i, String gamePlayAlgorithm, float f, int i2, int i3, long j3, String source, long j4, float f2, ItemCrop crop, String type, String mediaSrcPath, float f3) {
        o.LJIIIZ(materialId, "materialId");
        o.LJIIIZ(alignMode, "alignMode");
        o.LJIIIZ(gamePlayAlgorithm, "gamePlayAlgorithm");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(crop, "crop");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(mediaSrcPath, "mediaSrcPath");
        this.materialId = materialId;
        this.targetStartTime = j;
        this.targetEndTime = j2;
        this.isMutable = z;
        this.alignMode = alignMode;
        this.isSubVideo = z2;
        this.isReverse = z3;
        this.cartoonType = i;
        this.gamePlayAlgorithm = gamePlayAlgorithm;
        this.volume = f;
        this.width = i2;
        this.height = i3;
        this.duration = j3;
        this.source = source;
        this.sourceStartTime = j4;
        this.cropScale = f2;
        this.crop = crop;
        this.type = type;
        this.mediaSrcPath = mediaSrcPath;
        this.speed = f3;
    }

    public /* synthetic */ MediaItem(String str, long j, long j2, boolean z, String str2, boolean z2, boolean z3, int i, String str3, float f, int i2, int i3, long j3, String str4, long j4, float f2, ItemCrop itemCrop, String str5, String str6, float f3, int i4) {
        this(str, j, j2, z, (i4 & 16) != 0 ? "" : str2, z2, z3, i, (i4 & 256) != 0 ? "" : str3, f, i2, i3, j3, (i4 & FileUtils.BUFFER_SIZE) != 0 ? "" : str4, j4, f2, itemCrop, (131072 & i4) != 0 ? "" : str5, (262144 & i4) == 0 ? str6 : "", (i4 & 524288) != 0 ? 1.0f : f3);
    }
}
