package X;

import Y.IDfS131S0100000_10;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.view.CommerceRecommendMusicViewDelegate$inflateRecommendViewV2$1$2$1$invokeSuspend$$inlined$map$1$2", f = "CommerceRecommendMusicViewDelegate.kt", l = {136}, m = "emit")
/* renamed from: X.NEd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59015NEd extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS131S0100000_10 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59015NEd(IDfS131S0100000_10 iDfS131S0100000_10, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS131S0100000_10;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}