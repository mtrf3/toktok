package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.SaveDraftByPath", f = "SaveDraftByPath.kt", l = {129}, m = "saveDraft")
/* renamed from: X.Gd3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41937Gd3 extends C3CS {
    public ISaveVideoToDraftListener LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C41935Gd1 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41937Gd3(C41935Gd1 c41935Gd1, InterfaceC67352kd<? super C41937Gd3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c41935Gd1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, null, this);
    }
}
