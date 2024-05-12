package X;

import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nqi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60620Nqi {
    public static void LIZ(InterfaceC60761Nsz interfaceC60761Nsz, String eventName, List<? extends Object> list) {
        o.LJIIJ(eventName, "eventName");
        InterfaceC88473Ynt<? super InterfaceC60761Nsz, ? super String, Object, C76800UCe> interfaceC88473Ynt = interfaceC60761Nsz.getHybridContext().sendEventListener;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(interfaceC60761Nsz, eventName, list);
        }
    }

    public static void LIZIZ(InterfaceC60761Nsz interfaceC60761Nsz, String eventName, JSONObject jSONObject) {
        o.LJIIJ(eventName, "eventName");
        InterfaceC88473Ynt<? super InterfaceC60761Nsz, ? super String, Object, C76800UCe> interfaceC88473Ynt = interfaceC60761Nsz.getHybridContext().sendEventListener;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(interfaceC60761Nsz, eventName, jSONObject);
        }
    }

    public static void LIZJ(InterfaceC60761Nsz interfaceC60761Nsz, String eventName, java.util.Map<String, ? extends Object> map) {
        o.LJIIJ(eventName, "eventName");
        InterfaceC88473Ynt<? super InterfaceC60761Nsz, ? super String, Object, C76800UCe> interfaceC88473Ynt = interfaceC60761Nsz.getHybridContext().sendEventListener;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(interfaceC60761Nsz, eventName, map);
        }
    }
}
