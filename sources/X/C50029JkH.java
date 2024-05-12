package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.JkH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50029JkH implements InterfaceC50022JkA {
    @Override // X.InterfaceC50022JkA
    public final m LJJLIIJ(C50031JkJ param) {
        int i;
        int i2;
        LinkedHashMap<String, Integer> linkedHashMap;
        o.LJIIIZ(param, "param");
        try {
            SearchApi.RealApi LIZ = SearchApi.LIZ();
            long j = param.LJIIIIZZ;
            String str = param.LIZ;
            String str2 = param.LJIIJ;
            int i3 = param.LJIIIZ;
            int i4 = param.LJ;
            String str3 = param.LJI;
            String str4 = param.LJII;
            String str5 = param.LIZJ;
            int i5 = param.LJFF;
            C50287JoR c50287JoR = param.LJIIJJI;
            int i6 = 1;
            if (c50287JoR == null || c50287JoR.isDefaultOption()) {
                i6 = 0;
            }
            C50287JoR c50287JoR2 = param.LJIIJJI;
            if (c50287JoR2 != null) {
                i = c50287JoR2.getFilterBy();
            } else {
                i = 0;
            }
            C50287JoR c50287JoR3 = param.LJIIJJI;
            if (c50287JoR3 != null) {
                i2 = c50287JoR3.getSortType();
            } else {
                i2 = 0;
            }
            C50287JoR c50287JoR4 = param.LJIIJJI;
            if (c50287JoR4 == null || (linkedHashMap = c50287JoR4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            m mVar = LIZ.searchDynamicMusicList(j, str, str2, i3, i4, str3, str4, "music", str5, i5, i6, i, i2, linkedHashMap, param.LJIJI, param.LJJIIJ, param.LJJIIZ, param.LJJIIZI, param.LJJIJ).get();
            o.LJIIIIZZ(mVar, "RETROFIT.searchDynamicMu…ionId\n            ).get()");
            return mVar;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }
}
