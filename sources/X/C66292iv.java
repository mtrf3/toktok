package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$Companion$getInstance$initUid$awaitUid$1", f = "StorageDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2iv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66292iv extends AbstractC65782Prm implements InterfaceC88471Ynr<String, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C66292iv(InterfaceC67352kd<? super C66292iv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C66292iv c66292iv = new C66292iv(interfaceC67352kd);
        c66292iv.LJLIL = obj;
        return c66292iv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String str = (String) this.LJLIL;
        boolean z = true;
        if (str.length() <= 0 || o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(String str, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(str, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
