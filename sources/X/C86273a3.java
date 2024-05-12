package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.search.IMSearchEngine", f = "IMSearchEngine.kt", l = {86, 88, 103, 105, 121, 123, 138, UserLevelGeckoUpdateSetting.DEFAULT, 155}, m = "doQuery")
/* renamed from: X.3a3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86273a3 extends C3CS {
    public C86233Zz LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public long LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ C86233Zz<SEARCH_RESULT> LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86273a3(InterfaceC67352kd interfaceC67352kd, C86233Zz c86233Zz) {
        super(interfaceC67352kd);
        this.LJLJLLL = c86233Zz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LIZJ(null, null, null, null, this);
    }
}
