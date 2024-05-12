package X;

import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem$onInvite$1$1$success$2$1", f = "AddYoursInviteFriendsAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8iJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218798iJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AddYoursInviteFriendsAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C218798iJ(AddYoursInviteFriendsAssem addYoursInviteFriendsAssem, InterfaceC67352kd<? super C218798iJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = addYoursInviteFriendsAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C218798iJ(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((SY4) this.LJLIL._$_findCachedViewById(R.id.awu)).setLoading(false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
