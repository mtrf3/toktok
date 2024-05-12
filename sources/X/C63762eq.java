package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.framework.utils.file.ECFileUtil$getLiveCapturePath$1", f = "ECFileUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63762eq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63762eq(String str, String str2, InterfaceC67352kd<? super C63762eq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63762eq(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Keva repo = Keva.getRepo("ec_live");
        String string = repo.getString("live_capture_file_name", null);
        if (string != null) {
            File file = new File(i0.LJFF(this.LJLILLLLZI, string));
            try {
                if (file.exists()) {
                    C16880lQ.LLLZZIL(file);
                }
            } catch (Exception unused) {
            }
        }
        repo.storeString("live_capture_file_name", this.LJLIL);
        return C76800UCe.LIZ;
    }
}
