package X;

import com.bytedance.keva.Keva;

/* renamed from: X.2a9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60852a9 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C60852a9 LJLIL = new C60852a9();

    public C60852a9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("app_log_opt_interceptor_settings_v2");
    }
}
