package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.data.dao.IMUserBaseInfoDaoErrorReporter", f = "IMUserBaseInfoDaoErrorReporter.kt", l = {34}, m = "insertOrReplaceList")
/* renamed from: X.YjD, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88183YjD extends C3CS {
    public C88176Yj6 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C88176Yj6 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88183YjD(C88176Yj6 c88176Yj6, InterfaceC67352kd<? super C88183YjD> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c88176Yj6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(null, this);
    }
}
