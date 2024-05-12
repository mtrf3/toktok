package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.GroupSearchContentUpdateEngine", f = "GroupSearchContentUpdateEngine.kt", l = {234, 237, 246}, m = "fullUpdate")
/* renamed from: X.3Q3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Q3 extends C3CS {
    public C83593Pv LJLIL;
    public C3QC LJLILLLLZI;
    public Object LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C83593Pv LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Q3(C83593Pv c83593Pv, InterfaceC67352kd<? super C3Q3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c83593Pv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZ(this);
    }
}
