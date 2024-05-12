package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137225a2 extends AbstractC65781Prl implements InterfaceC88472Yns<TextStickerModel, C76800UCe> {
    public static final C137225a2 LJLIL = new C137225a2();

    public C137225a2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(TextStickerModel textStickerModel) {
        TextStickerModel it = textStickerModel;
        o.LJIIIZ(it, "it");
        it.setCaptionModel(new CaptionModel(false, 1, null));
        return C76800UCe.LIZ;
    }
}
