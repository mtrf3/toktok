package com.ss.ugc.effectplatform.model.net;

import X.F9E;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class PanelDesc extends F9E {
    public String extra;
    public UrlModel icon;
    public List<String> tags;
    public String tags_updated_at;
    public String text;

    /* JADX WARN: Multi-variable type inference failed */
    public PanelDesc() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PanelDesc copy$default(PanelDesc panelDesc, String str, UrlModel urlModel, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = panelDesc.text;
        }
        if ((i & 2) != 0) {
            urlModel = panelDesc.icon;
        }
        if ((i & 4) != 0) {
            str2 = panelDesc.tags_updated_at;
        }
        if ((i & 8) != 0) {
            str3 = panelDesc.extra;
        }
        if ((i & 16) != 0) {
            list = panelDesc.tags;
        }
        return panelDesc.copy(str, urlModel, str2, str3, list);
    }

    public final PanelDesc copy(String str, UrlModel urlModel, String str2, String str3, List<String> list) {
        return new PanelDesc(str, urlModel, str2, str3, list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.text, this.icon, this.tags_updated_at, this.extra, this.tags};
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public final String getText() {
        return this.text;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public PanelDesc(String str, UrlModel urlModel, String str2, String str3, List<String> list) {
        this.text = str;
        this.icon = urlModel;
        this.tags_updated_at = str2;
        this.extra = str3;
        this.tags = list;
    }

    public /* synthetic */ PanelDesc(String str, UrlModel urlModel, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : urlModel, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? list : null);
    }
}
