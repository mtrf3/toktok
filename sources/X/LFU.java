package X;

import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class LFU implements C0C3 {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
    }

    public LFU(C34K c34k, AqS159S0100000_9 aqS159S0100000_9) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = aqS159S0100000_9;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        if (Math.abs(i2) > C17N.LJIJJLI(10)) {
            C34K c34k = this.LJLIL;
            if (!c34k.element) {
                c34k.element = true;
                LDQ ldq = LER.LIZIZ;
                if (ldq != null) {
                    ldq.dismiss();
                }
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
            }
        }
    }
}
