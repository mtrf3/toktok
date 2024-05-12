package com.ss.android.ugc.tiktok.tpsc.settings.account;

import X.C72020SOi;
import X.C72021SOj;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PrivacySettingsAdapterConfigs implements Parcelable {
    public final Bundle extraData;
    public final String tag;
    public static final C72021SOj Companion = new C72021SOj();
    public static final Parcelable.Creator<PrivacySettingsAdapterConfigs> CREATOR = new C72020SOi();

    public /* synthetic */ PrivacySettingsAdapterConfigs() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsAdapterConfigs)) {
            return false;
        }
        PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs = (PrivacySettingsAdapterConfigs) obj;
        return o.LJ(this.tag, privacySettingsAdapterConfigs.tag) && o.LJ(this.extraData, privacySettingsAdapterConfigs.extraData);
    }

    public final int hashCode() {
        int hashCode = this.tag.hashCode() * 31;
        Bundle bundle = this.extraData;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivacySettingsAdapterConfigs(tag=");
        LIZ.append(this.tag);
        LIZ.append(", extraData=");
        LIZ.append(this.extraData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.tag);
        out.writeBundle(this.extraData);
    }

    public PrivacySettingsAdapterConfigs(String tag, Bundle bundle) {
        o.LJIIIZ(tag, "tag");
        this.tag = tag;
        this.extraData = bundle;
    }
}
