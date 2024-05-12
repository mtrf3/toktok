package com.ss.android.ugc.aweme.friends.model;

import X.C246119lH;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;

/* loaded from: classes10.dex */
public final class RelationDataSource {
    public static final RelationDataSource INSTANCE = new RelationDataSource();
    public static final EventLiveData<RelationStatus> relationLiveData = new EventLiveData<>();
    public static final EventLiveData<C246119lH> isRemovedLiveData = new EventLiveData<>();

    public final EventLiveData<RelationStatus> get() {
        return relationLiveData;
    }

    public final EventLiveData<C246119lH> getIsRemoved() {
        return isRemovedLiveData;
    }
}
