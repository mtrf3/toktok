package com.ss.android.ugc.aweme.commercialize.service;

import X.C63081OpJ;
import X.FLE;
import X.InterfaceC55686LtK;
import X.N5T;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceCommonServiceImpl implements ICommerceCommonService {
    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final InterfaceC55686LtK LIZ() {
        return N5T.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final boolean LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return C63081OpJ.LLIIIJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final String LIZJ(String from) {
        o.LJIIIZ(from, "from");
        return FLE.LIZ(from);
    }
}
