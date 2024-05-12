package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.stickerset.AddedStickerSetListManager", f = "AddedStickerSetListManager.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "onRefresh$aweme_emoji_release")
/* renamed from: X.2rJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71492rJ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C71572rR LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71492rJ(C71572rR c71572rR, InterfaceC67352kd<? super C71492rJ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c71572rR;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIILLIIL(null, this);
    }
}
