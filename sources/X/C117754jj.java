package X;

import Y.IDcS364S0100000_1;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.sender.VideoMsgSender$onUploadSuccess$2", f = "VideoMsgSender.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117754jj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C117844js LJLIL;
    public final /* synthetic */ G0D LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<C117844js, C76800UCe> LJLJI;
    public final /* synthetic */ C109544Rq LJLJJI;
    public final /* synthetic */ C117994k7 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C117754jj(C117844js c117844js, G0D g0d, InterfaceC88472Yns<? super C117844js, C76800UCe> interfaceC88472Yns, C109544Rq c109544Rq, C117994k7 c117994k7, InterfaceC67352kd<? super C117754jj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c117844js;
        this.LJLILLLLZI = g0d;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = c109544Rq;
        this.LJLJJL = c117994k7;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C117754jj(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        C117844js c117844js = this.LJLIL;
        G0D g0d = this.LJLILLLLZI;
        c117844js.getClass();
        if (g0d != null) {
            str = (String) g0d.LJLILLLLZI;
        } else {
            str = null;
        }
        C117844js LIZIZ = C117844js.LIZIZ(C117844js.LIZIZ(c117844js, null, null, str, 0, 0, null, 247), null, null, null, 0, 0, EnumC117804jo.UPLOADED, 191);
        InterfaceC88472Yns<C117844js, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(LIZIZ);
        }
        C31F.LIZ.getClass();
        C31G.LIZ();
        String uuid = this.LJLJJI.getUuid();
        o.LJIIIIZZ(uuid, "msg.uuid");
        C109544Rq LJIILJJIL = C63150OqQ.LJIILJJIL(uuid);
        if (LJIILJJIL == null || LJIILJJIL.isDeleted() || LJIILJJIL == null) {
            return C76800UCe.LIZ;
        }
        C117994k7 c117994k7 = this.LJLJJL;
        LJIILJJIL.setScene("private_video");
        String str2 = LIZIZ.LIZLLL;
        if (str2 == null) {
            str2 = "";
        }
        LJIILJJIL.setContentPB(C117714jf.LIZ(LIZIZ.LJ, LIZIZ.LJFF, str2).encode());
        LJIILJJIL.setAttachments(LIZIZ.LIZ(LJIILJJIL.getUuid()));
        C106674Gp.LJIIL(new IDcS364S0100000_1(c117994k7, 7), LJIILJJIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
