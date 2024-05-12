package X;

import com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel$updateRssLink$1$2", f = "RssLinkViewModel.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AJG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ RssLinkViewModel LJLJI;
    public final /* synthetic */ AJD LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJG(RssLinkViewModel rssLinkViewModel, AJD ajd, InterfaceC67352kd<? super AJG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = rssLinkViewModel;
        this.LJLJJI = ajd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        AJG ajg = new AJG(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        ajg.LJLILLLLZI = obj;
        return ajg;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        AJE aje;
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
                RssLinkViewModel rssLinkViewModel = this.LJLJI;
                AJD ajd = this.LJLJJI;
                InterfaceC68402mK interfaceC68402mK = rssLinkViewModel.LJLILLLLZI;
                String str = ajd.LJLIL;
                this.LJLIL = 1;
                obj = interfaceC68402mK.updateRss(str, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (AJI) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        RssLinkViewModel rssLinkViewModel2 = this.LJLJI;
        AJD ajd2 = this.LJLJJI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            AJI aji = (AJI) LIZ;
            Integer num = aji.LIZIZ;
            if (num == null || num.intValue() != 0) {
                rssLinkViewModel2.gv0(aji);
            } else {
                rssLinkViewModel2.getClass();
                C43I<AJE> c43i = ajd2.LJLJI;
                if (c43i == null || (aje = c43i.LIZ) == null) {
                    aje = AJE.NEW;
                }
                int i2 = AJF.LIZ[aje.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        String str2 = aji.LIZ;
                        if (str2 == null || str2.length() == 0) {
                            rssLinkViewModel2.setState(AJL.LJLIL);
                            rssLinkViewModel2.hv0(AJJ.UNLINK);
                        } else {
                            rssLinkViewModel2.setState(AJM.LJLIL);
                            RssLinkViewModel.iv0(rssLinkViewModel2, 1, null, 2);
                            rssLinkViewModel2.hv0(AJJ.DONE);
                        }
                    }
                } else {
                    rssLinkViewModel2.setState(AJK.LJLIL);
                    RssLinkViewModel.iv0(rssLinkViewModel2, 1, null, 2);
                    rssLinkViewModel2.hv0(AJJ.DONE);
                }
            }
        }
        RssLinkViewModel rssLinkViewModel3 = this.LJLJI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            if (m10exceptionOrNullimpl instanceof AJZ) {
                rssLinkViewModel3.setState(new AqS170S0100000_4(m10exceptionOrNullimpl, 11));
            } else {
                C36922EeM.LJFF(m10exceptionOrNullimpl);
                rssLinkViewModel3.gv0(null);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
