package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsOfflineService;

/* renamed from: X.5Vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136125Vw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(" Data Error\n Please save this message and contact @qilan\n");
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
        ((IToolsOfflineService) ServiceManager.get().getService(IToolsOfflineService.class)).LIZJ();
    }
}
