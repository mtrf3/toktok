package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public class FeedbackConf {

    @InterfaceC65349Pkn("disable_upload_region")
    public String[] disableUploadRegion;

    @InterfaceC65349Pkn("fe_help")
    public String feHelp;

    @InterfaceC65349Pkn("fe_record")
    public String feRecord;

    @InterfaceC65349Pkn("help")
    public String help;

    @InterfaceC65349Pkn("normal_entry")
    public String normalEntry;

    @InterfaceC65349Pkn("not_logged_in")
    public String notLoggedIn;

    public String[] getDisableUploadRegion() {
        String[] strArr = this.disableUploadRegion;
        if (strArr == null) {
            return null;
        }
        return strArr;
    }

    public String getFeHelp() {
        String str = this.feHelp;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getFeRecord() {
        String str = this.feRecord;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getHelp() {
        String str = this.help;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getNormalEntry() {
        String str = this.normalEntry;
        if (str == null) {
            return null;
        }
        return str;
    }

    public String getNotLoggedIn() {
        String str = this.notLoggedIn;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
