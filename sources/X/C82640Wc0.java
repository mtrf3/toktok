package X;

import Y.AObjectS89S0100000_14;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.Wc0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82640Wc0 {
    public final EnumC45994I3i LJLIL;
    public EnumC45994I3i LJLILLLLZI;

    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LJLILLLLZI == this.LJLIL) {
            interfaceC65784Pro.invoke();
        }
    }

    public C82640Wc0(InterfaceC81640W2i interfaceC81640W2i, LifecycleOwner lifecycleOwner, EnumC45994I3i recordMode) {
        C40871j1 LIZIZ;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(recordMode, "recordMode");
        this.LJLIL = recordMode;
        this.LJLILLLLZI = recordMode;
        if (interfaceC81640W2i != null && (LIZIZ = interfaceC81640W2i.LIZIZ()) != null) {
            LIZIZ.LIZIZ(lifecycleOwner, new AObjectS89S0100000_14(this, 467));
        }
    }
}
