package X;

import com.bytedance.ies.actionai.jni.ExecutionContext;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Woe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83424Woe extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C83429Woj<String> LJLIL;
    public final /* synthetic */ AbstractC83417WoX LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ ExecutionContext LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83424Woe(C83429Woj<String> c83429Woj, AbstractC83417WoX abstractC83417WoX, long j, ExecutionContext executionContext) {
        super(0);
        this.LJLIL = c83429Woj;
        this.LJLILLLLZI = abstractC83417WoX;
        this.LJLJI = j;
        this.LJLJJI = executionContext;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        long j;
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        List<C83430Wok> list = this.LJLIL.LJI;
        if (list != null) {
            Iterator it = ORZ.LLIZLLLIL(list).iterator();
            while (it.hasNext()) {
                C83430Wok c83430Wok = (C83430Wok) it.next();
                jSONArray.put(c83430Wok.LIZIZ);
                jSONArray2.put(c83430Wok.LIZ);
                jSONArray3.put(c83430Wok.LIZJ);
            }
        }
        String LIZ = this.LJLILLLLZI.LIZ();
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJI;
        ExecutionContext executionContext = this.LJLJJI;
        if (executionContext != null) {
            str = executionContext.getConversationId();
        } else {
            str = null;
        }
        C45265Hpd c45265Hpd = this.LJLIL.LJII;
        if (c45265Hpd != null) {
            j = c45265Hpd.LIZ;
        } else {
            j = 0;
        }
        C43003GuF.LIZ(0, CardStruct.IStatusCode.DEFAULT, null, LIZ, currentTimeMillis, str, jSONArray, jSONArray2, jSONArray3, j);
        return C76800UCe.LIZ;
    }
}
