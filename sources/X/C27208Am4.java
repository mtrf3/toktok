package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Am4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27208Am4 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C27208Am4 LJLIL = new C27208Am4();

    public C27208Am4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ec_page_template_cache");
    }
}
