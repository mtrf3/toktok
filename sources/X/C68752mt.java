package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.flashsale.FlashSaleCountDownManager$startCountDown$1", f = "FlashSaleCountDownManager.kt", l = {LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.2mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68752mt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C68762mu LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68752mt(C68762mu c68762mu, long j, InterfaceC67352kd<? super C68752mt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c68762mu;
        this.LJLJJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68752mt c68752mt = new C68752mt(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c68752mt.LJLILLLLZI = obj;
        return c68752mt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        long j;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
        }
        while (this.LJLJI.LIZJ != 3 && C48841JEv.LJIILLIIL(interfaceC70422pa)) {
            this.LJLJI.LIZIZ = SystemClock.elapsedRealtime();
            C68762mu c68762mu = this.LJLJI;
            long j2 = c68762mu.LJFF;
            long j3 = c68762mu.LJI;
            long j4 = c68762mu.LIZIZ;
            boolean z = false;
            if (j2 <= j4 && j4 < j3) {
                z = true;
            }
            if (z) {
                c68762mu.LIZJ = 2;
                j = j3 - j4;
                c68762mu.LIZ = j;
                long j5 = this.LJLJJI;
                if (j > j5) {
                    j = j5;
                }
            } else if (j4 >= j3) {
                c68762mu.LIZ = 0L;
                c68762mu.LIZJ = 3;
                j = -1;
            } else {
                c68762mu.LIZ = j3 - j4;
                c68762mu.LIZJ = 4;
                j = j2 - j4;
            }
            Iterator it = ((ArrayList) c68762mu.LJ).iterator();
            while (it.hasNext()) {
                ((InterfaceC88473Ynt) it.next()).invoke(Integer.valueOf(c68762mu.LIZJ), Integer.valueOf(c68762mu.LIZLLL), Long.valueOf(c68762mu.LIZ));
            }
            c68762mu.LIZLLL = c68762mu.LIZJ;
            if (j <= 0) {
                return C76800UCe.LIZ;
            }
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
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
