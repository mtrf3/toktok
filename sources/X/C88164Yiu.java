package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.decorator.IMUserDaoErrorReporter", f = "ImUserDaoErrorReporter.kt", l = {191}, m = "getAllUids")
/* renamed from: X.Yiu, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88164Yiu extends C3CS {
    public C88156Yim LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C88156Yim LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88164Yiu(C88156Yim c88156Yim, InterfaceC67352kd<? super C88164Yiu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c88156Yim;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(this);
    }
}