package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHS {
    public static final YHS LIZ = new YHS();
    public static final Gson LIZIZ = new Gson();

    public static List LIZ(C55063LjH c55063LjH) {
        InterfaceC55062LjG adapter;
        List<Aweme> Q8;
        if (c55063LjH == null || (adapter = c55063LjH.LIZ.getAdapter()) == null || (Q8 = adapter.Q8()) == null) {
            return C61878OQg.INSTANCE;
        }
        return Q8;
    }

    public static String LIZIZ(List list) {
        o.LJIIIZ(list, "list");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(aweme.getAid());
            LIZ2.append(',');
            sb.append(X1D.LIZIZ(LIZ2));
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sv.toString()");
        return sb2;
    }

    public static void LIZJ(C188727au c188727au, YHK rankSessionConfig) {
        o.LJIIIZ(rankSessionConfig, "rankSessionConfig");
        boolean LIZJ = FMX.LIZJ("tt_ad_pitaya_rerank_trace");
        if (!o.LJ(EF7.LJIILIIL, "local_test") && !LIZJ) {
            return;
        }
        c188727au.LIZLLL(rankSessionConfig.LIZ, "trigger_source");
        YHY yhy = rankSessionConfig.LJ;
        if (yhy != null) {
            c188727au.LIZLLL(yhy.LJLIL, "item_count");
            c188727au.LJIIIZ("cur_item_list", yhy.LJLILLLLZI);
            c188727au.LIZLLL(yhy.LJLJI, "cur_index");
        }
        FMX.LJIIL("tt_ad_pitaya_rerank_trace", c188727au.LIZ);
    }
}
