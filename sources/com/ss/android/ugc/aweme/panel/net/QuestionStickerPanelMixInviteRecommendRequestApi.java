package com.ss.android.ugc.aweme.panel.net;

import X.AbstractC73672Svk;
import X.C47261Igj;
import X.C60903NvH;
import X.E4Q;
import X.InterfaceC36395EQd;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.panel.model.InviteRecommendMixQuestionStickerPanelResponseModel;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class QuestionStickerPanelMixInviteRecommendRequestApi {
    public static final String LIZJ = AVApiImpl.LIZJ().LIZ();
    public final Api LIZ;
    public final List<Integer> LIZIZ;

    /* loaded from: classes8.dex */
    public interface Api {
        @E4Q("/tiktok/v1/forum/question/suggest/mix/")
        AbstractC73672Svk<InviteRecommendMixQuestionStickerPanelResponseModel> getQuestionStickerFromNet(@InterfaceC64989Pez("requests") String str);
    }

    public QuestionStickerPanelMixInviteRecommendRequestApi() {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String API_URL_PREFIX_SI = LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        this.LIZ = (Api) networkService.createRetrofit(API_URL_PREFIX_SI, true, Api.class);
        this.LIZIZ = C47261Igj.LJJIJIL(-1);
    }
}
