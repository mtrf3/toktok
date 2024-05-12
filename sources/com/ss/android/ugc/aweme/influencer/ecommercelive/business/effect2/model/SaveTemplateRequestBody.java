package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SaveTemplateRequestBody extends F9E {

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("field_list")
    public final List<TemplateField> fieldList;

    @InterfaceC65349Pkn("template_id")
    public final String templateId;

    @InterfaceC65349Pkn("template_type")
    public final int templateType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.authorId, this.templateId, Integer.valueOf(this.templateType), this.fieldList};
    }

    public SaveTemplateRequestBody(String authorId, String templateId, int i, List<TemplateField> fieldList) {
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(fieldList, "fieldList");
        this.authorId = authorId;
        this.templateId = templateId;
        this.templateType = i;
        this.fieldList = fieldList;
    }
}
