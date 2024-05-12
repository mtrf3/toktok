package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectCategoryResponseTemplate extends EffectCategoryResponse {
    public List<? extends Effect> collectionEffect;
    public Effect frontEffect;
    public boolean isDefault;
    public final transient EffectCategoryResponse kCategoryResponse;
    public Effect rearEffect;
    public String tagsUpdateTime;
    public List<? extends Effect> totalEffects;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCategoryResponseTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Effect getFrontEffect() {
        com.ss.ugc.effectplatform.model.Effect front_effect;
        EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse == null || (front_effect = kCategoryResponse.getFront_effect()) == null) {
            front_effect = super.getFront_effect();
        }
        return new Effect(front_effect);
    }

    public Effect getRearEffect() {
        com.ss.ugc.effectplatform.model.Effect rear_effect;
        EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse == null || (rear_effect = kCategoryResponse.getRear_effect()) == null) {
            rear_effect = super.getRear_effect();
        }
        return new Effect(rear_effect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectionEffect() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.EffectCategoryResponse r3 = r4.getKCategoryResponse()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getCollection_effect()
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
            r3.setCollection_effect(r2)
        L42:
            super.setCollection_effect(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = super.getCollection_effect()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate.getCollectionEffect():java.util.List");
    }

    public String getTagsUpdateTime() {
        String tags_update_time;
        EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (tags_update_time = kCategoryResponse.getTags_update_time()) != null) {
            return tags_update_time;
        }
        return super.getTags_update_time();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getTotalEffects() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.EffectCategoryResponse r3 = r4.getKCategoryResponse()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getTotal_effects()
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
            r3.setTotal_effects(r2)
        L42:
            super.setTotal_effects(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = super.getTotal_effects()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate.getTotalEffects():java.util.List");
    }

    public boolean isDefault() {
        EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            return kCategoryResponse.is_default();
        }
        return super.is_default();
    }

    public EffectCategoryResponse getKCategoryResponse() {
        return this.kCategoryResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCategoryResponseTemplate(EffectCategoryResponse effectCategoryResponse) {
        super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
        this.kCategoryResponse = effectCategoryResponse;
        this.totalEffects = new ArrayList();
        this.collectionEffect = new ArrayList();
    }

    public void setCollectionEffect(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.collectionEffect = value;
        EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setCollection_effect(value);
        }
        super.setCollection_effect(value);
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
        EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.set_default(z);
        }
        super.set_default(z);
    }

    public void setFrontEffect(Effect effect) {
        this.frontEffect = effect;
        EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    public void setRearEffect(Effect effect) {
        this.rearEffect = effect;
        EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    public void setTagsUpdateTime(String str) {
        this.tagsUpdateTime = str;
        EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setTags_update_time(str);
        }
        super.setTags_update_time(str);
    }

    public void setTotalEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.totalEffects = value;
        EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setTotal_effects(value);
        }
        super.setTotal_effects(value);
    }

    public /* synthetic */ EffectCategoryResponseTemplate(EffectCategoryResponse effectCategoryResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectCategoryResponse);
    }
}
