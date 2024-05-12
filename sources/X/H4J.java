package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.watermark.InternalWatermarkServiceImpl", f = "InternalWatermarkServiceImpl.kt", l = {96}, m = "preloadEffectWatermarkResource")
/* loaded from: classes8.dex */
public final class H4J extends C3CS {
    public VideoPublishEditModel LJLIL;
    public TimeSpeedModelExtension LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ H4H LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H4J(H4H h4h, InterfaceC67352kd<? super H4J> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = h4h;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJI(null, null, null, this);
    }
}
