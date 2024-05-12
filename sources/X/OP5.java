package X;

import com.bytedance.keva.Keva;

/* loaded from: classes11.dex */
public final class OP5 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final OP5 LJLIL = new OP5();

    public OP5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("filter_keywords");
    }
}
