package com.ss.ugc.effectplatform.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectChannelModel {
    public List<? extends EffectCategoryModel> category;
    public List<? extends Effect> collection;
    public List<? extends Effect> effects;
    public Extra extra;
    public String front_effect_id;
    public EffectPanelModel panel;
    public String rear_effect_id;
    public List<String> url_prefix;
    public String version;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectChannelModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final boolean checkValued() {
        return getPanel_model().checkValued();
    }

    /* loaded from: classes16.dex */
    public static final class Extra {
        public String rec_id = "";
        public String effect_recommend = "";

        public final String getEffect_recommend() {
            return this.effect_recommend;
        }

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setEffect_recommend(String str) {
            o.LJIIJ(str, "<set-?>");
            this.effect_recommend = str;
        }

        public final void setRec_id(String str) {
            o.LJIIJ(str, "<set-?>");
            this.rec_id = str;
        }
    }

    public final List<EffectCategoryModel> getCategory_list() {
        return this.category;
    }

    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public String getFront_effect_id() {
        return this.front_effect_id;
    }

    public final EffectPanelModel getPanel_model() {
        return this.panel;
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

    public final void setCategory_list(List<? extends EffectCategoryModel> value) {
        o.LJIIJ(value, "value");
        this.category = value;
    }

    public final void setCollection_list(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.collection = value;
    }

    public final void setEffect_list(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.effects = value;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public final void setPanel_model(EffectPanelModel value) {
        o.LJIIJ(value, "value");
        this.panel = value;
    }

    public void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public void setUrl_prefix(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.url_prefix = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public EffectChannelModel(String str, List<? extends Effect> effects, List<? extends EffectCategoryModel> category, EffectPanelModel panel, String str2, String str3, List<? extends Effect> collection, List<String> url_prefix, Extra extra) {
        o.LJIIJ(effects, "effects");
        o.LJIIJ(category, "category");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(collection, "collection");
        o.LJIIJ(url_prefix, "url_prefix");
        this.version = str;
        this.effects = effects;
        this.category = category;
        this.panel = panel;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.collection = collection;
        this.url_prefix = url_prefix;
        this.extra = extra;
    }

    public /* synthetic */ EffectChannelModel(String str, List list, List list2, EffectPanelModel effectPanelModel, String str2, String str3, List list3, List list4, Extra extra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2, (i & 8) != 0 ? new EffectPanelModel(null, null, null, null, null, null, 63, null) : effectPanelModel, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? new ArrayList() : list3, (i & 128) != 0 ? new ArrayList() : list4, (i & 256) == 0 ? extra : null);
    }
}
