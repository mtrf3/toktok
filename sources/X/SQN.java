package X;

import com.bytedance.keva.Keva;

/* loaded from: classes13.dex */
public final class SQN extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final SQN LJLIL = new SQN();

    public SQN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("DMFilter");
    }
}
