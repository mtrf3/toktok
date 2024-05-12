package X;

import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes11.dex */
public final class OVX extends AbstractC65781Prl implements InterfaceC65784Pro<StickerPropApi> {
    public static final OVX LJLIL = new OVX();

    public OVX() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.prop.api.StickerPropApi] */
    @Override // X.InterfaceC65784Pro
    public final StickerPropApi invoke() {
        return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(StickerPropApi.class);
    }
}
