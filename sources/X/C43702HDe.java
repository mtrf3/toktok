package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl", f = "EditServiceImpl.kt", l = {270}, m = "basicIntent")
/* renamed from: X.HDe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43702HDe extends C3CS {
    public EditConfig LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C43699HDb LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43702HDe(C43699HDb c43699HDb, InterfaceC67352kd<? super C43702HDe> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c43699HDb;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, this);
    }
}
