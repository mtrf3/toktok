package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftCopy", f = "DraftCopy.kt", l = {170}, m = "copyDraft")
/* renamed from: X.GPg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41468GPg extends C3CS {
    public AwemeDraft LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C41467GPf LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41468GPg(C41467GPf c41467GPf, InterfaceC67352kd<? super C41468GPg> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c41467GPf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, null, null, false, null, null, this);
    }
}
