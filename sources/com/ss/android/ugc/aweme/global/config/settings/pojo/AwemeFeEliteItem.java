package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class AwemeFeEliteItem {

    @InterfaceC65349Pkn("edit_contact_link")
    public String editContactLink;

    @InterfaceC65349Pkn("edit_service_center_link")
    public String editServiceCenterLink;

    public String getEditContactLink() {
        String str = this.editContactLink;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getEditServiceCenterLink() {
        String str = this.editServiceCenterLink;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
