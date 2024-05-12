package com.ss.ugc.effectplatform.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectChannelResponse {
    public List<? extends Effect> all_category_effects;
    public List<? extends EffectCategoryResponse> category_responses;
    public List<? extends Effect> collection_list;
    public Effect front_effect;
    public String panel;
    public EffectPanelModel panel_model;
    public Effect rear_effect;
    public List<String> url_prefix;
    public String version;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectChannelResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public List<Effect> getAll_category_effects() {
        return this.all_category_effects;
    }

    public List<EffectCategoryResponse> getCategory_responses() {
        return this.category_responses;
    }

    public List<Effect> getCollection_list() {
        return this.collection_list;
    }

    public Effect getFront_effect() {
        return this.front_effect;
    }

    public String getPanel() {
        return this.panel;
    }

    public EffectPanelModel getPanel_model() {
        return this.panel_model;
    }

    public Effect getRear_effect() {
        return this.rear_effect;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAll_category_effects(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.all_category_effects = list;
    }

    public void setCategory_responses(List<? extends EffectCategoryResponse> list) {
        o.LJIIJ(list, "<set-?>");
        this.category_responses = list;
    }

    public void setCollection_list(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.collection_list = list;
    }

    public void setFront_effect(Effect effect) {
        this.front_effect = effect;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    public void setPanel_model(EffectPanelModel effectPanelModel) {
        o.LJIIJ(effectPanelModel, "<set-?>");
        this.panel_model = effectPanelModel;
    }

    public void setRear_effect(Effect effect) {
        this.rear_effect = effect;
    }

    public void setUrl_prefix(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.url_prefix = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public EffectChannelResponse(String str, String str2, Effect effect, Effect effect2, List<? extends Effect> all_category_effects, List<? extends EffectCategoryResponse> category_responses, EffectPanelModel panel_model, List<? extends Effect> collection_list, List<String> url_prefix) {
        o.LJIIJ(all_category_effects, "all_category_effects");
        o.LJIIJ(category_responses, "category_responses");
        o.LJIIJ(panel_model, "panel_model");
        o.LJIIJ(collection_list, "collection_list");
        o.LJIIJ(url_prefix, "url_prefix");
        this.panel = str;
        this.version = str2;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.all_category_effects = all_category_effects;
        this.category_responses = category_responses;
        this.panel_model = panel_model;
        this.collection_list = collection_list;
        this.url_prefix = url_prefix;
        getPanel_model().setId(getPanel());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ EffectChannelResponse(String str, String str2, Effect effect, Effect effect2, List list, List list2, EffectPanelModel effectPanelModel, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : effect, (i & 8) == 0 ? effect2 : null, (i & 16) != 0 ? new ArrayList() : list, (i & 32) != 0 ? new ArrayList() : list2, (i & 64) != 0 ? new EffectPanelModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0) : effectPanelModel, (i & 128) != 0 ? new ArrayList() : list3, (i & 256) != 0 ? new ArrayList() : list4);
    }
}
