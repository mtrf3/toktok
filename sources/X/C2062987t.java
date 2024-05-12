package X;

import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.87t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2062987t {
    public static final /* synthetic */ C2062987t LIZ = new C2062987t();

    public static ShareFlavorService LIZ() {
        ShareFlavorService shareFlavorService;
        Object LIZ2 = C58096Mr6.LIZ(ShareFlavorService.class, false);
        if (LIZ2 != null) {
            shareFlavorService = (ShareFlavorService) LIZ2;
        } else {
            if (C58096Mr6.L6 == null) {
                synchronized (ShareFlavorService.class) {
                    if (C58096Mr6.L6 == null) {
                        C58096Mr6.L6 = new ShareFlavorServiceImpl();
                    }
                }
            }
            shareFlavorService = C58096Mr6.L6;
        }
        o.LJIIIIZZ(shareFlavorService, "get().getService(ShareFlavorService::class.java)");
        return shareFlavorService;
    }
}
