package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5wY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151185wY extends AbstractC65781Prl implements InterfaceC88472Yns<StickerItemModel, Boolean> {
    public static final C151185wY LJLIL = new C151185wY();

    public C151185wY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(StickerItemModel stickerItemModel) {
        StickerItemModel it = stickerItemModel;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(it.isTextSticker());
    }
}
