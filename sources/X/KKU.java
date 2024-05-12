package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KKU implements InterfaceC53896LDg {
    public final C8W0 LJLIL;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public KKU(C8W0 assem) {
        o.LJIIIZ(assem, "assem");
        this.LJLIL = assem;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        TopTabAbility LJJLIIIJL;
        if (TextUtils.equals(bundle.getString("fromStart", ""), "MainFragment") && (LJJLIIIJL = C78847Ux1.LJJLIIIJL(C55096Ljo.LJIIZILJ(this.LJLIL))) != null) {
            LJJLIIIJL.Cg0(true, true);
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        TopTabAbility LJJLIIIJL = C78847Ux1.LJJLIIIJL(C55096Ljo.LJIIZILJ(this.LJLIL));
        if (LJJLIIIJL != null) {
            LJJLIIIJL.yh0(true, true);
        }
    }
}
