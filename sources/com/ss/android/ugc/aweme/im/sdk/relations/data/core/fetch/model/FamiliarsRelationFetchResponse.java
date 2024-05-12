package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes2.dex */
public final class FamiliarsRelationFetchResponse extends BaseResponse {

    @InterfaceC65349Pkn("results")
    public List<FamiliarRelation> relations;

    public final List<FamiliarRelation> getRelations() {
        return this.relations;
    }

    public final void setRelations(List<FamiliarRelation> list) {
        this.relations = list;
    }
}
