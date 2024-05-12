package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.DspProfile;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Zqx, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91211Zqx {
    public static int LIZ;

    public static int LIZ() {
        int i;
        IUserService iUserService;
        User currentUser;
        DspProfile dspProfile;
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null && (iUserService = (IUserService) serviceManager.getService(IUserService.class)) != null && (currentUser = iUserService.getCurrentUser()) != null && (dspProfile = currentUser.getDspProfile()) != null) {
            i = dspProfile.getCollectCount();
        } else {
            i = 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("dsp collect from login module count is ");
        LIZ2.append(i);
        X1D.LIZIZ(LIZ2);
        if (i == 0) {
            i = LIZ;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("dsp collect count is ");
        LIZ3.append(i);
        X1D.LIZIZ(LIZ3);
        return i;
    }
}
