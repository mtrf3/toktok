package com.ss.android.ugc.aweme.sticker.image;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class DefaultTemplates extends F9E implements Serializable {

    @InterfaceC65349Pkn("cursor")
    public Integer cursor;

    @InterfaceC65349Pkn("template")
    public List<TemplateItem> templateItemList;

    public DefaultTemplates() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultTemplates copy$default(DefaultTemplates defaultTemplates, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = defaultTemplates.cursor;
        }
        if ((i & 2) != 0) {
            list = defaultTemplates.templateItemList;
        }
        return defaultTemplates.copy(num, list);
    }

    public final DefaultTemplates copy(Integer num, List<TemplateItem> list) {
        return new DefaultTemplates(num, list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.cursor, this.templateItemList};
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final List<TemplateItem> getTemplateItemList() {
        return this.templateItemList;
    }

    public final void setCursor(Integer num) {
        this.cursor = num;
    }

    public final void setTemplateItemList(List<TemplateItem> list) {
        this.templateItemList = list;
    }

    public DefaultTemplates(Integer num, List<TemplateItem> list) {
        this.cursor = num;
        this.templateItemList = list;
    }

    public DefaultTemplates(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
