package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69552RRk;
import X.C69553RRl;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class MarkMsgUnreadCountReportResponseBody extends Message<MarkMsgUnreadCountReportResponseBody, C69553RRl> {
    public static final ProtoAdapter<MarkMsgUnreadCountReportResponseBody> ADAPTER = new C69552RRk();
    public static final Boolean DEFAULT_SET_TOTAL_STATUS = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("failed_tag_list")
    public final List<Long> failed_tag_list;

    @InterfaceC65349Pkn("set_total_status")
    public final Boolean set_total_status;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MarkMsgUnreadCountReportResponseBody, C69553RRl> newBuilder2() {
        C69553RRl c69553RRl = new C69553RRl();
        c69553RRl.LIZLLL = this.set_total_status;
        c69553RRl.LJ = C63685Oz3.LIZJ("failed_tag_list", this.failed_tag_list);
        c69553RRl.addUnknownFields(unknownFields());
        return c69553RRl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.set_total_status != null) {
            sb.append(", set_total_status=");
            sb.append(this.set_total_status);
        }
        List<Long> list = this.failed_tag_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_tag_list=");
            sb.append(this.failed_tag_list);
        }
        return DIX.LIZLLL(sb, 0, 2, "MarkMsgUnreadCountReportResponseBody{", '}');
    }

    public MarkMsgUnreadCountReportResponseBody(Boolean bool, List<Long> list) {
        this(bool, list, C64537PUn.EMPTY);
    }

    public MarkMsgUnreadCountReportResponseBody(Boolean bool, List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.set_total_status = bool;
        this.failed_tag_list = C63685Oz3.LJFF("failed_tag_list", list);
    }
}
