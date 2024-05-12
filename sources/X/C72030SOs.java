package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.PrivateAccountConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.SOs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72030SOs implements Parcelable.Creator<PrivateAccountConfig> {
    @Override // android.os.Parcelable.Creator
    public final PrivateAccountConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new PrivateAccountConfig();
    }

    @Override // android.os.Parcelable.Creator
    public final PrivateAccountConfig[] newArray(int i) {
        return new PrivateAccountConfig[i];
    }
}
