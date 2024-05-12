package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class WhatsAppCodeItem {

    @InterfaceC65349Pkn("calling_code")
    public String callingCode;

    @InterfaceC65349Pkn("whatsapp_first")
    public Boolean whatsappFirst;

    public String getCallingCode() {
        String str = this.callingCode;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Boolean getWhatsappFirst() {
        Boolean bool = this.whatsappFirst;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }
}
