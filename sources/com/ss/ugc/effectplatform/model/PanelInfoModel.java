package com.ss.ugc.effectplatform.model;

import com.ss.ugc.effectplatform.model.CategoryPageModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class PanelInfoModel {
    public CategoryEffectModel category_effects;
    public List<? extends EffectCategoryModel> category_list;
    public Extra extra;
    public String front_effect_id;
    public EffectPanelModel panel;
    public String rear_effect_id;
    public List<String> url_prefix;
    public String version;

    /* JADX WARN: Multi-variable type inference failed */
    public PanelInfoModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    /* loaded from: classes13.dex */
    public static final class FilterEffect {
        public Long Id;
        public Long ReasonCode;
        public String ReasonMsg;

        /* JADX WARN: Multi-variable type inference failed */
        public FilterEffect() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final Long getId() {
            return this.Id;
        }

        public final Long getReasonCode() {
            return this.ReasonCode;
        }

        public final String getReasonMsg() {
            return this.ReasonMsg;
        }

        public final void setId(Long l) {
            this.Id = l;
        }

        public final void setReasonCode(Long l) {
            this.ReasonCode = l;
        }

        public final void setReasonMsg(String str) {
            this.ReasonMsg = str;
        }

        public FilterEffect(Long l, Long l2, String str) {
            this.Id = l;
            this.ReasonCode = l2;
            this.ReasonMsg = str;
        }

        public /* synthetic */ FilterEffect(Long l, Long l2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str);
        }
    }

    /* loaded from: classes16.dex */
    public static final class Extra {
        public List<CategoryPageModel.FilterEffect> filtered_effects;
        public String rec_id = "";
        public String effect_recommend = "";

        public final String getEffect_recommend() {
            return this.effect_recommend;
        }

        public final List<CategoryPageModel.FilterEffect> getFiltered_effects() {
            return this.filtered_effects;
        }

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setEffect_recommend(String str) {
            o.LJIIJ(str, "<set-?>");
            this.effect_recommend = str;
        }

        public final void setFiltered_effects(List<CategoryPageModel.FilterEffect> list) {
            this.filtered_effects = list;
        }

        public final void setRec_id(String str) {
            o.LJIIJ(str, "<set-?>");
            this.rec_id = str;
        }
    }

    public CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    public List<EffectCategoryModel> getCategory_list() {
        return this.category_list;
    }

    public final EffectPanelModel getEffect_panel() {
        return this.panel;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public String getFront_effect_id() {
        return this.front_effect_id;
    }

    public String getRear_effect_id() {
        return this.rear_effect_id;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public void setCategory_list(List<? extends EffectCategoryModel> list) {
        o.LJIIJ(list, "<set-?>");
        this.category_list = list;
    }

    public final void setEffect_panel(EffectPanelModel effectPanelModel) {
        this.panel = effectPanelModel;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public void setUrl_prefix(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.url_prefix = list;
    }

    public void setVersion(String str) {
        o.LJIIJ(str, "<set-?>");
        this.version = str;
    }

    public PanelInfoModel(String version, List<? extends EffectCategoryModel> category_list, CategoryEffectModel categoryEffectModel, EffectPanelModel effectPanelModel, String str, String str2, List<String> url_prefix, Extra extra) {
        o.LJIIJ(version, "version");
        o.LJIIJ(category_list, "category_list");
        o.LJIIJ(url_prefix, "url_prefix");
        this.version = version;
        this.category_list = category_list;
        this.category_effects = categoryEffectModel;
        this.panel = effectPanelModel;
        this.front_effect_id = str;
        this.rear_effect_id = str2;
        this.url_prefix = url_prefix;
        this.extra = extra;
    }

    public /* synthetic */ PanelInfoModel(String str, List list, CategoryEffectModel categoryEffectModel, EffectPanelModel effectPanelModel, String str2, String str3, List list2, Extra extra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : categoryEffectModel, (i & 8) != 0 ? null : effectPanelModel, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? new ArrayList() : list2, (i & 128) == 0 ? extra : null);
    }
}
