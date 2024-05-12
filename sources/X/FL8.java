package X;

import Y.ARunnableS2S1201000_6;
import Y.ARunnableS9S0201000_6;
import android.os.Binder;
import android.os.RemoteException;
import com.ss.android.ugc.cut_downloader.AbsDownloadService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FL8 extends AbstractBinderC40634Fx8 {
    public static final /* synthetic */ int LJLJI = 0;
    public final /* synthetic */ AbsDownloadService LJLILLLLZI;

    public FL8(AbsDownloadService this$0) {
        o.LJIIIZ(this$0, "this$0");
        this.LJLILLLLZI = this$0;
    }

    @Override // X.InterfaceC40638FxC
    public final void LJL(FL7 fl7) {
        if (fl7 != null) {
            AbsDownloadService absDownloadService = this.LJLILLLLZI;
            absDownloadService.LJLIL.post(new ARunnableS9S0201000_6(1, absDownloadService, fl7, 9));
            return;
        }
        throw new RemoteException("callback null");
    }

    public final void LJLJI(String str) {
        FL6 fl6 = (FL6) ((LinkedHashMap) this.LJLILLLLZI.LJLJI).get(str);
        if (fl6 == null) {
            return;
        }
        fl6.LIZJ.remove(Integer.valueOf(Binder.getCallingPid()));
        if (!fl6.LIZJ.isEmpty()) {
            return;
        }
        LJLJI(str);
    }

    @Override // X.InterfaceC40638FxC
    public final void LLLIL(String str, String str2) {
        if (str != null) {
            AbsDownloadService absDownloadService = this.LJLILLLLZI;
            absDownloadService.LJLIL.post(new ARunnableS2S1201000_6(absDownloadService, str, str2, 2));
            return;
        }
        throw new RemoteException("url null");
    }
}
