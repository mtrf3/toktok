package com.ss.android.ugc.aweme.feed.prompt.data;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecommendPromptResponse implements Serializable {

    @InterfaceC65349Pkn("prompts")
    public final List<PromptStruct> prompts;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendPromptResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendPromptResponse copy$default(RecommendPromptResponse recommendPromptResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendPromptResponse.prompts;
        }
        return recommendPromptResponse.copy(list);
    }

    public final RecommendPromptResponse copy(List<PromptStruct> list) {
        return new RecommendPromptResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendPromptResponse) && o.LJ(this.prompts, ((RecommendPromptResponse) obj).prompts);
    }

    public int hashCode() {
        List<PromptStruct> list = this.prompts;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendPromptResponse(prompts=");
        return C1NE.LIZIZ(LIZ, this.prompts, ')', LIZ);
    }

    public final List<PromptStruct> getPrompts() {
        return this.prompts;
    }

    public RecommendPromptResponse(List<PromptStruct> list) {
        this.prompts = list;
    }

    public /* synthetic */ RecommendPromptResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
