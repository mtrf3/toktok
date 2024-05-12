package X;

import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.share.ShareH5ServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Mrx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58149Mrx {
    public static final /* synthetic */ C58149Mrx LIZ = new C58149Mrx();

    public static ShareH5Service LIZ() {
        ShareH5Service shareH5Service;
        Object LIZ2 = C58096Mr6.LIZ(ShareH5Service.class, false);
        if (LIZ2 != null) {
            shareH5Service = (ShareH5Service) LIZ2;
        } else {
            if (C58096Mr6.M6 == null) {
                synchronized (ShareH5Service.class) {
                    if (C58096Mr6.M6 == null) {
                        C58096Mr6.M6 = new ShareH5ServiceImpl();
                    }
                }
            }
            shareH5Service = C58096Mr6.M6;
        }
        o.LJIIIIZZ(shareH5Service, "get().getService(ShareH5Service::class.java)");
        return shareH5Service;
    }
}
