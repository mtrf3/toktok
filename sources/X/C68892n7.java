package X;

import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView$setSegment$3$1", f = "StickerItemView.kt", l = {240}, m = "invokeSuspend")
/* renamed from: X.2n7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68892n7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C130525Ai LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68892n7(C130525Ai c130525Ai, long j, InterfaceC67352kd<? super C68892n7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c130525Ai;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68892n7(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C72682tE c72682tE = C72682tE.LIZ;
            String ttsAudioPath = this.LJLILLLLZI.getTtsAudioPath();
            int i2 = (int) (this.LJLJI / 33);
            this.LJLIL = 1;
            obj = c72682tE.LIZ(ttsAudioPath, i2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        float[] fArr = (float[]) obj;
        C130525Ai c130525Ai = this.LJLILLLLZI;
        int length = fArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            ((ArrayList) c130525Ai.LLIIJLIL).add(new OSZ(new Long(i4 * 33), new Float(fArr[i3])));
            i3++;
            i4++;
        }
        this.LJLILLLLZI.requestLayout();
        this.LJLILLLLZI.postInvalidate();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
