package X;

import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckApi;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckResponse;

/* renamed from: X.6kP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169136kP {
    public static PermissionCheckResponse LIZ(C169126kO c169126kO) {
        try {
            return ((PermissionCheckApi.CheckPermissionRequest) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, PermissionCheckApi.CheckPermissionRequest.class)).checkPermission(c169126kO).execute().LIZIZ;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("permission check failed: ");
            C16880lQ.LLLLIIL(e);
            LIZ.append(C76800UCe.LIZ);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            return null;
        }
    }
}
