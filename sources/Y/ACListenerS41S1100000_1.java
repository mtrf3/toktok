package Y;

import X.ActivityC45651qj;
import X.C05040Hs;
import X.C101573yj;
import X.C188727au;
import X.C201467vS;
import X.C2S9;
import X.C85583Xm;
import X.FMX;
import X.HG3;
import X.InterfaceC65784Pro;
import X.InterfaceC85603Xo;
import X.RBX;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACListenerS41S1100000_1 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS41S1100000_1 aCListenerS41S1100000_1, View view) {
        Aweme aweme = (Aweme) aCListenerS41S1100000_1.l1;
        String str = aCListenerS41S1100000_1.s0;
        C188727au c188727au = new C188727au();
        C201467vS.LIZIZ(c188727au, aweme);
        C201467vS.LIZLLL(c188727au, aweme);
        C201467vS.LIZ(c188727au, aweme);
        c188727au.LJI("enter_from", str);
        FMX.LJIIL("tap_photo_tag", c188727au.LIZ);
    }

    public static final void onClick$1(ACListenerS41S1100000_1 aCListenerS41S1100000_1, View view) {
        InterfaceC85603Xo interfaceC85603Xo = ((C85583Xm) aCListenerS41S1100000_1.l1).LJLILLLLZI;
        if (interfaceC85603Xo != null) {
            interfaceC85603Xo.LIZ(aCListenerS41S1100000_1.s0);
        }
    }

    public static final void onClick$2(ACListenerS41S1100000_1 aCListenerS41S1100000_1, View view) {
        SmartRouter.buildRoute(((C2S9) aCListenerS41S1100000_1.l1).getContext(), aCListenerS41S1100000_1.s0).open();
    }

    public static final void onClick$3(ACListenerS41S1100000_1 aCListenerS41S1100000_1, View view) {
        String str = aCListenerS41S1100000_1.s0;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "single_song");
        c188727au.LJIIIZ("music_id", str);
        FMX.LJIIL("music_detail_link_click", c188727au.LIZ);
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        C05040Hs.LJ(SmartRouter.buildRoute((ActivityC45651qj) aCListenerS41S1100000_1.l1, "aweme://music/detail/"), "id", aCListenerS41S1100000_1.s0, "process_id", uuid);
    }

    public static final void onClick$4(ACListenerS41S1100000_1 aCListenerS41S1100000_1, View view) {
        SessionListTopNoticeViewModel sessionListTopNoticeViewModel = (SessionListTopNoticeViewModel) aCListenerS41S1100000_1.l1;
        String sourceType = aCListenerS41S1100000_1.s0;
        sessionListTopNoticeViewModel.getClass();
        o.LJIIIZ(sourceType, "sourceType");
        C101573yj.LIZLLL(C101573yj.LIZ, "notification_page", "inbox_top", 1);
        sessionListTopNoticeViewModel.kv0(sourceType);
        List<String> list = SessionListTopNoticeViewModel.LLD;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        ((ArrayList) list).add(curUserId);
    }

    public static final void onClick$5(ACListenerS41S1100000_1 aCListenerS41S1100000_1, View view) {
        ((SessionListTopNoticeViewModel) aCListenerS41S1100000_1.l1).kv0(aCListenerS41S1100000_1.s0);
    }

    public static final void onClick$6(ACListenerS41S1100000_1 aCListenerS41S1100000_1, View view) {
        String str = aCListenerS41S1100000_1.s0;
        if (str == null || str.length() == 0) {
            return;
        }
        ((InterfaceC65784Pro) aCListenerS41S1100000_1.l1).invoke();
    }

    public ACListenerS41S1100000_1(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
