package X;

import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import fjb.a;
import kotlin.jvm.internal.AqS152S0100000_2;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.ui.ImageEditRootScene$nextToPublish$1", f = "ImageEditRootScene.kt", l = {1173}, m = "invokeSuspend")
/* renamed from: X.5rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148255rp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ImageEditRootScene LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C148255rp(ImageEditRootScene imageEditRootScene, InterfaceC67352kd<? super C148255rp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = imageEditRootScene;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C148255rp(this.LJLILLLLZI, interfaceC67352kd);
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
            XIA xia = C78613UtF.LIZJ;
            C149545tu c149545tu = new C149545tu(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            if (XKX.LJI(xia, c149545tu, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ImageEditRootScene imageEditRootScene = this.LJLILLLLZI;
        imageEditRootScene.LLLLIL(new AqS152S0100000_2(imageEditRootScene, 739), true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
