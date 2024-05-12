package X;

import com.ss.android.ugc.aweme.feed.motivatelogin.MotivateLoginPopupManager;
import com.ss.android.ugc.aweme.social.service.IMotivateLoginService;

/* renamed from: X.LiN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55007LiN implements IMotivateLoginService {
    public static final C55007LiN LIZIZ = new C55007LiN();
    public final /* synthetic */ IMotivateLoginService LIZ;

    @Override // com.ss.android.ugc.aweme.social.service.IMotivateLoginService
    public final void LIZ(ActivityC45651qj activityC45651qj) {
        this.LIZ.LIZ(activityC45651qj);
    }

    public C55007LiN() {
        IMotivateLoginService iMotivateLoginService;
        Object LIZ = C58096Mr6.LIZ(IMotivateLoginService.class, false);
        if (LIZ != null) {
            iMotivateLoginService = (IMotivateLoginService) LIZ;
        } else {
            if (C58096Mr6.J0 == null) {
                synchronized (IMotivateLoginService.class) {
                    if (C58096Mr6.J0 == null) {
                        C58096Mr6.J0 = new MotivateLoginPopupManager();
                    }
                }
            }
            iMotivateLoginService = C58096Mr6.J0;
        }
        this.LIZ = iMotivateLoginService;
    }
}
