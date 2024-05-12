package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0P implements InterfaceC86702Y1a {
    public final /* synthetic */ InteractStickerWidget LIZ;
    public final /* synthetic */ InteractStickerStruct LIZIZ;

    @Override // X.InterfaceC86702Y1a
    public final Y1E LIZ() {
        InteractStickerWidget interactStickerWidget = this.LIZ;
        Context context = interactStickerWidget.LJLIL;
        C245649kW c245649kW = interactStickerWidget.LJLJLLL;
        InteractStickerStruct interactStickerStruct = this.LIZIZ;
        C224048qm c224048qm = interactStickerWidget.LJLL;
        o.LJI(c224048qm);
        InterfaceC223648q8 interfaceC223648q8 = this.LIZ.LJLLI;
        C223048pA LIZ = c245649kW.LJIILIIL.LIZ();
        c245649kW.LIZ = LIZ.LIZ;
        c245649kW.LIZIZ = LIZ.LIZIZ;
        return new C223798qN(interactStickerStruct.getType(), context, c224048qm, interactStickerStruct, c245649kW, interfaceC223648q8);
    }

    public Y0P(InteractStickerWidget interactStickerWidget, InteractStickerStruct interactStickerStruct) {
        this.LIZ = interactStickerWidget;
        this.LIZIZ = interactStickerStruct;
    }
}
