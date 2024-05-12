package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;

/* renamed from: X.JMg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49034JMg implements InterfaceC49037JMj {
    public final InterfaceC88472Yns<C49357JYr, C76800UCe> LIZ;

    @Override // X.InterfaceC49037JMj
    public final InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> LIZ() {
        SearchComponentCenter.LIZ.getClass();
        return C49032JMe.LIZ().LIZ();
    }

    @Override // X.InterfaceC49036JMi
    public final InterfaceC87283bg getConfig() {
        C49357JYr c49357JYr = new C49357JYr(null);
        this.LIZ.invoke(c49357JYr);
        return c49357JYr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49034JMg(InterfaceC88472Yns<? super C49357JYr, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }
}
