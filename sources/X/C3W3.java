package X;

import com.ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.sharedar.viewmodel.SessionShareViewModel$realSearchFriendsByKeyV1$2", f = "SessionShareViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3W3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super SummonFriendList>, Object> {
    public final /* synthetic */ C85193Vz LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3W3(C85193Vz c85193Vz, long j, long j2, String str, String str2, InterfaceC67352kd<? super C3W3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c85193Vz;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3W3(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        SummonFriendList summonFriendList;
        ?? r8;
        User user;
        ArrayList LJFF = C1JX.LJFF(obj);
        List LLILLL = ORZ.LLILLL(this.LJLIL.LJIIJ, (int) this.LJLILLLLZI);
        LJFF.addAll(LLILLL);
        ((ArrayList) this.LJLIL.LJIIJ).removeAll(LLILLL);
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = this.LJLJI;
        C34K c34k = new C34K();
        c34k.element = this.LJLIL.LJI;
        do {
            long size = LJFF.size();
            long j = this.LJLILLLLZI;
            if (size >= j) {
                break;
            }
            summonFriendList = SummonFriendApi.LIZ.searchFriends(this.LJLJJI, j, c72242sW.element, 1, this.LJLJJL, 1).execute().LIZIZ;
            List<SummonFriendItem> list = summonFriendList.items;
            if (list != null) {
                C85193Vz c85193Vz = this.LJLIL;
                r8 = new ArrayList();
                for (SummonFriendItem summonFriendItem : list) {
                    SummonFriendItem summonFriendItem2 = summonFriendItem;
                    if (summonFriendItem2 != null && (user = summonFriendItem2.mUser) != null) {
                        c85193Vz.getClass();
                        if (user.getFollowStatus() == 2 && C85193Vz.LIZ(user)) {
                            r8.add(summonFriendItem);
                        }
                    }
                }
            } else {
                r8 = C61878OQg.INSTANCE;
            }
            c72242sW.element = summonFriendList.cursor;
            c34k.element = summonFriendList.hasMore;
            List LLILLL2 = ORZ.LLILLL(r8, ((int) this.LJLILLLLZI) - LJFF.size());
            LJFF.addAll(LLILLL2);
            ((ArrayList) this.LJLIL.LJIIJ).addAll(ORZ.LLILZ(r8.size() - LLILLL2.size(), r8));
            if (!c34k.element) {
                break;
            }
        } while (o.LJ(summonFriendList.keyword, this.LJLIL.LIZLLL));
        C85193Vz c85193Vz2 = this.LJLIL;
        c85193Vz2.LJII = c72242sW.element;
        c85193Vz2.LJI = c34k.element;
        return new SummonFriendList(LJFF, c72242sW.element, c34k.element, this.LJLJJI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super SummonFriendList> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
