package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Y0l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86687Y0l extends AbstractC65781Prl implements InterfaceC88472Yns<InteractStickerStruct, Boolean> {
    public static final C86687Y0l LJLIL = new C86687Y0l();

    public C86687Y0l() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InteractStickerStruct interactStickerStruct) {
        String text;
        InteractStickerStruct it = interactStickerStruct;
        o.LJIIIZ(it, "it");
        if (it.getType() == 88) {
            if (it.getAddYoursStickerStruct() == null) {
                return Boolean.TRUE;
            }
            if (it.getAddYoursStickerStruct().getTopicId() == null || (text = it.getAddYoursStickerStruct().getText()) == null || text.length() == 0) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
