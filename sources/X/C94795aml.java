package X;

import android.graphics.Bitmap;
import fjb.a;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl$cropIconAndRename$2", f = "TiktokEffectCreatePipelineImpl.kt", l = {438, 439}, m = "invokeSuspend")
/* renamed from: X.aml, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94795aml extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94795aml(String str, InterfaceC67352kd<? super C94795aml> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94795aml(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    int LJJLIIIJLLLLLLLZ = s.LJJLIIIJLLLLLLLZ(this.LJLILLLLZI, '.', 0, 6);
                    StringBuilder LIZ = X1D.LIZ();
                    String substring = this.LJLILLLLZI.substring(0, LJJLIIIJLLLLLLLZ);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    LIZ.append(substring);
                    LIZ.append("_crop");
                    String str = this.LJLILLLLZI;
                    String substring2 = str.substring(LJJLIIIJLLLLLLLZ, str.length());
                    o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    LIZ.append(substring2);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    C39579Fg7.LJJ(this.LJLILLLLZI, LIZIZ);
                    return LIZIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            String str2 = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = C66432j9.LIZ(str2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return null;
        }
        String str3 = this.LJLILLLLZI;
        this.LJLIL = 2;
        if (C66432j9.LIZIZ(bitmap, str3, null, this, 252) == enumC58928NAu) {
            return enumC58928NAu;
        }
        int LJJLIIIJLLLLLLLZ2 = s.LJJLIIIJLLLLLLLZ(this.LJLILLLLZI, '.', 0, 6);
        StringBuilder LIZ2 = X1D.LIZ();
        String substring3 = this.LJLILLLLZI.substring(0, LJJLIIIJLLLLLLLZ2);
        o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
        LIZ2.append(substring3);
        LIZ2.append("_crop");
        String str4 = this.LJLILLLLZI;
        String substring22 = str4.substring(LJJLIIIJLLLLLLLZ2, str4.length());
        o.LJIIIIZZ(substring22, "this as java.lang.String…ing(startIndex, endIndex)");
        LIZ2.append(substring22);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        C39579Fg7.LJJ(this.LJLILLLLZI, LIZIZ2);
        return LIZIZ2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
