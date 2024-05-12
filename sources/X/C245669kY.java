package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;

/* renamed from: X.9kY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245669kY extends AbstractC65781Prl implements InterfaceC88472Yns<InteractStickerStruct, Boolean> {
    public static final C245669kY LJLIL = new C245669kY();

    public C245669kY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InteractStickerStruct interactStickerStruct) {
        boolean z;
        InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
        if (interactStickerStruct2.getType() != 11 && interactStickerStruct2.getType() != 20) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
