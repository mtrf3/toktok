package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.GKm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41344GKm implements Parcelable.Creator<CopiedReactionWindowInfo> {
    @Override // android.os.Parcelable.Creator
    public final CopiedReactionWindowInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CopiedReactionWindowInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final CopiedReactionWindowInfo[] newArray(int i) {
        return new CopiedReactionWindowInfo[i];
    }
}
