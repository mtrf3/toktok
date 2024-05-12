package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M0J extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends String>> {
    public static final M0J LJLIL = new M0J();

    public M0J() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends String> invoke() {
        Object obj;
        Object obj2;
        String str;
        OSZ[] oszArr = new OSZ[7];
        if (M0M.LJFF == null) {
            M0M.LJFF = Boolean.valueOf(O3U.LJIILL("tiktok_live_ecommerce_ttmall_v3"));
        }
        String str2 = "1";
        if (o.LJ(M0M.LJFF, Boolean.TRUE)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("is_offline", obj);
        if (M0M.LIZ()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[1] = new OSZ("is_first_install_launch", obj2);
        if (!M0M.LIZIZ()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[2] = new OSZ("is_first_show_mall", str2);
        oszArr[3] = new OSZ("container_name", "spark");
        if (M0M.LJI.length() == 0) {
            M0M.LJI = "1.4.2.6-bugfix";
        }
        oszArr[4] = new OSZ("container_version", M0M.LJI);
        oszArr[5] = new OSZ("lynx_version", C56092Lzs.LIZJ);
        if (M0M.LJII == null) {
            M0M.LJII = O3U.LJIIJ(C38943FQd.LIZ(), "tiktok_live_ecommerce_ttmall_v3");
        }
        Long l = M0M.LJII;
        if (l == null || (str = l.toString()) == null) {
            str = "";
        }
        oszArr[6] = new OSZ("gecko_version_id", str);
        return C113554cx.LJJL(oszArr);
    }
}
