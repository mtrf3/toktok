package X;

import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TNu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74554TNu implements TO2 {
    public final String LIZ;

    public C74554TNu(String str) {
        this.LIZ = str;
    }

    @Override // X.TO2
    public final String LIZ(InfoStickerEffect effect) {
        o.LJIIIZ(effect, "effect");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C17N.LJJIJIL(this.LIZ));
        LIZ.append(effect.getId());
        LIZ.append(".gif");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.TO2
    public final boolean LIZIZ(InfoStickerEffect effect) {
        o.LJIIIZ(effect, "effect");
        return C44687HgJ.LIZIZ(LIZ(effect));
    }
}
