package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler", f = "AIGCPictureHandler.kt", l = {619, 624}, m = "uploadImage")
/* renamed from: X.SbN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72409SbN extends C3CS {
    public AIGCPictureHandler LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public InterfaceC88472Yns LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ AIGCPictureHandler LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72409SbN(AIGCPictureHandler aIGCPictureHandler, InterfaceC67352kd<? super C72409SbN> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = aIGCPictureHandler;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.uploadImage(null, null, null, this);
    }
}
