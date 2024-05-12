package com.ss.android.ugc.aweme.nows.feed.homepage;

import X.C222588oQ;
import X.InterfaceC212878Xb;
import X.InterfaceC212998Xn;
import X.InterfaceC213078Xv;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class NowSingleCardFeedViewHolder<R extends InterfaceC212998Xn<R, ITEM>, ITEM extends InterfaceC213078Xv> extends NowPostCardFeedViewHolder<R, ITEM> {
    public ITEM LJLZ;

    public abstract ITEM LJLIL(Aweme aweme);

    public abstract boolean LJLJI();

    @Override // com.ss.android.ugc.aweme.nows.feed.homepage.NowPostCardFeedViewHolder
    public final ReusedUIAssem<?> LJLIIL() {
        return new NowPostCardRootAssem(false, LJLJI(), this.LJLLILLLL.LJIIIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NowSingleCardFeedViewHolder(C222588oQ params, InterfaceC212878Xb<R, ITEM> interfaceC212878Xb) {
        super(params, interfaceC212878Xb);
        o.LJIIIZ(params, "params");
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.homepage.NowPostCardFeedViewHolder, X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
        LIZLLL(aweme);
        if (aweme == null) {
            return;
        }
        ITEM LJLIL = LJLIL(aweme);
        this.LJLZ = LJLIL;
        LJJZ(i, LJLIL);
    }
}
