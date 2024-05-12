package com.ss.android.ugc.aweme.net.interceptor;

import X.C38550FBa;
import X.C38551FBb;
import X.C38552FBc;
import X.C38553FBd;
import X.C38555FBf;
import X.C62822Ol8;
import X.C64797Pbt;
import X.F7S;
import X.FBZ;
import X.ORZ;
import com.ss.android.ugc.aweme.ml.api.SmartCDNRankService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CdnScoreInterceptor extends FeedBaseCronetInterceptor {
    @Override // com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor, X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        List<C38555FBf> list;
        List<C38555FBf> list2;
        ArrayList arrayList = new ArrayList();
        SmartCDNRankService.LIZ.getClass();
        C62822Ol8 c62822Ol8 = C38553FBd.LIZIZ;
        Object value = c62822Ol8.getValue();
        o.LJIIIIZZ(value, "<get-instance>(...)");
        C38552FBc acquireCdnScores = ((SmartCDNRankService) value).acquireCdnScores();
        if (acquireCdnScores != null && (list2 = acquireCdnScores.LIZ) != null) {
            arrayList.addAll(list2);
        }
        Object value2 = c62822Ol8.getValue();
        o.LJIIIIZZ(value2, "<get-instance>(...)");
        C38552FBc acquireCdnScores2 = ((SmartCDNRankService) value2).acquireCdnScores();
        if (acquireCdnScores2 != null && (list = acquireCdnScores2.LIZIZ) != null) {
            arrayList.addAll(list);
        }
        String LLD = ORZ.LLD(arrayList, ";", null, null, C38551FBb.LJLIL, 30);
        if (LLD.length() > 0) {
            C64797Pbt<?> intercept = super.intercept(new C38550FBa((F7S) fbz, LLD));
            o.LJIIIIZZ(intercept, "chain: Interceptor.Chain…         }\n            })");
            return intercept;
        }
        C64797Pbt<?> intercept2 = super.intercept(fbz);
        o.LJIIIIZZ(intercept2, "super.intercept(chain)");
        return intercept2;
    }
}
