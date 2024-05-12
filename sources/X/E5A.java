package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class E5A extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final E5A LJLIL = new E5A();

    public E5A() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("reverse_interest_select");
    }
}
