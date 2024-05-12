package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ext.RecUserContactAccessHelper", f = "RecUserContactAccessHelper.kt", l = {46}, m = "setupContactState")
/* renamed from: X.LUq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54348LUq extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57576Mii LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54348LUq(C57576Mii c57576Mii, InterfaceC67352kd<? super C54348LUq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57576Mii;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(null, null, this);
    }
}
