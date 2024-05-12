package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.GetAccessTokenMutation", f = "GetAccessTokenMutation.kt", l = {21}, m = "operate")
/* renamed from: X.al3, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94689al3 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94479ahf LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94689al3(C94479ahf c94479ahf, InterfaceC67352kd<? super C94689al3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94479ahf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
