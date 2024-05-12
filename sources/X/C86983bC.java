package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$loadData$2$1", f = "GiphyViewModel.kt", l = {135}, m = "invokeSuspend")
/* renamed from: X.3bC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86983bC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ GiphyViewModel LJLJI;
    public final /* synthetic */ Throwable LJLJJI;
    public final /* synthetic */ InterfaceC67352kd<A2G<Integer>> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C86983bC(long j, GiphyViewModel giphyViewModel, Throwable th, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd, InterfaceC67352kd<? super C86983bC> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLILLLLZI = j;
        this.LJLJI = giphyViewModel;
        this.LJLJJI = th;
        this.LJLJJL = interfaceC67352kd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C86983bC(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLILLLLZI;
            if (elapsedRealtime < 2000) {
                this.LJLIL = 1;
                if (C1JD.LIZJ(2000 - elapsedRealtime, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        this.LJLJI.LJLJLJ.postValue(this.LJLJJI);
        InterfaceC67352kd<A2G<Integer>> interfaceC67352kd = this.LJLJJL;
        if (interfaceC67352kd != null) {
            A2F a2f = A2G.LIZ;
            Exception exc = new Exception();
            a2f.getClass();
            A2I LIZJ = A2F.LIZJ(exc);
            C3C5.m7constructorimpl(LIZJ);
            interfaceC67352kd.resumeWith(LIZJ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
