package X;

import defpackage.e1;

/* loaded from: classes9.dex */
public final class IIS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final IIS LJLIL = new IIS();

    public IIS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!e1.LIZ(31744, "text_mode_enable", true, false) || LFH.LIZIZ.LIZLLL().block().LIZLLL()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
