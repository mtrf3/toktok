package X;

import com.ss.android.ugc.aweme.account.AccountInitServiceImpl;
import com.ss.android.ugc.aweme.account.IAccountInitService;
import com.ss.android.ugc.aweme.app.services.IDownloadService;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.app.services.IRegionService;
import com.ss.android.ugc.aweme.app.services.IWebViewService;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.MrK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58110MrK implements InterfaceC58114MrO {
    @Override // X.InterfaceC58114MrO
    public final <T> ServiceProvider<T> getService(Class<T> cls) {
        IAccountInitService iAccountInitService;
        if (o.LJ(cls, IWebViewService.class)) {
            return C58108MrI.LIZ;
        }
        if (o.LJ(cls, IRegionService.class)) {
            return C58109MrJ.LIZ;
        }
        if (o.LJ(cls, IFeed0VVManagerService.class)) {
            return C58111MrL.LIZ;
        }
        if (o.LJ(cls, IPushLaunchPageAssistantService.class)) {
            return C58112MrM.LIZ;
        }
        if (o.LJ(cls, IDownloadService.class)) {
            return C58113MrN.LIZ;
        }
        Object LIZ = C58096Mr6.LIZ(IAccountInitService.class, false);
        if (LIZ != null) {
            iAccountInitService = (IAccountInitService) LIZ;
        } else {
            if (C58096Mr6.LJJLJLI == null) {
                synchronized (IAccountInitService.class) {
                    if (C58096Mr6.LJJLJLI == null) {
                        C58096Mr6.LJJLJLI = new AccountInitServiceImpl();
                    }
                }
            }
            iAccountInitService = C58096Mr6.LJJLJLI;
        }
        return iAccountInitService.getService(cls);
    }
}
