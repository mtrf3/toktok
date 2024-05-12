package X;

import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TNq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74550TNq extends AbstractC74560TOa<InfoStickerEffect, String, C76800UCe> implements TO1 {
    public final TO2 LJII;
    public final InterfaceC65784Pro<InterfaceC74545TNl> LJIIIIZZ;

    @Override // X.AbstractC74560TOa
    public final String LJI(InfoStickerEffect infoStickerEffect) {
        InfoStickerEffect key = infoStickerEffect;
        o.LJIIIZ(key, "key");
        return key.getId();
    }

    public C74550TNq(C74554TNu c74554TNu, AqS162S0100000_12 aqS162S0100000_12) {
        super(3);
        this.LJII = c74554TNu;
        this.LJIIIIZZ = aqS162S0100000_12;
    }

    @Override // X.AbstractC74560TOa
    public final void LJFF(Object obj, TOZ toz) {
        InfoStickerEffect key = (InfoStickerEffect) obj;
        o.LJIIIZ(key, "key");
        String LIZ = this.LJII.LIZ(key);
        if (this.LJII.LIZIZ(key)) {
            toz.LJIIJJI(key, LIZ);
        } else {
            this.LJIIIIZZ.invoke().LIZIZ(key, new TNZ(toz, LIZ));
        }
    }
}
