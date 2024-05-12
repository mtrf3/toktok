package X;

import Y.ARunnableS17S0101000_13;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class NZ9 implements NZ4 {
    public final /* synthetic */ MixActivityContainer LIZ;

    @Override // X.NZ4
    public final void LIZ() {
        this.LIZ.LJJIIJZLJL();
    }

    @Override // X.NZ4
    public final void LIZIZ() {
        BusinessService.Business LIZ = this.LIZ.LJLJJL.LIZ(ReportBusinessProxy.class);
        Activity activity = this.LIZ.LJLIL;
        LIZ.getClass();
        CrossPlatformLegacyServiceImpl.LJIJ().LJIIIIZZ(activity, LIZ.LIZIZ.LIZ.LJIIIZ);
    }

    @Override // X.NZ4
    public final void LJLIIIL() {
        if (this.LIZ.LJIJI(null, false)) {
            return;
        }
        MixActivityContainer mixActivityContainer = this.LIZ;
        mixActivityContainer.LJZ = "click_button";
        mixActivityContainer.LJJI(true);
    }

    @Override // X.NZ4
    public final void LJLIIL() {
        String aid;
        WebBackForwardList copyBackForwardList;
        NZR LJJ = this.LIZ.LJJ();
        if (LJJ != null) {
            ReportBusinessProxy reportBusinessProxy = (ReportBusinessProxy) this.LIZ.LJLJJL.LIZ(ReportBusinessProxy.class);
            Activity activity = this.LIZ.LJLIL;
            String url = LJJ.getUrl();
            NZR LJJ2 = this.LIZ.LJJ();
            int i = 1;
            if (LJJ2 != null && (copyBackForwardList = LJJ2.copyBackForwardList()) != null) {
                i = 1 + copyBackForwardList.getCurrentIndex();
            }
            if (TextUtils.isEmpty(reportBusinessProxy.LIZLLL)) {
                return;
            }
            Uri.Builder builder = new Uri.Builder();
            Aweme i6 = AwemeService.LIZ().i6(reportBusinessProxy.LIZIZ.LIZ.LJIIIZ);
            if (TextUtils.isEmpty(reportBusinessProxy.LJ)) {
                if (i6 == null) {
                    aid = "";
                } else {
                    aid = i6.getAid();
                }
                reportBusinessProxy.LJ = aid;
            }
            String str = reportBusinessProxy.LIZIZ.LIZ.LJIIL;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("author_id", str);
            c188727au.LJIIIZ("enter_from", reportBusinessProxy.LIZIZ.LIZ.LJFF);
            c188727au.LJIIIZ("group_id", C227768wm.LIZIZ(i6));
            c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(i6)));
            c188727au.LJIIIZ("report_type", reportBusinessProxy.LIZLLL);
            c188727au.LJIIIZ("reported_url", url);
            c188727au.LJIIIZ("page_depth", String.valueOf(i));
            FMX.LJIIL("report", c188727au.LIZ);
            builder.appendQueryParameter("report_type", reportBusinessProxy.LIZLLL).appendQueryParameter("owner_id", str).appendQueryParameter("enter_from", reportBusinessProxy.LIZIZ.LIZ.LJFF).appendQueryParameter("reported_url", url).appendQueryParameter("page_depth", String.valueOf(i)).appendQueryParameter("user_id", ((RBX) HG3.LJIILL()).getCurUserId()).appendQueryParameter("object_id", reportBusinessProxy.LJ);
            CrossPlatformLegacyServiceImpl.LJIJ().LIZIZ(activity, builder);
        }
    }

    @Override // X.NZ4
    public final void LJLILLLLZI() {
        this.LIZ.LJJIIZ();
    }

    @Override // X.NZ4
    public final void LJLJI() {
        MixActivityContainer mixActivityContainer = this.LIZ;
        mixActivityContainer.LJLJLJ = "full_screen_page_click";
        if (mixActivityContainer.LJIJI(new ARunnableS17S0101000_13(2, this, 13), true)) {
            return;
        }
        this.LIZ.LJIJJ();
    }

    public NZ9(MixActivityContainer mixActivityContainer) {
        this.LIZ = mixActivityContainer;
    }

    @Override // X.NZ4
    public final void LJLIL(View view) {
        boolean z;
        NZD nzd = this.LIZ.LJZL;
        List<Integer> list = nzd.LJ;
        if (list == null || ((ArrayList) list).isEmpty()) {
            nzd.LIZIZ.setVisibility(0);
            nzd.LIZJ.setVisibility(0);
            nzd.LIZLLL.setVisibility(0);
        } else {
            if (((ArrayList) nzd.LJ).contains(Integer.valueOf(NZF.refresh.id))) {
                C27740Aue.LJIIIZ(8, nzd.LIZIZ);
                z = false;
            } else {
                C27740Aue.LJIIIZ(0, nzd.LIZIZ);
                z = true;
            }
            if (((ArrayList) nzd.LJ).contains(Integer.valueOf(NZF.copylink.id))) {
                nzd.LIZJ.setVisibility(8);
            } else {
                nzd.LIZJ.setVisibility(0);
                z = true;
            }
            if (((ArrayList) nzd.LJ).contains(Integer.valueOf(NZF.openwithbrowser.id))) {
                nzd.LIZLLL.setVisibility(8);
                if (!z) {
                    return;
                }
            } else {
                nzd.LIZLLL.setVisibility(0);
            }
        }
        C16880lQ.LLJL(this.LIZ.LJZL.LIZ(), view, 0, -12);
    }
}
