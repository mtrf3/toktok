package X;

import android.widget.CompoundButton;
import android.widget.TextView;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WlV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83229WlV implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C83230WlW LJLIL;

    public C83229WlV(C83230WlW c83230WlW) {
        this.LJLIL = c83230WlW;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AqS196S0100000_14 aqS196S0100000_14;
        if (z) {
            TextView switchText = (TextView) this.LJLIL.LJLILLLLZI.getValue();
            o.LJIIIIZZ(switchText, "switchText");
            switchText.setText((String) this.LJLIL.LJLJJLL.getValue());
        } else {
            TextView switchText2 = (TextView) this.LJLIL.LJLILLLLZI.getValue();
            o.LJIIIIZZ(switchText2, "switchText");
            switchText2.setText((String) this.LJLIL.LJLJL.getValue());
        }
        C83230WlW c83230WlW = this.LJLIL;
        if (c83230WlW.LJLJLJ.LJLJLJ && (aqS196S0100000_14 = c83230WlW.LJLJJI) != null) {
            C83271WmB c83271WmB = c83230WlW.LJLJJL;
            if (c83271WmB != null) {
                aqS196S0100000_14.invoke(c83271WmB.LIZIZ, Boolean.valueOf(z));
            } else {
                o.LJIJI("beautyListSwitch");
                throw null;
            }
        }
    }
}
