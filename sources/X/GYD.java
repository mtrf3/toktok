package X;

import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$calculateBackgroundColor$1", f = "Forward2StoryEnvironment.kt", l = {294, 296, 301, 301}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GYD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super GYE>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public GYE LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ ForwardMedia LJLJJI;
    public final /* synthetic */ GYE LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GYD(ForwardMedia forwardMedia, GYE gye, InterfaceC67352kd<? super GYD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = forwardMedia;
        this.LJLJJL = gye;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GYD gyd = new GYD(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        gyd.LJLJI = obj;
        return gyd;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GYD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super GYE> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
