package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.MutualRelationUserInfoApiService;
import com.ss.android.ugc.aweme.relation.model.MutualRelationListResponse;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.mutual.MutualRelationViewModel$refreshMutualRelationList$1", f = "MutualRelationViewModel.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.3GT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MutualRelationViewModel LJLILLLLZI;
    public final /* synthetic */ ArrayList<String> LJLJI;
    public final /* synthetic */ ArrayList<String> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3GT(MutualRelationViewModel mutualRelationViewModel, ArrayList<String> arrayList, ArrayList<String> arrayList2, InterfaceC67352kd<? super C3GT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mutualRelationViewModel;
        this.LJLJI = arrayList;
        this.LJLJJI = arrayList2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3GT(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
                this.LJLILLLLZI.setState(C94063mc.LJLIL);
                AbstractC73638SvC<MutualRelationListResponse> usersInfo = MutualRelationUserInfoApiService.LIZIZ.getUsersInfo(1, ORZ.LLD(this.LJLJI, ",", "", "", null, 56), ORZ.LLD(this.LJLJJI, ",", "", "", null, 56));
                this.LJLIL = 1;
                obj = C77318UWc.LIZ(usersInfo, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            MutualRelationListResponse mutualRelationListResponse = (MutualRelationListResponse) obj;
            mutualRelationListResponse.checkValid();
            List<User> userList = mutualRelationListResponse.getUserList();
            ArrayList arrayList = new ArrayList();
            for (User user : userList) {
                if (!user.isBlock()) {
                    arrayList.add(user);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    arrayList2.add(new C3GU((User) next, i2));
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (mutualRelationListResponse.getUserList().isEmpty()) {
                this.LJLILLLLZI.setState(C94053mb.LJLIL);
            } else {
                this.LJLILLLLZI.setState(new AqS167S0100000_1(arrayList2, (List<VoucherInfoNew>) 293));
            }
        } catch (Exception unused) {
            C221018lt.LIZ("MutualRelationViewModel", "mutual relation page config refresh error");
            this.LJLILLLLZI.setState(C94073md.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
