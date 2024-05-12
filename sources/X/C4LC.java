package X;

import com.bytedance.keva.Keva;

/* renamed from: X.4LC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LC extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C4LC LJLIL = new C4LC();

    public C4LC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("im_quick_share");
    }
}
