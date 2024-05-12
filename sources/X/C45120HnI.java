package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.cutsame.AuthorInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.HnI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45120HnI implements Parcelable.Creator<AuthorInfo> {
    @Override // android.os.Parcelable.Creator
    public final AuthorInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new AuthorInfo();
    }

    @Override // android.os.Parcelable.Creator
    public final AuthorInfo[] newArray(int i) {
        return new AuthorInfo[i];
    }
}
