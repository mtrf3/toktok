package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.RefreshAppleMusicAccessTokenMutation", f = "RefreshAppleMusicAccessTokenMutation.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "operate")
/* renamed from: X.al8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94694al8 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94489ahp LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94694al8(C94489ahp c94489ahp, InterfaceC67352kd<? super C94694al8> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94489ahp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
