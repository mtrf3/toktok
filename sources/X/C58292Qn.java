package X;

import com.bytedance.keva.Keva;

/* renamed from: X.2Qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58292Qn extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C58292Qn LJLIL = new C58292Qn();

    public C58292Qn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("google_one_tap_service_repo");
    }
}
