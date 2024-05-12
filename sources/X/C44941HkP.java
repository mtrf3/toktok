package X;

import android.graphics.Bitmap;
import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.StickerResizeHelperKt$resizePropImagesAsync$1", f = "StickerResizeHelper.kt", l = {37, 45}, m = "invokeSuspend")
/* renamed from: X.HkP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44941HkP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<IB3> LJLILLLLZI;
    public final /* synthetic */ int[] LJLJI;
    public final /* synthetic */ List<Bitmap> LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<IBJ, List<Bitmap>, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C44941HkP(List<IB3> list, int[] iArr, List<Bitmap> list2, InterfaceC88471Ynr<? super IBJ, ? super List<Bitmap>, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C44941HkP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = iArr;
        this.LJLJJI = list2;
        this.LJLJJL = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C44941HkP(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C141335gf.LIZJ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                }
            } else {
                C141335gf.LIZJ(obj);
                List<IB3> list = this.LJLILLLLZI;
                int[] iArr = this.LJLJI;
                List<Bitmap> list2 = this.LJLJJI;
                Iterator<IB3> it = list.iterator();
                while (it.hasNext()) {
                    Bitmap LJFF = C42307Gj1.LJFF(iArr[0], iArr[1], 0, 4, it.next().LJLILLLLZI);
                    if (LJFF != null) {
                        list2.add(LJFF);
                    }
                }
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                C44942HkQ c44942HkQ = new C44942HkQ(this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, null);
                this.LJLIL = 1;
                if (XKX.LJI(abstractC78621UtN, c44942HkQ, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception unused) {
            AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
            C44943HkR c44943HkR = new C44943HkR(this.LJLJJI, null, this.LJLJJL);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN2, c44943HkR, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
