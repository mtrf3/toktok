package com.ss.android.ugc.aweme.comment.viewmodel;

import X.C221108m2;
import X.C5H3;
import X.C70839Rr9;
import X.C74007T2t;
import X.EnumC221088m0;
import X.IHU;
import X.InterfaceC88471Ynr;
import X.TBT;
import X.TC8;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class GifEmojiListViewModel extends JediViewModel<GifEmojiListState> {
    public final TC8 LJLJJLL = new TC8();
    public final C5H3 LJLJL = C221108m2.LIZ(EnumC221088m0.NONE, IHU.LJLIL);
    public final ListMiddleware<GifEmojiListState, GifEmoji, C70839Rr9> LJLJLJ = new ListMiddleware<>(new AqS178S0100000_12(this, 101), new AqS178S0100000_12(this, 102), (InterfaceC88471Ynr) null, 12);

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final GifEmojiListState kv0() {
        return new GifEmojiListState(null, null, null, 7, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        ListMiddleware<GifEmojiListState, GifEmoji, C70839Rr9> listMiddleware = this.LJLJLJ;
        listMiddleware.LJ(new TBT() { // from class: X.T2u
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((GifEmojiListState) obj).getListState();
            }
        }, C74007T2t.LJLIL);
        iv0(listMiddleware);
    }
}
