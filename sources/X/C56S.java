package X;

import com.bytedance.bpea.cert.token.TokenCert;

/* renamed from: X.56S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56S extends AbstractC65781Prl implements InterfaceC65784Pro<TokenCert> {
    public static final C56S LJLIL = new C56S();

    public C56S() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TokenCert invoke() {
        return TokenCert.Companion.with("bpea-microphone_permission_request");
    }
}
