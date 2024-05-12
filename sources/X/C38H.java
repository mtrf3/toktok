package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.profile.model.User;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {282}, m = "assembleMafInfo")
/* renamed from: X.38H, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38H<T extends User> extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C38C LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38H(C38C c38c, InterfaceC67352kd<? super C38H> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c38c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZ(null, null, this);
    }
}
