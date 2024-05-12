package X;

import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel", f = "LiveSmallItemBeautyViewModel.kt", l = {141, 142}, m = "emitError")
/* renamed from: X.27h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C532927h extends C3CS {
    public LiveSmallItemBeautyViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532927h(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, InterfaceC67352kd<? super C532927h> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = liveSmallItemBeautyViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.lv0(this);
    }
}
