package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.RefreshAmazonAccessTokenMutation", f = "RefreshAmazonAccessTokenMutation.kt", l = {18}, m = "operate")
/* renamed from: X.al7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94693al7 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94487ahn LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94693al7(C94487ahn c94487ahn, InterfaceC67352kd<? super C94693al7> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94487ahn;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
