package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.music.MusicApplyOneAction$selectionUIMicroAction$1", f = "MusicApplyOneAction.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "onChange")
/* renamed from: X.Wp1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83447Wp1 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C83445Woz LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83447Wp1(C83445Woz c83445Woz, InterfaceC67352kd<? super C83447Wp1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c83445Woz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, this);
    }
}
