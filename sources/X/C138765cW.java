package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.unlocktts.UnlockReadTextVoiceComponent$fetchVoiceEffectList$1$1", f = "UnlockReadTextVoiceComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5cW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138765cW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<List<ReadTextEffectBean>> LJLIL;
    public final /* synthetic */ C138805ca LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138765cW(List<List<ReadTextEffectBean>> list, C138805ca c138805ca, InterfaceC67352kd<? super C138765cW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c138805ca;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C138765cW(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.isEmpty()) {
            InterfaceC138705cQ LJJLJ = this.LJLILLLLZI.LJJLJ();
            if (LJJLJ == null) {
                return null;
            }
            LJJLJ.Mz(null);
            return C76800UCe.LIZ;
        }
        this.LJLILLLLZI.LJLJLLL.clear();
        C138805ca c138805ca = this.LJLILLLLZI;
        List<ReadTextEffectBean> list = c138805ca.LJLJLLL;
        C138795cZ.LIZ(c138805ca.LJJLIIJ());
        list.addAll(C138905ck.LIZ(this.LJLIL));
        InterfaceC138705cQ LJJLJ2 = this.LJLILLLLZI.LJJLJ();
        if (LJJLJ2 != null) {
            LJJLJ2.jU(this.LJLIL);
        }
        InterfaceC138705cQ LJJLJ3 = this.LJLILLLLZI.LJJLJ();
        if (LJJLJ3 != null) {
            LJJLJ3.Hd0(new ArrayList(this.LJLILLLLZI.LJLJLLL));
        }
        InterfaceC138705cQ LJJLJ4 = this.LJLILLLLZI.LJJLJ();
        if (LJJLJ4 != null) {
            LJJLJ4.Mz(null);
        }
        if (!this.LJLILLLLZI.LJLJLLL.isEmpty()) {
            C138805ca c138805ca2 = this.LJLILLLLZI;
            c138805ca2.LJLJJLL(c138805ca2.LJLJLLL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
