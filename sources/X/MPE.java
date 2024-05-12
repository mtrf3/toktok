package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class MPE implements InterfaceC36130EFy, InterfaceC48038ItG {
    public static Boolean LJLIL = null;
    public static long LJLILLLLZI = 120000;
    public static long LJLJI = 5;
    public static long LJLJJI = 240000;
    public static int LJLJJL = 5;
    public static int LJLJJLL = 10;
    public static final MPE LJLJL = new MPE();

    @Override // X.InterfaceC36130EFy
    public void LIZ() {
    }

    @Override // X.InterfaceC36130EFy
    public void LIZIZ() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        C221018lt.LIZJ("MiddleDataSource", "refresh report error", it);
        return new OSZ(MPO.REPORT, new NoticeListsResponse(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0));
    }
}
