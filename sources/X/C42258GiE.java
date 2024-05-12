package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: X.GiE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42258GiE extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C42258GiE LJLIL = new C42258GiE();

    public C42258GiE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String currentSecUid = AVExternalServiceImpl.LIZ().publishService().getCurrentSecUid();
        if (currentSecUid == null) {
            return "";
        }
        return currentSecUid;
    }
}
