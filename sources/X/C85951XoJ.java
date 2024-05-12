package X;

import com.bytedance.keva.Keva;

/* renamed from: X.XoJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85951XoJ extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C85951XoJ LJLIL = new C85951XoJ();

    public C85951XoJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("need_sync");
    }
}
