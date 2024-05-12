package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS0S0200100;
import kotlin.jvm.internal.o;

/* renamed from: X.1n2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43361n2 extends C1TT {
    public final C78857UxB LJLJI = new C78857UxB();

    @Override // X.C0WM
    public final List<C1QC> LJIIJJI(EffectChannelResponse effectChannelResponse) {
        return this.LJLJI.LJIIJJI(effectChannelResponse);
    }

    @Override // X.C1TT, X.C0WP
    public final List<C1QC> LJIIZILJ(List<C1QC> effectPanelList) {
        o.LJIIIZ(effectPanelList, "effectPanelList");
        Iterator<Object> it = ORZ.LJLIIIL(effectPanelList).iterator();
        while (it.hasNext()) {
            Iterator<Object> it2 = ((C1QC) it.next()).LJLILLLLZI.iterator();
            while (it2.hasNext()) {
                LiveEffect liveEffect = (LiveEffect) it2.next();
                if (!C1TT.LIZLLL(liveEffect)) {
                    LIZ(liveEffect, new IDqS0S0200100(this, System.currentTimeMillis(), liveEffect, 4));
                }
            }
        }
        C1QC c1qc = (C1QC) ORZ.LJLLLL(effectPanelList);
        if (c1qc != null) {
            List<Object> filterList = c1qc.LJLILLLLZI;
            o.LJIIIZ(filterList, "filterList");
            C15760jc.LIZIZ(C15760jc.LIZ(filterList), filterList);
        }
        return effectPanelList;
    }
}
