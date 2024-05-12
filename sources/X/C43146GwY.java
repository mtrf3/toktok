package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.GwY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43146GwY implements Parcelable.Creator<ImportVideoInfo> {
    @Override // android.os.Parcelable.Creator
    public final ImportVideoInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ImportVideoInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ImportVideoInfo[] newArray(int i) {
        return new ImportVideoInfo[i];
    }
}
