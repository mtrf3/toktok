package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;

/* loaded from: classes13.dex */
public final class VoucherInfo {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 564));

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("cost_role_text")
    public final String costRoleText;

    @InterfaceC65349Pkn("cost_type")
    public final int costType;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("discount_text")
    public final String discountText;

    @InterfaceC65349Pkn("usable_end_time")
    public final long endTime;

    @InterfaceC65349Pkn("vap_schema")
    public final String schema;

    @InterfaceC65349Pkn("scope_text")
    public final String scopeTxt;

    @InterfaceC65349Pkn("usable_start_time")
    public final long startTime;

    @InterfaceC65349Pkn("tc_lines")
    public final List<TcLine> tcLines;

    @InterfaceC65349Pkn("threshold_text")
    public final String thresholdText;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("usable_reminder_text")
    public final String usableReminderText;

    @InterfaceC65349Pkn("use_limit_text")
    public final String useLimitText;

    @InterfaceC65349Pkn("vap_schema_type")
    public final Integer vapSchemaType;

    @InterfaceC65349Pkn("voucher_id")
    public final String voucherId;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeId;

    public final DaInfo LIZ() {
        return (DaInfo) this.LIZ.getValue();
    }

    public final TcLine LIZIZ() {
        List<TcLine> list = this.tcLines;
        TcLine tcLine = null;
        if (list == null) {
            return null;
        }
        Iterator<TcLine> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TcLine next = it.next();
            TcLine tcLine2 = next;
            if (tcLine2 != null && 10 == tcLine2.type) {
                tcLine = next;
                break;
            }
        }
        return tcLine;
    }
}
