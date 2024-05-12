package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JAX extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends C76800UCe>, C76800UCe> {
    public static final JAX LJLIL = new JAX();

    public JAX() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends C76800UCe> c43i) {
        MidAdCellComponent selectSubscribe = midAdCellComponent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.C4(selectSubscribe.A4().LJLJLLL, false);
            Aweme aweme = selectSubscribe.A4().LJLJLLL;
            if (aweme != null) {
                if (C1DJ.LJJ(aweme) && !selectSubscribe.LLILII) {
                    selectSubscribe.LLILII = true;
                    MidAdVM A4 = selectSubscribe.A4();
                    Context context = selectSubscribe.getContext();
                    A4.getClass();
                    Iterator<InterfaceC58172Qb> it = FeedAdServiceImpl.LJJIJLIJ().LJIL().iterator();
                    while (it.hasNext()) {
                        it.next().LIZLLL(aweme.getAid());
                    }
                    for (InterfaceC48720JAe interfaceC48720JAe : FeedAdServiceImpl.LJJIJLIJ().LJIILIIL()) {
                        if (context != null) {
                            interfaceC48720JAe.LIZIZ(context, aweme);
                        }
                    }
                    IMidAdAbility z4 = selectSubscribe.z4();
                    if (z4 != null) {
                        z4.bF(aweme, selectSubscribe.A4().LJLL, selectSubscribe.LLIL, new JAV(selectSubscribe));
                    }
                } else if (C1DJ.LJIJJLI(aweme)) {
                    String aid = aweme.getAid();
                    if (aid != null) {
                        JAY.LJ.add(aid);
                    }
                    JAY.LJI = false;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
