package X;

import com.bytedance.bpea.basics.Cert;

/* renamed from: X.Wrv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83627Wrv extends AbstractC83637Ws5 {
    public final String LIZIZ = "type_ui_operation";
    public final C83626Wru LIZJ;

    public final void LIZJ() {
        LIZIZ(this, "action_name_init_audio_capture", null, new C83693Wsz());
    }

    @Override // X.InterfaceC83706WtC
    public final String getType() {
        return this.LIZIZ;
    }

    public C83627Wrv(C83626Wru c83626Wru) {
        this.LIZJ = c83626Wru;
    }

    public final void LIZLLL(C78862UxG c78862UxG) {
        LIZIZ(this, "action_name_release_audio_capture", c78862UxG, null);
    }

    public final void LJ(Cert cert) {
        LIZIZ(this, "action_name_start_preview", cert, new C83678Wsk(false, 2));
    }

    public final void LJFF(Cert cert) {
        LIZIZ(this, "action_name_stop_audio_capture", cert, null);
    }

    public final void LJII(int i, Cert cert) {
        if (i == 1) {
            LIZIZ(this, "action_name_switch_shake_free_mode", cert, new VJ5(true));
        } else {
            if (i != 0) {
                return;
            }
            LIZIZ(this, "action_name_switch_shake_free_mode", cert, new VJ5(false));
        }
    }

    public final void LJI(C82085WJl c82085WJl, Cert cert, String str) {
        LIZIZ(this, "action_name_switch_camera", cert, new C83685Wsr(c82085WJl, str));
    }

    public static void LIZIZ(C83627Wrv c83627Wrv, String str, Cert cert, F9E f9e) {
        c83627Wrv.getClass();
        c83627Wrv.LIZ(new C83644WsC(c83627Wrv.LIZIZ, new C83677Wsj(0, 0), new NDG(c83627Wrv.LIZJ.LIZ(f9e, str), cert)));
    }
}
