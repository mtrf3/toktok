package Y;

import X.AbstractC73672Svk;
import X.C73969T1h;
import X.C84499XEh;
import X.T16;
import X.XF1;
import X.XF2;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDObjectS389S0100000_15 implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                return;
            case 1:
                onFail$1(this, exceptionResult);
                return;
            case 2:
                onFail$2(this, exceptionResult);
                return;
            case 3:
                onFail$3(this, exceptionResult);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effectChannelResponse);
                return;
            case 1:
                onSuccess$1(this, effectChannelResponse);
                return;
            case 2:
                onSuccess$2(this, effectChannelResponse);
                return;
            case 3:
                onSuccess$3(this, effectChannelResponse);
                return;
            default:
                return;
        }
    }

    public IDObjectS389S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(IDObjectS389S0100000_15 iDObjectS389S0100000_15, ExceptionResult exceptionResult) {
        XF1 xf1 = (XF1) iDObjectS389S0100000_15.l0;
        xf1.LIZ.LJJJJLI(xf1.LIZIZ, false, xf1.LIZJ, xf1.LIZLLL);
    }

    public static final void onFail$1(IDObjectS389S0100000_15 iDObjectS389S0100000_15, ExceptionResult exceptionResult) {
        XF1 xf1 = (XF1) iDObjectS389S0100000_15.l0;
        xf1.LIZ.LJJJJLI(xf1.LIZIZ, false, xf1.LIZJ, xf1.LIZLLL);
    }

    public static final void onFail$2(IDObjectS389S0100000_15 iDObjectS389S0100000_15, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        XF2 xf2 = (XF2) iDObjectS389S0100000_15.l0;
        xf2.LIZ.LJJJJLI(xf2.LIZIZ, false, xf2.LIZLLL, xf2.LIZJ);
    }

    public static final void onFail$3(IDObjectS389S0100000_15 iDObjectS389S0100000_15, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        XF2 xf2 = (XF2) iDObjectS389S0100000_15.l0;
        xf2.LIZ.LJJJJLI(xf2.LIZIZ, false, xf2.LIZLLL, xf2.LIZJ);
    }

    public static final void onSuccess$0(IDObjectS389S0100000_15 iDObjectS389S0100000_15, Object obj) {
        List<Effect> allCategoryEffects;
        EffectChannelResponseTemplate effectChannelResponseTemplate = (EffectChannelResponseTemplate) obj;
        if (effectChannelResponseTemplate != null && (allCategoryEffects = effectChannelResponseTemplate.getAllCategoryEffects()) != null && allCategoryEffects.isEmpty()) {
            XF1 xf1 = (XF1) iDObjectS389S0100000_15.l0;
            xf1.LIZ.LJJJJLI(xf1.LIZIZ, false, xf1.LIZJ, xf1.LIZLLL);
        } else {
            ((XF1) iDObjectS389S0100000_15.l0).LIZLLL.onSuccess(effectChannelResponseTemplate);
        }
    }

    public static final void onSuccess$1(IDObjectS389S0100000_15 iDObjectS389S0100000_15, Object obj) {
        List<Effect> allCategoryEffects;
        EffectChannelResponseTemplate effectChannelResponseTemplate = (EffectChannelResponseTemplate) obj;
        if (effectChannelResponseTemplate != null && (allCategoryEffects = effectChannelResponseTemplate.getAllCategoryEffects()) != null && allCategoryEffects.isEmpty()) {
            XF1 xf1 = (XF1) iDObjectS389S0100000_15.l0;
            xf1.LIZ.LJJJJLI(xf1.LIZIZ, false, xf1.LIZJ, xf1.LIZLLL);
        } else {
            ((XF1) iDObjectS389S0100000_15.l0).LIZLLL.onSuccess(effectChannelResponseTemplate);
        }
    }

    public static final void onSuccess$2(IDObjectS389S0100000_15 iDObjectS389S0100000_15, Object obj) {
        EffectChannelResponseTemplate response = (EffectChannelResponseTemplate) obj;
        o.LJIIIZ(response, "response");
        if (response.getAllCategoryEffects().size() == 0) {
            XF2 xf2 = (XF2) iDObjectS389S0100000_15.l0;
            xf2.LIZ.LJJJJLI(xf2.LIZIZ, false, xf2.LIZLLL, xf2.LIZJ);
            return;
        }
        ((XF2) iDObjectS389S0100000_15.l0).LIZJ.onSuccess(response);
    }

    public static final void onSuccess$3(IDObjectS389S0100000_15 iDObjectS389S0100000_15, Object obj) {
        EffectChannelResponse response = (EffectChannelResponse) obj;
        o.LJIIIZ(response, "response");
        if (C84499XEh.LIZ) {
            AbstractC73672Svk.LJIIJ(new IDuS322S0100000_12(response, 2)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0200000_15(iDObjectS389S0100000_15, response, 15));
            return;
        }
        if (response.getAllCategoryEffects().isEmpty()) {
            XF2 xf2 = (XF2) iDObjectS389S0100000_15.l0;
            xf2.LIZ.LJJJJLI(xf2.LIZIZ, false, xf2.LIZLLL, xf2.LIZJ);
            return;
        }
        ((XF2) iDObjectS389S0100000_15.l0).LIZJ.onSuccess(response);
    }
}
