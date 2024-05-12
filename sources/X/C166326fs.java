package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.basepipeline.Pipeline", f = "Pipeline.kt", l = {33}, m = "acceptAsync")
/* renamed from: X.6fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166326fs extends C3CS {
    public AbstractC166316fr LJLIL;
    public C166286fo LJLILLLLZI;
    public InterfaceC166346fu LJLJI;
    public C34K LJLJJI;
    public Object LJLJJL;
    public AbstractC166306fq LJLJJLL;
    public C34K LJLJL;
    public C34K LJLJLJ;
    public int LJLJLLL;
    public /* synthetic */ Object LJLL;
    public final /* synthetic */ AbstractC166316fr<T> LJLLI;
    public int LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166326fs(AbstractC166316fr<T> abstractC166316fr, InterfaceC67352kd<? super C166326fs> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLI = abstractC166316fr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLL = obj;
        this.LJLLILLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLI.LIZIZ(null, null, this);
    }
}
