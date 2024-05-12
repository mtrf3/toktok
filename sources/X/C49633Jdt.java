package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS174S0100000_8;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder$setupRelationBtn$4", f = "SearchUserViewHolder.kt", l = {765, 767, 769}, m = "invokeSuspend")
/* renamed from: X.Jdt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49633Jdt extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public User LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ SearchUserViewHolder LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49633Jdt(SearchUserViewHolder searchUserViewHolder, InterfaceC67352kd<? super C49633Jdt> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLJI = searchUserViewHolder;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C49633Jdt(this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        User user;
        boolean z;
        String str;
        SearchUserViewHolder searchUserViewHolder;
        InterfaceC49417JaP interfaceC49417JaP;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        user = this.LJLIL;
                        C141335gf.LIZJ(obj);
                        z = ((Boolean) obj).booleanValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    user = this.LJLIL;
                    C141335gf.LIZJ(obj);
                    z = ((Boolean) obj).booleanValue();
                }
            } else {
                user = this.LJLIL;
                C141335gf.LIZJ(obj);
                z = ((Boolean) obj).booleanValue();
            }
        } else {
            C141335gf.LIZJ(obj);
            SearchUserViewHolder searchUserViewHolder2 = this.LJLJI;
            user = searchUserViewHolder2.LLFF;
            if (user == null) {
                return Boolean.TRUE;
            }
            searchUserViewHolder2.i0(C49420JaS.LIZ(user), null);
            z = false;
            if (user.getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue() && !user.isEnableDirectMessage()) {
                SearchUserViewHolder searchUserViewHolder3 = this.LJLJI;
                this.LJLIL = user;
                this.LJLILLLLZI = 1;
                searchUserViewHolder3.getClass();
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                ARI ari = new ARI(searchUserViewHolder3.getContext());
                ari.LJI(R.string.tix, null);
                ari.LJIIIIZZ(R.string.gkb, null);
                C26227ARb LIZIZ = C77413UZt.LIZIZ(searchUserViewHolder3.getContext());
                LIZIZ.LJII = false;
                LIZIZ.LIZ(R.string.tcl);
                LIZIZ.LJIIL = ari;
                LIZIZ.LIZJ(new AqS139S0200000_8(xks, searchUserViewHolder3, 21));
                LIZIZ.LIZLLL(new AqS174S0100000_8(searchUserViewHolder3, 164));
                LIZIZ.LJI().LIZLLL();
                obj = xks.LJIIJJI();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                z = ((Boolean) obj).booleanValue();
            } else if (user.getFollowStatus() == EnumC57435MgR.UNFOLLOW.getValue() && user.getBlockStatus() == 1) {
                SearchUserViewHolder searchUserViewHolder4 = this.LJLJI;
                this.LJLIL = user;
                this.LJLILLLLZI = 2;
                searchUserViewHolder4.getClass();
                XKS xks2 = new XKS(1, C78555UsJ.LJJII(this));
                xks2.LJIIL();
                ARI ari2 = new ARI(searchUserViewHolder4.getContext());
                ari2.LJI(R.string.dsg, null);
                ari2.LJIIIIZZ(R.string.gkb, null);
                C26227ARb LIZIZ2 = C77413UZt.LIZIZ(searchUserViewHolder4.getContext());
                LIZIZ2.LJII = false;
                LIZIZ2.LIZ(R.string.td_);
                LIZIZ2.LJIIL = ari2;
                LIZIZ2.LIZJ(new AqS167S0100000_1(xks2, 228));
                LIZIZ2.LJI().LIZLLL();
                obj = xks2.LJIIJJI();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                z = ((Boolean) obj).booleanValue();
            } else if (user.getFollowStatus() == EnumC57435MgR.FOLLOW_REQUESTED.getValue()) {
                SearchUserViewHolder searchUserViewHolder5 = this.LJLJI;
                this.LJLIL = user;
                this.LJLILLLLZI = 3;
                searchUserViewHolder5.getClass();
                XKS xks3 = new XKS(1, C78555UsJ.LJJII(this));
                xks3.LJIIL();
                if (searchUserViewHolder5.LLIIZ) {
                    Boolean bool = Boolean.TRUE;
                    C3C5.m7constructorimpl(bool);
                    xks3.resumeWith(bool);
                }
                ARI ari3 = new ARI(searchUserViewHolder5.getContext());
                ari3.LJI(R.string.gka, new AqS174S0100000_8(searchUserViewHolder5, 165));
                ari3.LJIIIIZZ(R.string.qes, new AqS174S0100000_8(searchUserViewHolder5, 166));
                C26227ARb LIZIZ3 = C77413UZt.LIZIZ(searchUserViewHolder5.getContext());
                LIZIZ3.LJII = false;
                LIZIZ3.LIZ(R.string.gkc);
                LIZIZ3.LJIIL = ari3;
                LIZIZ3.LIZJ(new AqS139S0200000_8(xks3, searchUserViewHolder5, 22));
                LIZIZ3.LIZLLL(new AqS174S0100000_8(searchUserViewHolder5, 167));
                LIZIZ3.LJI().LIZLLL();
                searchUserViewHolder5.LLIIZ = true;
                obj = xks3.LJIIJJI();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                z = ((Boolean) obj).booleanValue();
            }
        }
        if (user.getFollowStatus() == 1) {
            str = "follow_cancel";
        } else {
            str = "follow";
        }
        C225318sp.LJ(user, str, this.LJLJI.getEnterFrom(), this.LJLJI.a0(), null, null, null);
        if (!z && (interfaceC49417JaP = (searchUserViewHolder = this.LJLJI).LLFZ) != null) {
            interfaceC49417JaP.LIZIZ(searchUserViewHolder.LLIIJI);
        }
        return Boolean.valueOf(z);
    }
}
