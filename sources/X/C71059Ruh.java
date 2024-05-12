package X;

import com.ss.android.ugc.aweme.local_test.LocalTestApi;

/* renamed from: X.Ruh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71059Ruh extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C71059Ruh LJLIL = new C71059Ruh();

    public C71059Ruh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null && localTestApi.enableBoe()) {
            return C71058Rug.LIZJ.getValue();
        }
        return "https://oec-api.tiktokv.com/";
    }
}
