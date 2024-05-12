package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel$tryLoadLocalFirst$1", f = "ExploreFeedListViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8AW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8AW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ExploreFeedListViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8AW(ExploreFeedListViewModel exploreFeedListViewModel, InterfaceC67352kd<? super C8AW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = exploreFeedListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C8AW(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ExploreAwemeList exploreAwemeList;
        List<Aweme> list;
        C141335gf.LIZJ(obj);
        ExploreFeedListViewModel exploreFeedListViewModel = this.LJLIL;
        exploreFeedListViewModel.getClass();
        try {
            exploreAwemeList = C8AX.LIZ;
        } catch (Throwable unused) {
            C8AX.LIZ().storeBoolean("key_cache_explore_available", false);
        }
        if (exploreAwemeList == null) {
            String string = C8AX.LIZ().getString("key_cache_explore_list", "");
            if (string == null || string.length() == 0) {
                C8AX.LIZ().storeBoolean("key_cache_explore_available", false);
            } else {
                ExploreAwemeList exploreAwemeList2 = (ExploreAwemeList) C69432nz.LIZ().LJI(string, ExploreAwemeList.class);
                C8AX.LIZ = exploreAwemeList2;
                if (exploreAwemeList2 == null || (list = exploreAwemeList2.items) == null || list.isEmpty()) {
                    C8AX.LIZ().storeBoolean("key_cache_explore_available", false);
                }
                exploreAwemeList = C8AX.LIZ;
                if (exploreAwemeList != null) {
                }
            }
            return C76800UCe.LIZ;
        }
        List<Aweme> list2 = exploreAwemeList.items;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<Aweme> list3 = exploreAwemeList.items;
            if (list3 != null) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
                Iterator<Aweme> it = list3.iterator();
                while (it.hasNext()) {
                    Aweme R1 = AwemeService.LIZ().R1(it.next());
                    o.LJI(R1);
                    arrayList2.add(new C2050482y(R1, R1.isLike(), exploreAwemeList.getRequestId(), exploreAwemeList.logPb));
                }
                arrayList.addAll(arrayList2);
            }
            C72912tb c72912tb = new C72912tb(new C223208pQ(false, true));
            C33X c33x = C33X.LIZ;
            exploreFeedListViewModel.newState(new C8HZ(c72912tb, c33x, c33x, arrayList));
            C206978Aj.LIZIZ(exploreFeedListViewModel.LJLJI, null, true);
            C8BG<C8AY> operator = exploreFeedListViewModel.getConfig().getOperator();
            SZP szp = SZP.Refresh;
            A2F a2f = A2G.LIZ;
            C8AY c8ay = new C8AY(arrayList.size());
            a2f.getClass();
            operator.LIZLLL(szp, A2F.LIZLLL(null, c8ay, arrayList), true);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
