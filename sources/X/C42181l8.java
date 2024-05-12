package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1l8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42181l8 extends C1TT {
    public final C32151Nz LJLJI = new C32151Nz();

    @Override // X.C0WM
    public final List LJIIJJI(EffectChannelResponse effectChannelResponse) {
        return this.LJLJI.LJIIJJI(effectChannelResponse);
    }

    @Override // X.C1TT, X.C0WP
    public final List LJIIZILJ(List effectPanelList) {
        o.LJIIIZ(effectPanelList, "effectPanelList");
        Iterator<Object> it = ORZ.LJLIIIL(effectPanelList).iterator();
        while (it.hasNext()) {
            Iterator<Object> it2 = ((C1QC) it.next()).LJLILLLLZI.iterator();
            while (it2.hasNext()) {
                LiveEffect liveEffect = (LiveEffect) it2.next();
                if (!C1TT.LIZLLL(liveEffect) && C32141Ny.LIZJ(liveEffect)) {
                    LIZ(liveEffect, null);
                }
            }
        }
        return effectPanelList;
    }
}
