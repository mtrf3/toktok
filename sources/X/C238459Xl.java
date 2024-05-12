package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.LinkExtensionKt", f = "LinkExtension.kt", l = {58}, m = "getShareInfo")
/* renamed from: X.9Xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238459Xl extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;

    public C238459Xl(InterfaceC67352kd<? super C238459Xl> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C238469Xm.LIZ(null, null, this);
    }
}
