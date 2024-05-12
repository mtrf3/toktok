package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.api.FollowOfflineMutation", f = "FollowOfflineMutation.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "operate")
/* renamed from: X.MeT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57313MeT extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57312MeS LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57313MeT(C57312MeS c57312MeS, InterfaceC67352kd<? super C57313MeT> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57312MeS;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
