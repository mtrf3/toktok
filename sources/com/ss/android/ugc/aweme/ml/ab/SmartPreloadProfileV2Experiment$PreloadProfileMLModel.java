package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.setting.model.MLModel;

/* loaded from: classes9.dex */
public class SmartPreloadProfileV2Experiment$PreloadProfileMLModel extends MLModel {

    @InterfaceC65349Pkn("group_id")
    public int groupId;

    @InterfaceC65349Pkn("client_ai_threshold")
    public float clientAIThreshold = 0.5f;

    @InterfaceC65349Pkn("recommend_threshold")
    public float recommendThreshold = 0.5f;

    @Override // com.ss.android.ugc.aweme.setting.model.MLModel
    public String toString() {
        return super.toString();
    }
}
