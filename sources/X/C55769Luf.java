package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService;
import com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM$getSharerInfoAsync$1", f = "SharedInviteDialogVM.kt", l = {77}, m = "invokeSuspend")
/* renamed from: X.Luf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55769Luf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ExposeSharerData>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ SharedInviteDialogVM LJLJI;
    public final /* synthetic */ C55773Luj LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55769Luf(SharedInviteDialogVM sharedInviteDialogVM, C55773Luj c55773Luj, InterfaceC67352kd<? super C55769Luf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = sharedInviteDialogVM;
        this.LJLJJI = c55773Luj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55769Luf(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ExposeSharerData exposeSharerData;
        int i;
        User user;
        String str;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLILLLLZI;
        Integer num = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    long j = this.LJLIL;
                    C141335gf.LIZJ(obj2);
                    i2 = j;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj2);
                SharedInviteDialogVM sharedInviteDialogVM = this.LJLJI;
                C55773Luj c55773Luj = this.LJLJJI;
                sharedInviteDialogVM.getClass();
                String str2 = c55773Luj.LJ;
                if (str2 != null) {
                    IMService.createIIMServicebyMonsterPlugin(false).getAutoMessageTooltipHelper().LIZJ(str2);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                InviteFriendsApiService inviteFriendsApiService = InviteFriendsApiService.LIZIZ;
                C55773Luj c55773Luj2 = this.LJLJJI;
                EnumC57171McB enumC57171McB = EnumC57171McB.DEFAULT;
                this.LJLIL = elapsedRealtime;
                this.LJLILLLLZI = 1;
                obj2 = inviteFriendsApiService.LIZ(c55773Luj2, enumC57171McB, this);
                i2 = elapsedRealtime;
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            exposeSharerData = (ExposeSharerData) obj2;
            i = i2;
        } catch (Throwable th) {
            C221018lt.LIZJ("@LinkRelation_OldLogic", "get sharer info error", th);
            exposeSharerData = null;
            i = i2;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - i;
        this.LJLJI.getClass();
        IMService.createIIMServicebyMonsterPlugin(false).getAutoMessageTooltipHelper().LIZ();
        C55773Luj c55773Luj3 = this.LJLJJI;
        String str3 = c55773Luj3.LIZLLL;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = c55773Luj3.LJ;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = c55773Luj3.LJFF;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = c55773Luj3.LJII;
        if (str7 != null) {
            str4 = str7;
        }
        EnumC57171McB enumC57171McB2 = c55773Luj3.LIZ;
        if (enumC57171McB2 == null) {
            enumC57171McB2 = EnumC57171McB.DEFAULT;
        }
        C238479Xn c238479Xn = new C238479Xn(str3, str5, str6, str4, enumC57171McB2, c55773Luj3.LIZJ, c55773Luj3.LJIIIIZZ, c55773Luj3.LIZIZ, c55773Luj3.LJIIIZ);
        if (exposeSharerData != null) {
            user = exposeSharerData.sharer;
            str = exposeSharerData.status_msg;
            num = new Integer(exposeSharerData.error_code);
        } else {
            user = null;
            str = null;
        }
        new C238409Xg(c238479Xn, user, elapsedRealtime2, str, num).LIZLLL("@LinkRelation_OldLogic");
        return exposeSharerData;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ExposeSharerData> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
