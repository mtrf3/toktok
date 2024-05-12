package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.anchor.MovieTokAnchorBusinessService$handleIconClick$1", f = "MovieTokAnchorBusinessService.kt", l = {398}, m = "invokeSuspend")
/* renamed from: X.7S1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7S1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC65462ha<XGX<? extends InterfaceC199277rv>> LJLJI;
    public final /* synthetic */ C7S8 LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ AnchorCommonStruct LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7S1(InterfaceC65462ha<? extends XGX<? extends InterfaceC199277rv>> interfaceC65462ha, C7S8 c7s8, String str, boolean z, AnchorCommonStruct anchorCommonStruct, InterfaceC67352kd<? super C7S1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC65462ha;
        this.LJLJJI = c7s8;
        this.LJLJJL = str;
        this.LJLJJLL = z;
        this.LJLJL = anchorCommonStruct;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C7S1 c7s1 = new C7S1(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c7s1.LJLILLLLZI = obj;
        return c7s1;
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
            final C7S8 c7s8 = this.LJLJJI;
            final String str = this.LJLJJL;
            final boolean z = this.LJLJJLL;
            final AnchorCommonStruct anchorCommonStruct = this.LJLJL;
            InterfaceC64672gJ<XGX<? extends InterfaceC199277rv>> interfaceC64672gJ = new InterfaceC64672gJ<XGX<? extends InterfaceC199277rv>>() { // from class: X.7S0
                @Override // X.InterfaceC64672gJ
                public final Object emit(XGX<? extends InterfaceC199277rv> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    XGX<? extends InterfaceC199277rv> xgx2 = xgx;
                    if (xgx2 instanceof XGW) {
                        if (C78977Uz7.LJJJJI(xgx2.LIZJ) == EnumC78982UzC.Optimistic) {
                            Object LJI = XKX.LJI(C36636EZk.LIZ, new C7S2(c7s8, str, z, anchorCommonStruct, null), interfaceC67352kd);
                            if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return LJI;
                            }
                        } else {
                            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                            boolean z2 = z;
                            Object LJI2 = XKX.LJI(abstractC78621UtN, new C186067Ry(xgx2, anchorCommonStruct, c7s8, str, null, InterfaceC70422pa.this, z2), interfaceC67352kd);
                            if (LJI2 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return LJI2;
                            }
                        }
                    } else if (xgx2 instanceof XGT) {
                        Object LJI3 = XKX.LJI(C36636EZk.LIZ, new C186077Rz(xgx2, anchorCommonStruct, c7s8, str, null, InterfaceC70422pa.this, z), interfaceC67352kd);
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
