package com.bytedance.effectcreatormobile.draft;

import X.C93494aRm;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DraftConfigModels extends F9E implements Parcelable {
    public static final Parcelable.Creator<DraftConfigModels> CREATOR = new C93494aRm();

    @InterfaceC65349Pkn("models")
    public final List<String> models;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.models};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeStringList(this.models);
    }

    public DraftConfigModels(List<String> models) {
        o.LJIIIZ(models, "models");
        this.models = models;
    }
}
