package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UBu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76790UBu extends AbstractC65781Prl implements InterfaceC88471Ynr<String, Long, C76800UCe> {
    public final /* synthetic */ C76788UBs LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76790UBu(C76788UBs c76788UBs, String str, JSONObject jSONObject, int i, long j) {
        super(2);
        this.LJLIL = c76788UBs;
        this.LJLILLLLZI = str;
        this.LJLJI = jSONObject;
        this.LJLJJI = i;
        this.LJLJJL = j;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, Long l) {
        String value = str;
        long longValue = l.longValue();
        o.LJIIIZ(value, "value");
        if ((!ujb.o.LJJJJJL(value)) && !o.LJ(value, "{}")) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = this.LJLJI;
            int i = this.LJLJJI;
            long j = this.LJLJJL;
            C76788UBs c76788UBs = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            if (jSONObject2 != null) {
                C05630Jz.LIZJ("extra", jSONObject, jSONObject2);
            }
            C05630Jz.LIZ(i, "result", jSONObject);
            C05630Jz.LJFF(jSONObject, "duration", j - longValue);
            C0K1 c0k1 = c76788UBs.LJI;
            String jSONObject3 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject3, "this.toString()");
            C0K0.LIZ(c0k1, str2, jSONObject3, true, 0L, false, 56);
            this.LJLIL.LJI.LIZJ(this.LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }
}
