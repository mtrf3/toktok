package X;

import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPermissionApi;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TFH implements InterfaceC45863HzH {
    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        new C158416Jp().LIZ.storeBoolean("is_has_live_cd_permission", false);
        StickerPermissionApi.LIZ.getClass();
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String API_URL_PREFIX_SI = TFG.LIZIZ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        ((StickerPermissionApi) networkService.createRetrofit(API_URL_PREFIX_SI, true, StickerPermissionApi.class)).getStickerPermission().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(TFI.LJLIL, new InterfaceC64592gB() { // from class: X.9Fb
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        return EnumC45752HxU.P1;
    }
}
