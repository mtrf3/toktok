package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.utils.NetworkUtilsExtKt", f = "NetworkUtilsExt.kt", l = {29}, m = "checkNetworkWithTimeout")
/* renamed from: X.Ryo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71314Ryo<T> extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;

    public C71314Ryo(InterfaceC67352kd<? super C71314Ryo> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C74172T9c.LIZ(null, this);
    }
}
