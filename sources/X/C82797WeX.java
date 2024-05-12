package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.sharestory.NonBlackMusicCardParam;
import kotlin.jvm.internal.o;

/* renamed from: X.WeX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82797WeX implements Parcelable.Creator<NonBlackMusicCardParam> {
    @Override // android.os.Parcelable.Creator
    public final NonBlackMusicCardParam createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new NonBlackMusicCardParam(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final NonBlackMusicCardParam[] newArray(int i) {
        return new NonBlackMusicCardParam[i];
    }
}
