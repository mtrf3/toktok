package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.UGq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76916UGq implements Parcelable.Creator<LiveEffect.CommerceExtra> {
    @Override // android.os.Parcelable.Creator
    public final LiveEffect.CommerceExtra createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new LiveEffect.CommerceExtra(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LiveEffect.CommerceExtra[] newArray(int i) {
        return new LiveEffect.CommerceExtra[i];
    }
}
