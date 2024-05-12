package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.music.MusicChangeOneAction$selectionUIMicroAction$1", f = "MusicChangeOneAction.kt", l = {50}, m = "onChange")
/* renamed from: X.WpH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83463WpH extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C83451Wp5 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83463WpH(C83451Wp5 c83451Wp5, InterfaceC67352kd<? super C83463WpH> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c83451Wp5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, this);
    }
}
