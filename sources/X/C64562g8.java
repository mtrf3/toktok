package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.common.StorageLegoTask$run$1$loginUid$1", f = "StorageLegoTask.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2g8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64562g8 extends AbstractC65782Prm implements InterfaceC88471Ynr<String, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C64562g8(InterfaceC67352kd<? super C64562g8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C64562g8 c64562g8 = new C64562g8(interfaceC67352kd);
        c64562g8.LJLIL = obj;
        return c64562g8;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String str = (String) this.LJLIL;
        boolean z = false;
        if (HG3.LJIILL().isLogin() && str.length() > 0 && !o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(String str, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(str, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
