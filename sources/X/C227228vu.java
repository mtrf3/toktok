package X;

import Y.IDComparatorS31S0000000_3;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.IRelationListApi;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendListVM;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendListVM$searchFromApi$1", f = "SearchFriendListVM.kt", l = {60}, m = "invokeSuspend")
/* renamed from: X.8vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227228vu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public SearchFriendListVM LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ SearchFriendListVM LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C227228vu(SearchFriendListVM searchFriendListVM, String str, InterfaceC67352kd<? super C227228vu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = searchFriendListVM;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C227228vu(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Collection, java.util.ArrayList] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3C4 c3c4;
        SearchFriendListVM searchFriendListVM;
        String str;
        String str2;
        ?? r6;
        List<? extends SearchSugEntity> list;
        LogPbBean logPbBean;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        try {
            if (i != 0) {
                if (i == 1) {
                    searchFriendListVM = this.LJLILLLLZI;
                    str = (String) this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                searchFriendListVM = this.LJLJJI;
                IRelationListApi iRelationListApi = searchFriendListVM.LJLIL;
                str = this.LJLJJL;
                this.LJLIL = str;
                this.LJLILLLLZI = searchFriendListVM;
                this.LJLJI = 1;
                obj = iRelationListApi.searchFriends(str, 100L, "tt_ffp_add_friends", 0L, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            SearchUserSugResponse searchUserSugResponse = (SearchUserSugResponse) obj;
            if (searchUserSugResponse == null || (logPbBean = searchUserSugResponse.logPbBean) == null || (str2 = logPbBean.getImprId()) == null) {
                str2 = "";
            }
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            if (searchUserSugResponse != null && (list = searchUserSugResponse.sugList) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<? extends SearchSugEntity> it = list.iterator();
                while (it.hasNext()) {
                    User LIZ = C247049mm.LIZ(it.next(), str2);
                    if (LIZ != null && (!o.LJ(LIZ.getUid(), curUserId))) {
                        arrayList.add(LIZ);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(searchFriendListVM.gv0((User) it2.next(), str2, str));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    EnumC227268vy enumC227268vy = ((C227128vk) next).LJLJLLL;
                    Object obj2 = linkedHashMap.get(enumC227268vy);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(enumC227268vy, obj2);
                    }
                    ((List) obj2).add(next);
                }
                TreeMap treeMap = new TreeMap(new IDComparatorS31S0000000_3(4));
                treeMap.putAll(linkedHashMap);
                for (Map.Entry entry : treeMap.entrySet()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("section: ");
                    LIZ2.append(((EnumC227268vy) entry.getKey()).name());
                    LIZ2.append(", size: ");
                    LIZ2.append(((List) entry.getValue()).size());
                    C221018lt.LJFF("[ffp]_Search", X1D.LIZIZ(LIZ2));
                }
                r6 = new ArrayList();
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    EnumC227268vy section = (EnumC227268vy) entry2.getKey();
                    List friendItems = (List) entry2.getValue();
                    o.LJIIIIZZ(section, "section");
                    List LJJIJ = C47261Igj.LJJIJ(new C227258vx(section));
                    o.LJIIIIZZ(friendItems, "friendItems");
                    searchFriendListVM.getClass();
                    if (section == EnumC227268vy.MORE_FRIENDS) {
                        friendItems = ORZ.LLILII(new IDComparatorS31S0000000_3(5), friendItems);
                    }
                    ORS.LJJLIIIJILLIZJL(ORZ.LLIIIZ(friendItems, LJJIJ), r6);
                }
            } else {
                r6 = C61878OQg.INSTANCE;
            }
            C3C5.m7constructorimpl(r6);
            c3c4 = r6;
        } catch (Throwable th) {
            C3C4 LIZ3 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ3);
            c3c4 = LIZ3;
        }
        String str3 = this.LJLJJL;
        SearchFriendListVM searchFriendListVM2 = this.LJLJJI;
        if (C3C5.m13isSuccessimpl(c3c4)) {
            List list2 = (List) c3c4;
            StringBuilder LIZIZ = C25620zW.LIZIZ("search: ", str3, " result size: ");
            LIZIZ.append(list2.size());
            C221018lt.LJFF("[ffp]_Search", X1D.LIZIZ(LIZIZ));
            searchFriendListVM2.setState(new AqS169S0100000_3(list2, (List<AnonymousClass852<C85M>>) 651));
        }
        String str4 = this.LJLJJL;
        SearchFriendListVM searchFriendListVM3 = this.LJLJJI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(c3c4);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("search: ");
            LIZ4.append(str4);
            LIZ4.append(" error");
            C221018lt.LIZJ("[ffp]_Search", X1D.LIZIZ(LIZ4), m10exceptionOrNullimpl);
            if (!(m10exceptionOrNullimpl instanceof CancellationException)) {
                searchFriendListVM3.setState(new AqS169S0100000_3(m10exceptionOrNullimpl, 652));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
