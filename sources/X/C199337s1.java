package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.detail.api.GetBookVideosQuery", f = "GetBookVideosQuery.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "operate")
/* renamed from: X.7s1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199337s1 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C199297rx LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199337s1(C199297rx c199297rx, InterfaceC67352kd<? super C199337s1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c199297rx;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
