package X;

import com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService;
import com.ss.android.ugc.aweme.portrait.impl.PortraitCenterInitServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Mrh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58133Mrh {
    public static final IPortraitCenterInitService LIZ;

    static {
        IPortraitCenterInitService iPortraitCenterInitService;
        Object LIZ2 = C58096Mr6.LIZ(IPortraitCenterInitService.class, false);
        if (LIZ2 != null) {
            iPortraitCenterInitService = (IPortraitCenterInitService) LIZ2;
        } else {
            if (C58096Mr6.Z3 == null) {
                synchronized (IPortraitCenterInitService.class) {
                    if (C58096Mr6.Z3 == null) {
                        C58096Mr6.Z3 = new PortraitCenterInitServiceImpl();
                    }
                }
            }
            iPortraitCenterInitService = C58096Mr6.Z3;
        }
        o.LJIIIIZZ(iPortraitCenterInitService, "get().getService(IPortra…rInitService::class.java)");
        LIZ = iPortraitCenterInitService;
    }
}
