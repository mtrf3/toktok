package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.2VG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2VG extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, String> {
    public static final C2VG LJLIL = new C2VG();

    public C2VG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(Aweme aweme) {
        String aid;
        Aweme aweme2 = aweme;
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            return "";
        }
        return aid;
    }
}
