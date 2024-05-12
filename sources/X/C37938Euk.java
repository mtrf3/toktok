package X;

import android.content.Context;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Euk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37938Euk implements InterfaceC37862EtW, InterfaceC60617Nqf {
    public final C37943Eup LJLIL = new C37943Eup();
    public final HashMap<String, C37943Eup> LJLILLLLZI = new HashMap<>();
    public WeakReference<InterfaceC60761Nsz> LJLJI;

    public static String LIZJ(Object obj) {
        JSONObject jSONObject;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else if (obj instanceof ReadableMap) {
            ReadableMap map = ((ReadableMap) obj).getMap("data");
            if (map != null) {
                if (map instanceof JavaOnlyMap) {
                    C38010Evu.LIZ.getClass();
                    jSONObject = C38010Evu.LJ((JavaOnlyMap) map);
                } else {
                    jSONObject = new JSONObject();
                }
            } else {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        o.LJFF(jSONObject2, "str.toString()");
        return jSONObject2;
    }

    @Override // X.InterfaceC60617Nqf
    public final void LJIJ(Context context) {
        o.LJIIJ(context, "context");
        this.LJLIL.LJIJ(context);
        if (!this.LJLILLLLZI.isEmpty()) {
            Iterator<Map.Entry<String, C37943Eup>> it = this.LJLILLLLZI.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().LJIJ(context);
            }
        }
    }

    @Override // X.InterfaceC37862EtW
    public final void LIZIZ(C37955Ev1 call, C37863EtX c37863EtX) {
        C37943Eup c37943Eup;
        o.LJIIJ(call, "call");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("realDispatchBridgeMethod: ");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        C37887Etv.LIZ("MagpieLegacyBridgeSupport", X1D.LIZIZ(LIZ));
        if ((call.LJIIIIZZ.length() <= 0 || (c37943Eup = this.LJLILLLLZI.get(call.LJIIIIZZ)) == null || !c37943Eup.LIZIZ(call, LIZJ(call.LJI), c37863EtX)) && !this.LJLIL.LIZIZ(call, LIZJ(call.LJI), c37863EtX)) {
            c37863EtX.LIZIZ(EnumC37868Etc.NOT_FOUND);
        }
    }
}
