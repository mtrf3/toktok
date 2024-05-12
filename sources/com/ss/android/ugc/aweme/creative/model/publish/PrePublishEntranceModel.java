package com.ss.android.ugc.aweme.creative.model.publish;

import X.C43557H7p;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PrePublishEntranceModel implements Parcelable {
    public static final Parcelable.Creator<PrePublishEntranceModel> CREATOR = new C43557H7p();

    @GPV
    public volatile boolean preCompileSuccess;

    @GPV
    public String publishId;

    @GPV
    public volatile boolean started;

    public PrePublishEntranceModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.preCompileSuccess ? 1 : 0);
        out.writeInt(this.started ? 1 : 0);
        out.writeString(this.publishId);
    }

    public /* synthetic */ PrePublishEntranceModel(int i) {
        this(false, false, null);
    }

    public PrePublishEntranceModel(boolean z, boolean z2, String str) {
        this.preCompileSuccess = z;
        this.started = z2;
        this.publishId = str;
    }
}
