package com.ss.android.ugc.aweme.panel.net;

import X.AbstractC73672Svk;
import X.C00F;
import X.C47261Igj;
import X.C60903NvH;
import X.C73969T1h;
import X.E4Q;
import X.HJN;
import X.I1P;
import X.I1R;
import X.I1T;
import X.I1U;
import X.InterfaceC36395EQd;
import X.InterfaceC64989Pez;
import X.InterfaceC88472Yns;
import X.T16;
import Y.AfS56S0200000_7;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.panel.model.QuestionStickerPanelRequestModel;
import com.ss.android.ugc.aweme.panel.model.QuestionStickerPanelResponseModel;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class QuestionStickerPanelRequestApi {
    public static final String LIZJ = AVApiImpl.LIZJ().LIZ();
    public final Api LIZ;
    public final List<Integer> LIZIZ;

    /* loaded from: classes8.dex */
    public interface Api {
        @E4Q("/tiktok/v1/forum/question/suggest/")
        AbstractC73672Svk<QuestionStickerPanelResponseModel> getQuestionStickerFromNet(@InterfaceC64989Pez("requests") String str);
    }

    public QuestionStickerPanelRequestApi() {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String API_URL_PREFIX_SI = LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        this.LIZ = (Api) networkService.createRetrofit(API_URL_PREFIX_SI, true, Api.class);
        this.LIZIZ = C47261Igj.LJJIJIL(-1, -1, -1);
    }

    public static int LIZ(int i) {
        if ((i == I1P.QuestionCollectionRECOMMEND.ordinal() && ((ArrayList) HJN.LIZIZ).isEmpty()) || (i == I1P.QuestionCollectionFAVORITE.ordinal() && ((ArrayList) HJN.LIZJ).isEmpty())) {
            return 30;
        }
        return 6;
    }

    public final void LIZJ(int i) {
        if (I1R.LIZLLL()) {
            ListProtector.set(this.LIZIZ, 0, Integer.valueOf(i));
        } else if (C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) == 2 || C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) == 3) {
            ListProtector.set(this.LIZIZ, 1, Integer.valueOf(i));
        } else {
            ListProtector.set(this.LIZIZ, 0, Integer.valueOf(i));
            ListProtector.set(this.LIZIZ, 1, Integer.valueOf(i));
        }
    }

    public final void LIZIZ(int i, int i2, InterfaceC88472Yns interfaceC88472Yns) {
        ArrayList arrayList = new ArrayList();
        if (i2 == I1P.All.ordinal()) {
            if (I1U.LIZ() != 0) {
                Integer valueOf = Integer.valueOf(i);
                I1P i1p = I1P.QuestionCollectionFAVORITE;
                arrayList.add(new QuestionStickerPanelRequestModel(valueOf, Integer.valueOf(LIZ(i1p.ordinal())), i1p.ordinal(), 0, 8, null));
            }
            if (I1R.LIZIZ()) {
                if (I1U.LIZ() == 3) {
                    Integer valueOf2 = Integer.valueOf(i);
                    I1P i1p2 = I1P.QuestionCollectionRECOMMEND;
                    arrayList.add(new QuestionStickerPanelRequestModel(valueOf2, Integer.valueOf(LIZ(i1p2.ordinal())), i1p2.ordinal(), 0, 8, null));
                }
                if (I1U.LIZIZ()) {
                    Integer valueOf3 = Integer.valueOf(i);
                    I1P i1p3 = I1P.QuestionCollectionINVITATION;
                    arrayList.add(new QuestionStickerPanelRequestModel(valueOf3, Integer.valueOf(LIZ(i1p3.ordinal())), i1p3.ordinal(), 0, 8, null));
                }
            }
        } else {
            arrayList.add(new QuestionStickerPanelRequestModel(Integer.valueOf(i), Integer.valueOf(LIZ(i2)), i2, 0, 8, null));
        }
        LIZJ(0);
        Api api = this.LIZ;
        String json = GsonProtectorUtils.toJson(new Gson(), arrayList);
        o.LJIIIIZZ(json, "Gson().toJson(requests)");
        api.getQuestionStickerFromNet(json).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0200000_7(this, i2, interfaceC88472Yns, 16), new I1T(this));
    }
}
