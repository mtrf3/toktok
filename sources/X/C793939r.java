package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApiUtil", f = "ImApiUtil.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "fetchUserSelf")
/* renamed from: X.39r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C793939r extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C793739p LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C793939r(C793739p c793739p, InterfaceC67352kd<? super C793939r> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c793739p;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZJ(null, null, 0, this);
    }
}
