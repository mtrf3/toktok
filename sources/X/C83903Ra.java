package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.CombinedLoader", f = "CombinedLoader.kt", l = {57, 77, 78, 83}, m = "loadInternal$loadList")
/* renamed from: X.3Ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83903Ra<R> extends C3CS {
    public C3RZ LJLIL;
    public Object LJLILLLLZI;
    public AbstractC113374cf LJLJI;
    public boolean LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public int LJLJJLL;

    public C83903Ra(InterfaceC67352kd<? super C83903Ra> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C3RZ.LJIIIIZZ(null, false, this);
    }
}
