package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.filter.TTNShareSceneFilter", f = "TTNShareSceneFilter.kt", l = {C61447O9r.LJIIJ}, m = "doFilter")
/* renamed from: X.3EC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EC extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3EB LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3EC(C3EB c3eb, InterfaceC67352kd<? super C3EC> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c3eb;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, this);
    }
}
