package X;

import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Pln, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65411Pln extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final C65411Pln LJLIL = new C65411Pln();

    public C65411Pln() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        e eVar = new e();
        eVar.LIZIZ(GsonUtils.JSONObjectAdapter.LIZ, JSONObject.class);
        eVar.LIZIZ(GsonUtils.JSONArrayAdapter.LIZ, JSONArray.class);
        eVar.LIZ = eVar.LIZ.LJ(C65410Plm.LIZ, true, true);
        eVar.LJI = true;
        return eVar.LIZ();
    }
}
