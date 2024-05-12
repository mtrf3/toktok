package com.zhihu.matisse.internal.entity;

import Y.IDCreatorS56S0000000_14;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public class Album implements Parcelable {
    public long mCount;
    public final Uri mCoverUri;
    public final String mDisplayName;
    public final String mId;
    public static final Parcelable.Creator<Album> CREATOR = new IDCreatorS56S0000000_14(71);
    public static final String ALBUM_ID_ALL = String.valueOf(-1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean LIZIZ() {
        return ALBUM_ID_ALL.equals(this.mId);
    }

    public Album(Parcel parcel) {
        this.mId = parcel.readString();
        this.mCoverUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.mDisplayName = parcel.readString();
        this.mCount = parcel.readLong();
    }

    public static Album LIZLLL(Cursor cursor) {
        return new Album(cursor.getString(cursor.getColumnIndex("bucket_id")), UriProtector.parse(cursor.getString(cursor.getColumnIndex("uri"))), cursor.getString(cursor.getColumnIndex("bucket_display_name")), cursor.getLong(cursor.getColumnIndex("count")));
    }

    public final String LIZ(Context context) {
        if (LIZIZ()) {
            return context.getString(R.string.i0p);
        }
        return this.mDisplayName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeParcelable(this.mCoverUri, 0);
        parcel.writeString(this.mDisplayName);
        parcel.writeLong(this.mCount);
    }

    public Album(String str, Uri uri, String str2, long j) {
        this.mId = str;
        this.mCoverUri = uri;
        this.mDisplayName = str2;
        this.mCount = j;
    }
}
