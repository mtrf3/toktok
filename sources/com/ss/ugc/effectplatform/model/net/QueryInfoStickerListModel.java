package com.ss.ugc.effectplatform.model.net;

import X.F9E;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class QueryInfoStickerListModel extends F9E {
    public List<? extends EffectCategoryModel> category;
    public List<InfoStickerEffect> collection;
    public List<InfoStickerEffect> effects;
    public String front_effect_id;
    public PanelDesc panel;
    public String rear_effect_id;
    public List<String> url_prefix;
    public String version;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryInfoStickerListModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryInfoStickerListModel copy$default(QueryInfoStickerListModel queryInfoStickerListModel, String str, PanelDesc panelDesc, List list, List list2, List list3, String str2, String str3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryInfoStickerListModel.version;
        }
        if ((i & 2) != 0) {
            panelDesc = queryInfoStickerListModel.panel;
        }
        if ((i & 4) != 0) {
            list = queryInfoStickerListModel.effects;
        }
        if ((i & 8) != 0) {
            list2 = queryInfoStickerListModel.collection;
        }
        if ((i & 16) != 0) {
            list3 = queryInfoStickerListModel.category;
        }
        if ((i & 32) != 0) {
            str2 = queryInfoStickerListModel.front_effect_id;
        }
        if ((i & 64) != 0) {
            str3 = queryInfoStickerListModel.rear_effect_id;
        }
        if ((i & 128) != 0) {
            list4 = queryInfoStickerListModel.url_prefix;
        }
        return queryInfoStickerListModel.copy(str, panelDesc, list, list2, list3, str2, str3, list4);
    }

    public final QueryInfoStickerListModel copy(String str, PanelDesc panelDesc, List<InfoStickerEffect> list, List<InfoStickerEffect> list2, List<? extends EffectCategoryModel> list3, String str2, String str3, List<String> list4) {
        return new QueryInfoStickerListModel(str, panelDesc, list, list2, list3, str2, str3, list4);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.version, this.panel, this.effects, this.collection, this.category, this.front_effect_id, this.rear_effect_id, this.url_prefix};
    }

    public final List<EffectCategoryModel> getCategory() {
        return this.category;
    }

    public final List<InfoStickerEffect> getCollection() {
        return this.collection;
    }

    public final List<InfoStickerEffect> getEffects() {
        return this.effects;
    }

    public final String getFront_effect_id() {
        return this.front_effect_id;
    }

    public final PanelDesc getPanel() {
        return this.panel;
    }

    public final String getRear_effect_id() {
        return this.rear_effect_id;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setCategory(List<? extends EffectCategoryModel> list) {
        this.category = list;
    }

    public final void setCollection(List<InfoStickerEffect> list) {
        this.collection = list;
    }

    public final void setEffects(List<InfoStickerEffect> list) {
        this.effects = list;
    }

    public final void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public final void setPanel(PanelDesc panelDesc) {
        this.panel = panelDesc;
    }

    public final void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public QueryInfoStickerListModel(String str, PanelDesc panelDesc, List<InfoStickerEffect> list, List<InfoStickerEffect> list2, List<? extends EffectCategoryModel> list3, String str2, String str3, List<String> list4) {
        this.version = str;
        this.panel = panelDesc;
        this.effects = list;
        this.collection = list2;
        this.category = list3;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.url_prefix = list4;
    }

    public /* synthetic */ QueryInfoStickerListModel(String str, PanelDesc panelDesc, List list, List list2, List list3, String str2, String str3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : panelDesc, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) == 0 ? list4 : null);
    }
}
