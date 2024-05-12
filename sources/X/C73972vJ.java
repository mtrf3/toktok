package X;

import android.os.SystemClock;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel;
import com.google.gson.j;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel$2$1$1", f = "CaptionViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2vJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73972vJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ CaptionViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73972vJ(String str, CaptionViewModel captionViewModel, InterfaceC67352kd<? super C73972vJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = captionViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73972vJ(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            j LJJIJ = C38393F4z.LJ(this.LJLIL).LJJIJ("ts");
            if (LJJIJ != null) {
                CaptionViewModel captionViewModel = this.LJLILLLLZI;
                long LJIJJLI = LJJIJ.LJIJJLI();
                C0NB.LIZIZ("SeiHelper", String.valueOf(LJIJJLI));
                captionViewModel.LJLLI = LJIJJLI;
                this.LJLILLLLZI.LJLLILLLL = SystemClock.elapsedRealtime();
            }
        } catch (Exception e) {
            C0NB.LIZIZ("CaptionViewModel", e.toString());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
