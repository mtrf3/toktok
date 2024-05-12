package com.facebook.share.model;

import X.C16880lQ;
import X.Q8N;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import java.util.Set;

/* loaded from: classes12.dex */
public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends Q8N> implements ShareModel {
    public final Bundle bundle;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Bundle LIZIZ() {
        return (Bundle) this.bundle.clone();
    }

    public final String LIZLLL() {
        return this.bundle.getString("og:type");
    }

    public final Set<String> LJ() {
        return this.bundle.keySet();
    }

    public ShareOpenGraphValueContainer(Parcel parcel) {
        this.bundle = parcel.readBundle(Q8N.class.getClassLoader());
    }

    public final Object LIZ(String str) {
        return C16880lQ.LLJJIII(this.bundle, str);
    }

    public ShareOpenGraphValueContainer(Q8N q8n) {
        this.bundle = (Bundle) q8n.LIZ.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.bundle);
    }
}
