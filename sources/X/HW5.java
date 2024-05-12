package X;

import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectplatform.EffectStorageCleanServiceImpl$tryClean$1", f = "EffectStorageCleanServiceImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HW5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ EffectConfiguration LJLIL;
    public final /* synthetic */ EffectManager LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Long, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HW5(EffectConfiguration effectConfiguration, EffectManager effectManager, InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super HW5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = effectConfiguration;
        this.LJLILLLLZI = effectManager;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new HW5(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            ArrayList<String> draftList = EffectPlatform.LJJJLIIL(true);
            H7B.LIZIZ("EffectStorageClean", "configuration.draftList:" + draftList);
            String absolutePath = this.LJLIL.getEffectDir().getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "configuration.effectDir.absolutePath");
            InterfaceC84458XCs LIZ = C84395XAh.LIZ(absolutePath);
            if (LIZ != null) {
                o.LJIIIIZZ(draftList, "draftList");
                LIZ.LIZ(draftList);
            }
            this.LJLJI.invoke(new Long(this.LJLILLLLZI.removeUnused(2592000000L)));
        } catch (Exception unused) {
            this.LJLJI.invoke(new Long(0L));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
