package X;

import com.bytedance.im.core.proto.Response;
import kotlin.jvm.internal.o;

/* renamed from: X.OxQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63584OxQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C63622Oy2 item, long j, boolean z) {
        String str;
        o.LJIIIZ(item, "item");
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("imsdk_network_request");
        c63323OtD.LIZ(Integer.valueOf(item.LJFF()), "imsdk_cmd");
        c63323OtD.LIZ(C63626Oy6.LIZ(item.LJFF()), "url_path");
        c63323OtD.LIZ(1, "imsdk_result");
        c63323OtD.LIZ(Long.valueOf(item.LJLIL), "seq_id");
        c63323OtD.LIZ(Long.valueOf(j), "duration");
        if (z) {
            str = "ws";
        } else {
            str = "http";
        }
        c63323OtD.LIZ(str, "net_type");
        c63323OtD.LIZ(item.LJLJJLL.retry_count, "retry_times");
        try {
            Response response = item.LJLJL;
            if (response != null) {
                c63323OtD.LIZ(response.log_id, "log_id");
                c63323OtD.LIZ(item.LJLJL.status_code, "status");
            }
        } catch (Exception e) {
            C63337OtR.LJFF(e);
        }
        c63323OtD.LIZLLL();
    }
}
