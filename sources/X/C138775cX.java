package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.unlocktts.UnlockReadTextVoiceComponent$fetchVoiceEffectList$1", f = "UnlockReadTextVoiceComponent.kt", l = {127, 128, 149}, m = "invokeSuspend")
/* renamed from: X.5cX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138775cX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C138805ca LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138775cX(C138805ca c138805ca, InterfaceC67352kd<? super C138775cX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c138805ca;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C138775cX(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (RuntimeException e) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C138785cY c138785cY = new C138785cY(this.LJLILLLLZI, e, null);
            this.LJLIL = 3;
            if (XKX.LJI(abstractC78621UtN, c138785cY, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C141335gf.LIZJ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                }
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C138905ck LIZ = C138795cZ.LIZ(this.LJLILLLLZI.LJJLIIJ());
            InterfaceC88472Yns<EffectCategoryModel, Boolean> interfaceC88472Yns = this.LJLILLLLZI.LJLLLL;
            this.LJLIL = 1;
            obj = LIZ.LIZIZ(interfaceC88472Yns, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
        C138765cW c138765cW = new C138765cW((List) obj, this.LJLILLLLZI, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN2, c138765cW, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
