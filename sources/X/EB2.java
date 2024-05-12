package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class EB2 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final EB2 LJLIL = new EB2();

    public EB2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("EarlyFeedbackService");
    }
}
