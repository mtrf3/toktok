package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility", f = "AuthCardListScopeAbility.kt", l = {317, 323, 326}, m = "tryRouteFindFriendsPage")
/* renamed from: X.MpX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57999MpX extends C3CS {
    public AuthCardListScopeAbility LJLIL;
    public EnumC58046MqI LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ AuthCardListScopeAbility LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57999MpX(AuthCardListScopeAbility authCardListScopeAbility, InterfaceC67352kd<? super C57999MpX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = authCardListScopeAbility;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIIIZZ(false, false, null, this);
    }
}
