package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ext_power_list.AssemListViewModel;

@InterfaceC65848Psq(c = "com.bytedance.ext_power_list.AssemListViewModel", f = "AssemListViewModel.kt", l = {66}, m = "whenLoadLatest")
/* loaded from: classes16.dex */
public final class XMP extends C3CS {
    public AssemListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AssemListViewModel<S, ITEM, Cursor> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XMP(AssemListViewModel<S, ITEM, Cursor> assemListViewModel, InterfaceC67352kd<? super XMP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = assemListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.whenLoadLatest(null, this);
    }
}
