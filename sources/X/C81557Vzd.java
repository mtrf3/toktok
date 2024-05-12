package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Vzd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81557Vzd extends AbstractC26257ASf {
    public final /* synthetic */ C81556Vzc LIZ;

    public C81557Vzd(C81556Vzc c81556Vzc) {
        this.LIZ = c81556Vzc;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        InterfaceC81560Vzg interfaceC81560Vzg;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        this.LIZ.LLFZ = true;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        ((ColorDrawable) this.LIZ.LLD.getValue()).setColor(C44384HbQ.LLJJ((1 + f) * 0.5f, ((ColorDrawable) this.LIZ.LLD.getValue()).getColor()));
        InterfaceC36571c5 interfaceC36571c5 = this.LIZ.LJLJI;
        if ((interfaceC36571c5 instanceof InterfaceC81560Vzg) && (interfaceC81560Vzg = (InterfaceC81560Vzg) interfaceC36571c5) != null) {
            interfaceC81560Vzg.LIZ();
        }
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        boolean z;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        InterfaceC81560Vzg interfaceC81560Vzg;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        InterfaceC36571c5 interfaceC36571c5 = this.LIZ.LJLJI;
        if ((interfaceC36571c5 instanceof InterfaceC81560Vzg) && (interfaceC81560Vzg = (InterfaceC81560Vzg) interfaceC36571c5) != null) {
            interfaceC81560Vzg.LIZIZ();
        }
        if (i == 5) {
            C81556Vzc c81556Vzc = this.LIZ;
            if (!c81556Vzc.LLI && c81556Vzc.LLFZ && (interfaceC65784Pro = c81556Vzc.LJLZ) != null) {
                interfaceC65784Pro.invoke();
            }
        }
        C81556Vzc c81556Vzc2 = this.LIZ;
        if (c81556Vzc2.LJLJJLL == EnumC81480VyO.FULLSCREEN) {
            if (i != 3) {
                z = true;
            } else {
                z = false;
            }
            c81556Vzc2.LLJJIJIL(z);
        }
    }
}
