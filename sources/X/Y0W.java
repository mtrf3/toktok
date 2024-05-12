package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0W implements InterfaceC86702Y1a {
    public final /* synthetic */ InteractStickerWidget LIZ;
    public final /* synthetic */ InteractStickerStruct LIZIZ;

    @Override // X.InterfaceC86702Y1a
    public final Y1E LIZ() {
        InteractStickerWidget interactStickerWidget = this.LIZ;
        C224048qm c224048qm = interactStickerWidget.LJLL;
        if (c224048qm != null) {
            InteractStickerStruct interactStickerStruct = this.LIZIZ;
            ITranslationService LJJIJ = TranslationServiceImpl.LJJIJ();
            Context mContext = interactStickerWidget.LJLIL;
            o.LJIIIIZZ(mContext, "mContext");
            return LJJIJ.LJIIL(mContext, interactStickerWidget.LJLJLLL, interactStickerStruct, c224048qm, interactStickerWidget.LJLLI);
        }
        return null;
    }

    public Y0W(InteractStickerWidget interactStickerWidget, InteractStickerStruct interactStickerStruct) {
        this.LIZ = interactStickerWidget;
        this.LIZIZ = interactStickerStruct;
    }
}
