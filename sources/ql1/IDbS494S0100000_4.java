package ql1;

import X.AbstractC60811Ntn;
import X.C188727au;
import X.C25961AGv;
import X.C60704Ns4;
import X.FMX;
import X.InterfaceC60761Nsz;
import X.ViewOnTouchListenerC25960AGu;
import X.WM7;
import Y.IDrS44S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.touchpoint.core.model.DynamicDialog;
import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment;
import com.ss.android.ugc.aweme.specact.touchpoints.popup.DynamicPopupTask;
import com.ss.android.ugc.aweme.trending.ui.list.TrendingRevealPage;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDbS494S0100000_4 extends AbstractC60811Ntn {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz interfaceC60761Nsz, String str, C60704Ns4 c60704Ns4) {
        switch (this.$t) {
            case 0:
                LJJJJIZL$0(this, interfaceC60761Nsz, str, c60704Ns4);
                return;
            default:
                super.LJJJJIZL(interfaceC60761Nsz, str, c60704Ns4);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz interfaceC60761Nsz) {
        switch (this.$t) {
            case 1:
                LJJJJJ$0(this, interfaceC60761Nsz);
                return;
            default:
                super.LJJJJJ(interfaceC60761Nsz);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        switch (this.$t) {
            case 2:
                LJJJJLI$0(this, interfaceC60761Nsz);
                return;
            default:
                super.LJJJJLI(interfaceC60761Nsz);
                return;
        }
    }

    public IDbS494S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJJJJ$0(IDbS494S0100000_4 iDbS494S0100000_4, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        ((TrendingRevealPage) iDbS494S0100000_4.l0).LJLIL = view;
        View childAt = ((ViewGroup) view).getChildAt(0);
        o.LJII(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        ((RecyclerView) childAt).LJIIJJI(new IDrS44S0100000_4((TrendingRevealPage) iDbS494S0100000_4.l0, 8));
    }

    public static final void LJJJJLI$0(IDbS494S0100000_4 iDbS494S0100000_4, InterfaceC60761Nsz interfaceC60761Nsz) {
        WebKitView webKitView;
        if ((interfaceC60761Nsz instanceof WebKitView) && interfaceC60761Nsz != null && (webKitView = (WebKitView) interfaceC60761Nsz) != null) {
            webKitView.setOnTouchListener(new ViewOnTouchListenerC25960AGu((CreatorCenterFragment) iDbS494S0100000_4.l0));
            webKitView.setWebOverScrollByListener(new C25961AGv((CreatorCenterFragment) iDbS494S0100000_4.l0));
        }
    }

    public static final void LJJJJIZL$0(IDbS494S0100000_4 iDbS494S0100000_4, InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        Integer num;
        String str;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        C188727au c188727au = new C188727au();
        DynamicDialog dynamicDialog = ((DynamicPopupTask) iDbS494S0100000_4.l0).LJLJJL;
        Integer num2 = null;
        if (dynamicDialog != null) {
            num = Integer.valueOf(dynamicDialog.LIZ);
        } else {
            num = null;
        }
        c188727au.LJFF(num, "touch_point_id");
        DynamicDialog dynamicDialog2 = ((DynamicPopupTask) iDbS494S0100000_4.l0).LJLJJL;
        if (dynamicDialog2 != null) {
            str = dynamicDialog2.LIZIZ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("touch_point_name", str);
        DynamicDialog dynamicDialog3 = ((DynamicPopupTask) iDbS494S0100000_4.l0).LJLJJL;
        if (dynamicDialog3 != null) {
            num2 = dynamicDialog3.LIZJ;
        }
        c188727au.LJFF(num2, "launch_plan_id");
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, ((DynamicPopupTask) iDbS494S0100000_4.l0).LJLIL);
        c188727au.LJIIIZ("reason", c60704Ns4.LIZIZ);
        FMX.LJIIL("dynamic_popup_load_fail", c188727au.LIZ);
    }
}
