package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.repo.MaFUserRepository", f = "MaFUserRepository.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "loadInner")
/* renamed from: X.Mnb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57879Mnb extends C3CS {
    public C57877MnZ LJLIL;
    public C57634Mje LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C57877MnZ LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57879Mnb(C57877MnZ c57877MnZ, InterfaceC67352kd<? super C57879Mnb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c57877MnZ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJ(null, this);
    }
}
