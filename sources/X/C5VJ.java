package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;

/* renamed from: X.5VJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5VJ extends AbstractC65781Prl implements InterfaceC88472Yns<StickerItemModel, Boolean> {
    public static final C5VJ LJLIL = new C5VJ();

    public C5VJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(StickerItemModel stickerItemModel) {
        return Boolean.valueOf(stickerItemModel.isTextSticker());
    }
}
