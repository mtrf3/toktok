package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public class BALeadGenMessage extends CR6 {

    @InterfaceC65349Pkn("cta_text")
    public String ctaText;

    @InterfaceC65349Pkn("op")
    public int op;

    @InterfaceC65349Pkn("op_time")
    public long opTime;

    @InterfaceC65349Pkn("page_id")
    public long pageId;

    @InterfaceC65349Pkn("schema")
    public String schema;

    public BALeadGenMessage() {
        this.type = EnumC31509CYf.BA_LEAD_GEN;
    }
}
