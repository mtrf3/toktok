package com.ss.android.ugc.aweme.challenge.recommend;

import X.AV1;
import X.C10K;
import X.GHY;
import Y.AgS124S0100000_7;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class RecommendHashTagViewModel extends ViewModel {
    public MutableLiveData<RecommendHashTagResponse> LJLIL;

    public final void gv0(GHY ghy) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.LJLIL == null) {
            this.LJLIL = new MutableLiveData<>();
        }
        MutableLiveData<RecommendHashTagResponse> data = this.LJLIL;
        o.LJIIIZ(data, "data");
        if (AV1.LJIIJJI()) {
            return;
        }
        RecommendHashTagApi.HashTagApi hashTagApi = RecommendHashTagApi.LIZ;
        o.LJI(hashTagApi);
        if (ghy != null) {
            str = ghy.LIZLLL;
            str2 = ghy.LIZIZ;
            str3 = ghy.LIZ;
            str4 = ghy.LIZJ;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        hashTagApi.fetchRecommendHashTagsMT(str, str2, str3, str4).LJ(new AgS124S0100000_7(data, 22), C10K.LJIIIIZZ, null);
    }
}
