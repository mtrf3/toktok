package Y;

import X.ActivityC45651qj;
import X.C191937g5;
import X.C192567h6;
import X.C193127i0;
import X.C200477tr;
import X.C2U8;
import X.C62819Ol5;
import X.C73318Sq2;
import X.InterfaceC64592gB;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageResponse;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.service.unlogindigg.UnLoggedDiggResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS7S1201000_3 implements InterfaceC64592gB {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS7S1201000_3 afS7S1201000_3, Object obj) {
        UnLoggedDiggResponse unLoggedDiggResponse = (UnLoggedDiggResponse) obj;
        if (unLoggedDiggResponse.statusCode != 0) {
            ((VideoDiggVM) afS7S1201000_3.l1).qv0(new Exception(unLoggedDiggResponse.statusMsg));
        } else {
            VideoDiggVM videoDiggVM = (VideoDiggVM) afS7S1201000_3.l1;
            videoDiggVM.LJLLI = false;
            String enterFrom = C62819Ol5.LJIILIIL(videoDiggVM.LJLILLLLZI, videoDiggVM.LJLJI, true);
            int i = C200477tr.LIZ[((VideoDiggVM) afS7S1201000_3.l1).ov0().LIZIZ().ordinal()];
            String str = "";
            if (i != 1) {
                if (i == 2) {
                    Context context = ((VideoDiggVM) afS7S1201000_3.l1).getContext();
                    o.LJIIIIZZ(enterFrom, "enterFrom");
                    String str2 = ((VideoDiggVM) afS7S1201000_3.l1).mv0().LJLIL;
                    if (str2 != null) {
                        str = str2;
                    }
                    C193127i0.LIZIZ(context, false, enterFrom, str);
                }
            } else {
                Context context2 = ((VideoDiggVM) afS7S1201000_3.l1).getContext();
                o.LJIIIIZZ(enterFrom, "enterFrom");
                String str3 = ((VideoDiggVM) afS7S1201000_3.l1).mv0().LJLIL;
                if (str3 != null) {
                    str = str3;
                }
                C193127i0.LIZIZ(context2, true, enterFrom, str);
            }
            if (afS7S1201000_3.i3 == 1) {
                ((VideoDiggVM) afS7S1201000_3.l1).ov0().LIZ(afS7S1201000_3.s0);
            } else {
                ((VideoDiggVM) afS7S1201000_3.l1).ov0().LJ(afS7S1201000_3.s0);
            }
        }
        ((C73318Sq2) afS7S1201000_3.l2).dispose();
    }

    public static final void accept$1(AfS7S1201000_3 afS7S1201000_3, Object obj) {
        String str;
        CollectionManageResponse collectionManageResponse = (CollectionManageResponse) obj;
        C192567h6 c192567h6 = new C192567h6();
        c192567h6.LIZLLL = "collection_video";
        c192567h6.LJIILJJIL = String.valueOf((Object) 1);
        if (afS7S1201000_3.i3 == 3) {
            str = "on";
        } else {
            str = "off";
        }
        c192567h6.LJIILL = str;
        c192567h6.LJIILIIL();
        String str2 = collectionManageResponse.collectionId;
        if (str2 == null) {
            str2 = "";
        }
        SmartRoute buildRoute = SmartRouter.buildRoute((ActivityC45651qj) afS7S1201000_3.l1, "aweme://favorite/videos/collections/add/video");
        buildRoute.withParam("collectionId", str2);
        buildRoute.withParam("collectionName", afS7S1201000_3.s0);
        buildRoute.withParam("enterMethod", "create_collection");
        buildRoute.open();
        C2U8.LIZ(new C191937g5((CollectionManageRequest) afS7S1201000_3.l2, "create_collection"));
    }

    public AfS7S1201000_3(int i, Object obj, String str, Object obj2, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
