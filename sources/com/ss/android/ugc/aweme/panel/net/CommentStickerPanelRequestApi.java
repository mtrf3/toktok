package com.ss.android.ugc.aweme.panel.net;

import X.AbstractC73672Svk;
import X.C47261Igj;
import X.C60903NvH;
import X.C73426Srm;
import X.C73893SzJ;
import X.C73969T1h;
import X.E4Q;
import X.I1Q;
import X.InterfaceC36395EQd;
import X.InterfaceC64989Pez;
import X.InterfaceC88472Yns;
import X.T16;
import Y.AfS46S0300000_7;
import Y.AfS59S0100000_7;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.panel.model.CommentStickerPanelRequest;
import com.ss.android.ugc.aweme.panel.model.CommentStickerPanelResponse;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommentStickerPanelRequestApi {
    public static final String LIZJ = AVApiImpl.LIZJ().LIZ();
    public final Api LIZ;
    public final List<Integer> LIZIZ;

    /* loaded from: classes8.dex */
    public interface Api {
        @E4Q("/tiktok/comment/recommend/v1")
        AbstractC73672Svk<CommentStickerPanelResponse> getCommentStickerFromNet(@InterfaceC64989Pez("requests") String str);
    }

    public CommentStickerPanelRequestApi() {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String API_URL_PREFIX_SI = LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        this.LIZ = (Api) networkService.createRetrofit(API_URL_PREFIX_SI, true, Api.class);
        this.LIZIZ = C47261Igj.LJJIJIL(-1, -1, -1);
    }

    public final void LIZIZ(int i) {
        int size = this.LIZIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            ListProtector.set(this.LIZIZ, i2, Integer.valueOf(i));
        }
    }

    public static C73426Srm LIZ(CommentStickerPanelRequestApi commentStickerPanelRequestApi, int i, InterfaceC88472Yns interfaceC88472Yns, int i2, int i3) {
        int i4;
        int i5 = i2;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i4 = 30;
        } else {
            i4 = 0;
        }
        if ((i3 & 8) != 0) {
            i5 = 0;
        }
        commentStickerPanelRequestApi.getClass();
        ArrayList arrayList = new ArrayList();
        I1Q i1q = I1Q.Favorites;
        if (i5 == i1q.getValue()) {
            arrayList.add(new CommentStickerPanelRequest(Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i1q.getValue())));
        } else {
            I1Q i1q2 = I1Q.Recommended;
            if (i5 == i1q2.getValue()) {
                arrayList.add(new CommentStickerPanelRequest(Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i1q2.getValue())));
            } else if (i5 == I1Q.Both.getValue()) {
                arrayList.add(new CommentStickerPanelRequest(Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i1q.getValue())));
                arrayList.add(new CommentStickerPanelRequest(Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i1q2.getValue())));
            }
        }
        commentStickerPanelRequestApi.LIZIZ(0);
        C73893SzJ c73893SzJ = new C73893SzJ();
        Api api = commentStickerPanelRequestApi.LIZ;
        String json = GsonProtectorUtils.toJson(new Gson(), arrayList);
        o.LJIIIIZZ(json, "Gson().toJson(requests)");
        api.getCommentStickerFromNet(json).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS46S0300000_7(commentStickerPanelRequestApi, i5, interfaceC88472Yns, c73893SzJ, 8), new AfS59S0100000_7(commentStickerPanelRequestApi, c73893SzJ, 80));
        return new C73426Srm(c73893SzJ);
    }
}
