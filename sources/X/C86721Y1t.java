package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86721Y1t extends Y25<C86715Y1n> {
    @Override // X.Y25
    public final void LJ(Aweme aweme, Y3Z y3z) {
    }

    @Override // X.Y25
    public final C86715Y1n LIZ() {
        return C86715Y1n.LIZIZ;
    }

    @Override // X.Y25
    public final EnumC79500VIa LIZIZ() {
        return EnumC79500VIa.STICKER;
    }

    @Override // X.Y25
    public final boolean LJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return Y02.LJ(aweme);
    }

    @Override // X.Y25
    public final boolean LJII(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return Y01.LIZIZ.LJJIII(aweme);
    }

    @Override // X.Y25
    public final void LJFF(Aweme aweme, C86753Y2z c86753Y2z) {
        HashMap<String, String> hashMap;
        C69392nv LJ = C86715Y1n.LIZIZ.LJ(aweme, Y01.LIZIZ.LJJIIZI());
        if (LJ != null) {
            hashMap = LJ.LJLIL;
        } else {
            hashMap = null;
        }
        c86753Y2z.LIZLLL = new X65(hashMap, LJII(aweme));
    }

    @Override // X.Y25
    public final void LIZJ(Aweme aweme, InterfaceC86733Y2f interfaceC86733Y2f, boolean z, boolean z2) {
        Y2L y2l;
        Integer num;
        if (interfaceC86733Y2f == null) {
            return;
        }
        if (!Y02.LIZLLL(aweme.getInteractStickerStructs())) {
            y2l = Y2L.NOT_EXIST;
        } else if (!z) {
            y2l = Y2L.NOT_TRANSLATABLE;
        } else if (!z2) {
            y2l = Y2L.TRANSLATION_NOT_TRIGGERED;
        } else {
            y2l = Y2L.TO_BE_TRANSLATED;
        }
        String str = null;
        if (y2l == Y2L.TO_BE_TRANSLATED) {
            num = Integer.valueOf(Y01.LIZIZ.LIZ.LJIIJ(aweme));
        } else {
            num = null;
        }
        if (y2l != Y2L.NOT_EXIST) {
            str = aweme.getTextStickerMajorityLang();
        }
        interfaceC86733Y2f.LIZIZ(Y2V.TEXT_STICKER, y2l, str, num);
    }
}
