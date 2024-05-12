package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OFQ implements InterfaceC66028Pvk {
    public static boolean LIZ;

    @Override // X.InterfaceC66028Pvk
    public void onEventUpdated(VMM event) {
        o.LJIIJ(event, "event");
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventCreated(VMM event) {
        o.LJIIJ(event, "event");
        LIZ(event, "event_create");
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventSampled(VMM event) {
        o.LJIIJ(event, "event");
        LIZ(event, "event_unsampled");
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventTerminated(VMM event) {
        o.LJIIJ(event, "event");
        LIZ(event, "event_terminated");
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventUploaded(VMM event) {
        o.LJIIJ(event, "event");
        LIZ(event, "event_uploaded");
    }

    public static void LIZ(VMM vmm, String str) {
        OFP ofp = OFP.SdkAudit;
        if (ofp.not()) {
            return;
        }
        try {
            if (ofp.getStrListOptions("event_allow_list", new ArrayList()).contains(vmm.LJIIJ)) {
                C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_sdk_trace");
                c79605VMb.LJIIIIZZ = vmm.LIZIZ;
                c79605VMb.LJIIJJI = EnumC40073Fo5.Tea;
                JSONObject jSONObject = new JSONObject();
                C40082FoE.LJIIIIZZ(jSONObject, "stage", str);
                C40082FoE.LJIIIIZZ(jSONObject, "event_type", vmm.LJIIJ);
                c79605VMb.LIZLLL = jSONObject;
                C79604VMa LIZ2 = c79605VMb.LIZ();
                OFH.LIZLLL.getClass();
                OFH.LIZLLL(LIZ2);
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }
}
