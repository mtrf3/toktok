package X;

import com.bytedance.lynx.hybrid.prefetch.bridge.WorkerBridgeModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Eqv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37701Eqv extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ Callback LJLIL;
    public final /* synthetic */ ReadableMap LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37701Eqv(Callback callback, ReadableMap readableMap) {
        super(1);
        this.LJLIL = callback;
        this.LJLILLLLZI = readableMap;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject it = jSONObject;
        o.LJIIJ(it, "it");
        WorkerBridgeModule.Companion.getClass();
        JavaOnlyMap LIZIZ = C37699Eqt.LIZIZ(it);
        Callback callback = this.LJLIL;
        if (callback != null) {
            callback.invoke(LIZIZ);
        }
        return C76800UCe.LIZ;
    }
}
