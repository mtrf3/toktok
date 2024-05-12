package X;

import com.lynx.react.bridge.ReadableMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EX1 implements InterfaceC37673EqT {
    public final /* synthetic */ EX0 LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC37673EqT
    public final void LIZ(Object parcel) {
        Object LIZ;
        java.util.Map<String, ? extends Object> result;
        o.LJIIIZ(parcel, "parcel");
        EX0 ex0 = this.LIZ;
        try {
            if (parcel instanceof JSONObject) {
                result = C38381F4n.LJIIIIZZ((JSONObject) parcel);
            } else if (parcel instanceof ReadableMap) {
                result = ((ReadableMap) parcel).toHashMap();
            } else {
                result = C113554cx.LJJJLIIL();
            }
            o.LJIIIIZZ(result, "result");
            ex0.LIZ(result);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        String str = this.LIZIZ;
        EX0 ex02 = this.LIZ;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C15280iq.LIZJ(str, V0N.LJJIJL(m10exceptionOrNullimpl));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("code", 0);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("call bridge failed, error = ");
            LIZ2.append(m10exceptionOrNullimpl.getMessage());
            linkedHashMap.put("msg", X1D.LIZIZ(LIZ2));
            ex02.LIZ(linkedHashMap);
        }
    }

    public EX1(C37865EtZ c37865EtZ, String str) {
        this.LIZ = c37865EtZ;
        this.LIZIZ = str;
    }
}
