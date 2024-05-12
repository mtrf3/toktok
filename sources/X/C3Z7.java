package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.vcloud.vctrace.BuildConfig;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {BuildConfig.VERSION_CODE}, m = "doIMUserBaseInfoDBUpdate")
/* renamed from: X.3Z7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z7 extends C3CS {
    public C85913Yt LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C85913Yt LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Z7(C85913Yt c85913Yt, InterfaceC67352kd<? super C3Z7> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(null, this);
    }
}
