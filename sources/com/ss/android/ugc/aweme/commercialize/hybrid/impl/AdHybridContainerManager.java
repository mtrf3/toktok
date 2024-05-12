package com.ss.android.ugc.aweme.commercialize.hybrid.impl;

import X.AbstractC59064NGa;
import X.C141335gf;
import X.C25620zW;
import X.C3C5;
import X.C58096Mr6;
import X.C58582Rq;
import X.C59051NFn;
import X.C59065NGb;
import X.C59066NGc;
import X.C59072NGi;
import X.C59421NTt;
import X.C61520OCm;
import X.C65777Prh;
import X.C76800UCe;
import X.C78983UzD;
import X.EnumC242959gB;
import X.ND5;
import X.ND6;
import X.ND7;
import X.NGS;
import X.NGT;
import X.NGU;
import X.NGW;
import X.NGY;
import X.NGZ;
import X.O3U;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdHybridContainerManager implements IAdHybridContainerManager {
    public final Map<String, AbstractC59064NGa> LIZ = new LinkedHashMap();
    public final String LIZIZ = "AdHybridContainerManager";

    public static IAdHybridContainerManager LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IAdHybridContainerManager.class, false);
        if (LIZ != null) {
            return (IAdHybridContainerManager) LIZ;
        }
        if (C58096Mr6.LLLLLIL == null) {
            synchronized (IAdHybridContainerManager.class) {
                if (C58096Mr6.LLLLLIL == null) {
                    C58096Mr6.LLLLLIL = new AdHybridContainerManager();
                }
            }
        }
        return C58096Mr6.LLLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager
    public final void initialize() {
        Object LIZ;
        String name;
        NGU.LIZ.getClass();
        Object obj = null;
        try {
            Field declaredField = Class.forName("com.ss.android.ugc.aweme.commercialize.hybrid.api.Type_CommerceHybridCollector").getDeclaredField("TYPE_COLLECTOR");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            if (obj2 != null) {
                NGU.LIZJ = C65777Prh.LIZJ(obj2);
                LIZ = C76800UCe.LIZ;
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C58582Rq.LIZ(C25620zW.LIZ("initAdHybridAnnotation: exception with container type = ", m10exceptionOrNullimpl), NGU.LIZIZ);
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (EnumC242959gB enumC242959gB : EnumC242959gB.values()) {
                arrayList.add(enumC242959gB.name());
            }
            Field[] declaredFields = Class.forName("com.ss.android.ugc.aweme.commercialize.hybrid.api.Gecko_CommerceHybridCollector").getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    if (field != null && (name = field.getName()) != null && arrayList.contains(name)) {
                        field.setAccessible(true);
                        Map<String, List<String>> map = NGU.LIZLLL;
                        Object obj3 = field.get(null);
                        o.LJII(obj3, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                        map.put(name, C65777Prh.LIZIZ(obj3));
                    }
                }
                obj = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(obj);
        } catch (Throwable th2) {
            obj = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(obj);
        }
        Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(obj);
        if (m10exceptionOrNullimpl2 != null) {
            C58582Rq.LIZ(C25620zW.LIZ("initAdHybridAnnotation: exception with gecko config = ", m10exceptionOrNullimpl2), NGU.LIZIZ);
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager
    public final AbstractC59064NGa LIZIZ(C59066NGc c59066NGc, C59421NTt adHybridRenderOption) {
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        if (this.LIZ.containsKey(adHybridRenderOption.LIZIZ)) {
            AbstractC59064NGa abstractC59064NGa = (AbstractC59064NGa) ((LinkedHashMap) this.LIZ).get(adHybridRenderOption.LIZIZ);
            if (abstractC59064NGa != null) {
                C58582Rq.LIZ("preRender get container from cache and prerender", this.LIZIZ);
                abstractC59064NGa.LJIIL(adHybridRenderOption, null);
                return abstractC59064NGa;
            }
        }
        NGZ ngz = new NGZ(new C59065NGb(c59066NGc));
        this.LIZ.put(adHybridRenderOption.LIZIZ, ngz);
        ngz.LJIIL(adHybridRenderOption, null);
        C58582Rq.LIZ("preRender create container", this.LIZIZ);
        return ngz;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager
    public final AbstractC59064NGa LIZJ(C59066NGc adHybridContainerOption, C59421NTt adHybridRenderOption) {
        AbstractC59064NGa remove;
        o.LJIIIZ(adHybridContainerOption, "adHybridContainerOption");
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        if (this.LIZ.containsKey(adHybridRenderOption.LIZIZ) && (remove = this.LIZ.remove(adHybridRenderOption.LIZIZ)) != null) {
            C58582Rq.LIZ("getContainer from cache", this.LIZIZ);
            return remove;
        }
        C58582Rq.LIZ("getContainer from create", this.LIZIZ);
        return new NGZ(new C59065NGb(adHybridContainerOption));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager
    public final void LIZ(EnumC242959gB adHybridGeckoLoadOpportunity, Object obj, NGY ngy) {
        Object LIZ;
        o.LJIIIZ(adHybridGeckoLoadOpportunity, "adHybridGeckoLoadOpportunity");
        NGW.LIZ.getClass();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            NGT.LIZ.getClass();
            List LIZ2 = NGT.LIZ(adHybridGeckoLoadOpportunity);
            if (LIZ2 != null) {
                Iterator it = ((ArrayList) LIZ2).iterator();
                while (it.hasNext()) {
                    ND7 obtainGeckoConfig = ((NGS) it.next()).obtainGeckoConfig(obj);
                    if (obtainGeckoConfig instanceof C59051NFn) {
                        NGW.LIZ(((C59051NFn) obtainGeckoConfig).LIZ, ((C59051NFn) obtainGeckoConfig).LIZJ, ((C59051NFn) obtainGeckoConfig).LIZIZ, linkedHashMap, ngy, linkedHashMap2);
                    } else if (obtainGeckoConfig instanceof ND5) {
                        for (Map.Entry<ND6, List<String>> entry : ((ND5) obtainGeckoConfig).LIZ.entrySet()) {
                            NGW.LIZ(entry.getKey().LJLIL, entry.getKey().LJLILLLLZI, entry.getValue(), linkedHashMap, ngy, linkedHashMap2);
                        }
                    } else {
                        C58582Rq.LIZ("preloadGecko wrong template class", NGW.LIZIZ);
                    }
                }
            }
            Iterator it2 = linkedHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                C61520OCm LJIIL = O3U.LJIIL((String) ((Map.Entry) it2.next()).getKey());
                if (LJIIL != null) {
                    LJIIL.LIZJ(linkedHashMap2, new C59072NGi(linkedHashMap, ngy, adHybridGeckoLoadOpportunity));
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C58582Rq.LIZ(C25620zW.LIZ("preloadGecko: Exception = ", m10exceptionOrNullimpl), NGW.LIZIZ);
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
    }
}
