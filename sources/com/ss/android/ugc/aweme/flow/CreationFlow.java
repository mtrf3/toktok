package com.ss.android.ugc.aweme.flow;

import X.C36450ESg;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.flow.PageSession;
import com.ss.android.ugc.aweme.flow.Stage;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class CreationFlow<INIT_STAGE extends Stage<INIT_PAGE_SESSION>, INIT_PAGE_SESSION extends PageSession> implements Parcelable {
    public static final Parcelable.Creator<CreationFlow<INIT_STAGE, INIT_PAGE_SESSION>> CREATOR = new C36450ESg();
    public final String creationFlowId;
    public final ExtraSession extraSession;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.creationFlowId);
        this.extraSession.writeToParcel(out, i);
    }

    public CreationFlow(String creationFlowId, ExtraSession extraSession) {
        o.LJIIIZ(creationFlowId, "creationFlowId");
        o.LJIIIZ(extraSession, "extraSession");
        this.creationFlowId = creationFlowId;
        this.extraSession = extraSession;
    }
}
