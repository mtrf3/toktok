package Y;

import X.ASQ;
import X.AST;
import X.ASY;
import X.AbstractC183357Hn;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C182407Dw;
import X.C2U8;
import X.C54838Lfe;
import X.C71Y;
import X.C74Z;
import X.C7HT;
import X.C7HW;
import X.FMX;
import X.InterfaceC65784Pro;
import X.X1D;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragment;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragmentV2;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDDListenerS101S0200000_3 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public static final void onDismiss$0(IDDListenerS101S0200000_3 iDDListenerS101S0200000_3, DialogInterface dialogInterface) {
        ((DialogInterface.OnDismissListener) iDDListenerS101S0200000_3.l0).onDismiss(dialogInterface);
        VideoViewHistoryAuthorizationFragment videoViewHistoryAuthorizationFragment = (VideoViewHistoryAuthorizationFragment) iDDListenerS101S0200000_3.l1;
        videoViewHistoryAuthorizationFragment.getClass();
        ActivityC45651qj mo49getActivity = videoViewHistoryAuthorizationFragment.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.hashCode();
        }
        C2U8.LIZ(new C182407Dw(0));
    }

    public static final void onDismiss$1(IDDListenerS101S0200000_3 iDDListenerS101S0200000_3, DialogInterface it) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        ((DialogInterface.OnDismissListener) iDDListenerS101S0200000_3.l0).onDismiss(it);
        VideoViewHistoryAuthorizationFragmentV2 videoViewHistoryAuthorizationFragmentV2 = (VideoViewHistoryAuthorizationFragmentV2) iDDListenerS101S0200000_3.l1;
        o.LJIIIIZZ(it, "it");
        videoViewHistoryAuthorizationFragmentV2.getClass();
        C71Y.LIZ("VideoViewHistoryPopV2", "v2 dismiss");
        AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
        if (o.LJ(LJIIIIZZ, ASY.LIZ)) {
            str = "close";
        } else if (LJIIIIZZ instanceof AbstractC183357Hn) {
            str = "save";
        } else {
            str = "leave_page";
        }
        ActivityC45651qj mo49getActivity = videoViewHistoryAuthorizationFragmentV2.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.hashCode();
        }
        C2U8.LIZ(new C182407Dw(0));
        String str5 = videoViewHistoryAuthorizationFragmentV2.LJLILLLLZI;
        Boolean bool = videoViewHistoryAuthorizationFragmentV2.LJLJJI;
        Boolean bool2 = Boolean.TRUE;
        String str6 = "auto_scene";
        if (o.LJ(bool, bool2)) {
            str2 = "auto_scene";
        } else {
            str2 = "click_bar";
        }
        if (videoViewHistoryAuthorizationFragmentV2.LJLJJLL) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        if (C54838Lfe.LJIIZILJ(AwemeService.LIZ().i6(videoViewHistoryAuthorizationFragmentV2.LJLJJL))) {
            str4 = "story";
        } else {
            str4 = "post";
        }
        C74Z.LJI("video_views_pop_up_click", str5, str2, str, str3, str4, "one_button", null, null, 384);
        if (!videoViewHistoryAuthorizationFragmentV2.LJLJI) {
            if (!o.LJ(videoViewHistoryAuthorizationFragmentV2.LJLJJI, bool2)) {
                str6 = "click_bar";
            }
            VideoViewAuthorizationViewModel videoViewAuthorizationViewModel = (VideoViewAuthorizationViewModel) videoViewHistoryAuthorizationFragmentV2.LJLIL.getValue();
            String str7 = videoViewHistoryAuthorizationFragmentV2.LJLJJL;
            int i2 = 1;
            if (videoViewHistoryAuthorizationFragmentV2.LJLJJLL) {
                i = 1;
            } else {
                i = 2;
            }
            boolean LJ = o.LJ(videoViewHistoryAuthorizationFragmentV2.LJLJJI, bool2);
            String str8 = videoViewHistoryAuthorizationFragmentV2.LJLILLLLZI;
            if (str8 == null) {
                str8 = "";
            }
            videoViewAuthorizationViewModel.hv0(str7, str8, str6, str, i, "two_button", LJ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onDismiss ");
            if (!videoViewHistoryAuthorizationFragmentV2.LJLJJLL) {
                i2 = 2;
            }
            LIZ.append(i2);
            C71Y.LIZ("VideoViewHistoryPopV2", X1D.LIZIZ(LIZ));
        }
    }

    public static final void onDismiss$2(IDDListenerS101S0200000_3 iDDListenerS101S0200000_3, DialogInterface it) {
        String str;
        Map LJJLIL = C113554cx.LJJLIL((Map) iDDListenerS101S0200000_3.l0);
        o.LJIIIIZZ(it, "it");
        AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
        if (LJIIIIZZ instanceof C7HW) {
            ((InterfaceC65784Pro) iDDListenerS101S0200000_3.l1).invoke();
            LJJLIL.put("action_type", "click");
            LJJLIL.put("cancel_type", "");
        } else {
            if (C7HT.LIZ()) {
                ((InterfaceC65784Pro) iDDListenerS101S0200000_3.l1).invoke();
            }
            LJJLIL.put("action_type", "cancel");
            if (LJIIIIZZ instanceof ASY) {
                str = "icon";
            } else {
                str = "other";
            }
            LJJLIL.put("cancel_type", str);
        }
        FMX.LJIIL("recommend_guide_pop_up_click", LJJLIL);
    }

    public IDDListenerS101S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
