package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$fetchVoiceListByOnlyCategory$2", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5bQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138085bQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<List<ReadTextEffectBean>> LJLIL;
    public final /* synthetic */ C138075bP LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138085bQ(List<List<ReadTextEffectBean>> list, C138075bP c138075bP, InterfaceC67352kd<? super C138085bQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c138075bP;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C138085bQ(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.isEmpty()) {
            this.LJLILLLLZI.LLILLJJLI.LIZ(C1DH.LJJJIL(new C138355br().LIZ(900)));
            this.LJLILLLLZI.LLILLJJLI.LIZ.put("error_msg", "fetch voice list failed");
        } else {
            C138075bP c138075bP = this.LJLILLLLZI;
            c138075bP.LLIIII = this.LJLIL;
            C138795cZ.LIZ(c138075bP.LLJZIJLIL());
            List<ReadTextEffectBean> LIZ = C138905ck.LIZ(this.LJLIL);
            if (this.LJLILLLLZI.LLLILZLLLI().bx()) {
                this.LJLILLLLZI.LLLILZLLLI().M40(LIZ);
            }
            C138075bP c138075bP2 = this.LJLILLLLZI;
            c138075bP2.LLJJIJI(LIZ);
            c138075bP2.LLIIIILZ = LIZ;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
