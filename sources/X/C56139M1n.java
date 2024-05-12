package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceResCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem", f = "EcVideoGuideAssem.kt", l = {661, 275, 693}, m = "startInterest")
/* renamed from: X.M1n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56139M1n extends C3CS {
    public EcVideoGuideAssem LJLIL;
    public Object LJLILLLLZI;
    public ReachCfg LJLJI;
    public DiversionData LJLJJI;
    public DiversionEntranceResCfg LJLJJL;
    public Object LJLJJLL;
    public Object LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public /* synthetic */ Object LJLLILLLL;
    public final /* synthetic */ EcVideoGuideAssem LJLLJ;
    public int LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56139M1n(EcVideoGuideAssem ecVideoGuideAssem, InterfaceC67352kd<? super C56139M1n> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLJ = ecVideoGuideAssem;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLILLLL = obj;
        this.LJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLJ.C4(this);
    }
}
