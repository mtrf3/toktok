package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class E4U extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final E4U LJLIL = new E4U();

    public E4U() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("PNSDeviceConsentService");
    }
}
