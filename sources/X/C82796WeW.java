package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.sharestory.BlackMusicCardParam;
import kotlin.jvm.internal.o;

/* renamed from: X.WeW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82796WeW implements Parcelable.Creator<BlackMusicCardParam> {
    @Override // android.os.Parcelable.Creator
    public final BlackMusicCardParam createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new BlackMusicCardParam(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final BlackMusicCardParam[] newArray(int i) {
        return new BlackMusicCardParam[i];
    }
}
