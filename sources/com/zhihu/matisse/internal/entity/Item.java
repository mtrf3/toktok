package com.zhihu.matisse.internal.entity;

import X.EnumC81057VrZ;
import Y.IDCreatorS56S0000000_14;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;

/* loaded from: classes15.dex */
public class Item implements Parcelable {
    public static final Parcelable.Creator<Item> CREATOR = new IDCreatorS56S0000000_14(72);
    public final long duration;
    public final long id;
    public final String mimeType;
    public final long size;
    public final Uri uri;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean LIZ() {
        String str = this.mimeType;
        if (str == null) {
            return false;
        }
        return str.equals(EnumC81057VrZ.GIF.toString());
    }

    public final boolean LIZIZ() {
        String str = this.mimeType;
        if (str == null) {
            return false;
        }
        if (!str.equals(EnumC81057VrZ.JPEG.toString()) && !this.mimeType.equals(EnumC81057VrZ.PNG.toString()) && !this.mimeType.equals(EnumC81057VrZ.GIF.toString()) && !this.mimeType.equals(EnumC81057VrZ.BMP.toString()) && !this.mimeType.equals(EnumC81057VrZ.WEBP.toString())) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL() {
        String str = this.mimeType;
        if (str == null) {
            return false;
        }
        if (!str.equals(EnumC81057VrZ.MPEG.toString()) && !this.mimeType.equals(EnumC81057VrZ.MP4.toString()) && !this.mimeType.equals(EnumC81057VrZ.QUICKTIME.toString()) && !this.mimeType.equals(EnumC81057VrZ.THREEGPP.toString()) && !this.mimeType.equals(EnumC81057VrZ.THREEGPP2.toString()) && !this.mimeType.equals(EnumC81057VrZ.MKV.toString()) && !this.mimeType.equals(EnumC81057VrZ.WEBM.toString()) && !this.mimeType.equals(EnumC81057VrZ.TS.toString()) && !this.mimeType.equals(EnumC81057VrZ.AVI.toString())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Long.valueOf(this.id).hashCode() + 31;
        String str = this.mimeType;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        return Long.valueOf(this.duration).hashCode() + ((Long.valueOf(this.size).hashCode() + ((this.uri.hashCode() + (hashCode * 31)) * 31)) * 31);
    }

    public Item(Parcel parcel) {
        this.id = parcel.readLong();
        this.mimeType = parcel.readString();
        this.uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.size = parcel.readLong();
        this.duration = parcel.readLong();
    }

    public static Item LJ(Cursor cursor) {
        return new Item(cursor.getLong(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("mime_type")), cursor.getLong(cursor.getColumnIndex("_size")), cursor.getLong(cursor.getColumnIndex("duration")));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        if (this.id != item.id) {
            return false;
        }
        String str = this.mimeType;
        if ((str == null || !str.equals(item.mimeType)) && (this.mimeType != null || item.mimeType != null)) {
            return false;
        }
        Uri uri = this.uri;
        if (((uri == null || !uri.equals(item.uri)) && (this.uri != null || item.uri != null)) || this.size != item.size || this.duration != item.duration) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.mimeType);
        parcel.writeParcelable(this.uri, 0);
        parcel.writeLong(this.size);
        parcel.writeLong(this.duration);
    }

    public Item(long j, String str, long j2, long j3) {
        Uri contentUri;
        this.id = j;
        this.mimeType = str;
        if (LIZIZ()) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (LIZLLL()) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = MediaStore.Files.getContentUri("external");
        }
        this.uri = ContentUris.withAppendedId(contentUri, j);
        this.size = j2;
        this.duration = j3;
    }
}
