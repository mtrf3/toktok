package X;

import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$zipAdvancedEffect$2", f = "MobileEffectUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3W8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3W8(String str, String str2, InterfaceC67352kd<? super C3W8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3W8(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String str = null;
        File LJFF = C43073GvN.LJFF(C60903NvH.LJIIJJI().LJJIJL().getPathService(), EnumC43651HBf.ADVANCED_MOBILE_EFFECT, null, 6);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("_effect.zip");
        File LLLILZJ = OR7.LLLILZJ(LJFF, X1D.LIZIZ(LIZ));
        try {
            C38977FRl.LJ(LLLILZJ.getAbsolutePath(), this.LJLILLLLZI);
            str = LLLILZJ.getAbsolutePath();
            return str;
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("failed to zip effect package, e=");
            LIZ2.append(th);
            H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ2));
            return str;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
