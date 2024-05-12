package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.viewmodel.MentionPostedAndLikeVideoVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.viewmodel.MentionPostedAndLikeVideoVM", f = "MentionPostedAndLikeVideoVM.kt", l = {112, 115, 117, LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "getPostedOrLikeVideos")
/* renamed from: X.SdJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72529SdJ extends C3CS {
    public MentionPostedAndLikeVideoVM LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ MentionPostedAndLikeVideoVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72529SdJ(MentionPostedAndLikeVideoVM mentionPostedAndLikeVideoVM, InterfaceC67352kd<? super C72529SdJ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = mentionPostedAndLikeVideoVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.lv0(0, 0L, null, this);
    }
}
