package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.basepipeline.PipelineHandler", f = "PipelineHandler.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "handle")
/* renamed from: X.6ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166336ft extends C3CS {
    public AbstractC166306fq LJLIL;
    public C166286fo LJLILLLLZI;
    public InterfaceC166346fu LJLJI;
    public AbstractC166306fq LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ AbstractC166306fq<T> LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166336ft(AbstractC166306fq<T> abstractC166306fq, InterfaceC67352kd<? super C166336ft> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = abstractC166306fq;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZJ(null, null, this);
    }
}
