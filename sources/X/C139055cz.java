package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.AqS168S0100000_2;

/* renamed from: X.5cz */
/* loaded from: classes3.dex */
public final class C139055cz {
    public static /* synthetic */ TextStickerModel LIZ(InterfaceC139045cy interfaceC139045cy, TextStickerData textStickerData, boolean z, AqS168S0100000_2 aqS168S0100000_2, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        InterfaceC88472Yns<? super TextStickerModel, C76800UCe> interfaceC88472Yns = aqS168S0100000_2;
        if ((i & 4) != 0) {
            interfaceC88472Yns = C139065d0.LJLIL;
        }
        return interfaceC139045cy.ko0(textStickerData, z, interfaceC88472Yns);
    }
}
