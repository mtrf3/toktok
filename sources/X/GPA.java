package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftViewInfoHelper", f = "DraftViewInfoHelper.kt", l = {29}, m = "getDraftViewInfoList")
/* loaded from: classes8.dex */
public final class GPA extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ GPB LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPA(GPB gpb, InterfaceC67352kd<? super GPA> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = gpb;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, null, this);
    }
}
