package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.result.common.core.ui.LiveInnerFlowAbility;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.lynx.spark.core.communicate.jsb.EcSearchLoadMoreLiveRooms$handle$1", f = "EcSearchLoadMoreLiveRooms.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.F3c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38344F3c extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ java.util.Map<String, Object> LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ IEcomSearchService LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ C37593EpB LJLJJLL;
    public final /* synthetic */ CompletionBlock<InterfaceC36553EWf> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38344F3c(java.util.Map<String, ? extends Object> map, Integer num, IEcomSearchService iEcomSearchService, View view, C37593EpB c37593EpB, CompletionBlock<InterfaceC36553EWf> completionBlock, InterfaceC67352kd<? super C38344F3c> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = map;
        this.LJLJI = num;
        this.LJLJJI = iEcomSearchService;
        this.LJLJJL = view;
        this.LJLJJLL = c37593EpB;
        this.LJLJL = completionBlock;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C38344F3c(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        long j;
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        String str5;
        int i3;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i4;
        String LJIIIIZZ;
        String LJIIIIZZ2;
        int i5;
        int i6;
        int i7;
        Integer num;
        Integer num2;
        String str14;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i8 = this.LJLIL;
        if (i8 != 0) {
            if (i8 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Object obj2 = this.LJLILLLLZI.get("keyword");
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            String str15 = "";
            if (str == null) {
                str = "";
            }
            Integer num7 = this.LJLJI;
            if (num7 != null) {
                j = num7.intValue();
            } else {
                j = 6;
            }
            Object obj3 = this.LJLILLLLZI.get("search_channel");
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            } else {
                str2 = null;
            }
            Object obj4 = this.LJLILLLLZI.get("source");
            if (!(obj4 instanceof String) || (str3 = (String) obj4) == null) {
                str3 = "";
            }
            Object obj5 = this.LJLILLLLZI.get("count");
            if ((obj5 instanceof Integer) && (num6 = (Integer) obj5) != null) {
                i = num6.intValue();
            } else {
                i = 6;
            }
            Object obj6 = this.LJLILLLLZI.get("search_id");
            if (!(obj6 instanceof String) || (str4 = (String) obj6) == null) {
                str4 = "";
            }
            Object obj7 = this.LJLILLLLZI.get("query_correct_type");
            if ((obj7 instanceof Integer) && (num5 = (Integer) obj7) != null) {
                i2 = num5.intValue();
            } else {
                i2 = 0;
            }
            Object obj8 = this.LJLILLLLZI.get("enter_from");
            if (!(obj8 instanceof String) || (str5 = (String) obj8) == null) {
                str5 = "";
            }
            Object obj9 = this.LJLILLLLZI.get("hot_search");
            if ((obj9 instanceof Integer) && (num4 = (Integer) obj9) != null) {
                i3 = num4.intValue();
            } else {
                i3 = 0;
            }
            Object obj10 = this.LJLILLLLZI.get("search_source");
            if (!(obj10 instanceof String) || (str6 = (String) obj10) == null) {
                str6 = "";
            }
            Object obj11 = this.LJLILLLLZI.get("last_search_id");
            if (obj11 instanceof String) {
                str7 = (String) obj11;
            } else {
                str7 = null;
            }
            Object obj12 = this.LJLILLLLZI.get("sug_tag_text");
            if (obj12 instanceof String) {
                str8 = (String) obj12;
            } else {
                str8 = null;
            }
            Object obj13 = this.LJLILLLLZI.get("sug_type");
            if (obj13 instanceof String) {
                str9 = (String) obj13;
            } else {
                str9 = null;
            }
            Object obj14 = this.LJLILLLLZI.get("sug_query_state");
            if (obj14 instanceof String) {
                str10 = (String) obj14;
            } else {
                str10 = null;
            }
            Object obj15 = this.LJLILLLLZI.get("attach_products");
            if (obj15 instanceof String) {
                str11 = (String) obj15;
            } else {
                str11 = null;
            }
            Object obj16 = this.LJLILLLLZI.get("traffic_source_list");
            if (obj16 instanceof String) {
                str12 = (String) obj16;
            } else {
                str12 = null;
            }
            Object obj17 = this.LJLILLLLZI.get("sug_creator_id");
            if (obj17 instanceof String) {
                str13 = (String) obj17;
            } else {
                str13 = null;
            }
            Object obj18 = this.LJLILLLLZI.get("is_filter_search");
            if ((obj18 instanceof Integer) && (num3 = (Integer) obj18) != null) {
                i4 = num3.intValue();
            } else {
                i4 = 0;
            }
            Object obj19 = this.LJLILLLLZI.get("ec_search_session_id");
            if ((!(obj19 instanceof String) || (LJIIIIZZ = (String) obj19) == null) && (LJIIIIZZ = this.LJLJJI.LJIIIIZZ("ec_search_session_id")) == null) {
                LJIIIIZZ = "";
            }
            Object obj20 = this.LJLILLLLZI.get("search_session_id");
            if ((!(obj20 instanceof String) || (LJIIIIZZ2 = (String) obj20) == null) && (LJIIIIZZ2 = this.LJLJJI.LJIIIIZZ("search_session_id")) == null) {
                LJIIIIZZ2 = "";
            }
            KFN kfn = new KFN(str, str6, str3, i3, i2, str4, str7, j, i, str5, str2, str8, str9, str10, str13, str11, str12, null, null, LJIIIIZZ, null, i4, null, null, LJIIIIZZ2, 5636096, null);
            java.util.Map<String, Object> map = this.LJLILLLLZI;
            Object obj21 = map.get("search_context");
            if ((obj21 instanceof String) && (str14 = (String) obj21) != null) {
                str15 = str14;
            }
            kfn.setSearchContext(str15);
            C50287JoR c50287JoR = new C50287JoR();
            Object obj22 = map.get("sort_type");
            if ((obj22 instanceof Integer) && (num2 = (Integer) obj22) != null) {
                i5 = num2.intValue();
            } else {
                i5 = 0;
            }
            c50287JoR.setSortType(i5);
            Object obj23 = map.get("filter_by");
            if ((obj23 instanceof Integer) && (num = (Integer) obj23) != null) {
                i6 = num.intValue();
            } else {
                i6 = 0;
            }
            c50287JoR.setFilterBy(i6);
            Object obj24 = map.get("is_filter_search");
            if (obj24 == null) {
                i7 = 0;
                obj24 = new Integer(0);
            } else {
                i7 = 0;
            }
            c50287JoR.setDefaultOption(o.LJ(obj24, new Integer(i7)));
            kfn.setFilterOption(c50287JoR);
            String str16 = null;
            LiveInnerFlowAbility liveInnerFlowAbility = (LiveInnerFlowAbility) C55096Ljo.LIZ(C55230Lly.LJ(this.LJLJJL), LiveInnerFlowAbility.class, null);
            if (liveInnerFlowAbility != null) {
                InterfaceC38263Ezz interfaceC38263Ezz = this.LJLJJLL.LJLIL;
                if (interfaceC38263Ezz != null) {
                    str16 = interfaceC38263Ezz.LIZIZ();
                }
                CompletionBlock<InterfaceC36553EWf> completionBlock = this.LJLJL;
                this.LJLIL = 1;
                if (liveInnerFlowAbility.rk0(str16, kfn, completionBlock, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
