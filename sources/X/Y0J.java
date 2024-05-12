package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0J implements InterfaceC86702Y1a {
    public final /* synthetic */ InteractStickerWidget LIZ;
    public final /* synthetic */ InteractStickerStruct LIZIZ;

    @Override // X.InterfaceC86702Y1a
    public final Y1E LIZ() {
        float f;
        InteractStickerWidget interactStickerWidget = this.LIZ;
        C224048qm c224048qm = interactStickerWidget.LJLL;
        C223048pA c223048pA = null;
        if (c224048qm == null) {
            return null;
        }
        Context mContext = interactStickerWidget.LJLIL;
        o.LJIIIIZZ(mContext, "mContext");
        InteractStickerWidget interactStickerWidget2 = this.LIZ;
        C245649kW c245649kW = interactStickerWidget2.LJLJLLL;
        InteractStickerStruct interactStickerStruct = this.LIZIZ;
        Aweme aweme = interactStickerWidget2.LLFF;
        o.LJIIIZ(interactStickerStruct, "interactStickerStruct");
        if (c245649kW != null) {
            InterfaceC86704Y1c interfaceC86704Y1c = c245649kW.LJIILIIL;
            if (interfaceC86704Y1c != null) {
                c223048pA = interfaceC86704Y1c.LIZ();
            }
            float f2 = 0.0f;
            if (c245649kW != null) {
                if (c223048pA != null) {
                    f = c223048pA.LIZ;
                } else {
                    f = 0.0f;
                }
                c245649kW.LIZ = f;
                if (c223048pA != null) {
                    f2 = c223048pA.LIZIZ;
                }
                c245649kW.LIZIZ = f2;
            }
        }
        return new C221718n1(interactStickerStruct.getType(), mContext, c224048qm, interactStickerStruct, c245649kW, aweme);
    }

    public Y0J(InteractStickerWidget interactStickerWidget, InteractStickerStruct interactStickerStruct) {
        this.LIZ = interactStickerWidget;
        this.LIZIZ = interactStickerStruct;
    }
}
