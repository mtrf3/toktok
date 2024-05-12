package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class E4L extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final E4L LJLIL = new E4L();

    public E4L() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ug_cohort");
    }
}
