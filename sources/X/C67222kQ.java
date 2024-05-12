package X;

import android.content.Context;
import android.graphics.Bitmap;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView$getDrawBitmap$1", f = "StickerItemView.kt", l = {473, 474}, m = "invokeSuspend")
/* renamed from: X.2kQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67222kQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C130525Ai LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67222kQ(C130525Ai c130525Ai, String str, InterfaceC67352kd<? super C67222kQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c130525Ai;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67222kQ(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            int measuredHeight = this.LJLILLLLZI.getMeasuredHeight() / 2;
            C130525Ai c130525Ai = this.LJLILLLLZI;
            Context context = c130525Ai.getContext();
            o.LJIIIIZZ(context, "context");
            String str = this.LJLJI;
            this.LJLIL = 1;
            obj = c130525Ai.LJIIJJI(context, str, measuredHeight, measuredHeight, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C67232kR c67232kR = new C67232kR(this.LJLILLLLZI, (Bitmap) obj, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, c67232kR, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
