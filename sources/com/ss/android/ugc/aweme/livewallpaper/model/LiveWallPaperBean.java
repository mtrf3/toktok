package com.ss.android.ugc.aweme.livewallpaper.model;

import X.C39579Fg7;
import X.C74221TAz;
import X.OW7;
import X.Q89;
import X.X1D;
import Y.IDCreatorS53S0000000_10;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* loaded from: classes11.dex */
public class LiveWallPaperBean implements Parcelable {
    public static final Parcelable.Creator<LiveWallPaperBean> CREATOR = new IDCreatorS53S0000000_10(1);
    public boolean forceToPause;
    public int height;
    public String id;
    public boolean shouldMute;
    public String source;
    public String thumbnailPath;
    public UrlModel thumbnailUrlModel;
    public String videoPath;
    public String videoUri;
    public String videoUrl;
    public float volume;
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static LiveWallPaperBean buildEmptyBean() {
        OW7 ow7 = new OW7();
        ow7.LIZ = "";
        ow7.LIZLLL = 0;
        ow7.LJ = 0;
        ow7.LIZIZ = "";
        ow7.LIZJ = "";
        ow7.LJFF = "";
        ow7.LJI = 0.0f;
        return new LiveWallPaperBean(ow7);
    }

    public static OW7 newBuilder() {
        return new OW7();
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.id)) {
            return false;
        }
        if ((!C39579Fg7.LIZIZ(this.thumbnailPath) || !C39579Fg7.LIZIZ(this.videoPath)) && (this.thumbnailUrlModel == null || TextUtils.isEmpty(this.videoUrl) || TextUtils.isEmpty(this.videoUri))) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveWallPaperBean{id='");
        Q89.LIZIZ(LIZ, this.id, '\'', ", thumbnailPath='");
        Q89.LIZIZ(LIZ, this.thumbnailPath, '\'', ", videoPath='");
        Q89.LIZIZ(LIZ, this.videoPath, '\'', ", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", source=");
        LIZ.append(this.source);
        LIZ.append(", volume=");
        return C74221TAz.LIZLLL(LIZ, this.volume, '}', LIZ);
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public String getSource() {
        return this.source;
    }

    public String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public UrlModel getThumbnailUrlModel() {
        return this.thumbnailUrlModel;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public String getVideoUri() {
        return this.videoUri;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public float getVolume() {
        return this.volume;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isForceToPause() {
        return this.forceToPause;
    }

    public boolean isShouldMute() {
        return this.shouldMute;
    }

    public LiveWallPaperBean(Parcel parcel) {
        boolean z;
        this.id = parcel.readString();
        this.thumbnailPath = parcel.readString();
        this.videoPath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.source = parcel.readString();
        this.volume = parcel.readFloat();
        this.thumbnailUrlModel = (UrlModel) parcel.readSerializable();
        this.videoUrl = parcel.readString();
        this.videoUri = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.shouldMute = z;
    }

    public void setForceToPause(boolean z) {
        this.forceToPause = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setShouldMute(boolean z) {
        this.shouldMute = z;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setThumbnailPath(String str) {
        this.thumbnailPath = str;
    }

    public void setThumbnailUrlModel(UrlModel urlModel) {
        this.thumbnailUrlModel = urlModel;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setVideoUri(String str) {
        this.videoUri = str;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public void setVolume(float f) {
        this.volume = f;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public LiveWallPaperBean(OW7 ow7) {
        this.id = ow7.LIZ;
        this.thumbnailPath = ow7.LIZIZ;
        this.videoPath = ow7.LIZJ;
        this.width = ow7.LIZLLL;
        this.height = ow7.LJ;
        this.source = ow7.LJFF;
        this.volume = ow7.LJI;
        this.thumbnailUrlModel = ow7.LJII;
        this.videoUrl = ow7.LJIIIIZZ;
        this.videoUri = ow7.LJIIIZ;
        this.shouldMute = ow7.LJIIJ;
        this.forceToPause = false;
    }

    public /* synthetic */ LiveWallPaperBean(OW7 ow7, IDCreatorS53S0000000_10 iDCreatorS53S0000000_10) {
        this(ow7);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.thumbnailPath);
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.source);
        parcel.writeFloat(this.volume);
        parcel.writeSerializable(this.thumbnailUrlModel);
        parcel.writeString(this.videoUrl);
        parcel.writeString(this.videoUri);
        parcel.writeByte(this.shouldMute ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ LiveWallPaperBean(Parcel parcel, IDCreatorS53S0000000_10 iDCreatorS53S0000000_10) {
        this(parcel);
    }
}
