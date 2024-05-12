package X;

import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.autocut.AutoCutEditHelper$clearDataAndCompressedFiles$2", f = "AutoCutEditHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63112dn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<String> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63112dn(List<String> list, InterfaceC67352kd<? super C63112dn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63112dn(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            Iterator<String> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                C44687HgJ.LJIILJJIL(it.next());
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }
}
