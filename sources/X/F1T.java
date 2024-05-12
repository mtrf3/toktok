package X;

import android.view.View;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F1T {
    public static boolean LIZIZ(String str) {
        boolean z;
        Object obj;
        boolean z2;
        Boolean bool = (Boolean) ((LinkedHashMap) C37789EsL.LIZIZ).get(str);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Iterator it = ((LinkedHashMap) F1U.LIZ).entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (o.LJ(str, entry.getValue())) {
                    obj = entry.getKey();
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Boolean bool2 = (Boolean) ((LinkedHashMap) C37789EsL.LIZIZ).get(obj);
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(InterfaceC60761Nsz interfaceC60761Nsz, boolean z, boolean z2) {
        C60737Nsb c60737Nsb;
        boolean z3;
        View LIZJ;
        ViewParent parent;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handle block back press by spark:");
        LIZ.append(z);
        LIZ.append(", by bullet:");
        LIZ.append(z2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (interfaceC60761Nsz != null) {
            c60737Nsb = interfaceC60761Nsz.getHybridContext();
        } else {
            c60737Nsb = null;
        }
        if (!(c60737Nsb instanceof SparkContext)) {
            c60737Nsb = null;
        }
        C37682Eqc.LIZIZ((SparkContext) c60737Nsb, "SparkActivity", LIZIZ);
        if (z && interfaceC60761Nsz != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerID", interfaceC60761Nsz.getHybridContext().containerId);
            interfaceC60761Nsz.LJIIJ("sparkOnBackPressAction", C47261Igj.LJJIJ(jSONObject));
        }
        if (z2 && interfaceC60761Nsz != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerID", interfaceC60761Nsz.getHybridContext().containerId);
            interfaceC60761Nsz.LJIIJ("bulletOnBackPressAction", C47261Igj.LJJIJ(jSONObject2));
        }
        if (interfaceC60761Nsz != null && (LIZJ = interfaceC60761Nsz.LIZJ()) != null && (parent = LIZJ.getParent()) != null && (parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
            z3 = ((SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) parent).LIZLLL();
        } else {
            z3 = false;
        }
        if (!z && (!z2 || !z3)) {
            return false;
        }
        return true;
    }
}
