package X;

import com.ss.android.ugc.aweme.commercialize.service.CommerceStickerOutService;
import com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceStickerOutService;

/* renamed from: X.NeL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59853NeL extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC74078T5m> {
    public static final C59853NeL LJLIL = new C59853NeL();

    public C59853NeL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC74078T5m invoke() {
        ICommerceStickerOutService commerceStickerOutService;
        Object LIZ = C58096Mr6.LIZ(ICommerceStickerOutService.class, false);
        if (LIZ != null) {
            commerceStickerOutService = (ICommerceStickerOutService) LIZ;
        } else {
            commerceStickerOutService = new CommerceStickerOutService();
        }
        return commerceStickerOutService.LIZ();
    }
}
