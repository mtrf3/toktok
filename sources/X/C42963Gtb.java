package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Gtb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42963Gtb extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C42963Gtb LJLIL = new C42963Gtb();

    public C42963Gtb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("aweme-draft-db-log");
    }
}
