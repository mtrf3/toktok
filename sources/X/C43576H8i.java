package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.composer.CreationComposerParser", f = "CreationComposerParser.kt", l = {56}, m = "parse")
/* renamed from: X.H8i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43576H8i extends C3CS {
    public C43575H8h LJLIL;
    public C68322mC LJLILLLLZI;
    public C68322mC LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C43575H8h LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43576H8i(C43575H8h c43575H8h, InterfaceC67352kd<? super C43576H8i> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c43575H8h;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, null, this);
    }
}
