package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.CommentStateManager", f = "CommentStateManager.kt", l = {28}, m = "queryCommentAweme")
/* renamed from: X.3II, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3II extends C3CS {
    public CommentContent LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3IH LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3II(C3IH c3ih, InterfaceC67352kd<? super C3II> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c3ih;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, this);
    }
}
