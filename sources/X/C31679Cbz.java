package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import fjb.a;
import java.io.File;
import java.io.FileInputStream;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.util.NinePatchUtil$loadNinePatchImage$1$bitmap$1", f = "NinePatchUtil.kt", l = {50}, m = "invokeSuspend")
/* renamed from: X.Cbz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31679Cbz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Bitmap>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC31680Cc0 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31679Cbz(String str, InterfaceC31680Cc0 interfaceC31680Cc0, InterfaceC67352kd<? super C31679Cbz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC31680Cc0;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C31679Cbz(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                String str = this.LJLILLLLZI;
                this.LJLIL = 1;
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                W5U.LJIIIIZZ(str).LJII(new C31681Cc1(c84654XKg));
                obj = c84654XKg.LIZ();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return BitmapFactory.decodeStream(new FileInputStream((File) obj));
        } catch (Throwable th) {
            InterfaceC31680Cc0 interfaceC31680Cc0 = this.LJLJI;
            if (interfaceC31680Cc0 != null) {
                interfaceC31680Cc0.onFailed(th);
            }
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
