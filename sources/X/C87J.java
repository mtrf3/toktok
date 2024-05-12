package X;

import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.ISearchService;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem$showTakoCommonConditionAsync$2", f = "TakoAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.87J, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87J extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ TakoAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87J(TakoAssem takoAssem, InterfaceC67352kd<? super C87J> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = takoAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C87J(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        M89 m89;
        C141335gf.LIZJ(obj);
        ISearchService r4 = this.LJLIL.r4();
        boolean z = false;
        if (r4 != null) {
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLIL)).getAweme();
            o.LJIIIIZZ(aweme, "item.aweme");
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLIL)).baseFeedPageParams;
            if (baseFeedPageParams != null) {
                m89 = baseFeedPageParams.param;
            } else {
                m89 = null;
            }
            if (r4.LJI(aweme, m89)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
