package X;

import com.bytedance.keva.Keva;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.controller.manager.ShareVideoRecordsManager$addExternalShareRecord$1", f = "ShareVideoRecordsManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66322iy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Keva LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66322iy(String str, Keva keva, InterfaceC67352kd<? super C66322iy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = keva;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66322iy(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C67532kv c67532kv = C67532kv.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EnumC66332iz.EXTERNAL.getValue());
        LIZ.append(':');
        LIZ.append(this.LJLIL);
        c67532kv.LIZLLL(C47261Igj.LJJIJ(X1D.LIZIZ(LIZ)), this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
