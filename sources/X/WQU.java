package X;

import Y.ACallableS117S0100000_14;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQU extends TMY<WQO> implements TPN {
    public final InterfaceC139745e6<InterfaceC84497XEf> LIZJ;
    public final InterfaceC139745e6<String> LIZLLL;
    public final boolean LJ;

    @Override // X.TMY
    public final AbstractC73672Svk<WQO> LJIIIIZZ() {
        return new C73432Srs(new ACallableS117S0100000_14(this, 6));
    }

    public static WQO LJIIIZ(EffectChannelResponse effectChannelResponse) {
        List<EffectCategoryResponse> categoryResponseList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (effectChannelResponse != null && (categoryResponseList = effectChannelResponse.getCategoryResponseList()) != null) {
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(categoryResponseList, 10));
            for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
                List<Effect> totalEffects = effectCategoryResponse.getTotalEffects();
                ArrayList arrayList4 = new ArrayList(C32I.LJJL(totalEffects, 10));
                Iterator<Effect> it = totalEffects.iterator();
                while (it.hasNext()) {
                    arrayList4.add(C82265WQj.LIZ(it.next(), effectCategoryResponse.getKey()));
                }
                arrayList3.add(new OSZ(effectCategoryResponse, arrayList4));
            }
            arrayList.addAll(arrayList3);
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ORS.LJJLIIIJILLIZJL((Iterable) ((OSZ) it2.next()).getSecond(), arrayList5);
            }
            arrayList2.addAll(arrayList5);
        }
        return new WQO(new C82237WPh(arrayList2, arrayList), false);
    }

    public WQU(InterfaceC139745e6<InterfaceC84497XEf> effectPlatform, InterfaceC139745e6<String> panelSupplier, boolean z) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(panelSupplier, "panelSupplier");
        this.LIZJ = effectPlatform;
        this.LIZLLL = panelSupplier;
        this.LJ = z;
    }
}
