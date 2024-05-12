package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Gtj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42971Gtj extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C42971Gtj LJLIL = new C42971Gtj();

    public C42971Gtj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("publisher-feedback-log");
    }
}
