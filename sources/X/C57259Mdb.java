package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Mdb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57259Mdb extends AbstractC65781Prl implements InterfaceC88473Ynt<JSONObject, String, String, C76800UCe> {
    public static final C57259Mdb LJLIL = new C57259Mdb();

    public C57259Mdb() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(JSONObject jSONObject, String str, String str2) {
        JSONObject appendParamIntoAwemeByEventName = jSONObject;
        String key = str;
        o.LJIIIZ(appendParamIntoAwemeByEventName, "$this$appendParamIntoAwemeByEventName");
        o.LJIIIZ(key, "key");
        appendParamIntoAwemeByEventName.put(key, str2);
        return C76800UCe.LIZ;
    }
}
