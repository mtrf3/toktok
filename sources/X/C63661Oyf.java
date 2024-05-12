package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.getcheckinfo.GetMessageCheckInfoUseCase", f = "GetMessageCheckInfoUseCase.kt", l = {73}, m = "fetchMessageCompletenessInfo")
/* renamed from: X.Oyf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63661Oyf extends C3CS {
    public C63120Opw LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C63651OyV LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63661Oyf(C63651OyV c63651OyV, InterfaceC67352kd<? super C63661Oyf> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c63651OyV;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(0, 0L, null, this);
    }
}
