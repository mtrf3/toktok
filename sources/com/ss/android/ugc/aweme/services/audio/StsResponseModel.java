package com.ss.android.ugc.aweme.services.audio;

import X.F9E;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StsResponseModel extends F9E {
    public final List<StsAssetModel> results;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StsResponseModel copy$default(StsResponseModel stsResponseModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = stsResponseModel.results;
        }
        return stsResponseModel.copy(list);
    }

    public final StsResponseModel copy(List<StsAssetModel> results) {
        o.LJIIIZ(results, "results");
        return new StsResponseModel(results);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.results};
    }

    public final List<StsAssetModel> getResults() {
        return this.results;
    }

    public StsResponseModel(List<StsAssetModel> results) {
        o.LJIIIZ(results, "results");
        this.results = results;
    }
}
