package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxDebugBadgeSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.CNv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31239CNv implements InterfaceC25300z0 {
    public String LIZ;
    public String LIZIZ;
    public Context LIZJ;
    public ViewGroup LIZLLL;
    public String LJ = "h5";
    public CO7 LJFF;
    public C30884CAe LJI;
    public final boolean LJII;
    public InterfaceC25290yz LJIIIIZZ;

    public final void LIZIZ() {
        WebView webView;
        if (this.LJI == null) {
            C30882CAc Lu = ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
            Context context = this.LIZJ;
            if (context != null) {
                ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
                o.LJI(LIZIZ);
                this.LJI = Lu.LIZIZ(LIZIZ, new CO2(this));
            } else {
                o.LJIJI("mContext");
                throw null;
            }
        }
        C30884CAe c30884CAe = this.LJI;
        if (c30884CAe != null && (webView = c30884CAe.LJLIL) != null) {
            webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            webView.setBackgroundColor(0);
            ViewGroup viewGroup = this.LIZLLL;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                ViewGroup viewGroup2 = this.LIZLLL;
                if (viewGroup2 != null) {
                    viewGroup2.addView(webView, 0);
                    if (this.LJII) {
                        ViewGroup viewGroup3 = this.LIZLLL;
                        if (viewGroup3 != null) {
                            LIZ(viewGroup3, COD.LJLIL);
                            return;
                        } else {
                            o.LJIJI("mRootContainer");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("mRootContainer");
                throw null;
            }
            o.LJIJI("mRootContainer");
            throw null;
        }
    }

    public final void LIZJ() {
        if (o.LJ("lynx", this.LJ)) {
            CO7 co7 = this.LJFF;
            if (co7 != null) {
                co7.release();
                return;
            }
            return;
        }
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu().LJFF(this.LJI);
    }

    public C31239CNv() {
        boolean z;
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest() && EnableLynxDebugBadgeSetting.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LJII = z;
    }

    public final void LIZ(ViewGroup viewGroup, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        Context context = this.LIZJ;
        if (context != null) {
            C47121t6 c47121t6 = new C47121t6(context, null);
            c47121t6.setText(this.LJ);
            c47121t6.setTextSize(14.0f);
            c47121t6.setTextColor(ColorProtector.parseColor("#FFFFFF"));
            c47121t6.setBackgroundColor(ColorProtector.parseColor("#88008800"));
            C16880lQ.LJJIIZ(c47121t6, new ACListenerS25S0100000_5((InterfaceC88472Yns) interfaceC88472Yns, 363));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            viewGroup.addView(c47121t6, layoutParams);
            return;
        }
        o.LJIJI("mContext");
        throw null;
    }
}
