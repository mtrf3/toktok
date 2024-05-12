package X;

import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TNw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74556TNw extends F9E {
    public final InfoStickerEffect LJLIL;
    public final C74558TNy LJLILLLLZI;
    public final Integer LJLJI;
    public final Exception LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C74556TNw(InfoStickerEffect sticker, C74558TNy c74558TNy, Integer num, Exception exc) {
        o.LJIIIZ(sticker, "sticker");
        this.LJLIL = sticker;
        this.LJLILLLLZI = c74558TNy;
        this.LJLJI = num;
        this.LJLJJI = exc;
    }
}
