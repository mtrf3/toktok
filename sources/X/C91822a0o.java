package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.bnpl.network.model.PhoneRule;
import kotlin.jvm.internal.o;

/* renamed from: X.a0o, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91822a0o implements Parcelable.Creator<PhoneRule> {
    @Override // android.os.Parcelable.Creator
    public final PhoneRule createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PhoneRule(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final PhoneRule[] newArray(int i) {
        return new PhoneRule[i];
    }
}
