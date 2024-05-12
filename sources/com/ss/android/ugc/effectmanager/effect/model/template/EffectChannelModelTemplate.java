package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectChannelModelTemplate extends EffectChannelModel {
    public final transient EffectChannelModel kChannelModel;
    public List<String> urlPrefix;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectChannelModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public EffectPanelModel getPanel() {
        com.ss.ugc.effectplatform.model.EffectPanelModel panel_model;
        EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel == null || (panel_model = kChannelModel.getPanel_model()) == null) {
            panel_model = getPanel_model();
        }
        return new EffectPanelModel(panel_model);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> getCategory() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.EffectChannelModel r4 = r5.getKChannelModel()
            if (r4 == 0) goto L52
            java.util.List r1 = r4.getCategory_list()
            if (r1 == 0) goto L52
        Lc:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L4c
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel
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
            com.ss.ugc.effectplatform.model.EffectCategoryModel r1 = (com.ss.ugc.effectplatform.model.EffectCategoryModel) r1
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r0 = new com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel
            r0.<init>(r1)
            r3.add(r0)
            goto L2d
        L42:
            if (r4 == 0) goto L47
            r4.setCategory_list(r3)
        L47:
            r5.setCategory_list(r3)
            r1 = r3
            goto L1d
        L4c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L52:
            java.util.List r1 = r5.getCategory_list()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate.getCategory():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollection() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.EffectChannelModel r3 = r4.getKChannelModel()
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
            r4.setCollection_list(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = r4.getCollection_list()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate.getCollection():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.EffectChannelModel r3 = r4.getKChannelModel()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getEffect_list()
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
            r3.setEffect_list(r2)
        L42:
            r4.setEffect_list(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = r4.getEffect_list()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate.getEffects():java.util.List");
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null && (url_prefix = kChannelModel.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    public EffectChannelModel getKChannelModel() {
        return this.kChannelModel;
    }

    public EffectChannelModelTemplate(EffectChannelModel effectChannelModel) {
        super(null, null, null, null, null, null, null, null, null, 511, null);
        this.kChannelModel = effectChannelModel;
        this.urlPrefix = new ArrayList();
    }

    public void setCategory(List<EffectCategoryModel> value) {
        o.LJIIJ(value, "value");
        EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null) {
            kChannelModel.setCategory_list(value);
        }
        setCategory_list(value);
    }

    public void setCollection(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null) {
            kChannelModel.setCollection_list(value);
        }
        setCollection_list(value);
    }

    public void setEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null) {
            kChannelModel.setEffect_list(value);
        }
        setEffect_list(value);
    }

    public void setPanel(EffectPanelModel value) {
        o.LJIIJ(value, "value");
        EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null) {
            kChannelModel.setPanel_model(value);
        }
        setPanel_model(value);
    }

    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        this.urlPrefix = value;
        EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null) {
            kChannelModel.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    public /* synthetic */ EffectChannelModelTemplate(EffectChannelModel effectChannelModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectChannelModel);
    }
}
