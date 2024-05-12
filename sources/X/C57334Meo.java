package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.api.DeletePinnedAwemeMutation", f = "DeletePinnedAwemeMutation.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "operate")
/* renamed from: X.Meo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57334Meo extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57333Men LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57334Meo(C57333Men c57333Men, InterfaceC67352kd<? super C57334Meo> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57333Men;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
