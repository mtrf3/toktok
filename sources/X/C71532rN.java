package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.FavStickerListManager", f = "FavStickerListManager.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48, 51, BaseNotice.CREATOR}, m = "onLoadMore$aweme_emoji_release")
/* renamed from: X.2rN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71532rN extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C71512rL LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71532rN(C71512rL c71512rL, InterfaceC67352kd<? super C71532rN> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c71512rL;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJJII(null, this);
    }
}
