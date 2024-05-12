package X;

import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageStoryAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.LNx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC54173LNx<V> implements Callable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ MainPageStoryAssem LJLJI;

    public CallableC54173LNx(boolean z, String str, MainPageStoryAssem mainPageStoryAssem) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = mainPageStoryAssem;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Aweme aweme;
        boolean z;
        String str2;
        if (!this.LJLIL) {
            str = "enter_homepage_follow";
        } else {
            str = "enter_homepage_hot";
        }
        LQ7 lq7 = new LQ7(str);
        lq7.LJIILLIIL = "publish";
        lq7.LIZLLL = "publish";
        lq7.LJIJI = this.LJLILLLLZI;
        if (o.LJ(str, "enter_homepage_follow")) {
            C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
            if (c88545Yp3 != null) {
                z = c88545Yp3.isConnected();
            } else {
                z = false;
            }
            lq7.LJJIFFI = z;
            if (c88545Yp3 == null || (str2 = c88545Yp3.LJIILJJIL()) == null) {
                str2 = "";
            }
            lq7.LJJII = str2;
        }
        HomePageDataViewModel homePageDataViewModel = (HomePageDataViewModel) this.LJLJI.LJLJJLL.getValue();
        if (homePageDataViewModel != null && homePageDataViewModel.LJLJLLL != null) {
            HomePageDataViewModel homePageDataViewModel2 = (HomePageDataViewModel) this.LJLJI.LJLJJLL.getValue();
            if (homePageDataViewModel2 != null) {
                aweme = homePageDataViewModel2.LJLJLLL;
            } else {
                aweme = null;
            }
            lq7.LJIILLIIL(aweme);
        }
        if (!o.LJ(str, "enter_homepage_follow") || !C53295Kvr.LIZ()) {
            lq7.LJIILIIL();
        }
        return null;
    }
}
