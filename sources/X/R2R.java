package X;

import com.bytedance.android.live.network.gson.BaseListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.BaseResponseTypeAdapter;
import com.bytedance.android.live.network.gson.LinkMicResponseAdapter;
import com.bytedance.android.live.network.gson.ListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ResponseTypeAdapter;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.google.gson.Gson;
import com.google.gson.e;

/* loaded from: classes12.dex */
public final class R2R extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final R2R LJLIL = new R2R();

    public R2R() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        Gson gson = C09650Zl.LIZIZ;
        e eVar = C09650Zl.LIZ;
        eVar.LIZIZ(new BaseResponseTypeAdapter(gson), BaseResponse.class);
        eVar.LIZIZ(new ResponseTypeAdapter(gson), C28467BFf.class);
        eVar.LIZIZ(new BaseListResponseTypeAdapter(gson), BaseListResponse.class);
        eVar.LIZIZ(new ListResponseTypeAdapter(gson), BOH.class);
        eVar.LIZIZ(new LinkMicResponseAdapter(gson), R2P.class);
        return eVar.LIZ();
    }
}
