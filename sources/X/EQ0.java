package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.wavepublish.normal.MobileEffectUploadTask", f = "MobileEffectUploadTask.kt", l = {138}, m = "buildPublishEventTrackingData")
/* loaded from: classes7.dex */
public final class EQ0 extends C3CS {
    public UploadableDraftEffect LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ ERH LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQ0(ERH erh, InterfaceC67352kd<? super EQ0> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = erh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIIJJI(null, this);
    }
}
