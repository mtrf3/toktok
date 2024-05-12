package com.ss.android.ugc.aweme.search.pages.result.common.searchrelation.core.ui;

import X.AbstractC49300JWm;
import X.C3C8;
import X.C49331JXr;
import X.C49913JiP;
import X.C65352Pkq;
import X.InterfaceC49025JLx;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchRelationUserCard implements ISearchCardProtocol<C49331JXr> {
    public final C49913JiP LJLIL = new C49913JiP();

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC65350Pko<C49331JXr> LLLIZZ() {
        return C65352Pkq.LIZ(C49331JXr.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C3C8> k3() {
        return new SearchRelationUserAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final AbstractC49300JWm<C49331JXr> getConfig() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean LJJLIL(C49331JXr item) {
        o.LJIIIZ(item, "item");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC49025JLx LLLLLLJ(C49331JXr c49331JXr) {
        return c49331JXr;
    }
}
