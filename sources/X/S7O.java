package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DiscountTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.MultiTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SingleTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SizeChartTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel$cancelDisplay$1$1", f = "TemplateListViewModel.kt", l = {235, 237}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class S7O extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public S6S LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ TemplateListViewModel LJLJI;
    public final /* synthetic */ S6U LJLJJI;
    public final /* synthetic */ TemplateItem LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7O(TemplateListViewModel templateListViewModel, S6U s6u, TemplateItem templateItem, InterfaceC67352kd<? super S7O> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = templateListViewModel;
        this.LJLJJI = s6u;
        this.LJLJJL = templateItem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new S7O(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        S6S s6s;
        LiveEffect liveEffect;
        TemplateListViewModel templateListViewModel;
        C64797Pbt c64797Pbt;
        InterfaceC57784Mm4 LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    c64797Pbt = (C64797Pbt) obj;
                    if (c64797Pbt == null && c64797Pbt.LIZIZ()) {
                        S6U s6u = this.LJLJJI;
                        s6u.getClass();
                        List<InterfaceC57784Mm4> list = s6u.getListState().LJLJJI;
                        if (list != null) {
                            TemplateItem templateItem = this.LJLJJL;
                            Iterator<InterfaceC57784Mm4> it = list.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                InterfaceC57784Mm4 next = it.next();
                                o.LJII(next, "null cannot be cast to non-null type com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem");
                                if (o.LJ(((TemplateItem) next).getTemplateId(), templateItem.getTemplateId())) {
                                    if (i2 >= 0) {
                                        S6U s6u2 = this.LJLJJI;
                                        s6u2.getClass();
                                        List<InterfaceC57784Mm4> list2 = s6u2.getListState().LJLJJI;
                                        if (list2 != null && i2 < list2.size()) {
                                            TemplateItem templateItem2 = this.LJLJJL;
                                            if (templateItem2 instanceof MultiTextTemplateItem) {
                                                LIZ = MultiTextTemplateItem.LIZ((MultiTextTemplateItem) templateItem2, null, false, 895);
                                            } else if (templateItem2 instanceof SingleTextTemplateItem) {
                                                LIZ = SingleTextTemplateItem.LIZ((SingleTextTemplateItem) templateItem2, null, false, 895);
                                            } else if (templateItem2 instanceof ProductTemplateItem) {
                                                LIZ = ProductTemplateItem.LIZ((ProductTemplateItem) templateItem2, null, false, 895);
                                            } else if (templateItem2 instanceof DiscountTemplateItem) {
                                                LIZ = DiscountTemplateItem.LIZ((DiscountTemplateItem) templateItem2, null, false, 895);
                                            } else {
                                                o.LJII(templateItem2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SizeChartTemplateItem");
                                                LIZ = SizeChartTemplateItem.LIZ((SizeChartTemplateItem) templateItem2, null, false, 895);
                                            }
                                            this.LJLJI.listSetItemAt(i2, (int) LIZ);
                                            this.LJLJI.setState(C71571S7b.LJLIL);
                                        }
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        this.LJLJI.setState(new AqS178S0100000_12(new C3C1(new Throwable("request cancel display failed")), 507));
                    }
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s6s = this.LJLIL;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLJI.setState(C71573S7d.LJLIL);
            S5I s5i = this.LJLJI.LJLJJI;
            if (s5i != null) {
                s6s = s5i.Rj();
                if (s6s != null) {
                    liveEffect = s6s.LJLJJLL;
                    templateListViewModel = this.LJLJI;
                    InterfaceC07990Tb interfaceC07990Tb = templateListViewModel.LJLILLLLZI;
                    if (liveEffect != null || interfaceC07990Tb == null) {
                        templateListViewModel.setState(C71570S7a.LJLIL);
                        return C76800UCe.LIZ;
                    }
                    C71562S6s c71562S6s = templateListViewModel.LJLJI;
                    this.LJLIL = s6s;
                    this.LJLILLLLZI = 1;
                    obj = c71562S6s.LIZ(interfaceC07990Tb, liveEffect, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            } else {
                s6s = null;
            }
            liveEffect = null;
            templateListViewModel = this.LJLJI;
            InterfaceC07990Tb interfaceC07990Tb2 = templateListViewModel.LJLILLLLZI;
            if (liveEffect != null) {
            }
            templateListViewModel.setState(C71570S7a.LJLIL);
            return C76800UCe.LIZ;
        }
        ((Boolean) obj).booleanValue();
        FSJ fsj = C36576EXc.LIZIZ;
        S7N s7n = new S7N(this.LJLJI, s6s, this.LJLJJL, null);
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        obj = XKX.LJI(fsj, s7n, this);
        if (obj == enumC58928NAu) {
            return enumC58928NAu;
        }
        c64797Pbt = (C64797Pbt) obj;
        if (c64797Pbt == null) {
        }
        this.LJLJI.setState(new AqS178S0100000_12(new C3C1(new Throwable("request cancel display failed")), 507));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
