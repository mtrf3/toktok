package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.detail.api.GetMovieVideosQuery", f = "GetMovieVideosQuery.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "operate")
/* renamed from: X.7s3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199357s3 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C199307ry LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199357s3(C199307ry c199307ry, InterfaceC67352kd<? super C199357s3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c199307ry;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
