package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$fetchVoiceEffectList$1$1", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5aX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137535aX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<ReadTextEffectBean> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C138075bP LJLJI;
    public final /* synthetic */ TextStickerData LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C137535aX(List<? extends ReadTextEffectBean> list, boolean z, C138075bP c138075bP, TextStickerData textStickerData, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C137535aX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = z;
        this.LJLJI = c138075bP;
        this.LJLJJI = textStickerData;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137535aX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.isEmpty()) {
            if (!this.LJLILLLLZI) {
                this.LJLJI.LLJJ(this.LJLJJI);
            }
        } else if (!this.LJLILLLLZI) {
            this.LJLJI.LLFII = true;
            this.LJLJI.LLIILZL(this.LJLJJI);
        }
        this.LJLJJL.invoke();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
