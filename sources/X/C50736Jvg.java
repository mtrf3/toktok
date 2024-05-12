package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jvg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50736Jvg extends AbstractC65781Prl implements InterfaceC65784Pro<C50734Jve> {
    public static final C50736Jvg LJLIL = new C50736Jvg();

    public C50736Jvg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C50734Jve invoke() {
        C50734Jve c50734Jve = new C50734Jve();
        if (o.LJ(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchCoinDebugSwitch(), Boolean.TRUE)) {
            String curUserId = c50734Jve.LJJIFFI().getCurUserId();
            o.LJIIIIZZ(curUserId, "accountService.curUserId");
            c50734Jve.LJJIJL(curUserId);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String curUserId2 = c50734Jve.LJJIFFI().getCurUserId();
            o.LJIIIIZZ(curUserId2, "accountService.curUserId");
            c50734Jve.LJJIL(curUserId2, linkedHashMap);
        }
        return c50734Jve;
    }
}
