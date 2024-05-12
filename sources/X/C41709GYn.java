package X;

import Y.AfS56S0200000_7;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$calculateSingeImageBackgroundColor$1", f = "ForwardOnThisDayEnvironment.kt", l = {597}, m = "invokeSuspend")
/* renamed from: X.GYn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41709GYn extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super OSZ<? extends GYE, ? extends CanvasVideoData>>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ CreativeInfo LJLJI;
    public final /* synthetic */ GYE LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41709GYn(CreativeInfo creativeInfo, GYE gye, InterfaceC67352kd<? super C41709GYn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = creativeInfo;
        this.LJLJJI = gye;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41709GYn c41709GYn = new C41709GYn(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c41709GYn.LJLILLLLZI = obj;
        return c41709GYn;
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
            C3CK c3ck = (C3CK) this.LJLILLLLZI;
            C138895cj.LIZ(new C138895cj(this.LJLJI, new GYB(0)), this.LJLJJI.LIZ, false, null, false, false, 60).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0200000_7(c3ck, this.LJLJJI, 17), C41714GYs.LJLIL);
            C41717GYv c41717GYv = C41717GYv.LJLIL;
            this.LJLIL = 1;
            if (C3T0.LIZ(c3ck, c41717GYv, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super OSZ<? extends GYE, ? extends CanvasVideoData>> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
