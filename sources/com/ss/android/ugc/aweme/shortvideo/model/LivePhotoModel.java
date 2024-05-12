package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LivePhotoModel extends F9E implements Parcelable, Serializable {
    public static final long serialVersionUID = 1;
    public Effect effect;
    public boolean isOpen;
    public int photoHeight;
    public String photoPath;
    public int photoWidth;
    public int videoHeight;
    public String videoPath;
    public int videoWidth;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LivePhotoModel> CREATOR = new Creator();

    /* loaded from: classes7.dex */
    public static class Creator implements Parcelable.Creator<LivePhotoModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivePhotoModel createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            return new LivePhotoModel(in.readInt() != 0, (Effect) in.readParcelable(LivePhotoModel.class.getClassLoader()), in.readString(), in.readInt(), in.readInt(), in.readString(), in.readInt(), in.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivePhotoModel[] newArray(int i) {
            return new LivePhotoModel[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LivePhotoModel() {
        /*
            r11 = this;
            r1 = 0
            r2 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r3 = r2
            r4 = r1
            r5 = r1
            r6 = r2
            r7 = r1
            r8 = r1
            r10 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.LivePhotoModel.<init>():void");
    }

    public static /* synthetic */ LivePhotoModel copy$default(LivePhotoModel livePhotoModel, boolean z, Effect effect, String str, int i, int i2, String str2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = livePhotoModel.isOpen;
        }
        if ((i5 & 2) != 0) {
            effect = livePhotoModel.effect;
        }
        if ((i5 & 4) != 0) {
            str = livePhotoModel.videoPath;
        }
        if ((i5 & 8) != 0) {
            i = livePhotoModel.videoWidth;
        }
        if ((i5 & 16) != 0) {
            i2 = livePhotoModel.videoHeight;
        }
        if ((i5 & 32) != 0) {
            str2 = livePhotoModel.photoPath;
        }
        if ((i5 & 64) != 0) {
            i3 = livePhotoModel.photoWidth;
        }
        if ((i5 & 128) != 0) {
            i4 = livePhotoModel.photoHeight;
        }
        return livePhotoModel.copy(z, effect, str, i, i2, str2, i3, i4);
    }

    public final LivePhotoModel copy(boolean z, Effect effect, String videoPath, int i, int i2, String photoPath, int i3, int i4) {
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(photoPath, "photoPath");
        return new LivePhotoModel(z, effect, videoPath, i, i2, photoPath, i3, i4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isOpen), this.effect, this.videoPath, Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight), this.photoPath, Integer.valueOf(this.photoWidth), Integer.valueOf(this.photoHeight)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.isOpen ? 1 : 0);
        parcel.writeParcelable(this.effect, i);
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeString(this.photoPath);
        parcel.writeInt(this.photoWidth);
        parcel.writeInt(this.photoHeight);
    }

    /* loaded from: classes7.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final int getPhotoHeight() {
        return this.photoHeight;
    }

    public final String getPhotoPath() {
        return this.photoPath;
    }

    public final int getPhotoWidth() {
        return this.photoWidth;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    public final void setEffect(Effect effect) {
        this.effect = effect;
    }

    public final void setOpen(boolean z) {
        this.isOpen = z;
    }

    public final void setPhotoHeight(int i) {
        this.photoHeight = i;
    }

    public final void setPhotoPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.photoPath = str;
    }

    public final void setPhotoWidth(int i) {
        this.photoWidth = i;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.videoPath = str;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public LivePhotoModel(boolean z, Effect effect, String videoPath, int i, int i2, String photoPath, int i3, int i4) {
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(photoPath, "photoPath");
        this.isOpen = z;
        this.effect = effect;
        this.videoPath = videoPath;
        this.videoWidth = i;
        this.videoHeight = i2;
        this.photoPath = photoPath;
        this.photoWidth = i3;
        this.photoHeight = i4;
    }

    public /* synthetic */ LivePhotoModel(boolean z, Effect effect, String str, int i, int i2, String str2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? null : effect, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) == 0 ? str2 : "", (i5 & 64) != 0 ? 0 : i3, (i5 & 128) == 0 ? i4 : 0);
    }
}
