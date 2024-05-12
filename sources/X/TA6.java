package X;

import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM$updateEffectImage$1", f = "EffectEditVM.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class TA6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ android.net.Uri LJLIL;
    public final /* synthetic */ EffectEditVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TA6(android.net.Uri uri, EffectEditVM effectEditVM, InterfaceC67352kd<? super TA6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = uri;
        this.LJLILLLLZI = effectEditVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new TA6(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String parent;
        C141335gf.LIZJ(obj);
        String path = this.LJLIL.getPath();
        if (path != null) {
            EffectEditVM effectEditVM = this.LJLILLLLZI;
            File file = new File(path);
            if (file.exists() && file.getParent() != null && (parent = file.getParent()) != null) {
                StringBuilder LJFF = C72972SkS.LJFF(parent, '/');
                LJFF.append(System.currentTimeMillis());
                LJFF.append(".png");
                String LIZIZ = X1D.LIZIZ(LJFF);
                C39579Fg7.LJJ(path, LIZIZ);
                effectEditVM.setState(new AqS35S1000000_12(LIZIZ, 1));
                if (effectEditVM.gv0().mode == TAE.PUBLISH) {
                    java.util.Map<String, String> map = C74186T9q.LIZLLL(effectEditVM.gv0()).LIZ;
                    o.LJIIIIZZ(map, "eventBuilder.builder()");
                    C78897Uxp.LJJJ("publish_effect_page_edit_thumbnail", map);
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
