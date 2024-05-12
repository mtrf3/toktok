package com.ss.ugc.effectplatform.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectCategoryModel {
    public List<String> effects;
    public String extra;
    public UrlModel icon;
    public UrlModel icon_selected;
    public String id;
    public boolean is_default;
    public String key;
    public String name;
    public List<String> tags;
    public String tags_updated_at;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCategoryModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean checkValued() {
        if (getIcon() == null) {
            setIcon(new UrlModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0));
        }
        if (getIcon() != null) {
            if (getIcon_selected() == null) {
                setIcon_selected(new UrlModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0));
            }
            if (getIcon_selected() != null) {
                return !o.LJ(getId(), "");
            }
        }
        return false;
    }

    public List<String> getEffects() {
        return this.effects;
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public UrlModel getIcon_selected() {
        return this.icon_selected;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public boolean is_default() {
        return this.is_default;
    }

    public void setEffects(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.effects = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setIcon_selected(UrlModel urlModel) {
        this.icon_selected = urlModel;
    }

    public void setId(String str) {
        o.LJIIJ(str, "<set-?>");
        this.id = str;
    }

    public void setKey(String str) {
        o.LJIIJ(str, "<set-?>");
        this.key = str;
    }

    public void setName(String str) {
        o.LJIIJ(str, "<set-?>");
        this.name = str;
    }

    public void setTags(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.tags = list;
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void set_default(boolean z) {
        this.is_default = z;
    }

    public EffectCategoryModel(String id, String name, String key, UrlModel urlModel, UrlModel urlModel2, List<String> effects, List<String> tags, String str, boolean z, String str2) {
        o.LJIIJ(id, "id");
        o.LJIIJ(name, "name");
        o.LJIIJ(key, "key");
        o.LJIIJ(effects, "effects");
        o.LJIIJ(tags, "tags");
        this.id = id;
        this.name = name;
        this.key = key;
        this.icon = urlModel;
        this.icon_selected = urlModel2;
        this.effects = effects;
        this.tags = tags;
        this.tags_updated_at = str;
        this.is_default = z;
        this.extra = str2;
    }

    public /* synthetic */ EffectCategoryModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, List list, List list2, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : urlModel, (i & 16) != 0 ? null : urlModel2, (i & 32) != 0 ? new ArrayList() : list, (i & 64) != 0 ? new ArrayList() : list2, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? false : z, (i & 512) == 0 ? str5 : null);
    }
}
