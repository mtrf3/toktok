package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.RelationModelFilterHelper", f = "RelationModelFilterHelper.kt", l = {105, 112, 116, LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "fetchShareState")
/* renamed from: X.3FN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FN extends C3CS {
    public Object LJLIL;
    public InterfaceC88472Yns LJLILLLLZI;
    public Object LJLJI;
    public ShareStateResponse LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C3FK LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3FN(C3FK c3fk, InterfaceC67352kd<? super C3FN> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c3fk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZ(null, null, null, this);
    }
}
