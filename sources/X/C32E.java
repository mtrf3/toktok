package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadReactionIndicatorFactoryKt", f = "UnreadReactionIndicatorFactory.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40, 51, 56, 64}, m = "getUnreadReactionIndicatorParameters")
/* renamed from: X.32E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32E extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public C63120Opw LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public int LJLJLJ;

    public C32E(InterfaceC67352kd<? super C32E> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C32D.LIZ(null, this);
    }
}
