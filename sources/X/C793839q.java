package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApiUtil", f = "ImApiUtil.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "fetchUserOther")
/* renamed from: X.39q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C793839q extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C793739p LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C793839q(C793739p c793739p, InterfaceC67352kd<? super C793839q> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c793739p;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(null, null, 0, this);
    }
}
