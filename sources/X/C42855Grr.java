package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: X.Grr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42855Grr {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        HQ7 hq7 = (HQ7) ServiceManager.get().getService(HQ7.class);
        if (hq7 != null) {
            return hq7.getCurrentUserID();
        }
        return null;
    }
}
