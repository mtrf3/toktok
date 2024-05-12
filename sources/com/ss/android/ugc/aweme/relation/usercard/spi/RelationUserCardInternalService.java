package com.ss.android.ugc.aweme.relation.usercard.spi;

import X.C57780Mm0;
import X.C57859MnH;
import X.C57865MnN;
import X.C57928MoO;
import X.C57934MoU;
import X.C57935MoV;
import X.InterfaceC25772A9o;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RelationUserCardInternalService implements IRelationUserCardInternalService {
    @Override // com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService
    public final C57934MoU LIZ(C57859MnH config) {
        o.LJIIIZ(config, "config");
        return new C57934MoU(new C57935MoV(config, false));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService
    public final C57780Mm0 LIZJ(C57859MnH c57859MnH) {
        return new C57780Mm0(new C57935MoV(c57859MnH, true));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService
    public final InterfaceC25772A9o LIZIZ(C57859MnH c57859MnH, int i) {
        InterfaceC25772A9o c57865MnN;
        if (i == 1) {
            c57865MnN = new C57928MoO();
        } else {
            c57865MnN = new C57865MnN();
        }
        if (c57859MnH != null) {
            c57865MnN.setConfigInner(c57859MnH);
        }
        return c57865MnN;
    }
}
