package com.bytedance.android.livesdk.qa;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class QuestionList extends F9E {

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("questions")
    public ArrayList<QuestionEx> questionExList;

    @InterfaceC65349Pkn("rec_req_id")
    public String recReqId;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionList() {
        this(null, false, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.questionExList, Boolean.valueOf(this.hasMore), this.recReqId};
    }

    public QuestionList(ArrayList<QuestionEx> questionExList, boolean z, String recReqId) {
        o.LJIIIZ(questionExList, "questionExList");
        o.LJIIIZ(recReqId, "recReqId");
        this.questionExList = questionExList;
        this.hasMore = z;
        this.recReqId = recReqId;
    }

    public /* synthetic */ QuestionList(ArrayList arrayList, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str);
    }
}
