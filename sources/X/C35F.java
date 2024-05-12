package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.utils.IMSearchLogUtilsKt", f = "IMSearchLogUtils.kt", l = {32}, m = "measureDuration")
/* renamed from: X.35F, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35F<T> extends C3CS {
    public C68322mC LJLIL;
    public C68322mC LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public int LJLJJL;

    public C35F(InterfaceC67352kd<? super C35F> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C35E.LIZ(null, this);
    }
}
