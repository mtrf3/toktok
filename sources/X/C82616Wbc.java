package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CustomStickerApi;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CustomStickerNetInterceptor;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import kotlin.jvm.internal.o;

/* renamed from: X.Wbc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82616Wbc extends AbstractC65781Prl implements InterfaceC65784Pro<CustomStickerApi> {
    public static final C82616Wbc LJLIL = new C82616Wbc();

    public C82616Wbc() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.infoSticker.customsticker.api.CustomStickerApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final CustomStickerApi invoke() {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String itemName = ((Host) ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0)).getItemName();
        o.LJIIIIZZ(itemName, "ServiceManager.get().get…a).getHosts()[0].itemName");
        return networkService.createRetrofitWithInterceptors(itemName, true, CustomStickerApi.class, C47261Igj.LJJIJ(new CustomStickerNetInterceptor()));
    }
}
