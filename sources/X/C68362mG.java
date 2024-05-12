package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel$downloadImagesWithFilePaths$1$2", f = "RssFeedViewModel.kt", l = {68}, m = "invokeSuspend")
/* renamed from: X.2mG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68362mG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ RssFeedViewModel LJLJJI;
    public final /* synthetic */ List<String> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68362mG(RssFeedViewModel rssFeedViewModel, List<String> list, InterfaceC67352kd<? super C68362mG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = rssFeedViewModel;
        this.LJLJJL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68362mG c68362mG = new C68362mG(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c68362mG.LJLJI = obj;
        return c68362mG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        Integer num;
        C68322mC c68322mC;
        C68322mC c68322mC2;
        T t;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c68322mC = this.LJLIL;
                    c68322mC2 = (C68322mC) this.LJLJI;
                    C141335gf.LIZJ(obj);
                    t = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                RssFeedViewModel rssFeedViewModel = this.LJLJJI;
                List<String> list = this.LJLJJL;
                c68322mC = new C68322mC();
                System.currentTimeMillis();
                C78773Uvp c78773Uvp = rssFeedViewModel.LJLJJL;
                this.LJLJI = c68322mC;
                this.LJLIL = c68322mC;
                this.LJLILLLLZI = 1;
                Object LIZ2 = c78773Uvp.LIZ(list, this);
                if (LIZ2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
                c68322mC2 = c68322mC;
                t = LIZ2;
            }
            c68322mC.element = t;
            System.currentTimeMillis();
            LIZ = (List) c68322mC2.element;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        RssFeedViewModel rssFeedViewModel2 = this.LJLJJI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            List list2 = (List) LIZ;
            rssFeedViewModel2.getClass();
            if (list2.isEmpty()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Downloaded 0 images for ");
                RssArticle rssArticle = rssFeedViewModel2.LJLJJI;
                if (rssArticle != null) {
                    num = Integer.valueOf(rssArticle.guid);
                } else {
                    num = null;
                }
                LIZ3.append(num);
                Exception exc = new Exception(X1D.LIZIZ(LIZ3));
                C36922EeM.LJFF(exc);
                rssFeedViewModel2.setState(new AqS167S0100000_1((Throwable) exc, 468));
            } else {
                rssFeedViewModel2.setState(new AqS167S0100000_1(list2, (List<VoucherInfoNew>) 469));
            }
        }
        RssFeedViewModel rssFeedViewModel3 = this.LJLJJI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            rssFeedViewModel3.getClass();
            C36922EeM.LJFF(m10exceptionOrNullimpl);
            rssFeedViewModel3.setState(new AqS167S0100000_1(m10exceptionOrNullimpl, 468));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
