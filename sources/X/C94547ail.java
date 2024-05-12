package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ugc.effectcreator.main.MainFragment;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment", f = "MainFragment.kt", l = {359}, m = "draftIconCacheRestore")
/* renamed from: X.ail, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94547ail extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ MainFragment LJLJI;
    public Object LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94547ail(MainFragment mainFragment, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = mainFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.Hl(null, null, this);
    }
}
