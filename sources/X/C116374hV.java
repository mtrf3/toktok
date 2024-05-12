package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.processor.SkyLightBaseDataModule", f = "SkyLightBaseDataModule.kt", l = {31, 31, 31, 31}, m = "process")
/* renamed from: X.4hV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116374hV extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AbstractC116364hU<T> LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116374hV(AbstractC116364hU<T> abstractC116364hU, InterfaceC67352kd<? super C116374hV> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = abstractC116364hU;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJ(this);
    }
}
