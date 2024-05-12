package X;

import Y.IDDListenerS101S0200000_3;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.7Dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182397Dv {
    public static void LIZ(Context context, Integer num, String str) {
        if (TextUtils.equals(EF7.LJIILIIL, "local_test") && C45804HyK.LJIJJ(context) != null) {
            C71Y.LIZ("VideoViewAutoPop", str + "  count:" + num);
        }
    }

    public static void LIZIZ(Context context, String enterFrom, boolean z, String aid, DialogInterface.OnDismissListener onDismissListener) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(aid, "aid");
        if (context instanceof ActivityC45651qj) {
            VideoViewHistoryAuthorizationFragment videoViewHistoryAuthorizationFragment = new VideoViewHistoryAuthorizationFragment();
            Bundle bundle = new Bundle();
            bundle.putString("page_type", enterFrom);
            bundle.putBoolean("is_auto_pop", z);
            bundle.putString("aid", aid);
            videoViewHistoryAuthorizationFragment.setArguments(bundle);
            ASL asl = new ASL();
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLILLLL = videoViewHistoryAuthorizationFragment;
            tuxSheet.LJLILLLLZI = new IDDListenerS101S0200000_3(onDismissListener, videoViewHistoryAuthorizationFragment, 0);
            tuxSheet.LJZI = false;
            asl.LJI(0);
            C1DG.LJII((ActivityC45651qj) context, "context.supportFragmentManager", asl.LIZ, "VideoViewHistoryPop");
        }
    }
}
