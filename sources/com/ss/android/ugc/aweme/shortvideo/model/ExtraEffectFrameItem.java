package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ExtraEffectFrameItem extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<ExtraEffectFrameItem> CREATOR = new Creator();

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("mime_type")
    public int mimeType;

    @InterfaceC65349Pkn("path")
    public String path;

    @InterfaceC65349Pkn("width")
    public int width;

    /* loaded from: classes7.dex */
    public static class Creator implements Parcelable.Creator<ExtraEffectFrameItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtraEffectFrameItem createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            return new ExtraEffectFrameItem(in.readString(), in.readInt(), in.readInt(), in.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtraEffectFrameItem[] newArray(int i) {
            return new ExtraEffectFrameItem[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExtraEffectFrameItem() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r4 = r2
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.ExtraEffectFrameItem.<init>():void");
    }

    public static /* synthetic */ ExtraEffectFrameItem copy$default(ExtraEffectFrameItem extraEffectFrameItem, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = extraEffectFrameItem.path;
        }
        if ((i4 & 2) != 0) {
            i = extraEffectFrameItem.width;
        }
        if ((i4 & 4) != 0) {
            i2 = extraEffectFrameItem.height;
        }
        if ((i4 & 8) != 0) {
            i3 = extraEffectFrameItem.mimeType;
        }
        return extraEffectFrameItem.copy(str, i, i2, i3);
    }

    public final ExtraEffectFrameItem copy(String str, int i, int i2, int i3) {
        return new ExtraEffectFrameItem(str, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.path, Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.mimeType)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.mimeType);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMimeType() {
        return this.mimeType;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMimeType(int i) {
        this.mimeType = i;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public ExtraEffectFrameItem(String str, int i, int i2, int i3) {
        this.path = str;
        this.width = i;
        this.height = i2;
        this.mimeType = i3;
    }

    public /* synthetic */ ExtraEffectFrameItem(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }
}
