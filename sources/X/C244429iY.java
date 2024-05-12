package X;

import com.bytedance.keva.Keva;

/* renamed from: X.9iY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244429iY extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C244429iY LJLIL = new C244429iY();

    public C244429iY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("aigc_avatar_keva");
    }
}
