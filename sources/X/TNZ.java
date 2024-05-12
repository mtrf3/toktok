package X;

import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TNZ implements TO7<InfoStickerEffect, String, C76800UCe> {
    public final /* synthetic */ TO7 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public TNZ(TOZ toz, String str) {
        this.LJLIL = toz;
        this.LJLILLLLZI = str;
    }

    @Override // X.TO7
    public final void LJII(int i, Object key) {
        o.LJIIIZ(key, "key");
        this.LJLIL.LJII(i, key);
    }

    @Override // X.TO7
    public final void LJIIJJI(InfoStickerEffect key, String str) {
        o.LJIIIZ(key, "key");
        TO7 to7 = this.LJLIL;
        if (str == null) {
            str = this.LJLILLLLZI;
        }
        to7.LJIIJJI(key, str);
    }

    @Override // X.TO7
    public final void LIZ(InfoStickerEffect key, String str, C76800UCe info, long j) {
        String str2 = str;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(info, "info");
        TO7 to7 = this.LJLIL;
        if (str2 == null) {
            str2 = this.LJLILLLLZI;
        }
        to7.LIZ(key, str2, info, j);
    }

    @Override // X.TO7
    public final void LIZIZ(InfoStickerEffect key, Exception exc, C76800UCe info, long j) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(info, "info");
        this.LJLIL.LIZIZ(key, exc, info, j);
    }
}
