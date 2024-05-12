package X;

import com.ss.android.ugc.aweme.relation.api.RelationListApiService;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.ss.android.ugc.aweme.relation.model.FriendsListResponse;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel$mufPageConfig$2$1$onRefresh$1", f = "MufListPageViewModel.kt", l = {218}, m = "invokeSuspend")
/* renamed from: X.Scl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72495Scl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MufListPageViewModel LJLILLLLZI;
    public final /* synthetic */ InterfaceC67352kd<A2G<String>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C72495Scl(MufListPageViewModel mufListPageViewModel, InterfaceC67352kd<? super A2G<String>> interfaceC67352kd, InterfaceC67352kd<? super C72495Scl> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLILLLLZI = mufListPageViewModel;
        this.LJLJI = interfaceC67352kd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72495Scl(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC72447Sbz iv0 = this.LJLILLLLZI.iv0();
                if (iv0 != null) {
                    iv0.s20(new C72922tc());
                }
                RelationListApiService relationListApiService = RelationListApiService.LIZIZ;
                int i2 = this.LJLILLLLZI.getState().LJLIL;
                String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
                o.LJIIIIZZ(curSecUserId, "userService().curSecUserId");
                this.LJLIL = 1;
                obj = relationListApiService.getFriendsList(i2, 30, curSecUserId, "", this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            FriendsListResponse friendsListResponse = (FriendsListResponse) obj;
            friendsListResponse.checkValid();
            String str = friendsListResponse.nextPageToken;
            boolean z = friendsListResponse.hasMore;
            L6F.LIZIZ.LIZLLL(L61.STORY, null, friendsListResponse.getUserList(), C72501Scr.LJLIL);
            List<C62724OjY> userList = friendsListResponse.getUserList();
            MufListPageViewModel mufListPageViewModel = this.LJLILLLLZI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(userList, 10));
            Iterator<C62724OjY> it = userList.iterator();
            while (it.hasNext()) {
                arrayList.add(new C57792MmC(it.next(), (EnumC72483ScZ) mufListPageViewModel.LJLILLLLZI.getValue(), mufListPageViewModel.getState().LJLILLLLZI));
            }
            if (friendsListResponse.getUserList().isEmpty()) {
                this.LJLILLLLZI.setState(C72496Scm.LJLIL);
                InterfaceC67352kd<A2G<String>> interfaceC67352kd = this.LJLJI;
                A2F a2f = A2G.LIZ;
                List LJJIJ = C47261Igj.LJJIJ(new C72472ScO());
                a2f.getClass();
                A2H LIZ = A2F.LIZ(LJJIJ);
                C3C5.m7constructorimpl(LIZ);
                interfaceC67352kd.resumeWith(LIZ);
                InterfaceC72447Sbz iv02 = this.LJLILLLLZI.iv0();
                if (iv02 != null) {
                    iv02.s20(new C72912tb(C76800UCe.LIZ));
                }
            } else if (!z) {
                this.LJLILLLLZI.setState(C72497Scn.LJLIL);
                InterfaceC67352kd<A2G<String>> interfaceC67352kd2 = this.LJLJI;
                A2G.LIZ.getClass();
                A2H LIZ2 = A2F.LIZ(arrayList);
                C3C5.m7constructorimpl(LIZ2);
                interfaceC67352kd2.resumeWith(LIZ2);
                InterfaceC72447Sbz iv03 = this.LJLILLLLZI.iv0();
                if (iv03 != null) {
                    iv03.s20(new C72912tb(C76800UCe.LIZ));
                }
            } else {
                this.LJLILLLLZI.setState(C72498Sco.LJLIL);
                InterfaceC67352kd<A2G<String>> interfaceC67352kd3 = this.LJLJI;
                A2V LJ = A2F.LJ(A2G.LIZ, null, str, arrayList, 1);
                C3C5.m7constructorimpl(LJ);
                interfaceC67352kd3.resumeWith(LJ);
            }
        } catch (Exception e) {
            this.LJLILLLLZI.setState(C72499Scp.LJLIL);
            InterfaceC72447Sbz iv04 = this.LJLILLLLZI.iv0();
            if (iv04 != null) {
                iv04.s20(new C3C1(e));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
