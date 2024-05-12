package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;

/* renamed from: X.5WE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WE extends AbstractC65781Prl implements InterfaceC88472Yns<StickerItemModel, Boolean> {
    public static final C5WE LJLIL = new C5WE();

    public C5WE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(StickerItemModel stickerItemModel) {
        return Boolean.valueOf(stickerItemModel.isTextSticker());
    }
}
