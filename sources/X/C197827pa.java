package X;

import android.app.Dialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS27S0210000_3;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC55642Lsc("now_trial_start")
/* renamed from: X.7pa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197827pa extends AbstractC56325M8r<Dialog> {
    public final String LJLIL;
    public final InterfaceC194077jX LJLILLLLZI;
    public final int LJLJI = 2501;

    @Override // X.InterfaceC55641Lsb
    public final /* bridge */ /* synthetic */ C54082LKk getPopupContext() {
        return null;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ == null) {
            return null;
        }
        boolean LJJ = C78946Uyc.LJJ();
        C7MK.LJII("now_button_action", new AqS46S0110000_3(this, LJJ, 13));
        C26227ARb LIZ = C3AW.LIZ(LIZJ);
        LIZ.LJ(R.string.t4c);
        LIZ.LIZIZ(LIZJ.getResources().getQuantityString(R.plurals.u_, this.LJLILLLLZI.LIZ(), Integer.valueOf(this.LJLILLLLZI.LIZ())));
        UC0.LIZJ(LIZ, new AqS27S0210000_3(LIZJ, this, LJJ, 7));
        return LIZ.LJI().LJ();
    }

    public C197827pa(String str, InterfaceC194077jX interfaceC194077jX) {
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC194077jX;
    }

    public static final void LJIIIIZZ(JSONObject jSONObject, C197827pa c197827pa, boolean z, String str) {
        int i;
        jSONObject.put("action_type", str);
        jSONObject.put("page", c197827pa.LJLIL);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        jSONObject.put("is_to_ttn", i);
        jSONObject.put("button_type", "pop_up");
    }
}
