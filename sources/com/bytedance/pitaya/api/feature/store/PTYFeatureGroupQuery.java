package com.bytedance.pitaya.api.feature.store;

import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class PTYFeatureGroupQuery extends F9E implements ReflectionCall {
    public final String groupName;
    public final List<PTYFeatureQuery> queries;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PTYFeatureGroupQuery copy$default(PTYFeatureGroupQuery pTYFeatureGroupQuery, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pTYFeatureGroupQuery.groupName;
        }
        if ((i & 2) != 0) {
            list = pTYFeatureGroupQuery.queries;
        }
        return pTYFeatureGroupQuery.copy(str, list);
    }

    public final PTYFeatureGroupQuery copy(String groupName, List<PTYFeatureQuery> queries) {
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(queries, "queries");
        return new PTYFeatureGroupQuery(groupName, queries);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.groupName, this.queries};
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final List<PTYFeatureQuery> getQueries() {
        return this.queries;
    }

    public PTYFeatureGroupQuery(String groupName, List<PTYFeatureQuery> queries) {
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(queries, "queries");
        this.groupName = groupName;
        this.queries = queries;
    }
}
