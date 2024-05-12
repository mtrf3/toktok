package X;

import android.os.SystemClock;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Oqy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63184Oqy implements InterfaceC63352Otg<List<C109544Rq>> {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ C63120Opw LJLILLLLZI;
    public final /* synthetic */ C63220OrY LJLJI;

    @Override // X.InterfaceC63352Otg
    public final List<C109544Rq> LIZIZ() {
        C109544Rq c109544Rq;
        C63322OtC.LJFF("MessageModel loadOlderMessageList onRun");
        C63220OrY c63220OrY = this.LJLJI;
        List<C109544Rq> list = null;
        if (c63220OrY.LJLILLLLZI.isEmpty()) {
            c109544Rq = null;
        } else {
            c109544Rq = c63220OrY.LJLILLLLZI.get(r1.size() - 1);
        }
        if (c109544Rq != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            String str = this.LJLJI.LJLIL;
            long index = c109544Rq.getIndex();
            C115944go LIZJ = C115944go.LIZJ();
            String str2 = this.LJLJI.LJLIL;
            C63220OrY.LJI(this.LJLIL);
            LIZJ.getClass();
            C115944go.LIZIZ(str2);
            list = C63150OqQ.LJJIFFI(str, index, this.LJLJI.LJLJI, null);
            C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
            int inboxType = this.LJLILLLLZI.getInboxType();
            EnumC63359Otn enumC63359Otn = EnumC63359Otn.MSG_SHOW;
            LJIIIZ.getClass();
            C63356Otk.LIZLLL(list, inboxType, enumC63359Otn);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                C63337OtR.LIZLLL("im_load_more_msg_duration", jSONObject);
            } catch (Exception unused) {
            }
        }
        return list;
    }

    public C63184Oqy(C63220OrY c63220OrY, List list, C63120Opw c63120Opw) {
        this.LJLJI = c63220OrY;
        this.LJLIL = list;
        this.LJLILLLLZI = c63120Opw;
    }
}
