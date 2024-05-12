package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.extensions.NetworkUtilsExtKt", f = "NetworkUtilsExt.kt", l = {33}, m = "checkNetworkWithTimeout")
/* renamed from: X.RvU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71108RvU<T> extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;

    public C71108RvU(InterfaceC67352kd<? super C71108RvU> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C74171T9b.LIZ(null, this);
    }
}
