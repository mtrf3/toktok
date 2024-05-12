package X;

import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.YeG, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87876YeG extends AbstractC65781Prl implements InterfaceC88471Ynr<SessionInfo, SessionShowInfo, SessionInfo> {
    public static final C87876YeG LJLIL = new C87876YeG();

    public C87876YeG() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final SessionInfo invoke(SessionInfo sessionInfo, SessionShowInfo sessionShowInfo) {
        SessionInfo sessionInfo2 = sessionInfo;
        SessionShowInfo sessionShowInfo2 = sessionShowInfo;
        o.LJIIIZ(sessionInfo2, "sessionInfo");
        o.LJIIIZ(sessionShowInfo2, "sessionShowInfo");
        return SessionInfo.LIZ(sessionInfo2, sessionShowInfo2, 13);
    }
}
