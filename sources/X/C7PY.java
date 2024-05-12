package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM$toggleFavorite$2", f = "TopicRecommendListVM.kt", l = {306}, m = "invokeSuspend")
/* renamed from: X.7PY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7PY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC65462ha<XGX<? extends InterfaceC199277rv>> LJLJI;
    public final /* synthetic */ C7PV LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C34K LJLJJLL;
    public final /* synthetic */ TopicRawInfo LJLJL;
    public final /* synthetic */ TopicRecommendListVM LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7PY(InterfaceC65462ha<? extends XGX<? extends InterfaceC199277rv>> interfaceC65462ha, C7PV c7pv, String str, C34K c34k, TopicRawInfo topicRawInfo, TopicRecommendListVM topicRecommendListVM, boolean z, InterfaceC67352kd<? super C7PY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC65462ha;
        this.LJLJJI = c7pv;
        this.LJLJJL = str;
        this.LJLJJLL = c34k;
        this.LJLJL = topicRawInfo;
        this.LJLJLJ = topicRecommendListVM;
        this.LJLJLLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C7PY c7py = new C7PY(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
        c7py.LJLILLLLZI = obj;
        return c7py;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            final InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            InterfaceC65462ha<XGX<? extends InterfaceC199277rv>> interfaceC65462ha = this.LJLJI;
            final C7PV c7pv = this.LJLJJI;
            final String str = this.LJLJJL;
            final C34K c34k = this.LJLJJLL;
            final TopicRawInfo topicRawInfo = this.LJLJL;
            final TopicRecommendListVM topicRecommendListVM = this.LJLJLJ;
            final boolean z = this.LJLJLLL;
            InterfaceC64672gJ<XGX<? extends InterfaceC199277rv>> interfaceC64672gJ = new InterfaceC64672gJ<XGX<? extends InterfaceC199277rv>>() { // from class: X.7Pa
                @Override // X.InterfaceC64672gJ
                public final Object emit(XGX<? extends InterfaceC199277rv> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    XGX<? extends InterfaceC199277rv> xgx2 = xgx;
                    if (xgx2 instanceof XGW) {
                        if (C78977Uz7.LJJJJI(xgx2.LIZJ) == EnumC78982UzC.Optimistic) {
                            Object LJI = XKX.LJI(C36636EZk.LIZ, new C7PX(c7pv, str, c34k, topicRawInfo, null), interfaceC67352kd);
                            if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return LJI;
                            }
                        } else {
                            Object LJI2 = XKX.LJI(C36636EZk.LIZ, new C185317Pb(c34k, topicRawInfo, c7pv, str, topicRecommendListVM, xgx2, InterfaceC70422pa.this, null), interfaceC67352kd);
                            if (LJI2 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return LJI2;
                            }
                        }
                    } else if (xgx2 instanceof XGT) {
                        Object LJI3 = XKX.LJI(C36636EZk.LIZ, new C7PZ(xgx2, c7pv, str, z, topicRawInfo, InterfaceC70422pa.this, null), interfaceC67352kd);
                        if (LJI3 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                            return LJI3;
                        }
                    } else {
                        C48841JEv.LIZJ(InterfaceC70422pa.this, null);
                    }
                    return C76800UCe.LIZ;
                }
            };
            this.LJLIL = 1;
            if (interfaceC65462ha.collect(interfaceC64672gJ, this) == enumC58928NAu) {
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
