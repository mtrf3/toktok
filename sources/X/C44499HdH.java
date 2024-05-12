package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import kotlin.jvm.internal.o;

/* renamed from: X.HdH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44499HdH implements Parcelable.Creator<ClientCherEffectParam> {
    @Override // android.os.Parcelable.Creator
    public final ClientCherEffectParam createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ClientCherEffectParam(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ClientCherEffectParam[] newArray(int i) {
        return new ClientCherEffectParam[i];
    }
}
