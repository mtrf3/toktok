package X;

import Y.IDhS73S0200000_15;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.api.ObservableTranslationApi;
import com.ss.android.ugc.aweme.translation.model.DescriptionTranslationResult;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86716Y1o extends AbstractC86724Y1w<Y2Y> {
    public static final C86716Y1o LIZIZ = new C86716Y1o();
    public static final Y2V LIZJ = Y2V.DESCRIPTION;
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C86757Y3d.LJLIL);

    @Override // X.AbstractC86724Y1w
    public final Y20<Y2Y> LIZJ() {
        return (Y20) LIZLLL.getValue();
    }

    @Override // X.AbstractC86724Y1w
    public final Y2V LIZLLL() {
        return LIZJ;
    }

    @Override // X.AbstractC86724Y1w
    public final AbstractC73672Svk<Boolean> LJII(Aweme aweme, InterfaceC86733Y2f interfaceC86733Y2f, String enterFrom) {
        AbstractC73672Svk<DescriptionTranslationResult> abstractC73672Svk;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (((Number) C52647KlP.LIZ.getValue()).intValue() == 1) {
            String aid = aweme.getAid();
            String LJJIIZI = Y01.LIZIZ.LJJIIZI();
            try {
                ObservableTranslationApi.ITranslationAPI LIZ = TBA.LIZ();
                if (LIZ == null || (abstractC73672Svk = LIZ.getDescriptionTranslation(aid, LJJIIZI)) == null) {
                    abstractC73672Svk = C73536StY.LJLIL;
                    o.LJIIIIZZ(abstractC73672Svk, "empty()");
                }
            } catch (ExecutionException e) {
                AbstractC36908Ee8.getCompatibleException(e);
                abstractC73672Svk = C73536StY.LJLIL;
                o.LJIIIIZZ(abstractC73672Svk, "empty()");
            }
            return abstractC73672Svk.LJJJ(C73969T1h.LIZIZ()).LJJIJL(new IDhS73S0200000_15(aweme, interfaceC86733Y2f, 0)).LJJL(T16.LIZ());
        }
        return TBA.LIZIZ(C2058886e.LIZIZ(aweme), C2058886e.LIZJ(aweme), Y01.LIZIZ.LJJIIZI(), aweme.getAid(), 1).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new IDhS73S0200000_15(aweme, interfaceC86733Y2f, 1)).LJJL(T16.LIZ());
    }
}
