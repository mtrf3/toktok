package com.bytedance.effectcreatormobile.draft;

import X.C93493aRl;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DraftConfigEffect extends F9E implements Parcelable {
    public static final Parcelable.Creator<DraftConfigEffect> CREATOR = new C93493aRl();

    @InterfaceC65349Pkn("model_names")
    public final DraftConfigModels modelNames;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.modelNames};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        this.modelNames.writeToParcel(parcel, 0);
    }

    public DraftConfigEffect(DraftConfigModels modelNames) {
        o.LJIIIZ(modelNames, "modelNames");
        this.modelNames = modelNames;
    }
}
