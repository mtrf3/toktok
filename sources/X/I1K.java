package X;

import Y.AfS56S0200000_7;
import Y.AfS59S0100000_7;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.e;
import com.ss.android.ugc.aweme.panel.model.InviteRecommendMixQuestionStickerPanelResponseModel;
import com.ss.android.ugc.aweme.panel.model.QuestionCollectionMixedRequest;
import com.ss.android.ugc.aweme.panel.net.QuestionStickerPanelMixInviteRecommendRequestApi;
import com.ss.android.ugc.aweme.panel.net.QuestionStickerPanelRequestApi;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I1K {
    public List<QaStruct> LIZJ = new ArrayList();
    public List<QaStruct> LIZLLL = new ArrayList();
    public List<QaStruct> LJ = new ArrayList();
    public final List<QaStruct> LJFF = new ArrayList();
    public final List<QaStruct> LJI = new ArrayList();
    public final C29901Fi<Boolean> LJII = new C29901Fi<>();
    public final C29901Fi<Boolean> LJIIIIZZ = new C29901Fi<>();
    public final QuestionStickerPanelRequestApi LIZ = new QuestionStickerPanelRequestApi();
    public final QuestionStickerPanelMixInviteRecommendRequestApi LIZIZ = new QuestionStickerPanelMixInviteRecommendRequestApi();

    public final boolean LIZIZ(int i) {
        if (((Number) ListProtector.get(this.LIZ.LIZIZ, i)).intValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(int i) {
        if (((Number) ListProtector.get(this.LIZ.LIZIZ, i)).intValue() == 2) {
            return true;
        }
        return false;
    }

    public final void LIZ(String str, InterfaceC88472Yns<? super InviteRecommendMixQuestionStickerPanelResponseModel, C76800UCe> interfaceC88472Yns) {
        QuestionStickerPanelMixInviteRecommendRequestApi questionStickerPanelMixInviteRecommendRequestApi = this.LIZIZ;
        I1P.QUESTIONCOLLECTIONMIXINVITERECOMMEND.ordinal();
        questionStickerPanelMixInviteRecommendRequestApi.getClass();
        QuestionCollectionMixedRequest questionCollectionMixedRequest = new QuestionCollectionMixedRequest(EnumC81461Vy5.RecommendQuestion.ordinal(), str);
        ListProtector.set(questionStickerPanelMixInviteRecommendRequestApi.LIZIZ, 0, 0);
        QuestionStickerPanelMixInviteRecommendRequestApi.Api api = questionStickerPanelMixInviteRecommendRequestApi.LIZ;
        e eVar = new e();
        eVar.LJIIL = false;
        String json = GsonProtectorUtils.toJson(eVar.LIZ(), questionCollectionMixedRequest);
        o.LJIIIIZZ(json, "GsonBuilder().disableHtm…create().toJson(requests)");
        api.getQuestionStickerFromNet(json).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0200000_7(questionStickerPanelMixInviteRecommendRequestApi, interfaceC88472Yns, 15), new AfS59S0100000_7(questionStickerPanelMixInviteRecommendRequestApi, 81));
        this.LJIIIIZZ.LJII(Boolean.TRUE);
    }
}
