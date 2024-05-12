package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NR3 extends NR7 {
    public final java.util.Map<String, NR2> LIZIZ;
    public final java.util.Map<String, C59348NQy> LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NR3(NSR base) {
        super(base);
        o.LJIIIZ(base, "base");
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashMap();
    }

    public final NR2 LJIILJJIL(NRF nrf) {
        if (!nrf.LIZ) {
            return null;
        }
        String LJ = this.LIZ.LJ(nrf);
        NR2 nr2 = (NR2) ((LinkedHashMap) this.LIZIZ).get(LJ);
        if (nr2 == null) {
            NRA nra = new NRA(this, nrf);
            if (NSZ.LIZ.LIZ) {
                C59349NQz c59349NQz = new C59349NQz(nra);
                this.LIZIZ.put(LJ, c59349NQz);
                return c59349NQz;
            }
            throw new IllegalStateException("ViewabilitySDKManager has to be active");
        }
        return nr2;
    }

    @Override // X.NR7, X.NRC
    public final void LJIIIIZZ(Context context, NRF nrf) {
        o.LJIIIZ(context, "context");
        super.LJIIIIZZ(context, nrf);
        NR2 LJIILJJIL = LJIILJJIL(nrf);
        if (LJIILJJIL != null) {
            LJIILJJIL.LIZIZ();
        }
    }

    @Override // X.NR7, X.NRC
    public final void LIZJ(NRF nrf, Context context, int i) {
        C59348NQy LJIILIIL;
        o.LJIIIZ(context, "context");
        super.LIZJ(nrf, context, i);
        if (i == 0 && (LJIILIIL = LJIILIIL(nrf, null, C61878OQg.INSTANCE)) != null) {
            NR1.LIZIZ(LJIILIIL.LIZ);
            C59349NQz c59349NQz = LJIILIIL.LIZ;
            c59349NQz.getClass();
            c59349NQz.LJII = System.nanoTime();
            C59881Nen.LJ.LIZ();
        }
    }

    @Override // X.NR7, X.NRC
    public final void LJFF(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        super.LJFF(nrf, context, i);
        if (i == 1) {
            C59348NQy LJIILIIL = LJIILIIL(nrf, null, C61878OQg.INSTANCE);
            if (LJIILIIL != null) {
                NR1.LIZIZ(LJIILIIL.LIZ);
                LJIILIIL.LIZ.LJI();
            }
            NR2 LJIILJJIL = LJIILJJIL(nrf);
            if (LJIILJJIL != null) {
                LJIILJJIL.LIZIZ();
            }
        }
    }

    @Override // X.NR7, X.NRC
    public final void LJI(NRF nrf, Context context, int i) {
        C59348NQy LJIILIIL;
        o.LJIIIZ(context, "context");
        super.LJI(nrf, context, i);
        if (i == 0 && (LJIILIIL = LJIILIIL(nrf, null, C61878OQg.INSTANCE)) != null) {
            NR1.LIZIZ(LJIILIIL.LIZ);
            LJIILIIL.LIZ.LJI();
            C59881Nen.LJ.LIZIZ();
        }
    }

    @Override // X.NR7, X.NRC
    public final void LJIIIZ(NRF nrf, View view, List friendlyObstructions) {
        Integer LIZ;
        o.LJIIIZ(friendlyObstructions, "friendlyObstructions");
        super.LJIIIZ(nrf, view, friendlyObstructions);
        if (C35386Dug.LIZ() || (LIZ = SharePrefCache.inst().getEnableBindItemCallOMSDK().LIZ()) == null || LIZ.intValue() != 0) {
            LJIILIIL(nrf, view, friendlyObstructions);
        }
    }

    public final C59348NQy LJIILIIL(NRF nrf, View view, List<? extends View> list) {
        C59348NQy c59348NQy = null;
        if (!nrf.LIZ) {
            return null;
        }
        String LJ = this.LIZ.LJ(nrf);
        C59348NQy c59348NQy2 = (C59348NQy) ((LinkedHashMap) this.LIZJ).get(LJ);
        if (c59348NQy2 == null) {
            String LJ2 = this.LIZ.LJ(nrf);
            NR2 LJIILJJIL = LJIILJJIL(nrf);
            if (LJIILJJIL != null && view != null) {
                c59348NQy = C59348NQy.LIZ(LJIILJJIL);
                this.LIZJ.put(LJ2, c59348NQy);
                LJIILJJIL.LIZJ(view);
                Iterator<? extends View> it = list.iterator();
                while (it.hasNext()) {
                    LJIILJJIL.LIZ(it.next());
                }
                LJIILJJIL.LJFF();
            }
            this.LIZJ.put(LJ, c59348NQy);
            return c59348NQy;
        }
        return c59348NQy2;
    }

    @Override // X.NR7, X.NRC
    public final void LJIIJ(NRF nrf, Context context, int i, View view) {
        C59348NQy LJIILIIL;
        InterfaceC65784Pro<Long> duration;
        super.LJIIJ(nrf, context, i, view);
        if (i == 0 && (LJIILIIL = LJIILIIL(nrf, null, C61878OQg.INSTANCE)) != null) {
            InterfaceC59118NIc LIZ = LIZ();
            if (LIZ == null || (duration = LIZ.getDuration()) == null || ((float) duration.invoke().longValue()) >= 0.0f) {
                NR1.LIZIZ(LJIILIIL.LIZ);
                C59349NQz c59349NQz = LJIILIIL.LIZ;
                c59349NQz.getClass();
                c59349NQz.LJII = System.nanoTime();
                return;
            }
            throw new IllegalArgumentException("media duration could not be small than zero");
        }
    }

    @Override // X.NR7, X.NRC
    public final void LJIIJJI(NRF nrf, Context context, View adView, List<? extends View> friendlyView) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(adView, "adView");
        o.LJIIIZ(friendlyView, "friendlyView");
        this.LIZ.LJIIJJI(nrf, context, adView, friendlyView);
        NR2 nr2 = (NR2) ((LinkedHashMap) this.LIZIZ).get(this.LIZ.LJ(nrf));
        if (nr2 != null) {
            nr2.LIZJ(adView);
            nr2.LIZLLL();
            Iterator<? extends View> it = friendlyView.iterator();
            while (it.hasNext()) {
                nr2.LIZ(it.next());
            }
            C59348NQy LIZ = C59348NQy.LIZ(nr2);
            NR1.LIZIZ(LIZ.LIZ);
            C59349NQz c59349NQz = LIZ.LIZ;
            c59349NQz.getClass();
            c59349NQz.LJII = System.nanoTime();
            C59881Nen.LJ.LIZ();
        }
    }
}
