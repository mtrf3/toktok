package X;

import fjb.a;
import java.io.File;
import ujb.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.shared.UserProfileVideoLruCache$deleteFile$2", f = "UserProfileVideoLruCache.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2fA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63962fA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63962fA(String str, InterfaceC67352kd<? super C63962fA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63962fA(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String LJJJJZ;
        C141335gf.LIZJ(obj);
        String str = this.LJLIL;
        if (str != null) {
            C16880lQ.LLLZZIL(new File(str));
        }
        String str2 = this.LJLIL;
        if (str2 == null || (LJJJJZ = o.LJJJJZ(str2, "aweme_publish", "aweme_popular", false)) == null) {
            return null;
        }
        return Boolean.valueOf(C16880lQ.LLLZZIL(new File(LJJJJZ)));
    }
}
