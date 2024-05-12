package X;

import com.lynx.react.bridge.ReadableMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EWz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36573EWz implements InterfaceC37673EqT {
    public final /* synthetic */ EX0 LIZ;

    public C36573EWz(C37029Eg5 c37029Eg5) {
        this.LIZ = c37029Eg5;
    }

    @Override // X.InterfaceC37673EqT
    public final void LIZ(Object parcel) {
        Object LIZ;
        java.util.Map<String, ? extends Object> result;
        o.LJIIJ(parcel, "parcel");
        try {
            if (parcel instanceof JSONObject) {
                result = C38381F4n.LJIIIIZZ((JSONObject) parcel);
            } else if (parcel instanceof ReadableMap) {
                result = ((ReadableMap) parcel).toHashMap();
            } else {
                result = C113554cx.LJJJLIIL();
            }
            EX0 ex0 = this.LIZ;
            o.LJFF(result, "result");
            ex0.LIZ(result);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            EX0 ex02 = this.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("code", 0);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("call bridge failed, error = ");
            LIZ2.append(m10exceptionOrNullimpl.getMessage());
            linkedHashMap.put("msg", X1D.LIZIZ(LIZ2));
            ex02.LIZ(linkedHashMap);
        }
    }
}
