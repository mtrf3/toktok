package X;

import com.bytedance.pia.core.plugins.BridgeDowngradePlugin;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ep2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37584Ep2<T> implements BQ6<C37587Ep5> {
    public final /* synthetic */ BridgeDowngradePlugin LIZ;
    public final /* synthetic */ Object[] LIZIZ;

    public C37584Ep2(BridgeDowngradePlugin bridgeDowngradePlugin, Object[] objArr) {
        this.LIZ = bridgeDowngradePlugin;
        this.LIZIZ = objArr;
    }

    @Override // X.BQ6
    public final void accept(C37587Ep5 c37587Ep5) {
        C37587Ep5 c37587Ep52 = c37587Ep5;
        Object obj = this.LIZIZ[0];
        JSONObject jSONObject = null;
        if (!(obj instanceof InterfaceC37589Ep7)) {
            obj = null;
        }
        InterfaceC37589Ep7 interfaceC37589Ep7 = (InterfaceC37589Ep7) obj;
        if (interfaceC37589Ep7 == null) {
            Callback callback = c37587Ep52.LIZJ;
            if (callback != null) {
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.put("code", -2);
                callback.invoke(javaOnlyMap);
                return;
            }
            return;
        }
        C37499Enf runtime = this.LIZ.LIZ;
        o.LJFF(runtime, "runtime");
        String uri = runtime.LJ.toString();
        String str = c37587Ep52.LIZ;
        ReadableMap readableMap = c37587Ep52.LIZIZ;
        if (!(readableMap instanceof JavaOnlyMap)) {
            readableMap = null;
        }
        JavaOnlyMap javaOnlyMap2 = (JavaOnlyMap) readableMap;
        if (javaOnlyMap2 != null) {
            jSONObject = javaOnlyMap2.toJSONObject();
        }
        interfaceC37589Ep7.LIZ(uri, str, jSONObject, new C37586Ep4(this, c37587Ep52));
    }
}
