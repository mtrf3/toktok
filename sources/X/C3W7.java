package X;

import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$makeUploadEffectIcon$2", f = "MobileEffectUtil.kt", l = {448}, m = "invokeSuspend")
/* renamed from: X.3W7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3W7(String str, String str2, InterfaceC67352kd<? super C3W7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3W7(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            File LJFF = C43073GvN.LJFF(C60903NvH.LJIIJJI().LJJIJL().getPathService(), EnumC43651HBf.ADVANCED_MOBILE_EFFECT, null, 6);
            String str = this.LJLILLLLZI;
            String substring = str.substring(s.LJJLIIJ(str, "/", 6) + 1);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI);
            LIZ.append(substring);
            String newUploadIconPath = OR7.LLLILZJ(LJFF, X1D.LIZIZ(LIZ)).getAbsolutePath();
            C39579Fg7.LIZLLL(this.LJLILLLLZI, newUploadIconPath);
            o.LJIIIIZZ(newUploadIconPath, "newUploadIconPath");
            this.LJLIL = 1;
            obj = XKX.LJI(C78613UtF.LIZJ, new C66422j8(newUploadIconPath, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
