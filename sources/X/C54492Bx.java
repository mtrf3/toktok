package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$handleSongUserAction$2$success$downloadTask$1", f = "KaraokeViewModel.kt", l = {807, 828}, m = "invokeSuspend")
/* renamed from: X.2Bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54492Bx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ KaraokeViewModel LJLILLLLZI;
    public final /* synthetic */ C31271Kp LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54492Bx(KaraokeViewModel karaokeViewModel, C31271Kp c31271Kp, InterfaceC67352kd<? super C54492Bx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = karaokeViewModel;
        this.LJLJI = c31271Kp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54492Bx(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            KaraokeViewModel karaokeViewModel = this.LJLILLLLZI;
            C23080vQ c23080vQ = karaokeViewModel.LLFFF;
            C279917z c279917z = this.LJLJI.LIZIZ;
            String panel = karaokeViewModel.LJLJJLL.LIZJ().getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HitchHiking Panel Param: ");
            LIZ.append(panel);
            C0NB.LIZIZ("KaraokeViewModel", X1D.LIZIZ(LIZ));
            c279917z.getClass();
            o.LJIIIZ(panel, "panel");
            c279917z.LJI.putString("panel", panel);
            IDqS443S0100000 iDqS443S0100000 = new IDqS443S0100000(this.LJLILLLLZI, 13);
            this.LJLIL = 1;
            obj = c23080vQ.LIZIZ(c279917z, false, iDqS443S0100000, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        EnumC23060vO enumC23060vO = (EnumC23060vO) obj;
        this.LJLILLLLZI.yv0(C31311Kt.LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("download: ");
        LIZ2.append(enumC23060vO);
        C0NB.LIZIZ("KDownloader", X1D.LIZIZ(LIZ2));
        KaraokeViewModel karaokeViewModel2 = this.LJLILLLLZI;
        C279917z c279917z2 = this.LJLJI.LIZIZ;
        this.LJLIL = 2;
        obj = karaokeViewModel2.vv0(enumC23060vO, c279917z2, this);
        if (obj != enumC58928NAu) {
            return obj;
        }
        return enumC58928NAu;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
