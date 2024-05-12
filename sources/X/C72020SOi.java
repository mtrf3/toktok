package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import kotlin.jvm.internal.o;

/* renamed from: X.SOi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72020SOi implements Parcelable.Creator<PrivacySettingsAdapterConfigs> {
    @Override // android.os.Parcelable.Creator
    public final PrivacySettingsAdapterConfigs createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PrivacySettingsAdapterConfigs(parcel.readString(), parcel.readBundle());
    }

    @Override // android.os.Parcelable.Creator
    public final PrivacySettingsAdapterConfigs[] newArray(int i) {
        return new PrivacySettingsAdapterConfigs[i];
    }
}
