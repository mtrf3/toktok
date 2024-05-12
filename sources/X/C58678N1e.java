package X;

import com.bytedance.keva.Keva;

/* renamed from: X.N1e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58678N1e extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C58678N1e LJLIL = new C58678N1e();

    public C58678N1e() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ProactiveTriggersService");
    }
}
