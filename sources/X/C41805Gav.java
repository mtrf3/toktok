package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.composer.task.BaseComposeAsyncTask", f = "BaseComposeAsyncTask.kt", l = {15}, m = "run$suspendImpl")
/* renamed from: X.Gav, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41805Gav extends C3CS {
    public AbstractC41806Gaw LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AbstractC41806Gaw<PARAM, RESULT> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41805Gav(AbstractC41806Gaw<PARAM, RESULT> abstractC41806Gaw, InterfaceC67352kd<? super C41805Gav> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = abstractC41806Gaw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return AbstractC41806Gaw.LIZ(this.LJLJI, null, this);
    }
}
