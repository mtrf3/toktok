package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.music.model.CommerceToolsMusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Gll, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42477Gll implements Parcelable.Creator<CommerceToolsMusicModel> {
    @Override // android.os.Parcelable.Creator
    public final CommerceToolsMusicModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new CommerceToolsMusicModel();
    }

    @Override // android.os.Parcelable.Creator
    public final CommerceToolsMusicModel[] newArray(int i) {
        return new CommerceToolsMusicModel[i];
    }
}
