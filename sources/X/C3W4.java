package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.sharedar.viewmodel.SessionShareViewModel$searchFriends$1", f = "SessionShareViewModel.kt", l = {133}, m = "invokeSuspend")
/* renamed from: X.3W4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C85193Vz LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3W4(C85193Vz c85193Vz, String str, boolean z, InterfaceC67352kd<? super C3W4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c85193Vz;
        this.LJLJI = str;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3W4(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C85193Vz c85193Vz = this.LJLILLLLZI;
            String str = this.LJLJI;
            long j = c85193Vz.LJII;
            this.LJLIL = 1;
            obj = XKX.LJI(C78613UtF.LIZJ, new C3W3(c85193Vz, 50L, j, str, "at_user", null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        SummonFriendList summonFriendList = (SummonFriendList) obj;
        if (!o.LJ(summonFriendList.keyword, this.LJLILLLLZI.LIZLLL)) {
            return C76800UCe.LIZ;
        }
        C85193Vz c85193Vz2 = this.LJLILLLLZI;
        c85193Vz2.LJI = summonFriendList.hasMore;
        c85193Vz2.LJII = summonFriendList.cursor;
        MutableLiveData<List<C3W5>> mutableLiveData = c85193Vz2.LIZJ;
        if (this.LJLJJI) {
            arrayList = new ArrayList();
            Collection value = this.LJLILLLLZI.LIZJ.getValue();
            if (value == null) {
                value = C61878OQg.INSTANCE;
            }
            arrayList.addAll(value);
            List<SummonFriendItem> list = summonFriendList.items;
            o.LJIIIIZZ(list, "newSearchResult.items");
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<SummonFriendItem> it = list.iterator();
            while (it.hasNext()) {
                User user = it.next().mUser;
                o.LJIIIIZZ(user, "it.user");
                arrayList2.add(new C3W5(user));
            }
            arrayList.addAll(arrayList2);
        } else {
            List<SummonFriendItem> list2 = summonFriendList.items;
            o.LJIIIIZZ(list2, "newSearchResult.items");
            arrayList = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<SummonFriendItem> it2 = list2.iterator();
            while (it2.hasNext()) {
                User user2 = it2.next().mUser;
                o.LJIIIIZZ(user2, "it.user");
                arrayList.add(new C3W5(user2));
            }
        }
        mutableLiveData.setValue(arrayList);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
