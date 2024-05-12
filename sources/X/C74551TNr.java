package X;

import Y.ACallableS89S0200000_12;
import Y.IDuS81S0200000_12;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TNr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74551TNr implements InterfaceC164626d8 {
    public final TO4 LIZ;
    public final TO1 LIZIZ;
    public final TO2 LIZJ;

    @Override // X.InterfaceC164626d8
    public final C73622Suw LIZIZ(InfoStickerEffect sticker) {
        o.LJIIIZ(sticker, "sticker");
        return AbstractC73672Svk.LJIIJ(new IDuS81S0200000_12(this, sticker, 0)).LJJL(T16.LIZ()).LJJLI(new C73432Srs(new ACallableS89S0200000_12(this, sticker, 0)));
    }

    @Override // X.InterfaceC164626d8
    public final TMR<InfoStickerEffect, InfoStickerListModel> LIZ(int i, String str, String str2) {
        return this.LIZ.LIZ(i, str, str2);
    }

    public C74551TNr(C74559TNz c74559TNz, C74552TNs c74552TNs, C74550TNq c74550TNq, C74554TNu c74554TNu) {
        this.LIZ = c74559TNz;
        this.LIZIZ = c74550TNq;
        this.LIZJ = c74554TNu;
    }
}
