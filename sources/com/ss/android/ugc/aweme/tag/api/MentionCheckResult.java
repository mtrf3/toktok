package com.ss.android.ugc.aweme.tag.api;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MentionCheckResult implements Serializable {

    @InterfaceC65349Pkn("user_blocked_results")
    public ArrayList<MentionCheckSingleTypeResult> tagUpdateStatus;

    @InterfaceC65349Pkn("uid")
    public long uid;

    /* JADX WARN: Multi-variable type inference failed */
    public MentionCheckResult() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MentionCheckResult copy$default(MentionCheckResult mentionCheckResult, long j, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mentionCheckResult.uid;
        }
        if ((i & 2) != 0) {
            arrayList = mentionCheckResult.tagUpdateStatus;
        }
        return mentionCheckResult.copy(j, arrayList);
    }

    public final MentionCheckResult copy(long j, ArrayList<MentionCheckSingleTypeResult> arrayList) {
        return new MentionCheckResult(j, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionCheckResult)) {
            return false;
        }
        MentionCheckResult mentionCheckResult = (MentionCheckResult) obj;
        return this.uid == mentionCheckResult.uid && o.LJ(this.tagUpdateStatus, mentionCheckResult.tagUpdateStatus);
    }

    public int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.uid) * 31;
        ArrayList<MentionCheckSingleTypeResult> arrayList = this.tagUpdateStatus;
        return LLJIJIL + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MentionCheckResult(uid=");
        LIZ.append(this.uid);
        LIZ.append(", tagUpdateStatus=");
        LIZ.append(this.tagUpdateStatus);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ArrayList<MentionCheckSingleTypeResult> getTagUpdateStatus() {
        return this.tagUpdateStatus;
    }

    public final long getUid() {
        return this.uid;
    }

    public final void setTagUpdateStatus(ArrayList<MentionCheckSingleTypeResult> arrayList) {
        this.tagUpdateStatus = arrayList;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public MentionCheckResult(long j, ArrayList<MentionCheckSingleTypeResult> arrayList) {
        this.uid = j;
        this.tagUpdateStatus = arrayList;
    }

    public /* synthetic */ MentionCheckResult(long j, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : arrayList);
    }
}
