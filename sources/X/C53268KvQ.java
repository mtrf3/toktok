package X;

import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.KvQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53268KvQ {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C52980Kqm.LJLIL);

    public static String LIZ() {
        int i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) LIZ.getValue()) {
            if (o.LJ(obj, "use_rec_notice_follow_page")) {
                i = ((Number) C53270KvS.LIZ.getValue()).intValue();
            } else {
                i = 0;
            }
            arrayList.add(C113554cx.LJJL(new OSZ("key", obj), new OSZ("value", String.valueOf(i))));
        }
        String LIZLLL = JsonParseUtils.LIZLLL(arrayList);
        o.LJIIIIZZ(LIZLLL, "toJSONString(map)");
        return LIZLLL;
    }
}
