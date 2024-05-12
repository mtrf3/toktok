package X;

import com.lynx.react.bridge.ReadableMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EWy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36572EWy implements InterfaceC37673EqT {
    public final /* synthetic */ C37379Elj LIZ;

    @Override // X.InterfaceC37673EqT
    public final void LIZ(Object parcel) {
        Object LIZ;
        java.util.Map<String, ? extends Object> result;
        o.LJIIIZ(parcel, "parcel");
        C37379Elj c37379Elj = this.LIZ;
        try {
            if (parcel instanceof JSONObject) {
                result = C38381F4n.LJIIIIZZ((JSONObject) parcel);
            } else if (parcel instanceof ReadableMap) {
                result = ((ReadableMap) parcel).toHashMap();
            } else {
                result = C113554cx.LJJJLIIL();
            }
            o.LJIIIIZZ(result, "result");
            c37379Elj.LIZ(result);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C37379Elj c37379Elj2 = this.LIZ;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("code", 0);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("call bridge failed, error = ");
            LIZ2.append(m10exceptionOrNullimpl.getMessage());
            linkedHashMap.put("msg", X1D.LIZIZ(LIZ2));
            c37379Elj2.LIZ(linkedHashMap);
        }
    }

    public C36572EWy(C37379Elj c37379Elj, C37664EqK c37664EqK) {
        this.LIZ = c37379Elj;
    }
}
