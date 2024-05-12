package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class CategoryStruct {

    @InterfaceC65349Pkn("category_id")
    public String categoryId;

    @InterfaceC65349Pkn("category_name")
    public String categoryName;

    public String getCategoryId() {
        String str = this.categoryId;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getCategoryName() {
        String str = this.categoryName;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public CategoryStruct(String str, String str2) {
        this.categoryName = str;
        this.categoryId = str2;
    }
}
