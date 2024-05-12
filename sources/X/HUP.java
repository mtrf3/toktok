package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;

/* loaded from: classes8.dex */
public class HUP implements InterfaceC139745e6<IStickerUtilsService> {
    public IStickerUtilsService LJLIL;

    @Override // X.InterfaceC139745e6
    public final IStickerUtilsService get() {
        if (this.LJLIL == null) {
            this.LJLIL = AVExternalServiceImpl.LIZ().infoService().stickerInfo();
        }
        return this.LJLIL;
    }
}
