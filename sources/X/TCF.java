package X;

import com.ss.android.ugc.aweme.comment.api.GifEmojiApi;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TCF extends AbstractC65781Prl implements InterfaceC65784Pro<GifEmojiApi> {
    public static final TCF LJLIL = new TCF();

    public TCF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ss.android.ugc.aweme.comment.api.GifEmojiApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final GifEmojiApi invoke() {
        ?? create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getApiUrlPrefix()).create(GifEmojiApi.class);
        o.LJIIIIZZ(create, "get()\n                .g…(GifEmojiApi::class.java)");
        return create;
    }
}
