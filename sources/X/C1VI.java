package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1VI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VI implements C0WP<LiveEffect> {
    @Override // X.C0WP
    public final List<C1QC> LJIIZILJ(List<C1QC> effectPanelList) {
        o.LJIIIZ(effectPanelList, "effectPanelList");
        C0TX.LIZ.LIZJ("ComposerFilter");
        C0TX.LIZLLL("perform composer's process.");
        Iterator<Object> it = ORZ.LJLIIIL(effectPanelList).iterator();
        while (it.hasNext()) {
            Iterator<Object> it2 = ((C1QC) it.next()).LJLILLLLZI.iterator();
            while (it2.hasNext()) {
                final LiveEffect liveEffect = (LiveEffect) it2.next();
                C1KJ c1kj = C1KJ.LIZ;
                if (!C1KJ.LJIIL(liveEffect.getEffect())) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    c1kj.LIZLLL(liveEffect.getEffect(), new C0WN() { // from class: X.1VG
                        @Override // X.C0WN
                        public final void LJFF(int i, Effect effect) {
                        }

                        @Override // X.C0WN
                        public final void onStart(Effect effect) {
                        }

                        @Override // X.C0WN
                        public final void LJI(Effect effect) {
                            C1VI c1vi = C1VI.this;
                            long j = currentTimeMillis;
                            LiveEffect liveEffect2 = liveEffect;
                            c1vi.getClass();
                            C70657RoD.LJJI(0.01d, new C22R(j, liveEffect2, false));
                        }

                        @Override // X.C0WN
                        public final void onSuccess(Effect effect) {
                            C1VI c1vi = C1VI.this;
                            long j = currentTimeMillis;
                            LiveEffect liveEffect2 = liveEffect;
                            c1vi.getClass();
                            C70657RoD.LJJI(0.01d, new C22R(j, liveEffect2, true));
                        }
                    });
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
