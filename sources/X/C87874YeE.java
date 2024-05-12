package X;

import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.YeE, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87874YeE extends AbstractC65781Prl implements InterfaceC88472Yns<SessionInfo, Boolean> {
    public static final C87874YeE LJLIL = new C87874YeE();

    public C87874YeE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(SessionInfo sessionInfo) {
        boolean z;
        SessionInfo sessionInfo2 = sessionInfo;
        o.LJIIIZ(sessionInfo2, "sessionInfo");
        if (sessionInfo2.showSession != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
