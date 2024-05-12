package com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.protocol;

import X.AbstractC49300JWm;
import X.C3C8;
import X.C65352Pkq;
import X.C65776Prg;
import X.InterfaceC49025JLx;
import X.InterfaceC65350Pko;
import X.JP9;
import X.JWR;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.ui.SearchCSCardAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCSCardProtocol implements ISearchCardProtocol<JP9> {
    public final C65776Prg LJLIL = C65352Pkq.LIZ(JP9.class);
    public final JWR LJLILLLLZI = new JWR();

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C3C8> k3() {
        return new SearchCSCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC65350Pko<JP9> LLLIZZ() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final AbstractC49300JWm<JP9> getConfig() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean LJJLIL(JP9 item) {
        o.LJIIIZ(item, "item");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC49025JLx LLLLLLJ(JP9 jp9) {
        return jp9;
    }
}
