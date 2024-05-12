package X;

import com.ss.android.ugc.aweme.relation.api.RelationListApiService;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.ss.android.ugc.aweme.relation.model.FriendsListResponse;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel$mufPageConfig$2$1$onLoadMore$1", f = "MufListPageViewModel.kt", l = {172}, m = "invokeSuspend")
/* renamed from: X.Sck, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72494Sck extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MufListPageViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC67352kd<A2G<String>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C72494Sck(MufListPageViewModel mufListPageViewModel, String str, InterfaceC67352kd<? super A2G<String>> interfaceC67352kd, InterfaceC67352kd<? super C72494Sck> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLILLLLZI = mufListPageViewModel;
        this.LJLJI = str;
        this.LJLJJI = interfaceC67352kd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72494Sck(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
                RelationListApiService relationListApiService = RelationListApiService.LIZIZ;
                int i2 = this.LJLILLLLZI.getState().LJLIL;
                String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
                o.LJIIIIZZ(curSecUserId, "userService().curSecUserId");
                String str = this.LJLJI;
                this.LJLIL = 1;
                obj = relationListApiService.getFriendsList(i2, 30, curSecUserId, str, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            FriendsListResponse friendsListResponse = (FriendsListResponse) obj;
            friendsListResponse.checkValid();
            String str2 = friendsListResponse.nextPageToken;
            boolean z = friendsListResponse.hasMore;
            L6F.LIZIZ.LIZLLL(L61.STORY, null, friendsListResponse.getUserList(), C72500Scq.LJLIL);
            List<C62724OjY> userList = friendsListResponse.getUserList();
            MufListPageViewModel mufListPageViewModel = this.LJLILLLLZI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(userList, 10));
            Iterator<C62724OjY> it = userList.iterator();
            while (it.hasNext()) {
                arrayList.add(new C57792MmC(it.next(), (EnumC72483ScZ) mufListPageViewModel.LJLILLLLZI.getValue(), mufListPageViewModel.getState().LJLILLLLZI));
            }
            if (friendsListResponse.getUserList().isEmpty()) {
                this.LJLILLLLZI.setState(C72492Sci.LJLIL);
                InterfaceC67352kd<A2G<String>> interfaceC67352kd = this.LJLJJI;
                A2H LIZIZ = A2F.LIZIZ(A2G.LIZ);
                C3C5.m7constructorimpl(LIZIZ);
                interfaceC67352kd.resumeWith(LIZIZ);
            } else if (!z) {
                this.LJLILLLLZI.setState(C72493Scj.LJLIL);
                InterfaceC67352kd<A2G<String>> interfaceC67352kd2 = this.LJLJJI;
                A2G.LIZ.getClass();
                A2H LIZ = A2F.LIZ(arrayList);
                C3C5.m7constructorimpl(LIZ);
                interfaceC67352kd2.resumeWith(LIZ);
            } else {
                this.LJLILLLLZI.setState(C72491Sch.LJLIL);
                InterfaceC67352kd<A2G<String>> interfaceC67352kd3 = this.LJLJJI;
                A2V LJ = A2F.LJ(A2G.LIZ, null, str2, arrayList, 1);
                C3C5.m7constructorimpl(LJ);
                interfaceC67352kd3.resumeWith(LJ);
            }
        } catch (Exception unused) {
            this.LJLILLLLZI.setState(C72490Scg.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
