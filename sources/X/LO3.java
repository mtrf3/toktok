package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LO3<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ MainTabStrip LJLJJL;
    public final /* synthetic */ C54193LOr LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public LO3(String str, String str2, String str3, String str4, MainTabStrip mainTabStrip, C54193LOr c54193LOr, String str5) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = mainTabStrip;
        this.LJLJJLL = c54193LOr;
        this.LJLJL = str5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        LQ7 lq7 = new LQ7(this.LJLIL);
        lq7.LJIILLIIL = this.LJLILLLLZI;
        lq7.LIZLLL = this.LJLJI;
        lq7.LJIJI = this.LJLJJI;
        lq7.LJIILLIIL(LNH.LIZIZ(this.LJLJJL.LIZJ()));
        if (TextUtils.equals(this.LJLIL, "enter_homepage_follow") && (((FollowLiveBubbleConfig) this.LJLJJL.LJZL.getValue()).expGroup == 2 || ((FollowLiveBubbleConfig) this.LJLJJL.LJZL.getValue()).expGroup == 3)) {
            C54193LOr c54193LOr = this.LJLJJLL;
            lq7.LJIL = c54193LOr.LIZ;
            lq7.LJJ = c54193LOr.LIZIZ;
        }
        if (o.LJ(this.LJLIL, "enter_homepage_follow")) {
            C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
            if (c88545Yp3 != null) {
                z = c88545Yp3.isConnected();
            } else {
                z = false;
            }
            lq7.LJJIFFI = z;
            if (c88545Yp3 == null || (str = c88545Yp3.LJIILJJIL()) == null) {
                str = "";
            }
            lq7.LJJII = str;
            LIV socialTabNoticeData = LHM.LIZIZ.LIZIZ().getSocialTabNoticeData();
            if (socialTabNoticeData != null) {
                str2 = socialTabNoticeData.LJLIL;
                num = Integer.valueOf(socialTabNoticeData.LJLILLLLZI);
                num2 = Integer.valueOf(socialTabNoticeData.LJLJI);
                num3 = Integer.valueOf(socialTabNoticeData.LJLJJI);
            } else {
                str2 = null;
                num = null;
                num2 = null;
                num3 = null;
            }
            lq7.LJIILL(str2, num, num2, num3);
        }
        if (TextUtils.equals(this.LJLIL, "enter_topic_tab")) {
            lq7.LJJI = MainTabStrip.LLF.get(this.LJLJL);
        }
        if (!o.LJ(this.LJLIL, "enter_homepage_follow") || !C53295Kvr.LIZ()) {
            lq7.LJIILIIL();
        }
        return null;
    }
}
