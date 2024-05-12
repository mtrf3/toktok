package com.ss.android.ugc.effectmanager.effect.model.template;

import X.C32I;
import X.C62850Ola;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class SearchEffectResponseTemplate extends SearchEffectResponse {
    public List<? extends Effect> bindEffects;
    public boolean hasMore;
    public final transient SearchEffectResponse kSearchEffect;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchEffectResponseTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.net.SearchEffectResponse r3 = r4.getKSearchEffect()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getBind_effects()
            if (r1 == 0) goto L4d
        Lc:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L47
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L1e
        L1d:
            return r1
        L1e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L2d
        L3d:
            if (r3 == 0) goto L42
            r3.setBind_effects(r2)
        L42:
            super.setBind_effects(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = super.getBind_effects()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate.getBindEffects():java.util.List");
    }

    public List<Effect> getCollection() {
        ArrayList arrayList;
        List<com.ss.ugc.effectplatform.model.Effect> collection_list;
        SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null && (collection_list = kSearchEffect.getCollection_list()) != null) {
            arrayList = new ArrayList(C32I.LJJL(collection_list, 10));
            Iterator<com.ss.ugc.effectplatform.model.Effect> it = collection_list.iterator();
            while (it.hasNext()) {
                C62850Ola.LJII(it.next(), arrayList);
            }
        } else {
            List<com.ss.ugc.effectplatform.model.Effect> collection_list2 = getCollection_list();
            arrayList = new ArrayList(C32I.LJJL(collection_list2, 10));
            Iterator<com.ss.ugc.effectplatform.model.Effect> it2 = collection_list2.iterator();
            while (it2.hasNext()) {
                C62850Ola.LJII(it2.next(), arrayList);
            }
        }
        return arrayList;
    }

    public List<Effect> getEffects() {
        ArrayList arrayList;
        List<com.ss.ugc.effectplatform.model.Effect> effect_list;
        SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null && (effect_list = kSearchEffect.getEffect_list()) != null) {
            arrayList = new ArrayList(C32I.LJJL(effect_list, 10));
            Iterator<com.ss.ugc.effectplatform.model.Effect> it = effect_list.iterator();
            while (it.hasNext()) {
                C62850Ola.LJII(it.next(), arrayList);
            }
        } else {
            List<com.ss.ugc.effectplatform.model.Effect> effect_list2 = getEffect_list();
            arrayList = new ArrayList(C32I.LJJL(effect_list2, 10));
            Iterator<com.ss.ugc.effectplatform.model.Effect> it2 = effect_list2.iterator();
            while (it2.hasNext()) {
                C62850Ola.LJII(it2.next(), arrayList);
            }
        }
        return arrayList;
    }

    public boolean getHasMore() {
        SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            return kSearchEffect.getHas_more();
        }
        return super.getHas_more();
    }

    public SearchEffectResponse getKSearchEffect() {
        return this.kSearchEffect;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchEffectResponseTemplate(com.ss.ugc.effectplatform.model.net.SearchEffectResponse r12) {
        /*
            r11 = this;
            r2 = 0
            r4 = 0
            r9 = 127(0x7f, float:1.78E-43)
            r1 = r11
            r3 = r2
            r5 = r4
            r6 = r4
            r7 = r2
            r8 = r4
            r10 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1.kSearchEffect = r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.bindEffects = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate.<init>(com.ss.ugc.effectplatform.model.net.SearchEffectResponse):void");
    }

    public void setBindEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.bindEffects = value;
        SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            kSearchEffect.setBind_effects(value);
        }
        super.setBind_effects(value);
    }

    public void setCollection(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            kSearchEffect.setCollection_list(value);
        }
        setCollection_list(value);
    }

    public void setEffects(List<? extends Effect> effects) {
        o.LJIIJ(effects, "effects");
        SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            kSearchEffect.setEffect_list(effects);
        }
        setEffect_list(effects);
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
        SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            kSearchEffect.setHas_more(z);
        }
        super.setHas_more(z);
    }

    public /* synthetic */ SearchEffectResponseTemplate(SearchEffectResponse searchEffectResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchEffectResponse);
    }
}
