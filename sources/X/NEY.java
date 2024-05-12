package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.ibe.IBEGeckoPreloadUtil", f = "IBEGeckoPreloadUtil.kt", l = {41, LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "fetchGeckoIfNotExists")
/* loaded from: classes11.dex */
public final class NEY extends C3CS {
    public C59005NDt LJLIL;
    public C58628Mzg LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C59005NDt LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NEY(C59005NDt c59005NDt, InterfaceC67352kd<? super NEY> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c59005NDt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, null, this);
    }
}
