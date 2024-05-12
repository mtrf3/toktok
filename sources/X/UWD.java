package X;

import defpackage.b0;
import fjb.a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.service.assets.giftlist.GiftListManager$handleError$1", f = "GiftListManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UWD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Throwable LJLIL;
    public final /* synthetic */ C77286UUw LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ UWM LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<UWI, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UWD(Throwable th, C77286UUw c77286UUw, int i, UWM uwm, InterfaceC88472Yns<? super UWI, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super UWD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = th;
        this.LJLILLLLZI = c77286UUw;
        this.LJLJI = i;
        this.LJLJJI = uwm;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UWD(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UWI uwe;
        Integer num;
        C141335gf.LIZJ(obj);
        Throwable th = this.LJLIL;
        if (th instanceof UWI) {
            uwe = (UWI) th;
        } else {
            String message = this.LJLIL.getMessage();
            if (message == null) {
                Throwable cause = this.LJLIL.getCause();
                if (cause != null) {
                    message = cause.getMessage();
                } else {
                    message = null;
                }
            }
            uwe = new UWE("Others", message);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleError: message = ");
        LIZ.append(uwe.getMessage());
        LIZ.append(" extraMessage = ");
        LIZ.append(uwe.getExtraMessage());
        LIZ.append(" code = ");
        LIZ.append(uwe.getClientCode());
        C0NB.LJ("GiftListManager", X1D.LIZIZ(LIZ));
        C77286UUw info = this.LJLILLLLZI;
        int i = this.LJLJI;
        o.LJIIIZ(info, "info");
        Long l = info.LJFF;
        if (l != null) {
            long longValue = l.longValue();
            String str = info.LJI;
            if (str != null) {
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - longValue);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("logGiftListFail ");
                b0.LJ(LIZ2, info.LJI, " takes ", millis);
                LIZ2.append(" ms");
                C0NB.LJIIIZ("GiftListV2Monitor", X1D.LIZIZ(LIZ2));
                Integer valueOf = Integer.valueOf(uwe.getClientCode());
                UWI.Companion.getClass();
                if (uwe instanceof UWG) {
                    num = ((UWG) uwe).getServerCode();
                } else if (uwe instanceof UWF) {
                    num = ((UWF) uwe).getServerCode();
                } else {
                    num = null;
                }
                C77285UUv.LIZLLL(str, millis, i, info, valueOf, num, uwe.getMessage(), uwe.getExtraMessage());
            }
        }
        if (uwe instanceof UWF) {
            this.LJLJJI.LJ = null;
        } else {
            this.LJLJJL.invoke(uwe);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
