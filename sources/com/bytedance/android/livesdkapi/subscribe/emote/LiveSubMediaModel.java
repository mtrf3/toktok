package com.bytedance.android.livesdkapi.subscribe.emote;

import X.C76881UFh;
import X.UGL;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveSubMediaModel implements Serializable, Parcelable {
    public static final UGL CREATOR = new UGL();
    public C76881UFh emoteEditFinishParams;
    public String fileLocalUriPath;
    public String fileName;
    public int height;
    public int width;
    public int withTextSticker;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LiveSubMediaModel() {
    }

    public final C76881UFh getEmoteEditFinishParams() {
        return this.emoteEditFinishParams;
    }

    public final String getFileLocalUriPath() {
        return this.fileLocalUriPath;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getWithTextSticker() {
        return this.withTextSticker;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveSubMediaModel(Parcel parcel) {
        this();
        o.LJIIIZ(parcel, "parcel");
        this.fileLocalUriPath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.fileName = parcel.readString();
        this.withTextSticker = parcel.readInt();
    }

    public final void setEmoteEditFinishParams(C76881UFh c76881UFh) {
        this.emoteEditFinishParams = c76881UFh;
    }

    public final void setFileLocalUriPath(String str) {
        this.fileLocalUriPath = str;
    }

    public final void setFileName(String str) {
        this.fileName = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void setWithTextSticker(int i) {
        this.withTextSticker = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.fileLocalUriPath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.fileName);
        parcel.writeInt(this.withTextSticker);
    }
}
