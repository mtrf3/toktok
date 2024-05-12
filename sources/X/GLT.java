package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.AVDraftServiceImpl", f = "AVDraftServiceImpl.kt", l = {122}, m = "updateDraftSticker")
/* loaded from: classes8.dex */
public final class GLT extends C3CS {
    public DialogC25756A8y LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C41415GNf LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLT(C41415GNf c41415GNf, InterfaceC67352kd<? super GLT> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c41415GNf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, null, this);
    }
}
