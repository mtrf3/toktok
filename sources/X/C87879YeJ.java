package X;

import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.YeJ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87879YeJ extends AbstractC65781Prl implements InterfaceC88472Yns<SessionShowInfo, Boolean> {
    public static final C87879YeJ LJLIL = new C87879YeJ();

    public C87879YeJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(SessionShowInfo sessionShowInfo) {
        boolean z;
        SessionShowInfo sessionShowInfo2 = sessionShowInfo;
        o.LJIIIZ(sessionShowInfo2, "sessionShowInfo");
        if (sessionShowInfo2.playSession != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
