package com.ss.android.ugc.aweme.question.api;

import X.C10K;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC789838c;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.question.model.QuestionDetailResponse;
import com.ss.android.ugc.aweme.question.model.QuestionVideosResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class QuestionApi {
    public static final RealApi LIZ;

    /* loaded from: classes10.dex */
    public interface RealApi {
        @E8L("/tiktok/v1/forum/question/detail/")
        C10K<QuestionDetailResponse> queryQuestionDetail(@InterfaceC64986Pew("question_id") long j);

        @E8L("/tiktok/v1/forum/question/status/")
        C10K<QuestionDetailResponse> queryQuestionValidation(@InterfaceC64986Pew("question_id") long j);

        @E8L("/tiktok/v1/forum/question/videos/")
        C10K<QuestionVideosResponse> queryQuestionVideos(@InterfaceC64986Pew("question_id") long j, @InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2);

        @E8L("/tiktok/v1/forum/question/videos/")
        C10K<QuestionVideosResponse> queryQuestionVideos(@InterfaceC64986Pew("question_id") long j, @InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("aweme_ids_str") String str);
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String API_URL_PREFIX_SI = Api.LIZ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        InterfaceC789838c create = LIZLLL.create(API_URL_PREFIX_SI);
        o.LJI(create);
        LIZ = (RealApi) create.create(RealApi.class);
    }
}
