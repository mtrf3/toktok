package com.ss.android.ugc.aweme.tools.mvtemplate;

import X.InterfaceC61312at;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordMVViewModel extends BaseJediViewModel<RecordMVState> {
    public Effect LJLJJLL;
    public String LJLJL;
    public ShortVideoContext LJLJLJ;

    public final ShortVideoContext Mv0() {
        ShortVideoContext shortVideoContext = this.LJLJLJ;
        if (shortVideoContext != null) {
            return shortVideoContext;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new RecordMVState(null, null, 3, null);
    }
}
