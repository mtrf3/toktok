package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UBv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76791UBv extends AbstractC65781Prl implements InterfaceC88471Ynr<String, Long, C76800UCe> {
    public final /* synthetic */ C76788UBs LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76791UBv(C76788UBs c76788UBs, String str, JSONObject jSONObject, long j) {
        super(2);
        this.LJLIL = c76788UBs;
        this.LJLILLLLZI = str;
        this.LJLJI = jSONObject;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, Long l) {
        String value = str;
        l.longValue();
        o.LJIIIZ(value, "value");
        if (value.length() > 0 && !o.LJ(value, "{}")) {
            C0K1 c0k1 = this.LJLIL.LJI;
            String str2 = this.LJLILLLLZI;
            String jSONObject = this.LJLJI.toString();
            o.LJIIIIZZ(jSONObject, "jsonValue.toString()");
            C0K0.LIZ(c0k1, str2, jSONObject, false, this.LJLJJI, false, 44);
        }
        return C76800UCe.LIZ;
    }
}
