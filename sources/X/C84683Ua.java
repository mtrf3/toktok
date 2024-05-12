package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.3Ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84683Ua implements C3VM {
    public static final C84683Ua LJFF = new C84683Ua(0);
    public final C3UZ LIZ;
    public final InterfaceC75532xp LIZIZ;
    public final InterfaceC65784Pro<InterfaceC84703Uc> LIZJ;
    public final C64962gm LIZLLL;
    public final ConcurrentHashMap<String, InterfaceC84703Uc> LJ;

    public C84683Ua(int i) {
        C84693Ub c84693Ub = new C3UZ() { // from class: X.3Ub
            @Override // X.C3UZ
            public final void LIZ(String name, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                o.LJIIIZ(name, "name");
                C09900aA.LJI(name, jSONObject, jSONObject2, jSONObject3);
            }
        };
        C85323Wm reportDurationTea = C772831o.LIZ();
        C87403bs stopwatchFactory = C87403bs.LJLIL;
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(reportDurationTea, "reportDurationTea");
        o.LJIIIZ(stopwatchFactory, "stopwatchFactory");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LIZ = c84693Ub;
        this.LIZIZ = reportDurationTea;
        this.LIZJ = stopwatchFactory;
        this.LIZLLL = C48841JEv.LIZ(ioDispatcher.plus(T2R.LJIIJJI()));
        this.LJ = new ConcurrentHashMap<>();
    }

    public static JSONObject LIZJ(java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    @Override // X.C3VM
    public final void LIZ(C3UX key, C3UY body) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(body, "body");
        String c3ux = key.toString();
        InterfaceC84703Uc remove = this.LJ.remove(c3ux);
        if (remove == null || !remove.isRunning()) {
            return;
        }
        remove.stop();
        XKX.LIZLLL(this.LIZLLL, null, null, new C3UW(key, this, body, remove.LIZ(), c3ux, null), 3);
    }

    @Override // X.C3VM
    public final boolean LIZIZ(C3UX key, boolean z) {
        InterfaceC84703Uc interfaceC84703Uc;
        o.LJIIIZ(key, "key");
        String c3ux = key.toString();
        if (this.LJ.get(c3ux) != null && (interfaceC84703Uc = this.LJ.get(c3ux)) != null && interfaceC84703Uc.isRunning()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopwatch ");
            LIZ.append(c3ux);
            LIZ.append(" has already started.");
            C34B.LJIIIIZZ("DurationPerfMonImpl", X1D.LIZIZ(LIZ));
            if (!z) {
                return false;
            }
        }
        this.LJ.put(c3ux, this.LIZJ.invoke());
        return true;
    }
}
