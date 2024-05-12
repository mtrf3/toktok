package X;

import com.ss.android.ugc.aweme.api.ISocial2TabVisitApi;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LAT {
    public static final ISocial2TabVisitApi LIZ;
    public static final C62822Ol8 LIZIZ;

    static {
        Object obj;
        String str = EFJ.LIZJ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(ISocial2TabVisitApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        LIZ = (ISocial2TabVisitApi) obj;
        LIZIZ = C221108m2.LIZIZ(C53232Kuq.LJLIL);
    }

    public static int LIZ(String str) {
        String str2;
        int hashCode = str.hashCode();
        if (hashCode != -1525083535) {
            if (hashCode != -1309089240) {
                if (hashCode == -734952021) {
                    str2 = "FRIENDS_TAB";
                }
            } else {
                str2 = "FRIENDS_FEED";
            }
            str.equals(str2);
        } else if (str.equals("Following")) {
            return 3;
        }
        return 1;
    }

    public static void LIZIZ(String tag) {
        AbstractC73672Svk<BaseResponse> visitFriendsFeedV1;
        o.LJIIIZ(tag, "tag");
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            ArrayList<Integer> sv = LHM.LIZIZ.LIZIZ().redDotLogic().sv();
            ISocial2TabVisitApi iSocial2TabVisitApi = LIZ;
            Integer valueOf = Integer.valueOf(LIZ(tag));
            String LIZJ = C75792yF.LIZJ(sv);
            o.LJIIIIZZ(LIZJ, "toJson(feeds)");
            visitFriendsFeedV1 = iSocial2TabVisitApi.visitSocial2Tab(valueOf, LIZJ);
        } else {
            visitFriendsFeedV1 = LIZ.visitFriendsFeedV1();
        }
        visitFriendsFeedV1.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C53749L7p.LJLIL, C53750L7q.LJLIL);
    }
}
