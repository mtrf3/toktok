package X;

import com.ss.android.ugc.aweme.shortcut.TiktokShortcutManager;
import org.json.JSONObject;

/* renamed from: X.FtD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40391FtD implements InterfaceC38012Evw {
    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        Long l;
        long j;
        JSONObject jSONObject2;
        if (c38048EwW != null && (jSONObject2 = c38048EwW.LIZLLL) != null) {
            l = Long.valueOf(jSONObject2.optLong("withdrawal_amount"));
        } else {
            l = null;
        }
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        C40394FtG.LIZ.storeLong("key_withdrawal_num", j);
        TiktokShortcutManager.LJIIJ().LJIIIIZZ("FissionWithdrawalMethod", true);
    }
}
