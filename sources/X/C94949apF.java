package X;

import com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider;
import com.bytedance.ies.effectcreator.swig.LokiInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.draftupdate.DraftUpdater$updateDraftResources$updateFlow$1$1", f = "DraftUpdater.kt", l = {66, 67}, m = "invokeSuspend")
/* renamed from: X.apF, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94949apF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super Effect>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ LokiInfo LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94949apF(LokiInfo lokiInfo, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = lokiInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C94949apF c94949apF = new C94949apF(this.LJLJI, completion);
        c94949apF.LJLIL = obj;
        return c94949apF;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super Effect> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC64672gJ interfaceC64672gJ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLIL;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLIL;
            IEffectPlatformResourceProvider LIZ = C93726aVW.LIZ();
            LokiInfo it = this.LJLJI;
            o.LJIIIIZZ(it, "it");
            String identify = it.getIdentify();
            o.LJIIIIZZ(identify, "it.identify");
            this.LJLIL = interfaceC64672gJ;
            this.LJLILLLLZI = 1;
            obj = LIZ.downloadEffectById(identify, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        if (interfaceC64672gJ.emit(obj, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }
}
