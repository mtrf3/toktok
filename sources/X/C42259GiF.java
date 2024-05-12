package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: X.GiF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42259GiF extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C42259GiF LJLIL = new C42259GiF();

    public C42259GiF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return AVExternalServiceImpl.LIZ().publishService().getCurrentUserId();
    }
}
