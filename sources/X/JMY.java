package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;

/* loaded from: classes9.dex */
public final class JMY implements JMX {
    public final InterfaceC88472Yns<C48998JKw, C76800UCe> LIZ;

    @Override // X.JMX
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZIZ() {
        SearchComponentCenter.LIZ.getClass();
        return C49032JMe.LIZ().LIZIZ();
    }

    @Override // X.InterfaceC49036JMi
    public final InterfaceC87283bg getConfig() {
        InterfaceC88472Yns<C48998JKw, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns == null) {
            return null;
        }
        C48998JKw c48998JKw = new C48998JKw(null);
        interfaceC88472Yns.invoke(c48998JKw);
        return c48998JKw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JMY(InterfaceC88472Yns<? super C48998JKw, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }
}
