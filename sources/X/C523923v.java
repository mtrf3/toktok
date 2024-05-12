package X;

import com.bytedance.keva.Keva;

/* renamed from: X.23v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C523923v extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C523923v LJLIL = new C523923v();

    public C523923v() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("btm_page_show_cache");
    }
}
