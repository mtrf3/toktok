package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class PanelInfoModelTemplate extends PanelInfoModel {
    public CategoryEffectModel categoryEffectModel;
    public List<EffectCategoryModel> categoryList;
    public final transient PanelInfoModel kPanelModel;
    public List<String> urlPrefix;

    /* JADX WARN: Multi-variable type inference failed */
    public PanelInfoModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CategoryEffectModel getCategoryEffectModel() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel category_effects;
        PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel == null || (category_effects = kPanelModel.getCategory_effects()) == null) {
            category_effects = super.getCategory_effects();
        }
        return new CategoryEffectModel(category_effects);
    }

    public EffectPanelModel getPanel() {
        com.ss.ugc.effectplatform.model.EffectPanelModel effect_panel;
        PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel == null || (effect_panel = kPanelModel.getEffect_panel()) == null) {
            effect_panel = getEffect_panel();
        }
        return new EffectPanelModel(effect_panel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> getCategoryList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.PanelInfoModel r4 = r5.getKPanelModel()
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
            super.setCategory_list(r3)
            r1 = r3
            goto L1d
        L4c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L52:
            java.util.List r1 = super.getCategory_list()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate.getCategoryList():java.util.List");
    }

    public String getRecID() {
        PanelInfoModel.Extra extra = getExtra();
        if (extra != null) {
            return extra.getRec_id();
        }
        return null;
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (url_prefix = kPanelModel.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    public PanelInfoModel getKPanelModel() {
        return this.kPanelModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PanelInfoModelTemplate(PanelInfoModel panelInfoModel) {
        super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
        this.kPanelModel = panelInfoModel;
        this.categoryList = new ArrayList();
        this.urlPrefix = new ArrayList();
    }

    public void setCategoryEffectModel(CategoryEffectModel categoryEffectModel) {
        this.categoryEffectModel = categoryEffectModel;
        PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    public void setCategoryList(List<EffectCategoryModel> value) {
        o.LJIIJ(value, "value");
        this.categoryList = value;
        PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setCategory_list(value);
        }
        super.setCategory_list(value);
    }

    public void setPanel(EffectPanelModel effectPanelModel) {
        PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setEffect_panel(effectPanelModel);
        }
        setEffect_panel(effectPanelModel);
    }

    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        this.urlPrefix = value;
        PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    public /* synthetic */ PanelInfoModelTemplate(PanelInfoModel panelInfoModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : panelInfoModel);
    }
}
