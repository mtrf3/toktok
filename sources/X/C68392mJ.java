package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel$loadRssFeed$1$2", f = "RssFeedViewModel.kt", l = {46}, m = "invokeSuspend")
/* renamed from: X.2mJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68392mJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ RssFeedViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68392mJ(RssFeedViewModel rssFeedViewModel, InterfaceC67352kd<? super C68392mJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = rssFeedViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68392mJ c68392mJ = new C68392mJ(this.LJLJI, interfaceC67352kd);
        c68392mJ.LJLILLLLZI = obj;
        return c68392mJ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
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
                RssFeedViewModel rssFeedViewModel = this.LJLJI;
                InterfaceC68402mK interfaceC68402mK = rssFeedViewModel.LJLILLLLZI;
                String str = rssFeedViewModel.LJLJI;
                this.LJLIL = 1;
                obj = interfaceC68402mK.LIZ(str, null, null, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (List) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        RssFeedViewModel rssFeedViewModel2 = this.LJLJI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            List list = (List) LIZ;
            rssFeedViewModel2.getClass();
            rssFeedViewModel2.setState(new AqS167S0100000_1(list, (List<VoucherInfoNew>) 471));
            int size = list.size();
            int i2 = 0;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((RssArticle) it.next()).isPublished && (i2 = i2 + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            String enterFrom = rssFeedViewModel2.LJLIL.getEnterFrom();
            C188727au LIZLLL = KNV.LIZLLL(enterFrom, "enterFrom");
            LIZLLL.LJIIIZ("enter_from", enterFrom);
            LIZLLL.LIZLLL(size, "show_cnt");
            LIZLLL.LIZLLL(i2, "posted_cnt");
            FMX.LJIIL("article_list_show", LIZLLL.LIZ);
        }
        RssFeedViewModel rssFeedViewModel3 = this.LJLJI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            rssFeedViewModel3.getClass();
            C36922EeM.LJFF(m10exceptionOrNullimpl);
            rssFeedViewModel3.setState(new AqS167S0100000_1(m10exceptionOrNullimpl, 470));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
