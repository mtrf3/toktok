package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectEditText$initBgRes$2$2", f = "EffectEditText.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ETI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InnerEffectTextConfig LJLIL;
    public final /* synthetic */ WH4 LJLILLLLZI;
    public final /* synthetic */ ArrayList<W1T> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ETI(InnerEffectTextConfig innerEffectTextConfig, WH4 wh4, ArrayList<W1T> arrayList, InterfaceC67352kd<? super ETI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = innerEffectTextConfig;
        this.LJLILLLLZI = wh4;
        this.LJLJI = arrayList;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ETI(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (o.LJ(this.LJLIL, this.LJLILLLLZI.getInnerTextConfig())) {
            ((ArrayList) this.LJLILLLLZI.LJLL).clear();
            ((ArrayList) this.LJLILLLLZI.LJLL).addAll(this.LJLJI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
