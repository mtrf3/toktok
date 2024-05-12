package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SharePanelContactsPreloadManager$recentLoader$1$1", f = "SharePanelContactsPreloadManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3HK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HK extends AbstractC65782Prm implements InterfaceC88471Ynr<C63120Opw, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C3HK(InterfaceC67352kd<? super C3HK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3HK c3hk = new C3HK(interfaceC67352kd);
        c3hk.LJLIL = obj;
        return c3hk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C63120Opw c63120Opw = (C63120Opw) this.LJLIL;
        C3R9 parameters = C82563Lw.LJLJJLL;
        o.LJIIIZ(parameters, "parameters");
        return Boolean.valueOf(new C3LH(parameters).LJIIL(c63120Opw));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C63120Opw c63120Opw, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(c63120Opw, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
