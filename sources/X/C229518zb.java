package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.mix.api.GetMixVideoListQuery", f = "GetMixVideoListQuery.kt", l = {26}, m = "operate")
/* renamed from: X.8zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229518zb extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C229508za LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C229518zb(C229508za c229508za, InterfaceC67352kd<? super C229518zb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c229508za;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
