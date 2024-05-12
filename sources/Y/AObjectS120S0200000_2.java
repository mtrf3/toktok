package Y;

import X.C05040Hs;
import X.C5MM;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.ProgressDialogC173686rk;
import android.app.Activity;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;

/* loaded from: classes3.dex */
public class AObjectS120S0200000_2 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS120S0200000_2 aObjectS120S0200000_2, Object obj) {
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) aObjectS120S0200000_2.l0;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aObjectS120S0200000_2.l1;
        Boolean bool = (Boolean) obj;
        vEChooseVideoCoverFragment.getClass();
        if (bool != null && bool.booleanValue() && vEChooseVideoCoverFragment.LJLLL != null) {
            ProgressDialogC173686rk progressDialogC173686rk = vEChooseVideoCoverFragment.LJZI;
            if (progressDialogC173686rk != null) {
                progressDialogC173686rk.dismiss();
                vEChooseVideoCoverFragment.Al(false);
            }
            vEChooseVideoCoverFragment.LJLLILLLL.removeCallbacksAndMessages(null);
            vEChooseVideoCoverFragment.LJLLL.LJIIIZ().setValue(C5MM.LIZJ());
            vEChooseVideoCoverFragment.LJLLL.getEditor().LLJILJIL(false);
            vEChooseVideoCoverFragment.LJLLL.LJIIIZ().setValue(C5MM.LIZ());
            if (vEChooseVideoCoverFragment.getFragmentManager() == null) {
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Boolean.FALSE);
                }
            } else {
                vEChooseVideoCoverFragment.Gl();
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Boolean.TRUE);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS120S0200000_2 aObjectS120S0200000_2, Object obj) {
        String str;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS120S0200000_2.l0;
        Activity activity = (Activity) aObjectS120S0200000_2.l1;
        if (!TextUtils.equals(videoPublishContainerScene.LLILZLL.creativeModel.paidContentModel.getEntryPoint(), "")) {
            str = videoPublishContainerScene.LLILZLL.creativeModel.paidContentModel.getEntryPoint();
        } else {
            str = "feed";
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "aweme://paidcontent/series/post");
        buildRoute.withParam("edit_model", (Parcelable) videoPublishContainerScene.LLILZLL);
        buildRoute.withParam("creative_model", videoPublishContainerScene.LLILZLL.creativeModel);
        buildRoute.withParam("is_from_publish", true);
        C05040Hs.LJ(buildRoute, "enter_from", videoPublishContainerScene.LLILZLL.enterFrom, "entry_point", str);
        return null;
    }

    public AObjectS120S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
