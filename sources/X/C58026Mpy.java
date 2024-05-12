package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.api.MafUserApiService", f = "MafUserApi.kt", l = {35}, m = "dislike")
/* renamed from: X.Mpy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58026Mpy extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ MafUserApiService LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58026Mpy(MafUserApiService mafUserApiService, InterfaceC67352kd<? super C58026Mpy> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = mafUserApiService;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, 0, 0, this);
    }
}
