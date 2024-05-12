package X;

import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.ss.android.ugc.aweme.topic.search.api.RecommendTopicResponse;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM$getRecommendList$1", f = "TopicRecommendListVM.kt", l = {83}, m = "invokeSuspend")
/* renamed from: X.7PP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7PP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TopicRecommendListVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7PP(TopicRecommendListVM topicRecommendListVM, InterfaceC67352kd<? super C7PP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = topicRecommendListVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7PP(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ?? r3;
        Boolean bool;
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
                C7PN c7pn = (C7PN) this.LJLILLLLZI.LJLJL.getValue().getOperator();
                TopicRecommendListVM topicRecommendListVM = this.LJLILLLLZI;
                String str = topicRecommendListVM.LJLILLLLZI;
                if (str != null) {
                    int type = topicRecommendListVM.gv0().getType();
                    this.LJLIL = 1;
                    obj = c7pn.LJLJI(type, str, null, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    o.LJIJI("topicId");
                    throw null;
                }
            }
            RecommendTopicResponse recommendTopicResponse = (RecommendTopicResponse) obj;
            List<TopicRawInfo> list = recommendTopicResponse.topicInfoList;
            if (list != null) {
                TopicRecommendListVM topicRecommendListVM2 = this.LJLILLLLZI;
                r3 = new ArrayList(C32I.LJJL(list, 10));
                for (TopicRawInfo topicRawInfo : list) {
                    ArrayList arrayList = new ArrayList();
                    String str2 = topicRawInfo.title;
                    boolean z = false;
                    if (str2 != null) {
                        arrayList.add(new Position(0, str2.length() - 1));
                    }
                    String str3 = topicRecommendListVM2.LJLJJI;
                    if (str3 != null) {
                        if (str3.length() == 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    } else {
                        bool = null;
                    }
                    String str4 = topicRecommendListVM2.LJLJI;
                    if (str4 != null) {
                        r3.add(new C184817Nd(topicRawInfo, arrayList, null, bool, str4, 4));
                    } else {
                        o.LJIJI("vmID");
                        throw null;
                    }
                }
            } else {
                r3 = C61878OQg.INSTANCE;
            }
            this.LJLILLLLZI.setState(new AqS134S0200000_3((List) r3, (List<C184817Nd>) recommendTopicResponse, (RecommendTopicResponse) 15));
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
