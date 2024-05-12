package X;

import android.app.Activity;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FCG {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(FCG.class), "kitViewProviders", "getKitViewProviders()[Lcom/bytedance/hybrid/common/IKitViewProvider;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
    }

    public final synchronized void LIZJ() {
        FD1.LIZIZ.LIZ();
    }

    public final synchronized void LIZLLL() {
        C38600FCy.LIZJ.LIZ();
    }

    public static Activity LIZIZ() {
        WeakReference<Activity> weakReference = FCF.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void LIZ(String str, JSONObject jSONObject) {
        C31999Ch9.LIZJ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C31999Ch9.LIZ);
        linkedHashMap.putAll(C31999Ch9.LIZIZ);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC60761Nsz interfaceC60761Nsz = (InterfaceC60761Nsz) ((Reference) ((Map.Entry) it.next()).getValue()).get();
            if (interfaceC60761Nsz != null) {
                interfaceC60761Nsz.LJIIIZ(str, jSONObject);
            }
        }
    }
}
