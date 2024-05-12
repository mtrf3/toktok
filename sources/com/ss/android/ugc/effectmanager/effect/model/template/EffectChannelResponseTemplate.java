package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectChannelResponseTemplate extends EffectChannelResponse {
    public List<? extends Effect> allCategoryEffects;
    public List<EffectCategoryResponse> categoryResponseList;
    public List<? extends Effect> collections;
    public Effect frontEffect;
    public final transient EffectChannelResponse kChannelResponse;
    public EffectPanelModel panelModel;
    public Effect rearEffect;
    public List<String> urlPrefix;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectChannelResponseTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Effect getFrontEffect() {
        com.ss.ugc.effectplatform.model.Effect front_effect;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse == null || (front_effect = kChannelResponse.getFront_effect()) == null) {
            front_effect = super.getFront_effect();
        }
        return new Effect(front_effect);
    }

    public EffectPanelModel getPanelModel() {
        com.ss.ugc.effectplatform.model.EffectPanelModel panel_model;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse == null || (panel_model = kChannelResponse.getPanel_model()) == null) {
            panel_model = super.getPanel_model();
        }
        return new EffectPanelModel(panel_model);
    }

    public Effect getRearEffect() {
        com.ss.ugc.effectplatform.model.Effect rear_effect;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse == null || (rear_effect = kChannelResponse.getRear_effect()) == null) {
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
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getAllCategoryEffects() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.EffectChannelResponse r3 = r4.getKChannelResponse()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getAll_category_effects()
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
            r3.setAll_category_effects(r2)
        L42:
            super.setAll_category_effects(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = super.getAll_category_effects()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate.getAllCategoryEffects():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> getCategoryResponseList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.EffectChannelResponse r4 = r5.getKChannelResponse()
            if (r4 == 0) goto L52
            java.util.List r1 = r4.getCategory_responses()
            if (r1 == 0) goto L52
        Lc:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L4c
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse
            if (r0 == 0) goto L1e
        L1d:
            return r1
        L1e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.EffectCategoryResponse r1 = (com.ss.ugc.effectplatform.model.EffectCategoryResponse) r1
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r0 = new com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse
            r0.<init>(r1)
            r3.add(r0)
            goto L2d
        L42:
            if (r4 == 0) goto L47
            r4.setCategory_responses(r3)
        L47:
            super.setCategory_responses(r3)
            r1 = r3
            goto L1d
        L4c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L52:
            java.util.List r1 = super.getCategory_responses()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate.getCategoryResponseList():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollections() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.EffectChannelResponse r3 = r4.getKChannelResponse()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getCollection_list()
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
            r3.setCollection_list(r2)
        L42:
            super.setCollection_list(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = super.getCollection_list()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate.getCollections():java.util.List");
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null && (url_prefix = kChannelResponse.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    public EffectChannelResponse getKChannelResponse() {
        return this.kChannelResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EffectChannelResponseTemplate(EffectChannelResponse effectChannelResponse) {
        super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
        this.kChannelResponse = effectChannelResponse;
        this.allCategoryEffects = new ArrayList();
        this.categoryResponseList = new ArrayList();
        this.collections = new ArrayList();
        this.panelModel = new EffectPanelModel(null, 1, 0 == true ? 1 : 0);
        this.urlPrefix = new ArrayList();
    }

    public void setAllCategoryEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.allCategoryEffects = value;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setAll_category_effects(value);
        }
        super.setAll_category_effects(value);
    }

    public void setCategoryResponseList(List<EffectCategoryResponse> value) {
        o.LJIIJ(value, "value");
        this.categoryResponseList = value;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setCategory_responses(value);
        }
        super.setCategory_responses(value);
    }

    public void setCollections(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.collections = value;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setCollection_list(value);
        }
        super.setCollection_list(value);
    }

    public void setFrontEffect(Effect effect) {
        this.frontEffect = effect;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    public void setPanelModel(EffectPanelModel value) {
        o.LJIIJ(value, "value");
        this.panelModel = value;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setPanel_model(value);
        }
        super.setPanel_model(value);
    }

    public void setRearEffect(Effect effect) {
        this.rearEffect = effect;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        this.urlPrefix = value;
        EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    public /* synthetic */ EffectChannelResponseTemplate(EffectChannelResponse effectChannelResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectChannelResponse);
    }
}
