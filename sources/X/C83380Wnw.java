package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.bot.ActionAIComponent", f = "ActionAIComponent.kt", l = {372}, m = "getAutoCutFrameTos")
/* renamed from: X.Wnw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83380Wnw extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C83374Wnq LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83380Wnw(C83374Wnq c83374Wnq, InterfaceC67352kd<? super C83380Wnw> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c83374Wnq;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.ra(this);
    }
}
