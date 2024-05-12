package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.QsQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68370QsQ extends AbstractC68364QsK {
    public final C61689OIz LJLJI;

    @Override // X.AbstractC68364QsK
    public final InterfaceC68379QsZ LIZ(C68377QsX c68377QsX, List list) {
        return InterfaceC68379QsZ.LJIIJ;
    }

    public C68370QsQ(C61689OIz c61689OIz) {
        super("internal.logger");
        this.LJLJI = c61689OIz;
        ((HashMap) this.LJLILLLLZI).put("log", new C68369QsP(this, false, true));
        ((HashMap) this.LJLILLLLZI).put("silent", new C68402Qsw());
        ((AbstractC68364QsK) ((HashMap) this.LJLILLLLZI).get("silent")).LJIIIIZZ("log", new C68369QsP(this, true, true));
        ((HashMap) this.LJLILLLLZI).put("unmonitored", new C68403Qsx());
        ((AbstractC68364QsK) ((HashMap) this.LJLILLLLZI).get("unmonitored")).LJIIIIZZ("log", new C68369QsP(this, false, false));
    }
}
