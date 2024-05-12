package X;

import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.friends.model.RelationDataSource;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM$followWithOfflineWrite$1", f = "RelationViewVM.kt", l = {604}, m = "invokeSuspend")
/* renamed from: X.Mdo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57272Mdo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ RelationViewVM LJLILLLLZI;
    public final /* synthetic */ C57285Me1 LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, C38333F2r, C76800UCe> LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C57272Mdo(RelationViewVM relationViewVM, C57285Me1 c57285Me1, InterfaceC88471Ynr<? super Boolean, ? super C38333F2r, C76800UCe> interfaceC88471Ynr, String str, InterfaceC67352kd<? super C57272Mdo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = relationViewVM;
        this.LJLJI = c57285Me1;
        this.LJLJJI = interfaceC88471Ynr;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57272Mdo(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        User user;
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
            RelationViewVM relationViewVM = this.LJLILLLLZI;
            C57285Me1 c57285Me1 = this.LJLJI;
            relationViewVM.getClass();
            int iv0 = RelationViewVM.iv0(c57285Me1.LIZJ, c57285Me1.LJIIJ, c57285Me1.LJIIL);
            IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LJI(new FollowStatus(c57285Me1.LIZ, iv0));
            EventLiveData<RelationStatus> eventLiveData = RelationDataSource.INSTANCE.get();
            String str = c57285Me1.LIZ;
            Integer valueOf = Integer.valueOf(c57285Me1.LJIIJ);
            User user2 = c57285Me1.LJIILJJIL;
            if (user2 != null) {
                user = user2.m150clone();
            } else {
                user = null;
            }
            eventLiveData.postValue(new RelationStatus(str, iv0, valueOf, null, user, 8, null));
            C53578L1a.LIZ.getClass();
            if (C53578L1a.LIZ()) {
                InterfaceC54795Lex LJIL = C55723Ltv.LIZIZ.LJIL();
                FollowStatus followStatus = new FollowStatus(c57285Me1.LIZ, iv0);
                followStatus.followerStatus = c57285Me1.LJIIJ;
                LJIL.LJFF(followStatus);
            }
            InterfaceC65462ha LIZ = C57310MeQ.LIZ(this.LJLJI.LIZ, C57310MeQ.LIZIZ(this.LJLJI));
            C57290Me6 c57290Me6 = new C57290Me6(this.LJLJI, this.LJLJJI, this.LJLILLLLZI, this.LJLJJL);
            this.LJLIL = 1;
            if (LIZ.collect(c57290Me6, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
