package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;

/* renamed from: X.5dy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139665dy {
    public static void LIZ(InterfaceC139045cy interfaceC139045cy, InterfaceC139535dl interfaceC139535dl) {
        TextStickerModel textStickerModel;
        if (interfaceC139045cy == null || interfaceC139535dl == null) {
            return;
        }
        Iterator<TextStickerModel> it = interfaceC139045cy.RR().iterator();
        while (true) {
            if (it.hasNext()) {
                textStickerModel = it.next();
                if (u.LJIILLIIL(textStickerModel)) {
                    break;
                }
            } else {
                textStickerModel = null;
                break;
            }
        }
        TextStickerModel textStickerModel2 = textStickerModel;
        StickerModel stickerModel = (StickerModel) ORZ.LJLLLLLL(0, interfaceC139535dl.sk0(EnumC157656Gr.AI_CAPTION_TAG));
        if (textStickerModel2 == null || stickerModel == null) {
            return;
        }
        interfaceC139535dl.pK(stickerModel.getId(), C32151Nz.LJJIIJ(textStickerModel2));
    }
}
