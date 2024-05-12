package X;

import android.view.KeyEvent;
import org.json.JSONObject;

/* renamed from: X.1bH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C36071bH implements InterfaceC39006FSo {
    public void LJIIJ(int i, String str) {
        throw null;
    }

    public int LJIIJJI(int i, String str) {
        return 0;
    }

    public void LJIIL(int i) {
    }

    public void LJIILIIL(int i, String str) {
    }

    public void LJIILJJIL(C47789IpF c47789IpF, String str) {
        throw null;
    }

    public void LJIILL(int i, int i2) {
        throw null;
    }

    public void LJIILLIIL(int i, String str) {
    }

    @Override // X.InterfaceC39006FSo
    public final boolean LIZ() {
        if (!C64235PIx.LIZ("task_wait_timeout")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC39006FSo
    public final boolean LIZIZ() {
        if (!C64235PIx.LIZ("task_execute_timeout")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC39006FSo
    public final boolean LIZJ() {
        if (!C64235PIx.LIZ("task_rejected")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC39006FSo
    public final boolean LJFF() {
        if (!C64235PIx.LIZ("task_blocked")) {
            return false;
        }
        return true;
    }

    public static final long LJIIIIZZ(KeyEvent keyEvent) {
        return C38891fp.LIZLLL(keyEvent.getKeyCode());
    }

    public static final int LJIIIZ(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    @Override // X.InterfaceC39006FSo
    public final void LIZLLL(JSONObject jSONObject) {
        FUA.LIZJ("task_wait_timeout", jSONObject);
    }

    @Override // X.InterfaceC39006FSo
    public final void LJ(JSONObject jSONObject) {
        FUA.LIZJ("task_blocked", jSONObject);
    }

    @Override // X.InterfaceC39006FSo
    public final void LJI(JSONObject jSONObject) {
        FUA.LIZJ("task_execute_timeout", jSONObject);
    }

    @Override // X.InterfaceC39006FSo
    public final void LJII(JSONObject jSONObject) {
        FUA.LIZJ("task_rejected", jSONObject);
    }
}
