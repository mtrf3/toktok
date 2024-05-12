package X;

import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.hotword.HotWordGiftViewModel", f = "HotWordGiftViewModel.kt", l = {382, 405}, m = "findMatches")
/* renamed from: X.2ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67522ku extends C3CS {
    public HotWordGiftViewModel LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ HotWordGiftViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67522ku(HotWordGiftViewModel hotWordGiftViewModel, InterfaceC67352kd<? super C67522ku> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = hotWordGiftViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(null, this);
    }
}
