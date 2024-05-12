package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.SaveDraftByPath", f = "SaveDraftByPath.kt", l = {97}, m = "compressVideo")
/* renamed from: X.Gd2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41936Gd2 extends C3CS {
    public C44512HdU LJLIL;
    public C72242sW LJLILLLLZI;
    public Object LJLJI;
    public VideoSegment LJLJJI;
    public long LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C41935Gd1 LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41936Gd2(C41935Gd1 c41935Gd1, InterfaceC67352kd<? super C41936Gd2> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c41935Gd1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZ(null, null, this);
    }
}
