package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.consume.model.SearchConsumeModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Y9m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86922Y9m {
    public static SearchConsumeModel LIZ(C86919Y9j consumeData) {
        long j;
        Boolean bool;
        Object obj;
        o.LJIIIZ(consumeData, "consumeData");
        Object obj2 = consumeData.LLIIII.get(YG0.CLICK);
        Boolean bool2 = consumeData.LLFII;
        Boolean bool3 = Boolean.TRUE;
        if (!o.LJ(bool2, bool3) && consumeData.LJLZ == null) {
            if (obj2 instanceof Boolean) {
                obj = obj2;
            } else {
                obj = null;
            }
            if (!o.LJ(obj, bool3)) {
                return null;
            }
        }
        String str = consumeData.LJLIL;
        Long l = consumeData.LJLZ;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        Boolean bool4 = consumeData.LJZI;
        Boolean bool5 = consumeData.LJZL;
        Boolean bool6 = consumeData.LL;
        Boolean bool7 = consumeData.LLD;
        Boolean bool8 = consumeData.LLF;
        Boolean bool9 = consumeData.LLFF;
        Boolean bool10 = consumeData.LLFFF;
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        } else {
            bool = null;
            obj2 = null;
        }
        if (!o.LJ(obj2, bool3) && !o.LJ(consumeData.LLFII, bool3)) {
            bool3 = null;
        }
        Long l2 = consumeData.LLFZ;
        Long l3 = consumeData.LLIFFJFJJ;
        return new SearchConsumeModel(str, Long.valueOf(j), consumeData.LJLLLLLL, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool, bool3, consumeData.LLII, consumeData.LJZ, l3, l2);
    }
}
