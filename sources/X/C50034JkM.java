package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.JkM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50034JkM implements InterfaceC50022JkA {
    @Override // X.InterfaceC50022JkA
    public final m LJJLIIJ(C50031JkJ param) {
        o.LJIIIZ(param, "param");
        try {
            m mVar = SearchApi.LIZ().searchPlaceList(param.LIZ, param.LJIIIIZZ, param.LJIIIZ, param.LIZJ, param.LJI, param.LJII, param.LJIJI, param.LJJIIJ, param.LJJIIZ, param.LJJIIZI, param.LJJIJ).get();
            o.LJIIIIZZ(mVar, "RETROFIT.searchPlaceList…ionId\n            ).get()");
            return mVar;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }
}
