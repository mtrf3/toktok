package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.v2.CaptionTextManager", f = "CaptionTextManager.kt", l = {169, 175, 183, 187, 193}, m = "insertCaption")
/* loaded from: classes14.dex */
public final class UO6 extends C3CS {
    public UO1 LJLIL;
    public Object LJLILLLLZI;
    public C77105UNx LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ UO1 LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UO6(UO1 uo1, InterfaceC67352kd<? super UO6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = uo1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZLLL(null, null, this);
    }
}
