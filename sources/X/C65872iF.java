package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.StoryPublishServiceImpl$getCover$1", f = "StoryPublishServiceImpl.kt", l = {70}, m = "invokeSuspend")
/* renamed from: X.2iF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65872iF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65872iF(String str, InterfaceC67352kd interfaceC67352kd, InterfaceC88472Yns interfaceC88472Yns) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65872iF(this.LJLILLLLZI, interfaceC67352kd, this.LJLJI);
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
            Bitmap decodeFile = BitmapFactory.decodeFile(this.LJLILLLLZI);
            XIF xif = EXT.LIZ;
            C65272hH c65272hH = new C65272hH(this.LJLJI, decodeFile, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, c65272hH, this) == enumC58928NAu) {
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
