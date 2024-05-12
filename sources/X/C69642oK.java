package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.sync.StorageSyncer", f = "StorageSyncer.kt", l = {C61447O9r.LJIIJ, C61447O9r.LJIIJ}, m = "triggerFullUpdate")
/* renamed from: X.2oK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69642oK extends C3CS {
    public boolean LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C69622oI LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69642oK(C69622oI c69622oI, InterfaceC67352kd<? super C69642oK> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c69622oI;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, false, this);
    }
}
