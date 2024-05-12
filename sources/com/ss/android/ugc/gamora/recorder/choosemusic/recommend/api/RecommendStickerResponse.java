package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecommendStickerResponse extends BaseResponse {

    @InterfaceC65349Pkn("effect_info")
    public final List<Effect> recommendStickerList;

    public final int hashCode() {
        return Objects.hash(this.recommendStickerList);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("RecommendStickerResponse:%s", this.recommendStickerList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendStickerResponse(List<? extends Effect> recommendStickerList) {
        o.LJIIIZ(recommendStickerList, "recommendStickerList");
        this.recommendStickerList = recommendStickerList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendStickerResponse)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((RecommendStickerResponse) obj).recommendStickerList}, new Object[]{this.recommendStickerList});
    }
}
