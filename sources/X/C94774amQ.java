package X;

import com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider$onFetchCategorySuccess$2", f = "DefaultResourceProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.amQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94774amQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DefaultResourceProvider LJLIL;
    public final /* synthetic */ CategoryPageModel LJLILLLLZI;
    public final /* synthetic */ AbstractC94464ahQ LJLJI;
    public final /* synthetic */ InterfaceC93663aUV LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94774amQ(DefaultResourceProvider defaultResourceProvider, CategoryPageModel categoryPageModel, AbstractC94464ahQ abstractC94464ahQ, InterfaceC93663aUV interfaceC93663aUV, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = defaultResourceProvider;
        this.LJLILLLLZI = categoryPageModel;
        this.LJLJI = abstractC94464ahQ;
        this.LJLJJI = interfaceC93663aUV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94774amQ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<Effect> list;
        C141335gf.LIZJ(obj);
        DefaultResourceProvider defaultResourceProvider = this.LJLIL;
        ConcurrentHashMap<String, Effect> concurrentHashMap = defaultResourceProvider.effectCache;
        CategoryEffectModel categoryEffects = this.LJLILLLLZI.getCategoryEffects();
        if (categoryEffects != null) {
            list = categoryEffects.getEffects();
        } else {
            list = null;
        }
        defaultResourceProvider.addAll(concurrentHashMap, list);
        this.LJLJJI.onSuccess(this.LJLJI.LJFF(this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
