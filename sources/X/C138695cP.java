package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;

/* renamed from: X.5cP */
/* loaded from: classes3.dex */
public final class C138695cP {
    public static /* synthetic */ void LIZ(InterfaceC138705cQ interfaceC138705cQ, String str, String str2, SpeakerCenter.KevaSpeakerBean kevaSpeakerBean, TextStickerData textStickerData) {
        interfaceC138705cQ.dH(str, str2, kevaSpeakerBean, textStickerData, false);
    }

    public static /* synthetic */ void LIZIZ(InterfaceC138705cQ interfaceC138705cQ, boolean z, boolean z2, TextStickerData textStickerData, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i) {
        InterfaceC65784Pro interfaceC65784Pro3 = interfaceC65784Pro2;
        InterfaceC65784Pro interfaceC65784Pro4 = interfaceC65784Pro;
        boolean z3 = z2;
        TextStickerData textStickerData2 = textStickerData;
        if ((i & 2) != 0) {
            z3 = false;
        }
        String str = null;
        if ((i & 4) != 0) {
            textStickerData2 = null;
        }
        if ((i & 8) != 0) {
            str = "";
        }
        if ((i & 16) != 0) {
            interfaceC65784Pro4 = C138715cR.LJLIL;
        }
        if ((i & 32) != 0) {
            interfaceC65784Pro3 = C138725cS.LJLIL;
        }
        interfaceC138705cQ.SB(z, z3, textStickerData2, str, interfaceC65784Pro4, interfaceC65784Pro3);
    }
}
