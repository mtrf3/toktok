package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PwG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC66060PwG extends Handler {
    public HandlerC66060PwG(Looper looper) {
        super(looper);
    }

    public static void LIZ(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof InterfaceC66068PwO)) {
            obj = null;
        }
        InterfaceC66068PwO interfaceC66068PwO = (InterfaceC66068PwO) obj;
        if (interfaceC66068PwO != null) {
            if (interfaceC66068PwO instanceof C66120PxE) {
                C66120PxE c66120PxE = (C66120PxE) interfaceC66068PwO;
                C66037Pvt.LIZIZ.LIZ(5, c66120PxE);
                o.LJIIIIZZ(C66036Pvs.LIZIZ(), "HeliosEnv.get()");
                if (!o.LJ(r1.LIZLLL(), "decision_engine")) {
                    LIZIZ(c66120PxE);
                    return;
                }
                return;
            }
            java.util.Set set = (java.util.Set) ((HashMap) C66059PwF.LIZ).get(interfaceC66068PwO.getTag());
            if (set == null) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((InterfaceC66066PwM) it.next()).LIZIZ(interfaceC66068PwO);
            }
        }
    }

    public static void LIZIZ(C66120PxE event) {
        AbstractC66064PwK abstractC66064PwK;
        List<IIO> jsbEvents;
        o.LJIIIZ(event, "event");
        C66037Pvt.LIZIZ.LIZ(4, event);
        if (event.LLIIIILZ == null && (abstractC66064PwK = C66059PwF.LIZLLL) != null && (jsbEvents = abstractC66064PwK.getJsbEvents()) != null && (!jsbEvents.isEmpty())) {
            event.LLIIIJ = jsbEvents;
            event.LLIIIILZ = "jsb";
        }
        java.util.Set set = (java.util.Set) ((HashMap) C66059PwF.LIZ).get("PrivacyEvent");
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((InterfaceC66066PwM) it.next()).LIZIZ(event);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        InterfaceC66066PwM interfaceC66066PwM;
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        try {
            LIZ(msg);
        } catch (Throwable th) {
            if (msg.obj != null) {
                if ((!o.LJ(((InterfaceC66068PwO) r0).getTag(), "ExceptionEvent")) && (interfaceC66066PwM = C66059PwF.LIZJ) != null) {
                    interfaceC66066PwM.LIZIZ(new C65852Psu(C16880lQ.LLLLIIIILLL(), th, "Reporter", (java.util.Map) null, 24));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.helios.api.consumer.Event");
        }
    }
}
