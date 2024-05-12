package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService", f = "InviteFriendsApi.kt", l = {53}, m = "getSharerInfo")
/* renamed from: X.Lup, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55779Lup extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ InviteFriendsApiService LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55779Lup(InviteFriendsApiService inviteFriendsApiService, InterfaceC67352kd<? super C55779Lup> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = inviteFriendsApiService;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, this);
    }
}
