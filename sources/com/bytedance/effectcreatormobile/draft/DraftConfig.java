package com.bytedance.effectcreatormobile.draft;

import X.C93492aRk;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DraftConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<DraftConfig> CREATOR = new C93492aRk();

    @InterfaceC65349Pkn("effect")
    public final DraftConfigEffect effect;

    @InterfaceC65349Pkn("version")
    public final String version;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.effect, this.version};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        this.effect.writeToParcel(parcel, 0);
        parcel.writeString(this.version);
    }

    public DraftConfig(DraftConfigEffect effect, String version) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(version, "version");
        this.effect = effect;
        this.version = version;
    }
}
