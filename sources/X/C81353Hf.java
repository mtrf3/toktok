package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SharePanelContactsPreloadManager$recentLoader$1$3", f = "SharePanelContactsPreloadManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81353Hf extends AbstractC65782Prm implements InterfaceC88471Ynr<IMContact, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C81353Hf(InterfaceC67352kd<? super C81353Hf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C81353Hf c81353Hf = new C81353Hf(interfaceC67352kd);
        c81353Hf.LJLIL = obj;
        return c81353Hf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IMContact iMContact = (IMContact) this.LJLIL;
        C3R9 parameters = C82563Lw.LJLJJLL;
        o.LJIIIZ(parameters, "parameters");
        return Boolean.valueOf(new C3LJ(parameters).LJIIL(iMContact));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(IMContact iMContact, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(iMContact, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
