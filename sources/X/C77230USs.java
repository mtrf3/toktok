package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.contact.ContactUploadAuthProcessor", f = "ContactUploadAuthProcessor.kt", l = {20}, m = "process")
/* renamed from: X.USs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77230USs extends C3CS {
    public C77226USo LJLIL;
    public C77211URz LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C77226USo LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77230USs(C77226USo c77226USo, InterfaceC67352kd<? super C77230USs> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c77226USo;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
