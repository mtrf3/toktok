package com.ss.android.ugc.aweme.tools.mvtemplate.preview;

import X.C5YX;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mvtheme.MvItemCrop;
import com.ss.android.ugc.aweme.tools.mvtemplate.preview.MediaItem;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MediaItem extends F9E implements Parcelable {
    public final String alignMode;
    public final MvItemCrop crop;
    public final float cropScale;
    public final long duration;
    public final int height;
    public final boolean isMutable;
    public final boolean isReverse;
    public final boolean isSubVideo;
    public final String materialId;
    public final String mediaSrcPath;
    public final String source;
    public final long sourceStartTime;
    public final long targetStartTime;
    public final String type;
    public final int width;
    public static final C5YX Companion = new Object() { // from class: X.5YX
    };
    public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: X.5YV
        @Override // android.os.Parcelable.Creator
        public final MediaItem createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            long readLong = parcel.readLong();
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
            return new MediaItem(readString, readLong, z, readString2, z2, z3, parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readFloat(), (MvItemCrop) parcel.readParcelable(MediaItem.class.getClassLoader()), parcel.readString(), parcel.readString());
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
        return new Object[]{this.materialId, Long.valueOf(this.targetStartTime), Boolean.valueOf(this.isMutable), this.alignMode, Boolean.valueOf(this.isSubVideo), Boolean.valueOf(this.isReverse), Integer.valueOf(this.width), Integer.valueOf(this.height), Long.valueOf(this.duration), this.source, Long.valueOf(this.sourceStartTime), Float.valueOf(this.cropScale), this.crop, this.type, this.mediaSrcPath};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.materialId);
        out.writeLong(this.targetStartTime);
        out.writeInt(this.isMutable ? 1 : 0);
        out.writeString(this.alignMode);
        out.writeInt(this.isSubVideo ? 1 : 0);
        out.writeInt(this.isReverse ? 1 : 0);
        out.writeInt(this.width);
        out.writeInt(this.height);
        out.writeLong(this.duration);
        out.writeString(this.source);
        out.writeLong(this.sourceStartTime);
        out.writeFloat(this.cropScale);
        out.writeParcelable(this.crop, i);
        out.writeString(this.type);
        out.writeString(this.mediaSrcPath);
    }

    public MediaItem(String materialId, long j, boolean z, String alignMode, boolean z2, boolean z3, int i, int i2, long j2, String source, long j3, float f, MvItemCrop crop, String type, String mediaSrcPath) {
        o.LJIIIZ(materialId, "materialId");
        o.LJIIIZ(alignMode, "alignMode");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(crop, "crop");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(mediaSrcPath, "mediaSrcPath");
        this.materialId = materialId;
        this.targetStartTime = j;
        this.isMutable = z;
        this.alignMode = alignMode;
        this.isSubVideo = z2;
        this.isReverse = z3;
        this.width = i;
        this.height = i2;
        this.duration = j2;
        this.source = source;
        this.sourceStartTime = j3;
        this.cropScale = f;
        this.crop = crop;
        this.type = type;
        this.mediaSrcPath = mediaSrcPath;
    }
}
