package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71162qm extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, String> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71162qm(long j, int i, java.util.Map map) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = map;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        JSONObject jSONObject = new JSONObject();
        int i = this.LJLIL;
        long j = this.LJLILLLLZI;
        java.util.Map<String, String> map = this.LJLJI;
        HashMap hashMap = new HashMap();
        hashMap.put("ec_message_cnt", Integer.valueOf(i));
        hashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        FMX.LJIILJJIL("tiktokec_enter_page", jSONObject);
        return C76800UCe.LIZ;
    }
}
