package X;

import com.bytedance.keva.Keva;

/* renamed from: X.GjW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42338GjW extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C42338GjW LJLIL = new C42338GjW();

    public C42338GjW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("large_transaction_repo");
    }
}
