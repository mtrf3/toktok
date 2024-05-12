package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.android.editor.base.data.CoverUrl;
import kotlin.jvm.internal.o;

/* renamed from: X.ESc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36446ESc implements Parcelable.Creator<CoverUrl> {
    @Override // android.os.Parcelable.Creator
    public final CoverUrl createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CoverUrl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CoverUrl[] newArray(int i) {
        return new CoverUrl[i];
    }
}
