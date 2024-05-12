package X;

import org.json.JSONObject;

/* renamed from: X.Gkr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42421Gkr {
    public static final void LIZ(int i, Exception exc, boolean z) {
        JSONObject jSONObject = null;
        if (z) {
            C43882HKc.LIZLLL(0, "mv_resource_list_download_error_state", null, true);
            return;
        }
        if (exc != null) {
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("exception", J7I.LJII(exc));
            jSONObject = c6bk.LJ();
        }
        C43882HKc.LIZLLL(i, "mv_resource_list_download_error_state", jSONObject, true);
    }
}
