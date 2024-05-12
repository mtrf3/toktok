package com.ss.android.ugc.aweme.commerce.tools.music;

import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin;
import java.io.Serializable;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public enum ShootActionOrigin implements Parcelable, Serializable {
    CLICK_PLUS,
    CLICK_VIDEO_DUET_STITCH,
    CLICK_HASHTAG,
    CLICK_VIDEO_MUSIC,
    SEARCH_MUSIC,
    CLICK_EFFECT,
    OTHERS;

    public static final Parcelable.Creator<ShootActionOrigin> CREATOR = new Parcelable.Creator<ShootActionOrigin>() { // from class: X.HBB
        @Override // android.os.Parcelable.Creator
        public final ShootActionOrigin createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return ShootActionOrigin.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShootActionOrigin[] newArray(int i) {
            return new ShootActionOrigin[i];
        }
    };

    public static ShootActionOrigin valueOf(String str) {
        return (ShootActionOrigin) V0N.LJJJ(ShootActionOrigin.class, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(name());
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = super.toString().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
