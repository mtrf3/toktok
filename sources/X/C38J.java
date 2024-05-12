package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {329, 114}, m = "triggerFullUpdate")
/* renamed from: X.38J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38J extends C3CS {
    public Object LJLIL;
    public XJO LJLILLLLZI;
    public boolean LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C38C LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38J(C38C c38c, InterfaceC67352kd<? super C38J> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c38c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIIIZ(false, this);
    }
}
