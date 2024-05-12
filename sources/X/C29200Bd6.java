package X;

import com.bytedance.android.livesdkapi.host.IHostNetwork;

/* renamed from: X.Bd6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29200Bd6 extends AbstractC65781Prl implements InterfaceC65784Pro<C65019PfT> {
    public static final C29200Bd6 LJLIL = new C29200Bd6();

    public C29200Bd6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C65019PfT invoke() {
        return ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).getLiveRetrofit(false);
    }
}
