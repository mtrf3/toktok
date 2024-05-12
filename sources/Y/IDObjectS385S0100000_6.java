package Y;

import X.C141335gf;
import X.C32I;
import X.C3C4;
import X.C3C5;
import X.C47261Igj;
import X.C61878OQg;
import X.C79146V4k;
import X.C84654XKg;
import X.ET8;
import X.H78;
import X.InterfaceC67352kd;
import X.OSZ;
import X.OUR;
import X.Q7K;
import X.X1D;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.ProTemplateEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class IDObjectS385S0100000_6 implements IFetchEffectChannelListener {
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
            default:
                return;
        }
    }

    public IDObjectS385S0100000_6(C84654XKg c84654XKg, int i) {
        this.$t = i;
        this.l0 = c84654XKg;
    }

    public static final void onFail$0(IDObjectS385S0100000_6 iDObjectS385S0100000_6, ExceptionResult exceptionResult) {
        Exception exc;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch pro templates error, e = ");
        Exception exc2 = null;
        if (exceptionResult != null) {
            exc = exceptionResult.getException();
        } else {
            exc = null;
        }
        LIZ.append(exc);
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS385S0100000_6.l0;
        if (exceptionResult != null) {
            exc2 = exceptionResult.getException();
        }
        OSZ osz = new OSZ(exc2, C61878OQg.INSTANCE);
        C3C5.m7constructorimpl(osz);
        interfaceC67352kd.resumeWith(osz);
    }

    public static final void onFail$1(IDObjectS385S0100000_6 iDObjectS385S0100000_6, ExceptionResult exceptionResult) {
        Exception exc;
        if (!C79146V4k.LJJJ(((InterfaceC67352kd) iDObjectS385S0100000_6.l0).getContext()) && Q7K.LIZIZ("studio_fix_watermark_loader_resumed_crash", 1) == 1) {
            return;
        }
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS385S0100000_6.l0;
        if (exceptionResult != null) {
            exc = exceptionResult.getException();
        } else {
            exc = null;
        }
        OUR.LJ(new Throwable("request watermark panel failed", exc), interfaceC67352kd);
    }

    public static final void onSuccess$0(IDObjectS385S0100000_6 iDObjectS385S0100000_6, Object obj) {
        List<Effect> list;
        EffectChannelResponseTemplate effectChannelResponseTemplate = (EffectChannelResponseTemplate) obj;
        ET8 et8 = new ET8();
        if (effectChannelResponseTemplate == null || (list = effectChannelResponseTemplate.getAllCategoryEffects()) == null) {
            list = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Effect effect : list) {
            if (effect != null && (!et8.LIZ(r1, "effecttooltemplate"))) {
                arrayList.add(effect);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ProTemplateEffect((Effect) it.next(), C47261Igj.LJJIJ("TouchGes")));
        }
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS385S0100000_6.l0;
        OSZ osz = new OSZ(null, arrayList2);
        C3C5.m7constructorimpl(osz);
        interfaceC67352kd.resumeWith(osz);
    }

    public static final void onSuccess$1(IDObjectS385S0100000_6 iDObjectS385S0100000_6, Object obj) {
        List<Effect> allCategoryEffects;
        EffectChannelResponseTemplate effectChannelResponseTemplate = (EffectChannelResponseTemplate) obj;
        if (!C79146V4k.LJJJ(((InterfaceC67352kd) iDObjectS385S0100000_6.l0).getContext()) && Q7K.LIZIZ("studio_fix_watermark_loader_resumed_crash", 1) == 1) {
            return;
        }
        if (effectChannelResponseTemplate == null || (allCategoryEffects = effectChannelResponseTemplate.getAllCategoryEffects()) == null || allCategoryEffects.isEmpty()) {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS385S0100000_6.l0;
            C3C4 LIZ = C141335gf.LIZ(new Throwable("watermark panel empty"));
            C3C5.m7constructorimpl(LIZ);
            interfaceC67352kd.resumeWith(LIZ);
            return;
        }
        InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) iDObjectS385S0100000_6.l0;
        C3C5.m7constructorimpl(allCategoryEffects);
        interfaceC67352kd2.resumeWith(allCategoryEffects);
    }
}
