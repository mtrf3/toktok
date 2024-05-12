package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.SearchEffectModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class SearchEffectModelTemplate extends SearchEffectModel {
    public List<? extends Effect> bindEffects;
    public List<? extends Effect> collectionList;
    public List<? extends Effect> effectList;
    public final transient SearchEffectModel kSearchEffectModel;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchEffectModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.SearchEffectModel r4 = r5.getKSearchEffectModel()
            if (r4 == 0) goto L4f
            java.util.List r3 = r4.getBind_effects()
            if (r3 == 0) goto L4f
        Lc:
            r1 = 0
            if (r3 == 0) goto L15
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L1b
        L15:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1a:
            return r3
        L1b:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L26
            if (r3 == 0) goto L54
            goto L1a
        L26:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r3, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L35
        L45:
            if (r4 == 0) goto L4a
            r4.setBind_effects(r2)
        L4a:
            super.setBind_effects(r2)
            r3 = r2
            goto L1a
        L4f:
            java.util.List r3 = super.getBind_effects()
            goto Lc
        L54:
            X.Eqm r1 = new X.Eqm
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.effectmanager.effect.model.Effect>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate.getBindEffects():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectionList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.SearchEffectModel r4 = r5.getKSearchEffectModel()
            if (r4 == 0) goto L4f
            java.util.List r3 = r4.getCollection()
            if (r3 == 0) goto L4f
        Lc:
            r1 = 0
            if (r3 == 0) goto L15
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L1b
        L15:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1a:
            return r3
        L1b:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L26
            if (r3 == 0) goto L54
            goto L1a
        L26:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r3, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L35
        L45:
            if (r4 == 0) goto L4a
            r4.setCollection(r2)
        L4a:
            super.setCollection(r2)
            r3 = r2
            goto L1a
        L4f:
            java.util.List r3 = super.getCollection()
            goto Lc
        L54:
            X.Eqm r1 = new X.Eqm
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.effectmanager.effect.model.Effect>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate.getCollectionList():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffectList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.SearchEffectModel r4 = r5.getKSearchEffectModel()
            if (r4 == 0) goto L4f
            java.util.List r3 = r4.getEffects()
            if (r3 == 0) goto L4f
        Lc:
            r1 = 0
            if (r3 == 0) goto L15
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L1b
        L15:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1a:
            return r3
        L1b:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L26
            if (r3 == 0) goto L54
            goto L1a
        L26:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r3, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L35
        L45:
            if (r4 == 0) goto L4a
            r4.setEffects(r2)
        L4a:
            super.setEffects(r2)
            r3 = r2
            goto L1a
        L4f:
            java.util.List r3 = super.getEffects()
            goto Lc
        L54:
            X.Eqm r1 = new X.Eqm
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.effectmanager.effect.model.Effect>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate.getEffectList():java.util.List");
    }

    public SearchEffectModel getKSearchEffectModel() {
        return this.kSearchEffectModel;
    }

    public SearchEffectModelTemplate(SearchEffectModel searchEffectModel) {
        super(false, 0, null, null, null, null, null, null, 255, null);
        this.kSearchEffectModel = searchEffectModel;
        this.effectList = new ArrayList();
        this.collectionList = new ArrayList();
        this.bindEffects = new ArrayList();
    }

    public void setBindEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.bindEffects = value;
        SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setBind_effects(value);
        }
        super.setBind_effects(value);
    }

    public void setCollectionList(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.collectionList = value;
        SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setCollection(value);
        }
        super.setCollection(value);
    }

    public void setEffectList(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.effectList = value;
        SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setEffects(value);
        }
        super.setEffects(value);
    }

    public /* synthetic */ SearchEffectModelTemplate(SearchEffectModel searchEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchEffectModel);
    }
}
