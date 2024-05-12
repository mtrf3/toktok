package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJ3 implements InterfaceC82069WIv {
    @Override // X.InterfaceC82069WIv
    public final C82067WIt LIZ(WID wid, ArrayList<C6MP> arrayList) {
        return new C82067WIt();
    }

    @Override // X.InterfaceC82069WIv
    public final C82067WIt LIZIZ(C82622Wbi diContainer, WID wid, C82068WIu state) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(state, "state");
        ShortVideoContext shortVideoContext = (ShortVideoContext) diContainer.LJ(ShortVideoContext.class, null);
        C82067WIt c82067WIt = new C82067WIt();
        C81975WFf LJIIJJI = wid.LJIIJJI();
        WJ8 wj8 = WJ8.LJLIL;
        c82067WIt.LIZ(LJIIJJI, wj8);
        c82067WIt.LIZ(wid.LJIILJJIL(), new AqS161S0200000_14(this, shortVideoContext, 57));
        c82067WIt.LIZ((C81975WFf) wid.LJ.getValue(), WJ4.LJLIL);
        c82067WIt.LIZ((C81975WFf) wid.LJFF.getValue(), wj8);
        c82067WIt.LIZ((C81975WFf) wid.LJII.getValue(), WJ5.LJLIL);
        c82067WIt.LIZ(wid.LIZLLL(), new AqS161S0200000_14(this, shortVideoContext, 58));
        c82067WIt.LIZ(wid.LJII(), new AqS164S0100000_14(state, 394));
        return c82067WIt;
    }
}
