package com.ss.android.ugc.aweme.creative.model.edit;

import X.AnonymousClass629;
import X.C43563H7v;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditSaveLocalModel implements Parcelable {
    public static final Parcelable.Creator<EditSaveLocalModel> CREATOR = new C43563H7v();

    @GPV
    public String flowId;

    public EditSaveLocalModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.flowId);
    }

    public EditSaveLocalModel(String flowId) {
        o.LJIIIZ(flowId, "flowId");
        this.flowId = flowId;
    }

    public /* synthetic */ EditSaveLocalModel(int i) {
        this(AnonymousClass629.LIZ("randomUUID().toString()"));
    }
}
