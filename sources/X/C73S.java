package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.now.interaction.assem.CommentListVM;
import com.ss.android.ugc.now.interaction.model.CommentCursor;

@InterfaceC65848Psq(c = "com.ss.android.ugc.now.interaction.assem.CommentListVM", f = "CommentListVM.kt", l = {UserLevelGeckoUpdateSetting.DEFAULT}, m = "fetchCommentList")
/* renamed from: X.73S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73S extends C3CS {
    public CommentListVM LJLIL;
    public CommentCursor LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ CommentListVM LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73S(CommentListVM commentListVM, InterfaceC67352kd<? super C73S> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = commentListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.gv0(null, null, null, this);
    }
}
