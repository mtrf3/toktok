package X;

import com.ss.android.ugc.aweme.notification.creator.model.TabSortCacheModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import fjb.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM$getNoticeRequestDeferred$1", f = "CreatorNoticeResultVM.kt", l = {325}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MTA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AbstractC72932td<? extends CreatorNoticeResponse>>, Object> {
    public int LJLIL;
    public final /* synthetic */ CreatorNoticeResultVM LJLILLLLZI;
    public final /* synthetic */ MT7 LJLJI;
    public final /* synthetic */ NoticeTabModel LJLJJI;
    public final /* synthetic */ MT0 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTA(CreatorNoticeResultVM creatorNoticeResultVM, MT7 mt7, NoticeTabModel noticeTabModel, MT0 mt0, InterfaceC67352kd<? super MTA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = creatorNoticeResultVM;
        this.LJLJI = mt7;
        this.LJLJJI = noticeTabModel;
        this.LJLJJL = mt0;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MTA(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLILLLLZI.nv0());
            LIZ.append(": Creator request, requestType:");
            LIZ.append(this.LJLJI);
            C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ));
            this.LJLILLLLZI.LJLJJLL.getValue().getClass();
            MOR mor = new MOR();
            int i2 = this.LJLJJI.tabId;
            String LIZ2 = C53269KvR.LIZ();
            CopyOnWriteArrayList<TabSortCacheModel> copyOnWriteArrayList = C2WH.LIZ;
            List<Integer> LIZ3 = this.LJLJJL.LJLJI.LIZ();
            if (LIZ3 == null) {
                LIZ3 = C61878OQg.INSTANCE;
            }
            String str = this.LJLJJL.LJLJJI;
            MT7 requestType = this.LJLJI;
            int i3 = this.LJLJJI.lastReadTime;
            o.LJIIIZ(requestType, "requestType");
            int[] iArr = MT9.LIZ;
            int i4 = iArr[requestType.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                i3 = 0;
            }
            MT7 requestType2 = this.LJLJI;
            int i5 = this.LJLJJI.wallTime;
            o.LJIIIZ(requestType2, "requestType");
            int i6 = iArr[requestType2.ordinal()];
            if (i6 == 1 || i6 == 2 || i6 == 3) {
                i5 = 0;
            }
            boolean needMarkRead = this.LJLJI.getNeedMarkRead();
            boolean needMarkReadAll = this.LJLJI.getNeedMarkReadAll();
            MT7 mt7 = this.LJLJI;
            this.LJLIL = 1;
            List<Integer> list = LIZ3;
            obj2 = mor.LLIIIILZ(i2, LIZ2, copyOnWriteArrayList, list, str, i3, i5, needMarkRead, needMarkReadAll, mt7, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AbstractC72932td<? extends CreatorNoticeResponse>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
