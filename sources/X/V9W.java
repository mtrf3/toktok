package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.lynx.tasm.ui.image.FlattenUIImage;
import com.lynx.tasm.ui.image.UIImage;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V9W {
    public static void LIZIZ() {
        try {
            Class.forName(FlattenUIImage.class.getName());
            Class.forName(V9H.class.getName());
            Class.forName(UIImage.class.getName());
            Class.forName(C78731Uv9.class.getName());
            Class.forName(V9P.class.getName());
            Class.forName(V9X.class.getName());
            Class.forName(C78732UvA.class.getName());
            Class.forName(V9K.class.getName());
            Class.forName(EnumC78943UyZ.class.getName());
            Class.forName(C117434jD.class.getName());
            Class.forName(AbstractC81686W4c.class.getName());
            Class.forName(C81705W4v.class.getName());
            Class.forName(W4V.class.getName());
            Class.forName(C79077V1t.class.getName());
            Class.forName(V8L.class.getName());
            Class.forName(V92.class.getName());
            Class.forName(C80627Vkd.class.getName());
            Class.forName(C80629Vkf.class.getName());
            Class.forName(C80603VkF.class.getName());
            Class.forName(V93.class.getName());
            Class.forName(C79265V8z.class.getName());
            Class.forName(C80628Vke.class.getName());
            Class.forName(V94.class.getName());
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void LIZ(Activity launcher, C98563ts groupSessionInfo, int i, boolean z) {
        o.LJIIIZ(launcher, "launcher");
        o.LJIIIZ(groupSessionInfo, "groupSessionInfo");
        SmartRoute buildRoute = SmartRouter.buildRoute(launcher, "//im/group/chat_detail");
        buildRoute.withParam("key_session_info", groupSessionInfo);
        buildRoute.withParam("key_is_from_out_push", z);
        buildRoute.open(i);
    }
}
