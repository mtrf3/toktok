package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.legacy.source.MAFSource", f = "MAFSource.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "refresh")
/* renamed from: X.XyV, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86583XyV extends C3CS {
    public C86581XyT LJLIL;
    public C86581XyT LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C86581XyT LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86583XyV(C86581XyT c86581XyT, InterfaceC67352kd<? super C86583XyV> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c86581XyT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LLLLLJLJLL(this);
    }
}
