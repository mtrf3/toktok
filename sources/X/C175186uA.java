package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.6uA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175186uA extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C175186uA LJLIL = new C175186uA();

    public C175186uA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.penetration_rate_comment_page(), "penetration_rate_comment_page");
        } catch (Throwable th) {
            C78983UzD.LJIJ(th, "ExtendedSceneStatisticExp");
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
