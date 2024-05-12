package X;

import Y.AObjectS128S0200000_10;
import Y.AObjectS45S0101000_13;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.web.permission.AdWebPermissionService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class NZK implements InterfaceC59820Ndo {
    public View LIZ;
    public final /* synthetic */ NZQ LIZIZ;

    @Override // X.InterfaceC59820Ndo
    public final void LIZLLL(WebView webView, String str) {
    }

    @Override // X.InterfaceC59820Ndo
    public final void LIZ() {
        View view = this.LIZ;
        if (view != null) {
            NZQ nzq = this.LIZIZ;
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            nzq.removeView(view);
            this.LIZ = null;
        }
        NZO iFullScreen = this.LIZIZ.getIFullScreen();
        if (iFullScreen != null) {
            NZJ nzj = (NZJ) iFullScreen;
            MixActivityContainer mixActivityContainer = nzj.LIZIZ;
            C59309NPl c59309NPl = mixActivityContainer.LJLILLLLZI.LIZJ;
            if (!c59309NPl.LJIILL) {
                mixActivityContainer.LL.setVisibility(0);
                mixActivityContainer.LJIJJLI();
            } else if (!c59309NPl.LJIJ) {
                mixActivityContainer.LL.setVisibility(0);
                mixActivityContainer.LLF.setVisibility(0);
            }
            Activity activity = nzj.LIZIZ.LJLIL;
            if (activity != null) {
                int requestedOrientation = activity.getRequestedOrientation();
                int i = nzj.LIZ;
                if (requestedOrientation != i) {
                    nzj.LIZIZ.LJLIL.setRequestedOrientation(i);
                    MixActivityContainer mixActivityContainer2 = nzj.LIZIZ;
                    C59314NPq c59314NPq = mixActivityContainer2.LJLILLLLZI;
                    Activity activity2 = mixActivityContainer2.LJLIL;
                    if (c59314NPq != null && activity2 != null) {
                        C59309NPl c59309NPl2 = c59314NPq.LIZJ;
                        if (c59309NPl2.LJIJI && (c59309NPl2.LJIIZILJ || !C60178Nja.LIZIZ(activity2))) {
                            nzj.LIZIZ.LJIILLIIL();
                        }
                    }
                    nzj.LIZIZ.LJLIL.getWindow().clearFlags(1024);
                }
                ViewGroup viewGroup = (ViewGroup) nzj.LIZIZ.LJLIL.findViewById(R.id.nif);
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    public NZK(NZQ nzq) {
        this.LIZIZ = nzq;
    }

    @Override // X.InterfaceC59820Ndo
    public final void LJ(PermissionRequest permissionRequest) {
        AdWebStatBusiness webStatBusiness = this.LIZIZ.getWebStatBusiness();
        if (webStatBusiness == null || permissionRequest == null) {
            return;
        }
        C59273NOb c59273NOb = webStatBusiness.LIZIZ.LIZIZ;
        if (!c59273NOb.LJJLIIIJL || Arrays.binarySearch(permissionRequest.getResources(), "android.webkit.resource.VIDEO_CAPTURE") == -1) {
            return;
        }
        AdWebPermissionService.LIZJ().LIZ(permissionRequest, webStatBusiness.LJFF, c59273NOb.LJJLIIIJLLLLLLLZ, new AObjectS45S0101000_13(4, c59273NOb, 5));
    }

    @Override // X.InterfaceC59820Ndo
    public final void LIZIZ(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        NZO iFullScreen = this.LIZIZ.getIFullScreen();
        boolean z = false;
        if (iFullScreen != null) {
            NZJ nzj = (NZJ) iFullScreen;
            nzj.LIZIZ.LJIIIZ();
            MixActivityContainer mixActivityContainer = nzj.LIZIZ;
            Activity activity = mixActivityContainer.LJLIL;
            if (activity != null && view != null && mixActivityContainer.LJLILLLLZI.LIZJ.LJJIIJ) {
                nzj.LIZ = activity.getRequestedOrientation();
                nzj.LIZIZ.LJLIL.setRequestedOrientation(11);
                C60191Njn.LIZIZ(nzj.LIZIZ.LJLIL);
                ViewGroup viewGroup = (ViewGroup) nzj.LIZIZ.LJLIL.findViewById(R.id.nif);
                if (viewGroup == null) {
                    viewGroup = new FrameLayout(nzj.LIZIZ.LJLIL);
                    viewGroup.setId(R.id.nif);
                    nzj.LIZIZ.LJLIL.addContentView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
                }
                viewGroup.setVisibility(0);
                viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
                z = true;
            }
        }
        NZQ nzq = this.LIZIZ;
        if (!z) {
            this.LIZ = view;
            if (view != null) {
                nzq.addView(view);
            }
        }
    }

    @Override // X.InterfaceC59820Ndo
    public final void LIZJ(WebView webView, int i) {
        String str;
        NK2 nk2;
        if (webView != null) {
            webView.getUrl();
        }
        NZQ nzq = this.LIZIZ;
        if (webView != null) {
            str = webView.getUrl();
        } else {
            str = null;
        }
        nzq.getClass();
        if (TextUtils.equals("about:blank", str)) {
            return;
        }
        AdWebStatBusiness webStatBusiness = this.LIZIZ.getWebStatBusiness();
        if (webStatBusiness != null && webStatBusiness.LIZJ() && AdWebStatBusiness.LIZLLL(webView.getUrl()) && (nk2 = webStatBusiness.LJFF) != null) {
            nk2.LIZLLL(webView.getUrl(), i, new AObjectS128S0200000_10(webStatBusiness, webView, 4), webView);
        }
        this.LIZIZ.setProgress(i);
        if (i == 100) {
            ((C73305Spp) this.LIZIZ.LJFF(R.id.g94)).setVisibility(8);
            this.LIZIZ.LJIILIIL("onProgressChanged");
            return;
        }
        int LIZ = C34175Db9.LIZ();
        if (LIZ != 1) {
            if (LIZ != 2) {
                ((C61326O5a) this.LIZIZ.LJFF(R.id.hju)).setProgress(i);
                return;
            } else {
                if (((C61326O5a) this.LIZIZ.LJFF(R.id.hju)).getProgress() > i) {
                    return;
                }
                ((C61326O5a) this.LIZIZ.LJFF(R.id.hju)).setProgress(i);
                if (i <= 90) {
                    return;
                }
                this.LIZIZ.LJJI();
                return;
            }
        }
        ((C61326O5a) this.LIZIZ.LJFF(R.id.hju)).setProgress(i);
    }
}
