package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.video.model.SubOnlyVideoViewModel", f = "SubOnlyVideoViewModel.kt", l = {79}, m = "fetchSubOnlyVideo")
/* renamed from: X.7UC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7UC extends C3CS {
    public SubOnlyVideoViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ SubOnlyVideoViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7UC(SubOnlyVideoViewModel subOnlyVideoViewModel, InterfaceC67352kd<? super C7UC> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = subOnlyVideoViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.gv0(null, this);
    }
}
