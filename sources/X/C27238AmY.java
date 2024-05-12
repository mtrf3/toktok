package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import kotlin.jvm.internal.o;

/* renamed from: X.AmY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27238AmY implements Parcelable.Creator<Rule> {
    @Override // android.os.Parcelable.Creator
    public final Rule createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new Rule(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Rule[] newArray(int i) {
        return new Rule[i];
    }
}
