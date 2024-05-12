package com.ss.ugc.effectplatform.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectPanelModel {
    public String extra;
    public UrlModel icon;
    public String id;
    public List<String> tags;
    public String tags_updated_at;
    public String text;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectPanelModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean checkValued() {
        if (getIcon() == null) {
            setIcon(new UrlModel(null, null, null, null, null, 31, null));
            return true;
        }
        return true;
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public String getText() {
        return this.text;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setTags(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.tags = list;
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public EffectPanelModel(String str, String str2, UrlModel urlModel, List<String> tags, String str3, String str4) {
        o.LJIIJ(tags, "tags");
        this.text = str;
        this.id = str2;
        this.icon = urlModel;
        this.tags = tags;
        this.tags_updated_at = str3;
        this.extra = str4;
    }

    public /* synthetic */ EffectPanelModel(String str, String str2, UrlModel urlModel, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new UrlModel(null, null, null, null, null, 31, null) : urlModel, (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null);
    }
}
