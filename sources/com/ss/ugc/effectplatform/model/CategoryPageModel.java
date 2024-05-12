package com.ss.ugc.effectplatform.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class CategoryPageModel {
    public CategoryEffectModel category_effects;
    public Extra extra;
    public boolean isCache;
    public List<String> url_prefix;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryPageModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* loaded from: classes14.dex */
    public static final class Extra {
        public List<FilterEffect> filtered_effects;
        public String rec_id = "";
        public String effect_recommend = "";

        public final String getEffect_recommend() {
            return this.effect_recommend;
        }

        public final List<FilterEffect> getFiltered_effects() {
            return this.filtered_effects;
        }

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setEffect_recommend(String str) {
            o.LJIIJ(str, "<set-?>");
            this.effect_recommend = str;
        }

        public final void setFiltered_effects(List<FilterEffect> list) {
            this.filtered_effects = list;
        }

        public final void setRec_id(String str) {
            o.LJIIJ(str, "<set-?>");
            this.rec_id = str;
        }
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

    public CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public void setUrl_prefix(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.url_prefix = list;
    }

    public CategoryPageModel(CategoryEffectModel categoryEffectModel, List<String> url_prefix, Extra extra) {
        o.LJIIJ(url_prefix, "url_prefix");
        this.category_effects = categoryEffectModel;
        this.url_prefix = url_prefix;
        this.extra = extra;
    }

    public /* synthetic */ CategoryPageModel(CategoryEffectModel categoryEffectModel, List list, Extra extra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryEffectModel, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : extra);
    }
}
