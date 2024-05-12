package X;

import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.8gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217938gv {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C217948gw.LJLIL);

    public static SearchUserSugResponse LIZ(String keyword, java.util.Set fetchedUidSet) {
        Integer num;
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(fetchedUidSet, "fetchedUidSet");
        List LLJI = ORZ.LLJI(fetchedUidSet);
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        C250859sv c250859sv = new C250859sv(6L, null, keyword, "at_user", 20L, LLJI, num);
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-searchService>(...)");
        return ((ISearchUserService) value).LIZLLL(c250859sv);
    }

    public static SearchUserSugResponse LIZIZ(String keyword, java.util.Set fetchedUidSet) {
        Integer num;
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(fetchedUidSet, "fetchedUidSet");
        List LLJI = ORZ.LLJI(fetchedUidSet);
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        C250859sv c250859sv = new C250859sv(6L, null, keyword, "at_user", 20L, LLJI, num);
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-searchService>(...)");
        return ((ISearchUserService) value).LIZLLL(c250859sv);
    }
}
