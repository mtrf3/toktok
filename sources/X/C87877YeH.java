package X;

import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.YeH, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87877YeH extends AbstractC65781Prl implements InterfaceC88472Yns<SessionShowInfo, Boolean> {
    public static final C87877YeH LJLIL = new C87877YeH();

    public C87877YeH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(SessionShowInfo sessionShowInfo) {
        boolean z;
        SessionShowInfo sessionShowInfo2 = sessionShowInfo;
        o.LJIIIZ(sessionShowInfo2, "sessionShowInfo");
        if (sessionShowInfo2.clickSession != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
