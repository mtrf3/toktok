package X;

import com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel$setText$1", f = "CaptionViewModel.kt", l = {117, 119}, m = "invokeSuspend")
/* renamed from: X.Beg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29298Beg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C29296Bee LJLIL;
    public CaptionViewModel LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ CaptionViewModel LJLJJI;
    public final /* synthetic */ C29296Bee LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29298Beg(CaptionViewModel captionViewModel, C29296Bee c29296Bee, InterfaceC67352kd<? super C29298Beg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = captionViewModel;
        this.LJLJJL = c29296Bee;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29298Beg(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C29296Bee c29296Bee;
        CaptionViewModel captionViewModel;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            captionViewModel = this.LJLILLLLZI;
            c29296Bee = this.LJLIL;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            CaptionViewModel captionViewModel2 = this.LJLJJI;
            C29301Bej c29301Bej = new C29301Bej(captionViewModel2.LJLIL, captionViewModel2.LJLILLLLZI);
            c29296Bee = this.LJLJJL;
            captionViewModel = this.LJLJJI;
            String str = c29296Bee.LIZ;
            this.LJLIL = c29296Bee;
            this.LJLILLLLZI = captionViewModel;
            this.LJLJI = 1;
            obj = c29301Bej.LIZJ(str, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return C76800UCe.LIZ;
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C29297Bef c29297Bef = new C29297Bef(c29296Bee, arrayList, captionViewModel, null);
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = 2;
        if (XKX.LJI(abstractC78621UtN, c29297Bef, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
