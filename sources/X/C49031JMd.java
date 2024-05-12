package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import kotlin.jvm.internal.AqS174S0100000_8;

/* renamed from: X.JMd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49031JMd implements JMX {
    public final InterfaceC88472Yns<C49033JMf, C76800UCe> LIZ;

    @Override // X.JMX
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZIZ() {
        SearchComponentCenter.LIZ.getClass();
        return C49032JMe.LIZ().LIZJ();
    }

    @Override // X.InterfaceC49036JMi
    public final InterfaceC87283bg getConfig() {
        InterfaceC88472Yns<C49033JMf, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns == null) {
            return null;
        }
        C49033JMf c49033JMf = new C49033JMf(null);
        interfaceC88472Yns.invoke(c49033JMf);
        return c49033JMf;
    }

    public C49031JMd(AqS174S0100000_8 aqS174S0100000_8) {
        this.LIZ = aqS174S0100000_8;
    }
}
