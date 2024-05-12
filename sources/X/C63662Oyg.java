package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.getcheckinfo.GetMessageCheckInfoUseCase", f = "GetMessageCheckInfoUseCase.kt", l = {99}, m = "fetchCheckInfo")
/* renamed from: X.Oyg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63662Oyg extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C63651OyV LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63662Oyg(C63651OyV c63651OyV, InterfaceC67352kd<? super C63662Oyg> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c63651OyV;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, 0L, 0, this);
    }
}
