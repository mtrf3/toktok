package X;

import com.ss.android.ugc.aweme.services.LoginMethodService;

/* renamed from: X.Qxk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68700Qxk extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public static final C68700Qxk LJLIL = new C68700Qxk();

    public C68700Qxk() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue != -1 && intValue == 0) {
            boolean saveLoginStatus = R41.LIZIZ.LJIIIZ().getSaveLoginStatus();
            LoginMethodService LJIIIZ = R41.LIZIZ.LJIIIZ();
            if (saveLoginStatus) {
                i = 1;
            } else {
                i = 2;
            }
            LJIIIZ.updateLoginHistoryState(i, null);
        }
        return C76800UCe.LIZ;
    }
}
