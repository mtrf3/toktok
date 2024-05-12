package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.popup.PopupWeaver", f = "PopupWeaver.kt", l = {105}, m = "loop")
/* renamed from: X.8Rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211488Rs extends C3CS {
    public C211498Rt LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C211498Rt LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C211488Rs(C211498Rt c211498Rt, InterfaceC67352kd<? super C211488Rs> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c211498Rt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(this);
    }
}
