package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$interceptShareChannelClick$1", f = "FriendsEmptyPageMainSectionVM.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OYH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC62225ObV LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public final /* synthetic */ FriendsEmptyPageMainSectionVM LJLJL;
    public final /* synthetic */ InterfaceC62225ObV LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ Context LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OYH(FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, InterfaceC62225ObV interfaceC62225ObV, String str, String str2, Context context, InterfaceC67352kd<? super OYH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = friendsEmptyPageMainSectionVM;
        this.LJLJLJ = interfaceC62225ObV;
        this.LJLJLLL = str;
        this.LJLL = str2;
        this.LJLLI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new OYH(this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        InterfaceC62225ObV interfaceC62225ObV;
        String str2;
        String str3;
        Context context;
        String str4;
        User curUser;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJLL;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LJLJJL;
                context = (Context) this.LJLJJI;
                str3 = (String) this.LJLJI;
                str2 = (String) this.LJLILLLLZI;
                interfaceC62225ObV = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = this.LJLJL;
            String key = this.LJLJLJ.key();
            friendsEmptyPageMainSectionVM.getClass();
            User curUser2 = ((RBX) HG3.LJIILL()).getCurUser();
            str = "https://m.tiktok.com/invitef/download";
            if (C38354F3m.LJ("https://m.tiktok.com/invitef/download")) {
                str = " ";
            } else {
                if (C38354F3m.LJ(key)) {
                    key = CardStruct.IStatusCode.DEFAULT;
                }
                try {
                    str = UriProtector.parse("https://m.tiktok.com/invitef/download").buildUpon().appendQueryParameter("user_id", AV1.LJIIIIZZ(curUser2)).appendQueryParameter("enter_from", "homepage_friends").appendQueryParameter("invitemode", "invitevia").appendQueryParameter("invitesystem", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("platform", key).appendQueryParameter("copytype", CardStruct.IStatusCode.DEFAULT).build().toString();
                } catch (Exception unused) {
                }
            }
            C4LD.LIZIZ.LJJIL(2, this.LJLJLJ.key());
            if (str != null) {
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM2 = this.LJLJL;
                interfaceC62225ObV = this.LJLJLJ;
                str2 = this.LJLJLLL;
                str3 = this.LJLL;
                context = this.LJLLI;
                this.LJLIL = interfaceC62225ObV;
                this.LJLILLLLZI = str2;
                this.LJLJI = str3;
                this.LJLJJI = context;
                this.LJLJJL = str;
                this.LJLJJLL = 1;
                friendsEmptyPageMainSectionVM2.getClass();
                obj = XKX.LJI(C78613UtF.LIZJ, new C3IW(str, null), this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        String str5 = (String) obj;
        if (o.LJ(interfaceC62225ObV.key(), "email")) {
            interfaceC62225ObV.LJIIJ(new OYP(str5, str2, str3), context, null);
        } else {
            interfaceC62225ObV.LJIIJ(new OYP(str5, str3, 4), context, null);
        }
        C188727au c188727au = new C188727au();
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL == null || (curUser = ((RBX) LJIILL).getCurUser()) == null || (str4 = curUser.getUid()) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("from_user_id", str4);
        c188727au.LJIIIZ("platform", interfaceC62225ObV.key());
        c188727au.LJIIIZ("enter_from", "homepage_friends");
        c188727au.LJIIIZ("enter_method", "empty_page");
        c188727au.LJIIIZ("url", str);
        FMX.LJIIL("invite_via", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
