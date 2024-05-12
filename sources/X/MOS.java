package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.creator.repo.CreatorNoticeRepository$operator$1", f = "CreatorNoticeRepository.kt", l = {75}, m = "getNoticeList")
/* loaded from: classes10.dex */
public final class MOS extends C3CS {
    public MT7 LJLIL;
    public C68322mC LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ MOR LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MOS(MOR mor, InterfaceC67352kd<? super MOS> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = mor;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LLIIIILZ(0, null, null, null, null, 0, 0, false, false, null, this);
    }
}
