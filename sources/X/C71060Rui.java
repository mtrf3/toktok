package X;

import com.ss.android.ugc.aweme.local_test.LocalTestApi;

/* renamed from: X.Rui, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71060Rui extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C71060Rui LJLIL = new C71060Rui();

    public C71060Rui() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null) {
            return localTestApi.getEcommerceBoeHost();
        }
        return null;
    }
}
