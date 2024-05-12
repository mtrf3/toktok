package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "animateScrollBy")
/* renamed from: X.1xP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49791xP extends C3CS {
    public C56K LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C49791xP(InterfaceC67352kd<? super C49791xP> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0UW.LIZ(null, 0.0f, null, this);
    }
}
