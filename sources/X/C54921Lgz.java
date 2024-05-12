package X;

import android.app.Activity;
import android.webkit.CookieSyncManager;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.homepage.TiktokBaseMainHelper;
import com.ss.android.ugc.aweme.main.InterceptHomeBackPressServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Lgz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54921Lgz extends TiktokBaseMainHelper {
    public boolean LIZJ;

    @Override // X.InterfaceC54150LNa
    public final void LIZLLL() {
        this.LIZJ = false;
    }

    @Override // X.InterfaceC54150LNa
    public final void LIZJ() {
        Activity activity = this.LIZ;
        if (activity != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", C54154LNe.LIZIZ(activity));
            c188727au.LJIIIZ("enter_from", "homepage_hot");
            c188727au.LJIIIZ("is_quite", "1");
            FMX.LJIIL("click_back_quit", c188727au.LIZ);
        }
        BusinessComponentServiceUtils.getMainHelperService().getClass();
        FJU.LIZIZ().getClass();
        try {
            CookieSyncManager.getInstance().sync();
        } catch (Throwable unused) {
        }
        C54923Lh1.LIZIZ.LIZ();
        PipServiceImpl.LJJII().LJJ();
        this.LIZ.finish();
        IWF.LJJLIIIIJ().release();
        C56692Kj.LIZ().getClass();
        BusinessComponentServiceUtils.getMainHelperService().getClass();
        AwemeService.LIZ().clearCache();
    }

    @Override // X.InterfaceC54150LNa
    public final boolean onBackPressed() {
        InterceptHomeBackPressService LIZLLL = InterceptHomeBackPressServiceImpl.LIZLLL();
        if (LIZLLL != null && LIZLLL.LIZ()) {
            return true;
        }
        CommentService.LIZ.getClass();
        boolean LJJIIZ = CommentServiceImpl.LJJL().LJJIIZ(this.LIZ);
        this.LIZJ = LJJIIZ;
        if (LJJIIZ) {
            CommentServiceImpl.LJJL().LJII(this.LIZ);
            return false;
        }
        if (System.currentTimeMillis() - this.LIZIZ <= 2000) {
            LIZJ();
            this.LIZIZ = 0L;
            return true;
        }
        this.LIZIZ = System.currentTimeMillis();
        if (this.LIZ.isFinishing()) {
            return false;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIIZZ(R.string.c39);
        c26045AKb.LJIIJ();
        return false;
    }

    @Override // X.InterfaceC54150LNa
    public final boolean LIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54921Lgz(Activity activity) {
        super(activity);
        o.LJI(activity);
    }

    @Override // X.InterfaceC54150LNa
    public final void LIZIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("press_back", c188727au.LIZ);
    }
}
