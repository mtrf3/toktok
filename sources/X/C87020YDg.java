package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import defpackage.d;
import kotlin.jvm.internal.o;

/* renamed from: X.YDg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87020YDg extends d {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        boolean z;
        o.LJIIIZ(type, "type");
        String LJJIFFI = CommonFeedApiService.LIZ().LJJIFFI();
        if (LJJIFFI == null || LJJIFFI.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJJIFFI = "";
        }
        String LLLLIIIILLL = SearchServiceImpl.LLLZI().LLLLIIIILLL();
        XBaseModel LIZJ = ED5.LIZJ(d.c.class, null);
        d.c cVar = (d.c) LIZJ;
        cVar.setFromGroupId(LJJIFFI);
        cVar.setHistoryList(LLLLIIIILLL);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
