package X;

import Y.IDhS73S0200000_15;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.api.ObservableTranslationApi;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.StickerTranslationResult;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86715Y1n extends AbstractC86724Y1w<C69392nv> {
    public static final C86715Y1n LIZIZ = new C86715Y1n();
    public static final Y2V LIZJ = Y2V.TEXT_STICKER;
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C86771Y3r.LJLIL);

    @Override // X.AbstractC86724Y1w
    public final Y20<C69392nv> LIZJ() {
        return (Y20) LIZLLL.getValue();
    }

    @Override // X.AbstractC86724Y1w
    public final Y2V LIZLLL() {
        return LIZJ;
    }

    @Override // X.AbstractC86724Y1w
    public final AbstractC73672Svk<Boolean> LJII(Aweme aweme, InterfaceC86733Y2f interfaceC86733Y2f, String enterFrom) {
        AbstractC73672Svk<MultiTranslationResult> abstractC73672Svk;
        AbstractC73672Svk<StickerTranslationResult> abstractC73672Svk2;
        o.LJIIIZ(enterFrom, "enterFrom");
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        boolean z = false;
        if (interactStickerStructs == null || interactStickerStructs.isEmpty()) {
            LJFF(interfaceC86733Y2f, Y2M.NOT_EXISTED.name());
            return AbstractC73672Svk.LJJIJIL(Boolean.FALSE);
        }
        Y01 y01 = Y01.LIZIZ;
        o.LJIIIIZZ(interactStickerStructs, "interactStickerStructs");
        String LJI = y01.LIZ.LJI(aweme, interactStickerStructs);
        if (LJI.length() == 0) {
            LJFF(interfaceC86733Y2f, Y2M.NOT_EXISTED.name());
            return AbstractC73672Svk.LJJIJIL(Boolean.FALSE);
        }
        if (((Number) C52601Kkf.LIZ.getValue()).intValue() == 1) {
            z = true;
        }
        if (z) {
            String aid = aweme.getAid();
            String LJJIIZI = y01.LJJIIZI();
            try {
                ObservableTranslationApi.ITranslationAPI LIZ = TBA.LIZ();
                if (LIZ == null || (abstractC73672Svk2 = LIZ.getStickerTranslations(aid, LJJIIZI)) == null) {
                    abstractC73672Svk2 = C73536StY.LJLIL;
                    o.LJIIIIZZ(abstractC73672Svk2, "empty()");
                }
            } catch (ExecutionException e) {
                AbstractC36908Ee8.getCompatibleException(e);
                abstractC73672Svk2 = C73536StY.LJLIL;
                o.LJIIIIZZ(abstractC73672Svk2, "empty()");
            }
            return abstractC73672Svk2.LJJJ(C73969T1h.LIZIZ()).LJJIJL(new IDhS73S0200000_15(aweme, interfaceC86733Y2f, 2)).LJJL(T16.LIZ());
        }
        String LJJIIZI2 = y01.LJJIIZI();
        String LIZ2 = Y02.LIZ(aweme);
        try {
            ObservableTranslationApi.ITranslationAPI LIZ3 = TBA.LIZ();
            if (LIZ3 == null || (abstractC73672Svk = LIZ3.getMultipleStringTranslation(LJJIIZI2, LJI, LIZ2, 4)) == null) {
                abstractC73672Svk = C73536StY.LJLIL;
                o.LJIIIIZZ(abstractC73672Svk, "empty()");
            }
        } catch (ExecutionException e2) {
            AbstractC36908Ee8.getCompatibleException(e2);
            abstractC73672Svk = C73536StY.LJLIL;
            o.LJIIIIZZ(abstractC73672Svk, "empty()");
        }
        return abstractC73672Svk.LJJJ(C73969T1h.LIZIZ()).LJJIJL(new IDhS73S0200000_15(aweme, interfaceC86733Y2f, 3)).LJJL(T16.LIZ());
    }
}
