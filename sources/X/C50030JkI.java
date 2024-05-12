package X;

import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.JkI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50030JkI extends AbstractCallableC49927Jid {
    public final C50031JkJ LJLJI;

    @Override // X.AbstractCallableC49927Jid
    public final Object LIZIZ() {
        boolean z;
        int i;
        LinkedHashMap<String, String> linkedHashMap;
        C50031JkJ param = this.LJLJI;
        o.LJIIIZ(param, "param");
        try {
            SearchApi.RealApi LIZ = SearchApi.LIZ();
            long j = param.LJIIIIZZ;
            String str = param.LIZ;
            String str2 = param.LJIIJ;
            int i2 = param.LJIIIZ;
            int i3 = param.LJ;
            String str3 = param.LIZJ;
            String str4 = param.LJI;
            String str5 = param.LJII;
            int i4 = param.LJFF;
            String str6 = param.LJIIL;
            String str7 = param.LJIILJJIL;
            String str8 = param.LJIILL;
            String str9 = param.LJIJI;
            C50287JoR c50287JoR = param.LJIIJJI;
            if (c50287JoR != null) {
                z = c50287JoR.isDefaultOption();
            } else {
                z = true;
            }
            if (!z) {
                i = 1;
            } else {
                i = 0;
            }
            C50287JoR c50287JoR2 = param.LJIIJJI;
            if (c50287JoR2 == null || (linkedHashMap = c50287JoR2.userToFieldRequestMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            SearchUserList searchUserList = LIZ.searchUserList(j, str, str2, i2, 1, i3, str3, str4, str5, i4, str6, str7, str8, str9, i, linkedHashMap, param.LJJIIJ, param.LJJIIZ, param.LJJIIZI, param.LJJIJ).get();
            o.LJIIIIZZ(searchUserList, "RETROFIT.searchUserList(…ionId\n            ).get()");
            return searchUserList;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }

    public C50030JkI(C50031JkJ c50031JkJ) {
        this.LJLJI = c50031JkJ;
    }
}
