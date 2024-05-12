package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;

/* loaded from: classes16.dex */
public final class Y0R implements InterfaceC86702Y1a {
    public final /* synthetic */ InteractStickerWidget LIZ;
    public final /* synthetic */ InteractStickerStruct LIZIZ;

    @Override // X.InterfaceC86702Y1a
    public final Y1E LIZ() {
        InteractStickerWidget interactStickerWidget = this.LIZ;
        Context context = interactStickerWidget.LJLIL;
        C245649kW c245649kW = interactStickerWidget.LJLJLLL;
        InteractStickerStruct interactStickerStruct = this.LIZIZ;
        C224048qm c224048qm = interactStickerWidget.LJLL;
        InterfaceC223648q8 interfaceC223648q8 = interactStickerWidget.LJLLI;
        C223048pA LIZ = c245649kW.LJIILIIL.LIZ();
        c245649kW.LIZ = LIZ.LIZ;
        c245649kW.LIZIZ = LIZ.LIZIZ;
        C223658q9 c223658q9 = new C223658q9(interactStickerStruct.getType(), context, c224048qm, interactStickerStruct, c245649kW, interfaceC223648q8);
        C224048qm c224048qm2 = this.LIZ.LJLL;
        if (c224048qm2 != null) {
            c224048qm2.setCommentInteractSticker(c223658q9);
        }
        return c223658q9;
    }

    public Y0R(InteractStickerWidget interactStickerWidget, InteractStickerStruct interactStickerStruct) {
        this.LIZ = interactStickerWidget;
        this.LIZIZ = interactStickerStruct;
    }
}
