package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* renamed from: X.N0c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58650N0c implements InterfaceC58602MzG<java.util.Map<String, ? extends Object>, String> {
    public final InterfaceC58602MzG<?, ?>[] LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC58602MzG
    public final InterfaceC88472Yns<M95, java.util.Map<String, ? extends Object>> LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC58602MzG
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC58602MzG
    public final String getName() {
        return this.LIZIZ;
    }

    public C58650N0c(InterfaceC58602MzG<?, ?>... params) {
        o.LJIIIZ(params, "params");
        this.LIZ = params;
        this.LIZIZ = "ad_extra_data";
    }

    @Override // X.InterfaceC58602MzG
    public final String LIZ(java.util.Map<String, ? extends Object> before) {
        Gson LIZ;
        o.LJIIIZ(before, "before");
        InterfaceC58651N0d interfaceC58651N0d = (InterfaceC58651N0d) C59835Ne3.LJIIJ.LIZ();
        if (interfaceC58651N0d == null || (LIZ = interfaceC58651N0d.LIZ()) == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        String json = GsonProtectorUtils.toJson(LIZ, before);
        o.LJIIIIZZ(json, "requireNotNull(BaseRunti…getGson()).toJson(before)");
        return json;
    }
}
