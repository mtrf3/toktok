package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.Loader", f = "Loader.kt", l = {LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "applyCollator")
/* renamed from: X.4ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113404ci<D> extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AbstractC113374cf<Object, Object> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113404ci(AbstractC113374cf<Object, Object> abstractC113374cf, InterfaceC67352kd<? super C113404ci> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = abstractC113374cf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(null, this, null);
    }
}
