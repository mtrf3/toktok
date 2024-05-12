package com.bytedance.jedi.arch.ext.list;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C70839Rr9;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.bytedance.jedi.arch.ext.list.IListState;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public abstract class SingleListViewModel<T, S extends IListState<T, C70839Rr9>> extends ListViewModel<T, C70839Rr9, S> {
    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final InterfaceC88472Yns<S, AbstractC73672Svk<OSZ<List<T>, C70839Rr9>>> Iv0() {
        return null;
    }

    public abstract InterfaceC88472Yns<S, AbstractC73638SvC<OSZ<List<T>, C70839Rr9>>> Nv0();

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final InterfaceC88472Yns<S, AbstractC73672Svk<OSZ<List<T>, C70839Rr9>>> Jv0() {
        return new AqS178S0100000_12((SingleListViewModel) this, 96);
    }
}
