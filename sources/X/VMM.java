package X;

import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class VMM {
    public static final /* synthetic */ InterfaceC74236TBo[] LJIIJJI;
    public final C62822Ol8 LIZ;
    public String LIZIZ;
    public final C65357Pkv LIZJ;
    public final java.util.Map<String, Object> LIZLLL;
    public VMG LJ;
    public JSONObject LJFF;
    public C35894E6w LJI;
    public EnumC40073Fo5 LJII;
    public java.util.Map<String, Object> LJIIIIZZ;
    public final C66026Pvi LJIIIZ;
    public String LJIIJ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(VMM.class), "eventId", "getEventId()Ljava/util/UUID;");
        C65352Pkq.LIZ.getClass();
        LJIIJJI = new InterfaceC74236TBo[]{tbt};
    }

    public final UUID LIZ() {
        return (UUID) this.LIZ.getValue();
    }

    public final void LIZIZ() {
        if (!VMS.eventStream.isEnabled()) {
            return;
        }
        C38045EwT.LIZ(new AqS164S0100000_14(this, 260));
    }

    public final void LIZJ() {
        if (!VMS.eventStream.isEnabled()) {
            return;
        }
        C38045EwT.LIZ(new AqS164S0100000_14((VM4) this, 262));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HybridEvent(eventType='");
        LIZ.append(this.LJIIJ);
        LIZ.append("', eventId=");
        LIZ.append(LIZ());
        LIZ.append(", state=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public VMM(String eventType) {
        o.LJIIJ(eventType, "eventType");
        this.LJIIJ = eventType;
        this.LIZ = C221108m2.LIZIZ(VM6.LJLIL);
        this.LIZJ = new C65357Pkv();
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new VMG();
        this.LJII = EnumC40073Fo5.Slardar;
        this.LJIIIZ = new C66026Pvi();
    }

    public final void LJ(VMG vmg) {
        o.LJIIJ(vmg, "<set-?>");
        this.LJ = vmg;
    }

    public final void onEventTerminated(EnumC65355Pkt msg) {
        o.LJIIJ(msg, "msg");
        this.LIZJ.LIZIZ = msg;
        if (!VMS.eventStream.isEnabled()) {
            return;
        }
        C38045EwT.LIZ(new AqS164S0100000_14(this, 261));
    }

    public final void LIZLLL(Object obj, String str) {
        Object LIZ;
        java.util.Map<String, Object> map;
        try {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new LinkedHashMap();
            }
            map = this.LJIIIIZZ;
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (map != null) {
            map.put(str, obj);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C77117UOj.LJIIZILJ(m10exceptionOrNullimpl);
                return;
            }
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    public final void LJFF(boolean z, EnumC65355Pkt reason) {
        o.LJIIJ(reason, "reason");
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Event terminated, type = ");
            LIZ.append(reason.name());
            X1D.LIZIZ(LIZ);
            onEventTerminated(reason);
        }
    }
}
