package X;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import kotlin.jvm.internal.AqS69S1100000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.4f1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114834f1 implements InterfaceC114794ex {
    public static final C114834f1 LIZ = new C114834f1();

    @Override // X.InterfaceC114794ex
    public final void LJ() {
    }

    @Override // X.InterfaceC114794ex
    public final void LIZIZ(Throwable t) {
        o.LJIIIZ(t, "t");
        C34B.LJ("iesimcore", t);
    }

    @Override // X.InterfaceC114794ex
    public final void LJI(java.util.Map map) {
        new AqS69S1100000_1(map, 8).invoke();
    }

    @Override // X.InterfaceC114794ex
    public final void LJIIIIZZ(JSONObject jSONObject) {
        C09900aA.LJ("im_event", jSONObject);
    }

    public final void LJIILIIL(String extra) {
        o.LJIIIZ(extra, "extra");
        if (C85773Yf.LJLJI == null || extra.length() == 0) {
            return;
        }
        RuntimeBehaviorServiceImpl.LJ().event("message_send_fail", extra);
    }

    public static final void LJIIJ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        if (o.LJ(str, "imsdk")) {
            C34B.LIZIZ(str, msg);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(": ");
        LIZ2.append(msg);
        C34B.LIZIZ("iesimcore", X1D.LIZIZ(LIZ2));
    }

    public static final void LJIIJJI(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        if (o.LJ(str, "imsdk")) {
            C34B.LIZJ(str, msg);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(": ");
        LIZ2.append(msg);
        C34B.LIZJ("iesimcore", X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC114794ex
    public final void LIZ(String str, JSONObject jSONObject) {
        C09900aA.LJFF(str, jSONObject, null);
    }

    @Override // X.InterfaceC114794ex
    public final void LIZJ(String str, Throwable th) {
        if (th != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("imsdk: ");
            LIZ2.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ2));
        }
    }

    @Override // X.InterfaceC114794ex
    public final void LJFF(String event, JSONObject jSONObject) {
        o.LJIIIZ(event, "event");
        new AqS69S1100000_1(event, jSONObject, 9).invoke();
    }

    @Override // X.InterfaceC114794ex
    public final void LJII(String event, JSONObject jSONObject) {
        o.LJIIIZ(event, "event");
        LJFF(event, jSONObject);
    }

    @Override // X.InterfaceC114794ex
    public final void LJIIIZ(JSONObject jSONObject, String event) {
        o.LJIIIZ(event, "event");
        LJFF(event, jSONObject);
    }

    public final void LJIIL(String str, Throwable th) {
        if (o.LJ("SDKManager", "imsdk")) {
            C34B.LIZLLL("SDKManager", str, th);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SDKManager");
        LIZ2.append(": ");
        LIZ2.append(str);
        C34B.LIZLLL("iesimcore", X1D.LIZIZ(LIZ2), th);
    }

    @Override // X.InterfaceC114794ex
    public final void i(String str, String str2) {
        if (SC5.LIZIZ(str, "tag", str2, "msg", str, "imsdk")) {
            C34B.LJI(str, str2);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(": ");
        LIZ2.append(str2);
        C34B.LJI("iesimcore", X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC114794ex
    public final void LIZLLL(String str, String str2, java.util.Map<String, ? extends Object> map) {
        C36L.LIZLLL(str, str2, "im_event", map);
    }
}
