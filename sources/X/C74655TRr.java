package X;

import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageResp;
import com.bytedance.android.live.network.response.BaseResponse;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TRr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74655TRr<T> implements InterfaceC64592gB {
    public static final C74655TRr<T> LJLIL = new C74655TRr<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        long j;
        Long l;
        ReportLinkMessageResp reportLinkMessageResp;
        ReportLinkMessageResp reportLinkMessageResp2;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (reportLinkMessageResp2 = (ReportLinkMessageResp) baseResponse.data) != null) {
            j = reportLinkMessageResp2.interval;
        } else {
            j = 0;
        }
        C75159Ted.LIZJ = j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Anchor report success: interval is ");
        if (baseResponse != null && (reportLinkMessageResp = (ReportLinkMessageResp) baseResponse.data) != null) {
            l = Long.valueOf(reportLinkMessageResp.interval);
        } else {
            l = null;
        }
        C07670Rv.LJ(LIZ, l, LIZ, "MultiGuestV3ReportUtil");
        long j2 = C75159Ted.LIZJ;
        if (j2 > 0) {
            C75159Ted.LJ = (C73411SrX) TMC.LJJI(j2, TimeUnit.SECONDS).LJJJ(T16.LIZ()).LJJJLIIL(C74656TRs.LJLIL, new InterfaceC64592gB() { // from class: X.9DD
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                }
            });
        }
    }
}
