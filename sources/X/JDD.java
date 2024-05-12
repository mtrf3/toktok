package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.AqS63S1200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JDD implements DialogInterface.OnDismissListener {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ java.util.Map<String, String> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public JDD(String str, java.util.Map map, AqS63S1200000_8 aqS63S1200000_8) {
        this.LJLIL = aqS63S1200000_8;
        this.LJLILLLLZI = map;
        this.LJLJI = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface it) {
        String str;
        o.LJIIIIZZ(it, "it");
        if (ASQ.LJIIIIZZ(it) instanceof JDH) {
            this.LJLIL.invoke();
        }
        if (ASQ.LJIIIIZZ(it) instanceof JDH) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJLILLLLZI);
        LJJLIL.put("enter_from", this.LJLJI);
        LJJLIL.put("status", str);
        C60903NvH.LJJIJIL("floating_window_system_authorization_propup_result", LJJLIL);
    }
}
