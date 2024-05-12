package com.ss.android.ugc.aweme.ml.feature.pitaya.group;

import X.C61878OQg;
import com.bytedance.pitaya.api.feature.store.PTYFeatureDescription;
import com.bytedance.pitaya.api.feature.store.PTYFeatureGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class AWEFeaturePTYGroup extends PTYFeatureGroup {
    public static final AWEFeaturePTYGroup INSTANCE = new AWEFeaturePTYGroup();

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureGroup
    public String getGroupName() {
        return "ies_pty";
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureGroup
    public void traceEvent(String eventName, JSONObject params) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureGroup
    public List<PTYFeatureDescription> getDescription() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PTYFeatureDescription("sliding_velocity", null, null, null, 3, 1, false, 0, 0, null, null, null, 3982, null));
        arrayList.add(new PTYFeatureDescription("sliding_velocity_x", null, null, null, 3, 1, false, 0, 0, null, null, null, 3982, null));
        arrayList.add(new PTYFeatureDescription("sliding_velocity_y", null, null, null, 3, 1, false, 0, 0, null, null, null, 3982, null));
        return arrayList;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureGroup
    public List<String> getTrackEvents() {
        return C61878OQg.INSTANCE;
    }
}
