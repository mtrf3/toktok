package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public class CommentListAdMigration {

    @InterfaceC65349Pkn("enterprise_tag")
    public String enterpriseTag;

    @InterfaceC65349Pkn("link_tag")
    public String linkTag;

    @InterfaceC65349Pkn("task_tag")
    public String taskTag;

    public String getEnterpriseTag() {
        String str = this.enterpriseTag;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getLinkTag() {
        String str = this.linkTag;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getTaskTag() {
        String str = this.taskTag;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
