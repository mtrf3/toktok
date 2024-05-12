package X;

import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.YeF, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87875YeF extends AbstractC65781Prl implements InterfaceC88472Yns<SessionInfo, OSZ<? extends SessionInfo, ? extends SessionShowInfo>> {
    public static final C87875YeF LJLIL = new C87875YeF();

    public C87875YeF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final OSZ<? extends SessionInfo, ? extends SessionShowInfo> invoke(SessionInfo sessionInfo) {
        SessionInfo sessionInfo2 = sessionInfo;
        o.LJIIIZ(sessionInfo2, "sessionInfo");
        SessionShowInfo sessionShowInfo = sessionInfo2.showSession;
        if (sessionShowInfo != null) {
            return new OSZ<>(sessionInfo2, sessionShowInfo);
        }
        return null;
    }
}
