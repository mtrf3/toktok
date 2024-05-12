package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.UnReadCountReportResponseBody;

/* renamed from: X.Oy8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63628Oy8 extends AbstractC63515OwJ {
    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63628Oy8() {
        super(EnumC63625Oy5.UNREAD_COUNT_REPORT.getValue());
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        UnReadCountReportResponseBody unReadCountReportResponseBody;
        Boolean bool;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody == null || (unReadCountReportResponseBody = responseBody.unread_count_report_body) == null || (bool = unReadCountReportResponseBody.set_total_status) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        aRunnableS29S0200000_10.run();
    }
}
