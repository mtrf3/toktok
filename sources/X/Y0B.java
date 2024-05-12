package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0B implements InterfaceC86702Y1a {
    public final /* synthetic */ InteractStickerWidget LIZ;
    public final /* synthetic */ InteractStickerStruct LIZIZ;
    public final /* synthetic */ C224048qm LIZJ;

    @Override // X.InterfaceC86702Y1a
    public final Y1E LIZ() {
        C223048pA c223048pA;
        float f;
        Context mContext = this.LIZ.LJLIL;
        o.LJIIIIZZ(mContext, "mContext");
        InteractStickerWidget interactStickerWidget = this.LIZ;
        C245649kW c245649kW = interactStickerWidget.LJLJLLL;
        InteractStickerStruct interactStickerStruct = this.LIZIZ;
        C224048qm rootView = this.LIZJ;
        Aweme aweme = interactStickerWidget.LLFF;
        InterfaceC55235Lm3 interfaceC55235Lm3 = interactStickerWidget.LLD;
        o.LJIIIZ(interactStickerStruct, "interactStickerStruct");
        o.LJIIIZ(rootView, "rootView");
        if (c245649kW != null) {
            InterfaceC86704Y1c interfaceC86704Y1c = c245649kW.LJIILIIL;
            if (interfaceC86704Y1c != null) {
                c223048pA = interfaceC86704Y1c.LIZ();
            } else {
                c223048pA = null;
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
        return IQD.LIZ().LIZ(mContext, c245649kW, interactStickerStruct, rootView, aweme, interfaceC55235Lm3);
    }

    public Y0B(InteractStickerWidget interactStickerWidget, InteractStickerStruct interactStickerStruct, C224048qm c224048qm) {
        this.LIZ = interactStickerWidget;
        this.LIZIZ = interactStickerStruct;
        this.LIZJ = c224048qm;
    }
}
