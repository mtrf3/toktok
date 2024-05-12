package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class ProAccountEnableDetailInfo {

    @InterfaceC65349Pkn("can_set_pro_g")
    public Boolean canSetProaccountGender;

    @InterfaceC65349Pkn("category_page_text")
    public CategoryPageTextStruct categoryPageText;

    @InterfaceC65349Pkn("is_proaccount_display")
    public Integer isProaccountDisplay;

    @InterfaceC65349Pkn("siwa_skip_bind")
    public Boolean siwaSkipBind;

    @InterfaceC65349Pkn("welcome_page_list")
    public List<WelcomePageTextStruct> welcomePageList = new ArrayList();

    @InterfaceC65349Pkn("category_list")
    public List<CategoryStruct> categoryList = new ArrayList();

    public Boolean getCanSetProaccountGender() {
        Boolean bool = this.canSetProaccountGender;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public CategoryPageTextStruct getCategoryPageText() {
        CategoryPageTextStruct categoryPageTextStruct = this.categoryPageText;
        if (categoryPageTextStruct != null) {
            return categoryPageTextStruct;
        }
        throw new C158056If();
    }

    public Integer getIsProaccountDisplay() {
        Integer num = this.isProaccountDisplay;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Boolean getSiwaSkipBind() {
        Boolean bool = this.siwaSkipBind;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public List<CategoryStruct> getCategoryList() {
        return this.categoryList;
    }

    public List<WelcomePageTextStruct> getWelcomePageList() {
        return this.welcomePageList;
    }
}
