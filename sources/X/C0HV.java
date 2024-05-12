package X;

import java.util.ArrayList;

/* renamed from: X.0HV, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0HV implements Runnable {
    public final /* synthetic */ int LJLIL = 0;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    ((C0HS) this.LJLILLLLZI).LIZ(C0HD.LJIIL, new ArrayList());
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                try {
                    ((InterfaceC65784Pro) this.LJLILLLLZI).invoke();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public C0HV(InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLILLLLZI = interfaceC65784Pro;
    }
}
