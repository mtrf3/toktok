package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$updateTuningParam$1", f = "KaraokeViewModel.kt", l = {336, 339}, m = "invokeSuspend")
/* renamed from: X.2CA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ KaraokeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CA(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C2CA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = karaokeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2CA(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
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
            C0EV c0ev = this.LJLILLLLZI.LJLIL;
            this.LJLIL = 1;
            obj = c0ev.LJIIIZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (o.LJ(((LiveEffect) obj2).getResourceId(), InterfaceC30442Bx8.B3.LIZJ())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        LiveEffect liveEffect = (LiveEffect) obj2;
        if (liveEffect != null) {
            KaraokeViewModel karaokeViewModel = this.LJLILLLLZI;
            this.LJLIL = 2;
            if (karaokeViewModel.gv0(liveEffect) == enumC58928NAu) {
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
